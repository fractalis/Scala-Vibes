## 🧭 Module 15 – Domain Modelling & Architectural Patterns (Weeks 29–30)

**Why this matters:** A clear domain model and robust architecture are crucial for building maintainable software. Scala’s expressive type system and fusion of OOP and FP support domain-driven design and modern architectural patterns.

### 📚 Ten Research Topics

1. **Domain‑Driven Design (DDD) Fundamentals:** Study bounded contexts, aggregates, entities vs value objects, and domain events.
2. **Algebraic Data Types (ADTs):** Explore modelling with case classes and sealed traits; understand sum and product types.
3. **Immutability & FP Principles:** Investigate how immutability and pure functions simplify reasoning about domain behaviour; Scala encourages using immutable variables and collections[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,expressions%20all%20have%20return).
4. **Type‑Safe Domain Modelling:** Learn to encode constraints at the type level using value classes, refined types, and smart constructors.
5. **Hexagonal (Ports and Adapters) Architecture:** Study the separation between domain logic and external services through ports and adapters.
6. **Clean Architecture & Layering:** Research layering strategies (presentation, application, domain, infrastructure) and dependency inversion.
7. **Design Patterns in Scala:** Explore patterns adapted to Scala (type class pattern, builder, factory, cake pattern) and when to use them.
8. **Error Handling Strategies:** Compare error handling approaches (exceptions vs `Either`, `Try`, `Validated`) and domain error modelling.
9. **Graph Modelling:** Investigate using GraphX or Graph libraries to model domain relationships and constraints; graph‑based domain modelling.
10. **Evolution & Migration:** Learn strategies for evolving domain models over time while maintaining backward compatibility (versioning, migration scripts).

### 🔗 Validated Links (with descriptions)

- **Scala Language Fusion:** The Scala for JS developers page notes that Scala fuses object‑oriented and functional programming, encourages immutability, and treats everything as an expression[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,expressions%20all%20have%20return)—principles central to domain modelling.
- **Contextual Abstractions:** The same page introduces Scala 3’s contextual abstractions (given instances, extension methods) that help implement type classes and domain behaviours[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,own%20%E2%80%9Ccontrol%20structures%E2%80%9D%20and%20DSLs).
- **DDD Literature:** Official resources on Domain‑Driven Design by Eric Evans and Vaughn Vernon (articles and books) provide patterns and terminology.
- **Hexagonal Architecture Guide:** Explanation of the ports and adapters architecture and its application in Scala.
- **Refined Types Documentation:** Documentation for the refined library shows how to create types with compile‑time predicates.

### 🧠 Review Questions

1. According to the Scala documentation, how does Scala’s fusion of OOP and FP and emphasis on immutability support domain modelling[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,expressions%20all%20have%20return)?
2. What is a bounded context in DDD and how does it help manage complexity?
3. Explain the difference between entities and value objects. Provide an example for each.
4. What is a sealed trait, and why is it useful for modelling algebraic data types in Scala?
5. How does the hexagonal architecture isolate domain logic from external concerns? Describe the role of ports and adapters.
6. Describe the type class pattern and how Scala 3’s contextual abstractions make it easier to implement[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,own%20%E2%80%9Ccontrol%20structures%E2%80%9D%20and%20DSLs).
7. Compare error handling using exceptions versus using ADTs like `Either` or `Validated`. When would you use each approach?
8. How can refined types or smart constructors prevent invalid domain values at compile time?
9. What are some common design patterns in Scala for building modular code? How do they leverage the type system?
10. Describe a strategy for evolving a domain model when requirements change, ensuring backward compatibility.

### ✍️ Journal Prompts

