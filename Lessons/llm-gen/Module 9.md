# Module 9

## 🌐 Module 9 – Web Development & Microservices in Scala (Weeks 17–18)

**Why this matters:** Web applications and microservices are everywhere. Scala provides modern frameworks like Play, http4s, Akka HTTP, and Pekko for building reactive, type‑safe services.

### 📚 Ten Research Topics

1. **Play Framework Basics:** Learn the MVC architecture, built‑in routing, form handling, internationalisation, and hot reloading[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F).
2. **Reactive Architecture:** Study how Play/Pekko Streams uses a stateless, reactive approach built on Pekko/Akka to scale horizontally and vertically[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F).
3. **http4s:** Explore this purely functional, type‑safe HTTP toolkit built on cats‑effect. Understand how to define HTTP routes as functions.
4. **Akka HTTP & Pekko HTTP:** Research high‑performance, streaming HTTP servers built on Akka Actors/Streams. Learn about directives, routes, and marshalling.
5. **GraphQL with Sangria:** Investigate building GraphQL services with the Sangria library and integrating them into Play or http4s.
6. **JSON & Serialisation:** Compare Circe, Play JSON, and uPickle for serialising/deserialising JSON in Scala services.
7. **Dependency Injection:** Learn techniques for DI in Scala web apps—Guice (Play default), MacWire, or using constructor injection and the Reader monad.
8. **Microservice Patterns:** Study patterns like API gateways, service discovery, and contract‑first development; see how they apply to Scala ecosystems.
9. **Testing Web Services:** Explore testing strategies: property‑based testing with ScalaCheck, integration testing with embedded servers, mocking HTTP clients.
10. **Deployment & DevOps:** Research containerising Scala services with Docker, orchestrating with Kubernetes, and monitoring/observability tools (Prometheus, Grafana).

### 🔗 Validated Links (with descriptions)

- **Play Framework Introduction:** Official introduction detailing MVC architecture, built‑in HTTP server, form handling, routing, stateless reactive design on Pekko Streams, and integration with databases[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F).
- **Play & Pekko Streams:** Article explaining how Play uses Pekko Streams (formerly Akka Streams) to achieve predictable resource usage and scalability[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F).
- **http4s Documentation:** Official docs for http4s, covering routing DSL, server/client, and integration with cats‑effect.
- **Akka HTTP Quickstart:** Tutorial describing how to build routes with Akka HTTP directives and handle streaming requests/responses.
- **Sangria GraphQL:** Documentation for building GraphQL schemas and resolvers in Scala using Sangria.

### 🧠 Review Questions

1. What benefits does Play’s reactive, stateless design provide when handling web requests[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F)?
2. Describe the MVC pattern as implemented in Play. What are the responsibilities of the Controller, View, and Model?
3. How does http4s express routes? Compare the functional routing DSL with Play’s declarative routing file.
4. Explain how back‑pressure is used when streaming HTTP responses in Akka HTTP or Pekko HTTP.
5. What are GraphQL resolvers in Sangria, and how do they differ from REST endpoints?
6. How do Circe and Play JSON differ in parsing/encoding JSON? Which library would you choose for a purely functional application?
7. What strategies exist for dependency injection in Scala web services? Compare Guice with a typeclass‑based approach.
8. Explain an API gateway’s role in a microservice architecture. How might you implement one in Scala?
9. What are the advantages of property‑based testing for HTTP APIs compared to example‑based tests?
10. What tools and best practices ensure observability of Scala microservices in production (e.g., logging, metrics, tracing)?

### ✍️ Journal Prompts

