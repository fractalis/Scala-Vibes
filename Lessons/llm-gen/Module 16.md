## 🚀 Module 16 – DevOps, Deployment & Cloud (Weeks 31–32)

**Why this matters:** Building a great application is only part of the journey. You also need to package, deploy, and operate it in production. Modern DevOps practices and cloud tooling allow you to deliver Scala applications reliably and repeatably across environments.

### 📚 Ten Research Topics

1. **sbt‑native‑packager & Docker:** Learn how to use the sbt‑native‑packager plugin to package Scala applications into Docker images. The documentation explains that Docker images describe a container’s contents and how to run the application. The sbt‑native‑packager focuses on creating a Docker image that can “just run” the application built by SBT[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=Docker%20Plugin%C2%B6) and requires the Docker CLI for builds[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=You%20need%20the%20version%201,instead%20uses%20the%20CLI%20directly).
2. **Docker Fundamentals:** Review the basics of Docker – images, layers, registries, containers – and how multi‑stage builds reduce image size.
3. **Kubernetes Basics:** Understand pods, deployments, services, config maps, and secrets. Study how Scala services run on Kubernetes using clients such as skuber or fabric8.
4. **CI/CD Pipelines:** Explore continuous integration and deployment. Compare GitHub Actions, GitLab CI, Jenkins and how they integrate with sbt, tests, formatting, and packaging.
5. **Infrastructure as Code:** Investigate tools like Terraform, Pulumi, and AWS CloudFormation to provision infrastructure. Learn to define repeatable environments for Scala services.
6. **Cloud Services & Serverless:** Examine running Scala on AWS (EC2, ECS, Lambda), GCP (Cloud Run), or Azure (Functions). Consider GraalVM native images for fast startup and reduced memory footprint.
7. **Observability & Monitoring:** Research logging (Logback, SLF4J), metrics (Prometheus, Micrometer), tracing (OpenTelemetry). Understand how to instrument Scala applications.
8. **Configuration & Secrets:** Study Typesafe Config/HOCON for configuration, environment variables, and secret management solutions such as HashiCorp Vault.
9. **Security & Networking:** Delve into container security best practices, TLS certificates, mutual TLS, and network policies in Kubernetes.
10. **Deployment Strategies:** Learn blue‑green deployments, canary releases, feature flags, and autoscaling patterns.

### 🔗 Validated Links (with descriptions)

- **sbt‑native‑packager Docker docs:** The official docs explain that Docker images describe how to set up a container to run the application, and the sbt‑native‑packager creates a Docker image that can “just run” the application built by SBT[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=Docker%20Plugin%C2%B6). They also note the requirement to have the Docker CLI installed and configured for publishing[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=You%20need%20the%20version%201,instead%20uses%20the%20CLI%20directly).
- **Docker documentation:** Official Docker docs provide an introduction to Docker and detail how `Dockerfile` instructions build images.
- **Kubernetes concepts:** Kubernetes documentation explains pods, deployments, services and configuration objects for running containerized workloads.
- **GitHub Actions guide:** The GitHub Actions documentation shows how to set up pipelines for sbt builds, run tests, and publish artifacts.
- **Terraform tutorials:** The Terraform docs teach how to describe infrastructure as code and provision cloud resources reproducibly.

### 🧠 Review Questions

1. According to the sbt‑native‑packager docs, what is the purpose of a Docker image and how does the plugin simplify creating one for a Scala application[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=Docker%20Plugin%C2%B6)?
2. What tools do you need installed to build Docker images with sbt‑native‑packager[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=You%20need%20the%20version%201,instead%20uses%20the%20CLI%20directly)? Why isn’t the REST API used?
3. Describe the difference between a Docker image and a Docker container. What benefits do multi‑stage builds provide?
4. Explain the roles of pods, deployments, and services in Kubernetes. How does a deployment ensure reliability?
5. How would you configure a GitHub Actions workflow to run tests, format code, build a Docker image, and push it to a registry?
6. What advantages does infrastructure as code offer over manual provisioning? Give examples of Terraform resources relevant to Scala services.
7. Compare running a Scala application on a VM (EC2) versus in a container orchestrated by Kubernetes.
8. When should you consider using GraalVM native images for deployment? What trade‑offs are involved?
9. Describe best practices for managing configuration and secrets in containerized environments. Why should secrets not be baked into images?
10. What are blue‑green deployments and canary releases? How do they reduce risk during upgrades?

