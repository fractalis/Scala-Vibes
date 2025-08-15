## Module 10 – Advanced Concurrency & Distributed Systems (Weeks 19–20)

**Why this matters:** As your applications grow, you need tools for managing complex concurrency, state, and distribution. Scala’s ecosystem (Akka/Pekko, gRPC, messaging brokers) provides battle‑tested patterns for building reliable distributed systems.

### 📚 Ten Research Topics

1. **Actors vs Futures:** Study the differences between one‑shot futures and long‑lived actors; actors handle many requests over their lifetime, whereas futures encapsulate a single computation[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=,computation%20that%20ran%20only%20once).
2. **Akka Typed:** Learn about type‑safe actors, actor hierarchies, supervision strategies, and the actor lifecycle.
3. **Akka Cluster & Sharding:** Explore clustering, sharding, and distributed data (CRDTs) for scaling actor systems across nodes.
4. **Event Sourcing & CQRS:** Investigate patterns that persist events instead of mutable state, enabling replay and auditing.
5. **Persistence & Durable Actors:** Study Akka Persistence and how to create event‑sourced and command‑query separation (CQRS) systems.
6. **gRPC in Scala:** Research using `scalapb` to generate Scala gRPC services and clients; compare to REST.
7. **Message Brokers (RabbitMQ, NATS, Pulsar):** Understand messaging patterns (pub/sub, request/reply) and how to connect from Scala.
8. **Distributed Tracing & Metrics:** Learn techniques for observability in distributed systems: tracing (OpenTelemetry), metrics (Kamon), logging.
9. **Supervision & Fault Tolerance:** Explore supervision strategies (restart, resume, stop), back‑off, and circuit breakers.
10. **Designing Protocols & Contracts:** Research API contract design for RPC and messaging, including Protobuf definitions and schema evolution.

### 🔗 Validated Links (with descriptions)

- **Scala Concurrency – Futures vs Actors:** The Scala 3 book explains that `Future`s are one‑shot computations and that actors are designed to run long‑lived and respond to many requests[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=,computation%20that%20ran%20only%20once).
- **Akka Documentation:** Official docs for Akka Typed, clustering, and persistence. Includes detailed examples and patterns.
- **Event Sourcing & CQRS Guide:** Blog post detailing the principles of event sourcing and command‑query responsibility segregation.
- **gRPC for Scala (scalapb):** Documentation showing how to generate Scala code from `.proto` files and implement services.
- **RabbitMQ/AMQP Tutorial:** A simple introduction to message brokers and how to publish/consume messages from Scala.

### 🧠 Review Questions

1. According to the Scala concurrency chapter, what is the key difference between a `Future` and an `Actor` and when would you choose one over the other[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=,computation%20that%20ran%20only%20once)?
2. What does Akka Typed provide over classic actors? Describe the purpose of the actor’s behaviour type.
3. How does cluster sharding distribute actors across nodes? What happens when a node goes down?
4. Explain the principles of event sourcing. How does it differ from persisting mutable state?
5. What is CQRS and how can separating commands from queries improve scalability?
6. Describe how to define a service and messages in a `.proto` file and generate Scala code using scalapb.
7. Compare RabbitMQ, NATS, and Kafka in terms of delivery guarantees and use‑cases. Which one would you choose for each scenario?
8. What are supervision strategies in Akka? When would you choose `restart` vs `resume`?
9. How can you instrument an Akka application with metrics and distributed tracing? Which libraries facilitate this?
10. Why is API contract design (e.g., Protobuf messages) critical for distributed systems? What are best practices for evolving schemas?

### ✍️ Journal Prompts