1. **🏛️ Modelling Decisions:** Reflect on modelling a real‑world domain using case classes and sealed traits. What trade‑offs did you encounter when choosing between algebraic types and inheritance?
2. **🔄 Evolving Models:** Describe how you handled a change in business requirements that required evolving your domain model. How did you maintain compatibility with existing code?
3. **🧰 Patterns in Practice:** After applying a design pattern (e.g., hexagonal architecture or type class pattern) in a small project, discuss how it affected your code’s modularity and testability.

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Create a domain model for a simple e‑commerce cart using case classes and sealed traits. Ensure immutability and use refined types for constraints (e.g., non‑empty names).
2. Implement a value object for an email address that validates its format using a smart constructor; return an `Either` for error handling.
3. Write a small hexagonal architecture skeleton: define a port (`PaymentService`) and two adapters (in‑memory and external service).
4. Implement a type class (e.g., `Printable`) and provide given instances for two domain types; write a generic method that prints any `Printable`.
5. Use GraphX to model relationships between domain entities (e.g., social connections) and compute centrality metrics.
6. Write a DSL for building domain events and commands; interpret them into actions (e.g., logging or state changes).
7. Develop a `Validation` service using `Validated` to accumulate multiple domain validation errors.
8. Implement a repository pattern using type classes; define a trait `Repository[F[_], A]` and provide an in‑memory implementation.
9. Compare error handling: implement the same operation using exceptions, `Try`, and `Either`. Discuss the differences in error propagation.
10. Write migration code that transforms old versions of a domain object to a new version; ensure data integrity.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **E‑Commerce Domain Model:** Build a complete domain model for an online store (products, orders, customers). Use ADTs, refined types, and domain events; implement services using hexagonal architecture.
2. **Event‑Driven Task Manager:** Create a task management application with commands and events; use case classes for commands/events and interpret them into state changes.
3. **Banking System:** Model bank accounts and transactions with strong types and invariants; implement error handling with `Either` and domain‑specific error ADTs.
4. **Graph‑Based Social Platform:** Model a social network domain using GraphX; implement friend suggestions and group recommendations.
5. **Domain Evolution Tool:** Build a tool that generates migration scripts for evolving domain models; handle versioning and backward compatibility.

### 🌐 Mega Projects (12+ hrs)

1. **Multi‑Tenant SaaS Platform:** Design a SaaS application (e.g., project management) with clear bounded contexts (projects, billing, users). Use hexagonal architecture for each context, implement type‑safe APIs, and support domain evolution.
2. **Event‑Driven ERP System:** Build a simplified ERP (orders, inventory, invoicing) using DDD patterns. Model aggregates, implement CQRS with event sourcing, and provide a REST/GraphQL interface. Include migration strategy for evolving requirements.

### 🔍 Libraries & Frameworks to Explore

- **Refined:** Library for refined types with compile‑time and runtime validations.
- **Shapeless / scala‑derive / Magnolia:** Libraries for generic programming and automatic derivation of type class instances.
- **Cats / Cats MTL:** Provide type classes and monad transformers used in domain modelling.
- **GraphX / Graph for Scala:** Libraries for graph‑based modelling and algorithms.
- **PureConfig / Circe:** For configuration and serialisation of domain models.
- **ScalikeJDBC / Slick / Doobie:** Persistence libraries; use with repositories and port patterns.
- **Monocle / Quicklens:** Lens libraries for immutable data updates.
- **Pekko HTTP / http4s:** For exposing domain services as REST or HTTP APIs.
- **Refined or Newtype:** For zero‑overhead wrappers around primitive types to enforce constraints.
- **Flyway / Liquibase:** Database migration tools for evolving schema along with domain models.

### 📖 Definitions

- **Bounded Context:** A conceptual boundary in which a particular domain model is defined and applicable; prevents ambiguity across domains.
- **Entity:** An object with a distinct identity that changes over time (e.g., User, Order).
- **Value Object:** An immutable object distinguished only by its state (e.g., Money, Email); two value objects are equal if their properties are equal.
- **Aggregate:** A cluster of associated objects treated as a unit for data changes; enforces invariants across its members.
- **Port:** An interface representing a required or provided capability (e.g., repository, payment gateway) in hexagonal architecture.
- **Adapter:** A concrete implementation of a port that communicates with external systems (e.g., database, API).
- **Smart Constructor:** A constructor that validates input and returns either a valid value or an error; ensures domain invariants.
- **Refined Type:** A type enhanced with a predicate that must be satisfied, providing additional guarantees at compile time.
- **Type Class Pattern:** Defines behaviour for types without modifying them; implemented using implicits/given instances[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,own%20%E2%80%9Ccontrol%20structures%E2%80%9D%20and%20DSLs).
- **Hexagonal Architecture:** Architectural style separating core business logic from external systems via ports and adapters.

### 💡 Concepts

- **Immutable Domain:** Using immutable objects and pure functions simplifies reasoning and reduces bugs[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,expressions%20all%20have%20return).
- **Explicit Modelling:** Distinguish between entities and value objects; use ADTs to model domain states and operations.
- **Type‑Level Constraints:** Encode business rules in types using refined types or smart constructors to catch errors at compile time.
- **Separation of Concerns:** Hexagonal and clean architectures enforce separation between domain logic and infrastructure.
- **Pattern Adaptation:** Many classic patterns (builder, factory) have functional equivalents in Scala; the type class pattern provides ad‑hoc polymorphism.
- **Evolution:** Models change over time; explicit versioning and migration help maintain backward compatibility.