1. **⚙️ Building Routes:** After writing your first http4s and Play routes, reflect on the differences in style and ergonomics. Which felt more intuitive? How did type safety influence your confidence?
2. **🌐 Reactive Patterns:** Play emphasises a stateless, reactive architecture built on Pekko Streams[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F). How did this influence how you think about scaling web services? What challenges did you face in testing these asynchronous, streaming behaviours?
3. **🧪 API Design:** Describe how GraphQL’s schema‑first approach with Sangria compares to designing REST endpoints. What insights did you gain about data fetching patterns and client flexibility?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Create a simple Play application with one route that returns “Hello, Scala Web!”. Use the built‑in templates and form handling to accept a name and echo it back.
2. Build an http4s service that exposes a REST endpoint for adding and fetching users; use Circe for JSON marshalling.
3. Use Akka HTTP to implement a streaming endpoint that emits numbers every second. Consume this endpoint with an Akka Streams client.
4. Write a Sangria GraphQL schema for a blog with posts and authors. Implement resolvers for queries and mutations.
5. Compare Circe and Play JSON by writing encoders/decoders for a case class representing a User; test them for correctness.
6. Implement constructor‑based dependency injection in a Play service without using Guice; use the Reader monad or ZLayers if using ZIO.
7. Write property‑based tests using ScalaCheck for an http4s service that reverses a string provided in the query parameter.
8. Containerise an http4s application using Docker and deploy it locally with Docker Compose along with a Postgres database.
9. Configure metrics collection in a Play application using Kamon or Prometheus; expose an endpoint that reveals metrics.
10. Implement an API gateway stub in Scala that forwards requests to two microservices and aggregates the responses.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Full‑Stack To‑Do App:** Build a CRUD To‑Do application using Play or http4s on the backend and a minimal frontend (e.g., using Scalajs or a JS framework). Persist data in a relational database using Slick.
2. **Streaming Chat Service:** Use Akka HTTP or Pekko HTTP to implement websockets for a chat application; handle broadcasting messages and user connections with Actors.
3. **GraphQL API Server:** Develop a GraphQL server using Sangria that serves a dataset (e.g., movies, books). Implement queries, mutations, and subscriptions.
4. **Microservice Suite:** Build two microservices: one for user management and another for tasks. Use http4s for one and Play for the other, communicate via HTTP, and manage configuration with Typesafe Config.
5. **Observability Toolkit:** Instrument a Scala web service with distributed tracing (OpenTelemetry), metrics (Prometheus), and logging; create dashboards to monitor performance and errors.

### 🌐 Mega Projects (12+ hrs)

1. **E‑Commerce Platform:** Implement a small e‑commerce platform with multiple microservices (catalogue, cart, checkout). Use Play for the main API, http4s for the payment service, GraphQL for the product catalogue, and Kafka for event sourcing. Add tests and deployment scripts.
2. **Reactive SaaS Platform:** Create a SaaS application with real‑time collaboration features (e.g., shared documents). Use Akka Streams or Pekko Streams for websockets, http4s for the API, and integrate with a scalable database like Cassandra. Provide observability and resilience patterns.

### 🔍 Libraries & Frameworks to Explore

- **Play Framework:** High‑productivity web framework with hot reloading[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F).
- **http4s:** Functional, type‑safe HTTP toolkit built on Cats Effect.
- **Akka HTTP/Pekko HTTP:** Low‑level, high‑performance HTTP server built on Akka.
- **Sangria:** GraphQL server library for Scala.
- **Circe & Play JSON:** Libraries for JSON encoding/decoding.
- **Slick:** Functional relational mapping for databases.
- **Cats Effect & ZIO:** Libraries providing effect systems used by http4s and Pekko.
- **Kamon & Prometheus:** Observability libraries for metrics and tracing.
- **MacWire/Guice:** Dependency injection libraries.
- **Docker & Kubernetes:** Tools for containerisation and orchestration of services.

### 📖 Definitions

- **Model‑View‑Controller (MVC):** Architectural pattern separating the data (Model), the user interface (View), and the control logic (Controller); used in Play to organise web apps.
- **Reactive Streams:** Specification for asynchronous stream processing with non‑blocking back‑pressure; implemented by Akka Streams and http4s.
- **Directive:** In Akka HTTP, a building block for composing routes; encapsulates extraction of request data and computation of responses.
- **Route:** A function from `HttpRequest` to `RouteResult` defined using directives; describes how a service responds to requests.
- **GraphQL:** A query language and runtime for APIs that allows clients to request exactly the data they need and nothing more.
- **Dependency Injection (DI):** Technique where components receive their dependencies from external sources rather than creating them directly. Guice and MacWire provide DI frameworks.
- **Property‑Based Testing:** Testing paradigm where properties of the output are asserted for many randomly generated inputs. ScalaCheck is a key library.
- **Observability:** The ability to understand a system’s state through logs, metrics, and traces; critical for production systems.

### 💡 Concepts

- **Reactive Web:** Play’s reactive, stateless design utilises a built‑in HTTP server and Pekko Streams for predictability and scalability[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F).
- **Type‑Safe Routing:** http4s and Akka HTTP routes are first‑class Scala values that the compiler can verify, reducing runtime errors.
- **Back‑Pressure in HTTP:** Streaming endpoints must handle producers and consumers at different rates; Pekko/Akka Streams implement back‑pressure at the protocol level.
- **GraphQL vs REST:** GraphQL allows clients to specify queries on a schema; REST exposes resources via endpoints. GraphQL reduces over‑fetching but increases complexity.
- **Functional Effects:** Libraries like cats‑effect and ZIO model side effects as values, enabling safer concurrency and composition in web services.
- **DI Patterns:** Preference for constructor injection or functional patterns (Reader monad) avoids reliance on reflection-based frameworks and improves testability.

### 🧪 Applications