1. **🎭 Modelling Concurrency:** Reflect on the differences you observed when using an actor versus a future. How did the actor’s persistent lifecycle affect your design decisions?
2. **📡 Messaging Patterns:** Document your experience integrating a message broker (RabbitMQ or NATS) with an Akka application. How did pub/sub influence the overall architecture?
3. **🔍 Eventful Thinking:** After implementing an event‑sourced actor, write about how thinking in terms of events changed your approach to state management and debugging.

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Implement a simple Akka Typed actor that maintains a counter; it increments on receiving an `Increment` message and replies with the current count.
2. Write a small program that uses an actor to process tasks concurrently, then compare it with an implementation using `Future`s.
3. Create a gRPC service definition in a `.proto` file and generate Scala server/client code with scalapb. Write a client that calls the service.
4. Build an event‑sourced actor that persists `Added` and `Removed` events to maintain a shopping cart’s state.
5. Simulate a cluster by running multiple actor system instances locally. Implement cluster sharding to distribute counters across instances.
6. Write a producer/consumer using RabbitMQ where producers send tasks and consumers process them. Use `akka-stream-alpakka` connectors if desired.
7. Implement an Akka supervision strategy where the actor restarts on failure and logs the error. Trigger a failure and observe behaviour.
8. Create a simple metrics reporter for Akka using Kamon; expose metrics via HTTP for Prometheus scraping.
9. Add distributed tracing to a gRPC call using OpenTelemetry instrumentation and visualise the traces.
10. Build a small CLI tool that publishes and consumes messages from NATS with back‑pressure handling.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Chat System:** Build a chat service using Akka Typed where each chat room is an actor. Implement persistence so chat history is stored via event sourcing.
2. **Distributed Key‑Value Store:** Create a cluster of actors that partition key‑value pairs; implement consistent hashing and replication.
3. **gRPC Microservice:** Design a microservice with a gRPC API that stores data in a database and uses Akka Streams for server‑side streaming responses.
4. **Message‑Driven Workflow:** Develop a workflow engine using RabbitMQ or NATS where tasks flow through multiple stages implemented by actors.
5. **CQRS & Event Sourcing Demo:** Build a sample domain (e.g., orders and inventory) using event‑sourced aggregates, CQRS read models, and query services.

### 🌐 Mega Projects (12+ hrs)

1. **Distributed Auction System:** Develop a distributed auction platform using Akka Cluster. Use sharding to distribute auction actors, persist events for each bid, and implement a gRPC API for clients. Incorporate message broker integration for notifications and metrics instrumentation.
2. **Resilient Microservice Platform:** Build a collection of microservices communicating via RabbitMQ/NATS/gRPC. Implement supervision, circuit breakers, and event sourcing. Deploy the system using Kubernetes or Docker Compose and integrate monitoring and tracing.

### 🔍 Libraries & Frameworks to Explore

- **Akka Typed & Pekko:** Actor system with type safety; includes cluster, persistence, and distributed data modules.
- **Akka Streams / Pekko Streams:** For building reactive streams that integrate with actors and back‑pressure.
- **scalapb & gRPC‑Java:** Tools for building gRPC services and clients in Scala.
- **Alpakka:** Integrations between Akka Streams and messaging systems like RabbitMQ, NATS, Kafka.
- **Kamon & OpenTelemetry:** Libraries for metrics and distributed tracing.
- **Lagom or Pekko Serverless:** Frameworks for building microservices using CQRS and event sourcing.
- **Monix:** Alternative reactive programming library for tasks and streams.
- **Pulsar4s / RabbitMQ Java Client:** Scala clients for various message brokers.

### 📖 Definitions

- **Actor:** A concurrent entity that processes one message at a time, maintains internal state, and communicates via asynchronous message passing.
- **Future:** Represents a single asynchronous computation that produces a result or an exception at some point[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=,computation%20that%20ran%20only%20once).
- **Event Sourcing:** Pattern where state changes are persisted as a sequence of immutable events; the current state is reconstructed by replaying events.
- **CQRS (Command Query Responsibility Segregation):** Separates commands (state changes) from queries (reads) to optimise performance and scalability.
- **Sharding:** Distribution of actors or data across cluster nodes based on a consistent hash of entity identifiers.
- **Supervision:** Strategy whereby parent actors handle failures of their children, deciding whether to resume, restart, or stop them.
- **gRPC:** Remote procedure call framework that uses Protobuf to define services and messages; supports streaming and multiple languages.
- **Message Broker:** Middleware that routes messages between producers and consumers; includes brokers like RabbitMQ, NATS, Kafka, Pulsar.

### 💡 Concepts

- **One‑Shot vs Long‑Lived:** Futures are used for one‑off computations while actors live throughout an application’s lifecycle and process many messages[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=,computation%20that%20ran%20only%20once).
- **Location Transparency:** In actor systems, the physical location of an actor is abstracted away; messages are delivered regardless of node location.
- **Immutable Messages:** Messages sent between actors should be immutable to avoid shared mutable state and concurrency bugs.
- **Supervision Hierarchy:** Actors form a hierarchy where parent actors manage the failure states of their children.
- **Eventual Consistency:** In event‑sourced systems, read models might be eventually consistent with the write side.
- **Back‑Pressure & Flow Control:** When using streams, controlling the rate at which messages are processed is critical to avoid overwhelming consumers.