### 🧪 Applications

- **Design Robust Models:** Use ADTs and value classes to model complex business logic while preventing invalid states.
- **Hexagonal Services:** Structure services with ports and adapters to decouple domain logic from frameworks and infrastructure.
- **Immutable Aggregates:** Build aggregates as immutable objects and use events to capture changes.
- **Typed Errors:** Use `Either` or `Validated` to represent domain errors rather than throwing exceptions.
- **Graph Models:** Model relationships as graphs and leverage graph algorithms for recommendations or influence analysis.

### 📌 Additional Tips & Resources

1. **📖 Read DDD Blue Book:** Eric Evans’ book _Domain‑Driven Design_ is a foundational text. Vaughn Vernon’s _Implementing DDD_ and _Domain‑Driven Design Distilled_ are also recommended.
2. **🔍 Use Ubiquitous Language:** Establish a common vocabulary shared by the domain experts and developers.
3. **🧠 Keep Aggregates Small:** Aggregates should encapsulate a small set of entities; large aggregates become hard to maintain.
4. **🔄 Use Event Storming:** Collaborate with stakeholders to identify domain events and model flows.
5. **⚡ Avoid Anemic Models:** Don’t put logic only in services; embed behaviour within domain types.
6. **🔌 Separate Infrastructure:** Keep persistence, messaging, and web frameworks separate from domain logic using ports and adapters.
7. **🧱 Use Value Classes / Newtypes:** Provide strong typing without runtime overhead for domain primitives.
8. **🧪 Write Domain Tests:** Focus on testing domain logic with pure functions; it’s easier than testing controllers or databases.
9. **🎯 Start Simple:** Begin modelling with simple case classes and sealed traits; refactor to more complex patterns when needed.
10. **🚀 Review and Refine:** Iterate on your domain model as your understanding deepens; DDD is an ongoing process.

### 💡 Project Ideas (optional)

1. **Library Catalog:** Model a library system with books, patrons, and loans; implement domain rules (e.g., due dates, hold requests) using ADTs and DDD patterns.
2. **Financial Ledger:** Create a domain model for a double‑entry accounting system. Enforce invariants with refined types and smart constructors.
3. **Event‑Driven CRM:** Design a CRM domain with customers, leads, and opportunities; implement aggregates and domain events.
4. **Graph‑Based Recommendation:** Model user interests and item relationships as a graph; provide recommendations based on graph algorithms.
5. **Task Management Tool:** Build a domain model for tasks, projects, and teams; implement commands, events, and use hexagonal architecture.
6. **Insurance Claims:** Model insurance policies, claims, and coverage rules; enforce constraints and manage policy evolution.
7. **Transportation Network:** Represent a transportation network (routes, vehicles, schedules) and use graph modelling to compute optimal paths.
8. **Health Records:** Create a secure domain model for electronic health records; ensure data privacy and regulatory compliance.
9. **Smart Home Automation:** Model devices, rooms, and automation rules; implement event‑driven interactions and state management.
10. **Educational Platform:** Build a domain model for courses, students, and enrollments; handle grading and certificate issuance.
11. **Hotel Booking System:** Model rooms, bookings, and availability; include overbooking rules and cancellations.
12. **Inventory Management:** Represent warehouses, items, and stock levels; implement domain events for stock movements.
13. **Portfolio Tracker:** Design a financial portfolio domain; track securities, trades, and valuations; compute risk metrics.
14. **Energy Grid Simulation:** Model power generation, transmission, and consumption; simulate load balancing and outages.
15. **Messaging Platform:** Create a domain for messages, conversations, and users; implement encryption and moderation rules.
16. **Voting System:** Model voters, candidates, and ballots; enforce voter eligibility and secure vote counting.
17. **Research Paper Repository:** Represent papers, authors, citations; allow search and recommendations based on graph algorithms.
18. **Car Rental Service:** Model cars, reservations, pricing; handle vehicle availability and rental agreements.
19. **Supply Chain Management:** Model suppliers, shipments, and orders; implement domain rules for inventory and logistics.
20. **Real Estate Exchange:** Build a domain model for property listings, offers, and transactions; enforce contract rules and escrow.