### ✍️ Journal Prompts

1. **📦 Packaging Adventures:** After creating a Docker image for your Scala service using sbt‑native‑packager, reflect on the process. What settings did you customise (base image, exposed ports, entrypoint)? Did the image “just run” as advertised[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=Docker%20Plugin%C2%B6)?
2. **🏗️ Automating the Pipeline:** Write about your experience setting up a CI/CD pipeline. How did automated tests, formatting, and packaging influence your confidence? What issues did you encounter integrating Docker publishing?
3. **☁️ Into the Cloud:** Deploy your service to a Kubernetes cluster or a serverless platform. Describe the challenges you faced with configuration, scaling, and observability. How did you secure secrets and monitor your application?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Add the sbt‑native‑packager plugin to a Scala project and enable the Docker plugin. Build and run a local Docker image using `Docker/publishLocal`.
2. Write a multi‑stage Dockerfile by hand for a simple Scala program. Compare the resulting image size to the default generated by the plugin.
3. Create a Kubernetes deployment and service YAML file for your Dockerized Scala application. Use `kubectl apply` to deploy locally (e.g., Minikube or kind).
4. Configure a GitHub Actions workflow that runs `sbt test`, checks formatting (Scalafmt), packages the application as a Docker image, and publishes to Docker Hub.
5. Write a Terraform module that provisions an EC2 instance and deploys your Docker image using Amazon ECS or EC2 with Docker.
6. Implement logging using Logback; configure different log levels via Typesafe Config. Send logs to stdout/stderr for container compatibility.
7. Add Prometheus metrics to your application (e.g., via Micrometer or Kamon) and expose them on an HTTP endpoint.
8. Deploy your application to a serverless platform (e.g., AWS Lambda) using GraalVM native image. Measure cold start times.
9. Use Vault or AWS Secrets Manager to inject a database password into your container at runtime.
10. Implement feature flags in your application (e.g., using LaunchDarkly or a custom config). Roll out a new feature gradually.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Docker & K8s Demo:** Containerize an existing Scala REST service. Write Kubernetes manifests (Deployment, Service, Ingress) and deploy it to a local or cloud cluster. Include health checks and resource limits.
2. **CI/CD Pipeline:** Build a full CI/CD pipeline for a Scala application. Use GitHub Actions to run tests and packaging. Push Docker images to a registry and automatically deploy to a test environment.
3. **Infra as Code:** Use Terraform to provision a VPC, a managed PostgreSQL database, and an ECS or EKS cluster. Deploy your Dockerized Scala application and configure networking/security rules.
4. **Observability Stack:** Set up Prometheus and Grafana to monitor your Scala service. Collect metrics, logs, and traces, and create dashboards and alerts.
5. **Serverless Experiment:** Build a simple HTTP API using AWS Lambda (via GraalVM or Java) and API Gateway. Compare performance and cost to running the same service on a container.

### 🌐 Mega Projects (12+ hrs)

1. **Production‑Ready Platform:** Design and implement a production‑ready microservice platform for multiple Scala services. Automate build, test, packaging, deployment, and observability using GitHub Actions, Docker, Kubernetes, and Terraform. Include blue‑green deployments and autoscaling policies.
2. **Cloud‑Native ETL Pipeline:** Build a pipeline that ingests data from a message broker (e.g., Kafka), transforms it using a Scala application, and writes it to a data warehouse. Containerize the pipeline, deploy it on Kubernetes, and manage infrastructure via IaC.

### 🔍 Libraries & Frameworks to Explore

