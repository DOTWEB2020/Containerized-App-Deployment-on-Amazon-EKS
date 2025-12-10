# 🏗️ EKS Deployment Architecture - Solution Architect Demonstration

## Architectural Philosophy
> "The best architectures communicate intent through simplicity."

## File Architecture

### 1. `app.py` - The Storyteller Application
**Architectural Purpose:** Demonstrate application design that explains itself
**Key Decisions:**
- Self-documenting endpoints
- Health and readiness probes
- Environment-aware configuration
- Minimal dependencies

### 2. `Dockerfile` - Secure Container Blueprint
**Architectural Purpose:** Define container security and efficiency standards
**Key Decisions:**
- Slim base image for security
- Non-root user execution
- Health check integration
- Layer optimization

### 3. `k8s.yaml` - Infrastructure as Architecture
**Architectural Purpose:** Document infrastructure decisions as code
**Key Decisions:**
- Namespace isolation strategy
- Resource limits and requests
- Probes for self-healing
- Service discovery patterns

### 4. `deploy.sh` - Automated Delivery Pipeline
**Architectural Purpose:** Ensure consistent, repeatable deployments
**Key Decisions:**
- Sequential execution flow
- Verification and validation
- Error handling
- Clean output for ops teams

### 5. `cleanup.sh` - Lifecycle Management
**Architectural Purpose:** Demonstrate responsible cloud resource management
**Key Decisions:**
- Complete resource cleanup
- Cost control automation
- Environment hygiene

## Why This Architecture Matters

### For Business Stakeholders
- **Reduced Complexity:** Fewer moving parts = lower risk
- **Cost Control:** Efficient resource usage
- **Time-to-Value:** Faster deployment cycles
- **Reliability:** Production-ready patterns

### For Technical Teams
- **Clear Intent:** Every file has a purpose
- **Easy Maintenance:** Simple, documented code
- **Knowledge Transfer:** Self-explanatory structure
- **Scalability:** Built-in growth patterns

### For Solution Architects
- **Demonstrates:** Strategic thinking through code
- **Communicates:** Architecture decisions clearly
- **Validates:** Understanding of cloud-native patterns
- **Documents:** Design rationale for future reference

## Deployment Architecture Flow