### 🧪 Applications

- **Build Resilient Services:** Use Akka Cluster to scale microservices horizontally while handling failures gracefully.
- **Implement Event‑Driven Architectures:** Combine event sourcing and CQRS to build systems with audit trails and flexible projections.
- **Use gRPC for High‑Performance RPC:** Replace REST calls with gRPC for better performance and contract‑first API design.
- **Integrate Message Brokers:** Connect microservices using RabbitMQ or NATS to decouple producers and consumers.
- **Instrument for Observability:** Add metrics and tracing to understand and debug distributed behaviour.

### 📌 Additional Tips & Resources

1. **💬 Favour Immutable Commands:** Always define messages as case classes and avoid mutating them.
2. **🎛️ Tune Dispatcher:** Configure dispatcher thread pools in Akka to match workload (CPU‑bound vs I/O‑bound).
3. **🧗 Use Ask Pattern Sparingly:** The ask pattern (`?`) converts actor messages into `Future`s; overuse can lead to coupling and back‑pressure issues.
4. **📡 Explore Alpakka Connectors:** Many connectors exist for integrating with external systems (SQS, MQTT, Couchbase, etc.).
5. **🛠️ Build Protobuf Schemas First:** Designing your `.proto` definitions early helps avoid breaking changes later.
6. **🔁 Retry & Backoff:** Use built‑in patterns for retrying failed operations with exponential back‑off.
7. **📖 Read the Reactive Manifesto:** Understand the principles (responsive, resilient, elastic, message driven) guiding reactive systems.
8. **🧪 Test Actors with TestKit:** Akka TestKit provides tools for unit testing actors and verifying message flows.
9. **🚢 Deploy with Orchestration:** Use Docker Compose or Kubernetes to deploy clusters and test failover.
10. **🔒 Secure RPC:** Use TLS in gRPC and secure broker connections to protect messages in transit.

### 💡 Project Ideas (optional)

1. **Real‑Time Collaboration Platform:** Build a collaborative whiteboard or document editor using actor sharding for sessions and gRPC for client connections.
2. **IoT Event Bus:** Create a message bus for IoT devices using RabbitMQ and Akka Streams; implement devices as actors publishing readings.
3. **Distributed Job Scheduler:** Build a scheduler that distributes jobs across a cluster of actors, handling retries and timeouts.
4. **Persistent Chatbot:** Implement a chatbot that persists conversation history and uses event sourcing to restore state after restarts.
5. **Trading Platform Prototype:** Simulate a stock trading platform with event sourcing for orders and CQRS read models for order books.
6. **Resilient Workflow Engine:** Build an engine that orchestrates tasks via messages and persists event logs for auditing.
7. **Scalable Multiplayer Game Server:** Use actors for game sessions, cluster sharding for load balancing, and gRPC for communication.
8. **Event‑Sourced Ledger:** Implement a double‑entry bookkeeping ledger using event sourcing; provide APIs for posting entries and generating reports.
9. **Distributed Cache:** Create a distributed in‑memory cache backed by Akka Distributed Data and replicating across nodes.
10. **gRPC Gateway:** Build a gateway that translates HTTP REST calls into gRPC calls to backend services, handling streaming and error translation.
11. **Monitoring Dashboard:** Use actors and streams to collect metrics from multiple services and display them in real time.
12. **Event Replay Tool:** Develop a tool that replays stored events to rebuild state or perform analytics.
13. **Custom Broker:** Implement a simple message broker in Scala using actors; support topics, subscriptions, and delivery guarantees.
14. **Dynamic Service Discovery:** Build a service registry using Akka cluster; allow services to register and discover each other via gRPC.
15. **Real‑Time Auction Platform:** Manage auctions and bids with actors, cluster sharding, and gRPC; ensure fairness and fault tolerance.
16. **Distributed Rate Limiter:** Develop a rate‑limiting service using consistent hashing and distributed counters.
17. **Event Schema Registry:** Create a registry service that stores Protobuf schemas and version history; enforce compatibility.
18. **Fault Injection Framework:** Build a framework to inject failures into actors and gRPC calls to test resilience.
19. **Message Archiver:** Develop a service that archives messages from RabbitMQ or NATS to a database for auditing.
20. **Geo‑Distributed System Demo:** Deploy an Akka cluster across multiple geographic regions and build a demonstration of latency tolerance and data replication.