- **sbt‑native‑packager:** Package Scala applications into Docker, native packages, and other formats[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=Docker%20Plugin%C2%B6).
- **GraalVM Native Image:** Compile Scala/JVM applications into native executables for faster startup.
- **Fabric8 / skuber:** Kubernetes clients for the JVM and Scala to manage resources programmatically.
- **Typesafe Config / PureConfig:** Libraries for reading configurations (HOCON, JSON, properties) into case classes.
- **Terraform / Pulumi:** Infrastructure as code tools for provisioning cloud resources.
- **Kamon / Micrometer / Prometheus Java Client:** Metrics instrumentation libraries.
- **Logback / Log4s:** Logging frameworks for Scala.
- **Vault / AWS Secrets Manager:** Secret management services and clients.
- **LaunchDarkly / Unleash:** Feature flag platforms.
- **GraalVM / SBT GraalVM Plugin:** Tools for building native images.

### 📖 Definitions

- **Docker Image:** A read‑only template containing an application and all its dependencies. The sbt‑native‑packager builds such images so they can “just run” the SBT‑built application[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=Docker%20Plugin%C2%B6).
- **Container:** A runtime instance of an image with its own filesystem and process namespace.
- **sbt‑native‑packager:** An sbt plugin that packages Scala/Java applications for different platforms (Docker, Debian, RPM, etc.).
- **Kubernetes Pod:** The smallest deployable unit in Kubernetes, containing one or more containers with shared storage and networking.
- **Deployment:** A Kubernetes object that manages a set of replica pods and performs rolling updates.
- **CI/CD:** Continuous Integration and Continuous Deployment; automation of building, testing, and deploying code changes.
- **Infrastructure as Code:** Managing and provisioning infrastructure through machine‑readable configuration files rather than manual processes.
- **Serverless:** A cloud execution model where you deploy code without managing servers; resources scale automatically.
- **Observability:** The ability to measure the internal state of a system through logs, metrics, and traces.
- **Blue‑Green Deployment:** A deployment strategy where two environments (blue and green) are used; traffic is switched from one to the other to minimise downtime.

### 💡 Concepts

- **Immutable Infrastructure:** Build artifacts (Docker images) are immutable; any change results in a new image. This reduces configuration drift.
- **Separation of Concerns:** DevOps separates application code from deployment configuration (YAML, IaC) and pipelines.
- **Declarative vs Imperative:** Kubernetes and Terraform use declarative definitions (desired state), while scripts may be imperative.
- **Scalability & Resilience:** Containers can be replicated and managed by orchestrators like Kubernetes to handle load and failure.
- **Configuration Management:** Externalize configuration to environment variables or files rather than hard‑coding values.
- **Least Privilege:** Containers and services should run with minimal permissions and non‑root users for security.
- **Observability Pillars:** Logs, metrics, and traces provide complementary views into system behaviour.
- **Auto‑Scaling:** Use metrics (CPU, request rate) to scale replicas up and down automatically.
- **Canary & Blue‑Green:** Incremental deployment techniques that reduce risk when releasing new versions.
- **Cost Optimisation:** Evaluate serverless vs container‑based deployments to balance cost and performance.

### 🧪 Applications

