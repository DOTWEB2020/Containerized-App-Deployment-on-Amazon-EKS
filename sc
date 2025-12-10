# ==============================================
# ARCHITECT'S DOCKERFILE - EKS DEMO
# ==============================================

# Use official Python slim image for small size + security
FROM python:3.9-slim

# Set maintainer label (best practice)
LABEL maintainer="solution-architect@demo.com"
LABEL version="1.0"
LABEL description="Architect's EKS demonstration application"

# Set working directory inside container
WORKDIR /app

# Set environment variables
ENV PYTHONDONTWRITEBYTECODE=1
ENV PYTHONUNBUFFERED=1
ENV PORT=8080
ENV ENVIRONMENT=production

# Install system dependencies
# curl for health checks, procps for debugging
RUN apt-get update && apt-get install -y \
    curl \
    procps \
    && rm -rf /var/lib/apt/lists/*

# Copy requirements first (for better caching)
COPY requirements.txt .

# Install Python dependencies
RUN pip install --no-cache-dir --upgrade pip && \
    pip install --no-cache-dir -r requirements.txt

# Copy application code
COPY app.py .

# Create non-root user for security (best practice)
RUN useradd -m -u 1000 appuser && \
    chown -R appuser:appuser /app

# Switch to non-root user
USER appuser

# Expose the port the app runs on
EXPOSE 8080

# Health check (important for Kubernetes)
HEALTHCHECK --interval=30s --timeout=3s --start-period=5s --retries=3 \
    CMD curl -f http://localhost:8080/health || exit 1

# Command to run the application
CMD ["python", "app.py"]

# ==============================================
# DOCKERFILE ARCHITECTURE NOTES:
# 1. Multi-stage builds skipped for simplicity
# 2. Security: Non-root user, no cache, slim image
# 3. Production-ready: Health checks, env vars
# 4. EKS optimized: Small size, proper ports
# ==============================================