- **Build a REST API:** Use Play or http4s to create a versioned API, handle JSON requests/responses, and validate input.
- **Streaming Endpoints:** Implement websockets or server‑sent events using Akka HTTP or Pekko HTTP; manage concurrency with Actors.
- **GraphQL Gateway:** Use Sangria to provide a unified schema for multiple microservices; use federation or schema stitching to merge services.
- **Service Discovery:** Integrate a service like Consul or Eureka to locate services at runtime; configure clients accordingly.
- **Containerised Deployment:** Create a Dockerfile for your web service, run it locally, and deploy to a Kubernetes cluster with health checks.

### 📌 Additional Tips & Resources

1. **🔥 Use Hot Reloading:** Play’s hot reloading speeds up development; ensure you understand how the dev mode differs from production.
2. **💾 Manage Blocking Calls:** Offload blocking I/O (e.g., database queries) onto dedicated thread pools when using http4s or Akka HTTP.
3. **🛡️ Secure Your API:** Use HTTPS, CSRF protection (Play provides built‑in support[playframework.com](https://www.playframework.com/documentation/3.0.x/Introduction#:~:text=%C2%A7What%20is%20Play%3F)), and rate‑limiting.
4. **🔍 Use Middleware:** In http4s, middlewares (e.g., for logging, authentication) compose elegantly; explore building your own.
5. **⚠️ Handle Timeouts:** Set appropriate timeouts for HTTP clients and servers to avoid resource exhaustion.
6. **🐛 Debug with Logging:** Use structured logging (e.g., Logback with Logstash encoder) to capture contextual data.
7. **📚 Explore Templating:** Play has Twirl for server-side templates; http4s often uses static front‑ends. Evaluate when server-side rendering is appropriate.
8. **🧰 Simplify DI:** MacWire’s compile‑time DI avoids runtime reflection and errors; consider it for type‑safe wiring.
9. **📜 Document your API:** Use tools like OpenAPI or GraphiQL UI to document and explore your endpoints.
10. **🧪 Test Thoroughly:** Combine unit tests, property-based tests, and integration tests to ensure reliability.

### 💡 Project Ideas (optional)

1. **Blog Platform:** Build a full blog system with Play (backend), GraphQL (API), and a front‑end of your choice; include authentication and comments.
2. **Real‑Time Collaboration:** Implement a collaborative document editor using websockets (Akka/Pekko HTTP) and CRDTs for conflict‑resolution.
3. **Event‑Driven CRM:** Create a CRM system where microservices emit events through Kafka; implement services in Play/http4s with GraphQL queries.
4. **Authentication Service:** Build an OAuth2 or JWT based authentication/authorisation service in Scala, integrating with third-party providers.
5. **API Gateway & Aggregator:** Design an API gateway that routes requests to underlying microservices and aggregates results; add caching and rate-limiting.
6. **Serverless Scala:** Explore building functions with AWS Lambda using Scala; wrap them with a http4s or Play façade.
7. **Streaming Dashboard:** Create a dashboard that consumes server-sent events from an Akka HTTP service and displays metrics in real time.
8. **GraphQL Federation:** Combine multiple GraphQL schemas (e.g., user service, order service) into a single federated gateway using Sangria.
9. **Functional REST Client:** Build a type-safe HTTP client using http4s `Client` and implement an API wrapper for a public REST service.
10. **Continuous Delivery Pipeline:** Set up CI/CD (e.g., GitHub Actions) that builds, tests, containerises, and deploys a Scala web service to Kubernetes.
11. **Reverse Proxy:** Write a reverse proxy in Scala that applies load balancing and request logging; compare performance to nginx.
12. **Server-Side Rendering:** Build a server-side rendered front-end using Play’s Twirl templates and integrate dynamic data from http4s services.
13. **Chatbot Service:** Use http4s to expose an API that integrates with a chat platform (e.g., Slack); process messages via Akka Streams.
14. **Document Management System:** Store and serve documents, generating previews on the fly; use Play or http4s for the API and integrate with a search engine like ElasticSearch.
15. **Health Monitoring Tool:** Build a service that collects heartbeat signals from microservices, stores them, and presents status dashboards.
16. **Payment Gateway Integration:** Integrate with payment APIs (Stripe, PayPal) using http4s; handle webhooks and secure communication.
17. **Notification System:** Implement an event-driven notification service that sends emails and push notifications; ensure reliability and retries.
18. **Configuration Service:** Build a central configuration server with versioned properties; serve dynamic configuration to microservices.
19. **CMS with GraphQL:** Develop a headless CMS using Play + GraphQL; support content editing and versioning.
20. **Microservice Observability Platform:** Create a system that ingests traces/metrics from multiple services and provides an interactive UI to explore them.