- **Packaging & Shipping:** Use sbt‑native‑packager to generate a Docker image and push it to a registry for consistent deployments[scala-sbt.org](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html#:~:text=Docker%20Plugin%C2%B6).
- **Orchestrating Services:** Deploy multiple Scala microservices to Kubernetes with proper service discovery and load balancing.
- **Automated Testing & Deployment:** Configure CI/CD pipelines that enforce quality gates (tests, formatting) before deploying to staging/production.
- **Infrastructure Provisioning:** Use Terraform modules to spin up networks, databases, and clusters in the cloud.
- **Serverless Functions:** Compile a Scala function to a native binary and deploy it as an AWS Lambda for event‑driven use cases.
- **Monitoring:** Instrument applications with Prometheus and view dashboards in Grafana; set alerts for error rates.
- **Config & Secrets:** Use Typesafe Config to load configurations and Vault to retrieve secrets at runtime.
- **Disaster Recovery:** Use blue‑green deployments and rollbacks to recover quickly from failures.

### 📌 Additional Tips & Resources

1. **🧪 Test Locally First:** Use Minikube or kind to test Kubernetes manifests before deploying to the cloud.
2. **📂 Keep Images Small:** Use multi‑stage builds and slim base images (e.g., Alpine) to reduce attack surface.
3. **🔒 Secure by Default:** Run containers as non‑root users and regularly scan images for vulnerabilities.
4. **⏱️ Automate Everything:** Automate tests, builds, and deployments to reduce manual errors and speed up feedback.
5. **📖 Read Official Docs:** The Docker and Kubernetes docs are extensive; refer to them for best practices and troubleshooting.
6. **🔧 Use Helm:** Helm charts simplify deploying complex applications to Kubernetes by templating manifests.
7. **🗄️ Version Configurations:** Store Kubernetes manifests, Terraform code, and Helm charts in version control.
8. **📦 Explore Native Images:** GraalVM native images can drastically reduce cold start times but may require configuration of reflection and resources.
9. **🔗 Use CI Templates:** Leverage community‑maintained GitHub Actions or GitLab CI templates for Scala and sbt.
10. **🧠 Keep Learning:** The DevOps landscape evolves quickly; follow blogs, podcasts, and documentation to stay up‑to‑date.

### 💡 Project Ideas (optional)

1. **Multi‑Service Deployment:** Create two collaborating Scala services (e.g., orders and inventory), containerize them, and deploy with Kubernetes and Istio for service mesh.
2. **Terraform Module Library:** Build a library of Terraform modules (VPC, database, ECS/EKS cluster) tailored for Scala applications.
3. **Cluster Auto‑Scaler:** Develop a tool that monitors CPU usage and scales Kubernetes nodes automatically.
4. **Secret Rotation Service:** Implement a service that rotates database passwords and updates Kubernetes secrets with minimal downtime.
5. **Custom Helm Chart:** Package your Scala application as a Helm chart with configurable values for replicas, environment variables, and resource limits.
6. **Deployment Visualiser:** Build a Scala.js dashboard that visualises the status of Kubernetes deployments, pods, and services.
7. **Infra Drift Detector:** Create a tool that compares Terraform state with the actual infrastructure and reports drift.
8. **Chaos Testing Tool:** Implement a small chaos engineering tool that randomly kills pods or network connections to test resilience.
9. **Cost Explorer:** Write a Scala service that queries cloud provider APIs to analyse cost across resources and suggests optimisations.
10. **Serverless Workflow Engine:** Combine AWS Step Functions or Azure Durable Functions with Scala to orchestrate serverless steps.
11. **Self‑Healing Scripts:** Develop scripts that detect failed pods and automatically restart or redeploy them.
12. **GitOps Pipeline:** Use Argo CD or Flux to implement GitOps deployments for your Scala microservices.
13. **Infrastructure Monitoring Bot:** Build a chatbot that reports deployment status, costs, and alerts via Slack or Discord.
14. **Package Manager:** Create a tool that builds Debian/RPM packages for Scala apps using sbt‑native‑packager and publishes them to APT/YUM repos.
15. **Auto‑Rollback System:** Implement automatic rollback if metrics degrade after a deployment.
16. **Cluster Migration Tool:** Move an application from one cloud provider to another using Terraform and Kubernetes abstractions.
17. **Event‑Driven Scaling:** Use Prometheus alerts to trigger Lambda functions that scale services up or down.
18. **Cross‑Region Replication:** Deploy your service in multiple regions and implement data replication and failover strategies.
19. **Immutable Config Service:** Build a service that serves versioned configuration files and notifies clients of updates.
20. **Security Scanner:** Create a pipeline that scans Docker images and Kubernetes manifests for vulnerabilities and misconfigurations.