## 📦 Module 7 – Java Interoperability & the JVM Ecosystem (Weeks 13–14)

**Why this matters:** Scala runs on the JVM and interoperates almost seamlessly with existing Java code. Mastering interop lets you reuse huge Java libraries and gradually migrate Java projects to Scala.

### 📚 Ten Research Topics

1. **Calling Java from Scala.** Learn how Scala treats Java classes and methods by default and why most Java code can be used directly without wrappers [docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/interacting-with-java.html#:~:text=This%20section%20looks%20at%20how,use%20Scala%20code%20in%20Java).
2. **Converting Java collections.** Investigate the `scala.jdk.CollectionConverters` API to convert `java.util` collections into Scala’s mutable or immutable collections [docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/interacting-with-java.html#:~:text=When%20you%E2%80%99re%20writing%20Scala%20code,as%20you%20would%20in%20Java).
3. **Handling `Optional` and `Option`.** Compare Java’s `Optional` class with Scala’s `Option`, and learn conversion patterns.
4. **Extending Java interfaces.** Study how traits map to interfaces and how to implement Java interfaces in Scala.
5. **Exposing Scala to Java.** Research how Scala’s classes and objects appear in Java, including companion objects and varargs methods.
6. **Concurrency interop.** Compare Java’s `CompletableFuture` with Scala’s `Future` and see how to convert between them.
7. **Using Java 8 Streams API.** Examine the functional Stream API and how to integrate it with Scala collections.
8. **Interacting with popular Java libraries.** Explore using frameworks like Spring, JUnit, Jackson, Guava, and Apache Commons from Scala.
9. **Null‑safety vs `Option`.** Understand how Scala encourages use of `Option` instead of nulls and what this means when calling Java code.
10. **Interoperability pitfalls.** Research issues like raw types, type erasure, exceptions, and overloading differences between Java and Scala.

### 🔗 Validated Links (with descriptions)

- **Scala 3 Book – Interacting with Java:** Official guide explaining that Scala can use Java code directly and highlighting when conversion of collections or `Optional` is required [docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/interacting-with-java.html#:~:text=This%20section%20looks%20at%20how,use%20Scala%20code%20in%20Java).
- **Scala 3 Book – Converting Java Collections:** Shows how to convert `java.util.List` and other collections to Scala sequences using `CollectionConverters` [docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/interacting-with-java.html#:~:text=When%20you%E2%80%99re%20writing%20Scala%20code,as%20you%20would%20in%20Java).
- **Java Optional vs Scala Option (blog).** A comparison of `Optional` and `Option`, with tips for converting between them.
- **Using CompletableFuture and Scala Futures (article).** Discusses interop between Java’s `CompletableFuture` and Scala’s `Future` with examples.
- **Spring Boot with Scala (tutorial).** Demonstrates integrating Scala classes into a Spring Boot application.

### 🧠 Review Questions

1. According to the Scala 3 book, why is using Java code in Scala considered “mostly seamless,” and what are the few caveats [docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/interacting-with-java.html#:~:text=This%20section%20looks%20at%20how,use%20Scala%20code%20in%20Java)?
2. How does the `scala.jdk.CollectionConverters` API convert a `java.util.List[String]` to a Scala `Seq[String]` [docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/interacting-with-java.html#:~:text=When%20you%E2%80%99re%20writing%20Scala%20code,as%20you%20would%20in%20Java)?
3. What are the semantic differences between Java’s `Optional` and Scala’s `Option`? When might you choose to convert one into the other?
4. How do you implement a Java interface with multiple methods using Scala’s `trait` syntax?
5. When exposing a Scala object to Java, why do Scala companion objects appear as static members? What happens to Scala’s default values and named parameters?
6. What is the recommended way to translate a Java `CompletableFuture` into a Scala `Future` so that you retain error handling and asynchronous semantics?
7. How does Java’s Stream API differ from Scala’s collection operations? What are the pros and cons of each when writing functional pipelines?
8. What are some patterns for using popular Java libraries like Jackson or Guava in Scala code? Which features of Scala (e.g., case classes) can simplify usage?
9. Why does Scala encourage avoiding `null` and using `Option` instead? How do you handle `null` values from Java APIs?
10. What pitfalls should you watch for when intermixing Java and Scala, such as raw types, overloading ambiguity, or checked exceptions?

### ✍️ Journal Prompts

1. **🧵 Interweaving Collections:** Reflect on a day’s work where you converted Java collections to Scala ones. What challenges did you face? How did using `CollectionConverters` simplify or complicate your code? Consider the interplay with `Option`/`Optional`.
2. **🚀 Bridging Futures:** Describe an experience converting `CompletableFuture`s to Scala `Future`s. How did error handling differ? Did you notice any performance or readability differences? How does this influence your choice of concurrency tool?
3. **🌉 Building Bridges:** Think about how the concepts of null-safety and optional types influenced your design decisions when using a Java library. Did you refactor or wrap the API to feel more “Scala‑like”? How did this deepen your understanding of both languages?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Write a Scala script that takes a `java.util.List[Int]` from Java code and sums the elements after converting it into a Scala `List[Int]`.
2. Create a Scala class that implements a Java interface (e.g., `Runnable`) and prints a message when run. Test it from a Java program.
3. Convert a Java `Optional[String]` to a Scala `Option[String]` and handle the absence case safely.
4. Implement a function that accepts a `CompletableFuture[Int]`, converts it to a Scala `Future[Int]`, and multiplies the result by two.
5. Use the Java Stream API in Scala to filter and map a list of integers, then compare the syntax to the equivalent Scala collection operations.
6. Write a simple Scala wrapper for a popular Java library (e.g., wrapping Jackson’s object mapper to serialise/deserialise case classes).
7. Explore type erasure by writing a Java generic method and calling it from Scala; examine the compiled signatures.
8. Build a JUnit test in Scala for a Scala class. Use `@Test` annotations and assert statements.
9. Create a minimal Spring Boot application that injects a Scala component. Pass data between Java controllers and Scala services.
10. Write a Scala script that catches a checked Java exception (e.g., `IOException`) and uses Scala’s `Try` or `Either` to handle it.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Collection Converter Library:** Implement a small library that wraps Java collections and provides Scala‑friendly methods, including conversion to/from `Option` and `Optional`.
2. **Java Library Port:** Choose a small Java utility library (e.g., for parsing CSV) and port its core functionality to idiomatic Scala, using `Option` instead of `null`.
3. **Interop CLI Tool:** Build a command‑line tool that reads JSON using Jackson (Java) and outputs processed results with Scala’s pattern matching and case classes.
4. **Spring & Scala Demo:** Create a simple web app using Spring Boot controllers (Java) and service/business logic implemented in Scala. Explore DI and configuration.
5. **Testing Harness:** Write a suite of JUnit and ScalaTest tests for the same Scala module to compare frameworks and show how each integrates with Maven/SBT.

### 🌐 Mega Projects (12+ hrs)

1. **Mixed‑Language Microservice:** Develop a microservice where the API layer is built in Java (perhaps using Spring Boot) and the core business logic is in Scala. Include asynchronous processing using both `CompletableFuture` and `Future`, convert between them, and implement integration tests.
2. **Scala‑to‑Java Interop Toolkit:** Create a toolkit that automates many common interop tasks—converting collections, options, futures, and building Java wrappers for Scala classes—along with documentation and example usage.

### 🔍 Libraries & Frameworks to Explore (Java/Scala/JVM)

- **Apache Commons Lang/IO:** Utility methods that you can call from Scala to enhance string and file handling.
- **Guava:** Google's core libraries; explore `Optional`, caching, and immutable collections.
- **Jackson Databind:** JSON serialisation/deserialisation library widely used in Java and Scala.
- **JUnit/JUnit 5:** Testing framework; see how to write Scala tests using it.
- **Spring Boot:** Framework for building microservices; experiment with embedding Scala classes.
- **Project Lombok:** For reducing boilerplate in Java; see how Scala’s case classes achieve similar goals without extra tools.

### 📖 Definitions

- **Java Interoperability:** The ability for Scala code to call Java classes/methods directly and vice versa; ensures reuse of existing JVM code.
- **Collection Converters:** APIs (e.g., `scala.jdk.CollectionConverters`) that convert `java.util` collections into Scala’s mutable/immutable collections and back.
- **Optional/Option:** `Optional` is Java’s container for possibly missing values introduced in Java 8; `Option` is Scala’s equivalent. Converting between them is essential when intermixing code.
- **Trait vs Interface:** Scala traits can have concrete methods and fields; when compiled, they map to interfaces with static helper methods on a companion class.
- **CompletableFuture vs Future:** Java’s `CompletableFuture` supports callback chaining and can be completed manually; Scala’s `Future` runs tasks asynchronously using an execution context and is more functional.

### 💡 Concepts

- **Seamless Usage:** Because both languages compile to JVM bytecode, Scala can use most Java code “as-is”[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/interacting-with-java.html#:~:text=This%20section%20looks%20at%20how,use%20Scala%20code%20in%20Java). Only special types (collections, `Optional`, varargs) need conversion.
- **Bridging Collections:** Java’s collections are mutable and untyped; Scala uses immutable and strongly typed collections. Converters transform them into idiomatic Scala data structures [docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/interacting-with-java.html#:~:text=When%20you%E2%80%99re%20writing%20Scala%20code,as%20you%20would%20in%20Java).
- **Null Safety:** Scala minimises null usage, encouraging `Option` to represent missing values. When calling Java, you must handle potential `null`s.
- **Exception Handling:** Java has checked exceptions; Scala does not. You’ll often wrap Java calls in `Try`/`Either` or handle exceptions explicitly.
- **Reflection & Bytecode:** Understanding how Scala compiles to classes helps when debugging interop issues, especially with generics and type erasure.

### 🧪 Applications

- **Wrapping Java APIs:** By converting Java collections and `Optional` values, you can wrap a Java API into a Scala-friendly facade that uses case classes, pattern matching and `Option`.
- **Using Scala in Java Projects:** You can gradually introduce Scala modules into existing Java codebases, exposing classes with Java‑compatible signatures (no top‑level functions). This allows teams to adopt Scala incrementally.
- **Cross‑language Concurrency:** Compose asynchronous pipelines by converting between `CompletableFuture` and Scala `Future`. This makes it possible to integrate Java frameworks like Spring WebFlux with Scala logic.
- **Testing & Tooling:** Use SBT to compile Scala sources alongside Maven or Gradle builds for Java; or use mixed build configurations so you can run both ScalaTest and JUnit.

### 📌 Additional Tips & Resources

1. **💡 Use `AnyRef` for Java generics:** When type parameters cannot be inferred, specify `AnyRef` or a specific class to help the compiler.
2. **🔁 Be mindful of varargs:** Scala methods using varargs become `Seq` in Java; conversely, Java varargs become arrays in Scala.
3. **🧰 Try SBT’s `javacOptions`:** When compiling Java sources with SBT, set flags for linting and warnings to ensure interop correctness.
4. **⚠️ Avoid Raw Types:** Raw Java generics lose type information; always specify type arguments when calling from Scala.
5. **🛠️ Use IDE support:** IntelliJ IDEA and Metals have excellent tools for navigating mixed Scala/Java projects.
6. **📜 Read Bytecode:** Use `javap` to inspect compiled Scala classes and see how Scala constructs map to Java constructs.
7. **🏗️ Explore `scala.reflect` API:** For advanced interop, reflection can generate Java proxies or interop code at runtime.
8. **🧪 Compare Test Frameworks:** Write the same tests using ScalaTest and JUnit; note differences in syntax and output.
9. **📦 Try Gradle’s Scala plugin:** Build mixed projects using Gradle and see how dependencies are resolved.
10. **🔄 Evaluate conversion performance:** Some conversions (like large collection wraps) can be costly. Benchmark them using JMH.

### 💡 Project Ideas (optional)

1. **Java–Scala Cookbook:** Compile examples of common interop tasks into a small book with code and explanations.
2. **Document Parser:** Use Java’s Apache POI library to read Excel/Word files and process them with Scala functions.
3. **Web Crawler:** Use Java’s Jsoup library for HTML parsing and build a Scala pipeline that extracts data and analyses it.
4. **Configuration DSL:** Build a DSL in Scala that generates Java configuration classes for a framework like Spring.
5. **Monitoring Tool:** Use Java’s JMX and Scala’s concurrency to monitor JVM metrics and alert on thresholds.
6. **Type‑safe JDBC Wrapper:** Wrap Java’s JDBC API into a functional Scala layer that returns `Option`/`Either` instead of throwing exceptions.
7. **Gradual Migration:** Take a simple Java project and incrementally migrate modules to Scala, documenting each step.
8. **Case Class to Lombok Converter:** Generate Lombok‑annotated Java classes from Scala case classes and vice versa.
9. **Interop Logging Library:** Write a logging wrapper that exposes a unified API but can plug into Java’s SLF4J or Scala’s logging libraries.
10. **Custom Build Plugin:** Develop an SBT or Gradle plugin that simplifies building mixed projects, handling joint compilation and tests.
11. **CompletableFuture Playground:** Benchmark conversion functions between `CompletableFuture` and `Future` under load.
12. **RPC Bridge:** Build a small RPC framework where Java clients call Scala services via gRPC and convert data types at the boundaries.
13. **Event‑Driven Microservice:** Use Java frameworks (e.g., Spring Cloud Stream) to consume events and process them in Scala.
14. **Data Transformation Service:** Use Java’s Apache Commons CSV to parse data and transform it using Scala operations; output results with Jackson.
15. **Interoperability Linter:** Write a static analysis tool that scans mixed codebases for interop pitfalls (raw types, nulls, etc.) and offers fixes.
16. **Plugin for IntelliJ:** Create an IDE plugin that adds quick‑fixes for converting Optional/Option or Java collections in mixed projects.
17. **Hybrid WebApp:** Build a Play application that integrates Java libraries like Netty for networking and uses Scala for high‑level logic.
18. **Metadata Generator:** Use Java reflection and Scala macros to generate documentation of public APIs for mixed modules.
19. **Language Server Extension:** Extend Metals (Scala LSP) to better understand Java sources and provide interop suggestions.
20. **Case Study Blog:** Document a real world migration of a Java component to Scala; summarise findings, issues, and solutions.