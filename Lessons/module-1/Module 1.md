## 📦 Module 1 – Scala Fundamentals & Getting Started (Weeks 1–2)

### 🔍 Research Topics (10)

1. **What is Scala and why use it?** – Study the high‑level features of the language: high‑level syntax, expressive type system, fusion of object‑oriented and functional paradigms, and its ability to run on the JVM and in the browser[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it).
2. **Scala vs Java – key differences** – Explore how Scala simplifies boilerplate code, removes semicolons, and seamlessly interoperates with Java code[docs.scala-lang.org](https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#:~:text=At%20a%20Glance%3A%20Why%20Scala%3F). Pay special attention to how Scala’s `object` declaration replaces static methods[docs.scala-lang.org](https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#:~:text=What%20is%20less%20familiar%20to,first%20time%20it%20is%20used).
3. **Scala’s type system** – Investigate static typing with type inference, expressive types (generics, union types, variance annotations, type classes, etc.) and how they improve correctness and IDE support[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it)[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Expressive%20type%20system).
4. **Classes and objects** – Learn how classes encapsulate state and behavior, how primary constructors are declared in the class signature, and how to instantiate objects without the `new` keyword[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=Classes%20in%20Scala%20are%20blueprints,covered%20later%20in%20the%20tour).
5. **Traits and mixins** – Study how traits provide reusable interfaces and fields, similar to Java interfaces, and how classes extend traits[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=Traits%20are%20used%20to%20share,and%20therefore%20have%20no%20parameters)[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=trait%20Iterator%5BA%5D%20,A).
6. **Scala’s collection hierarchy** – Understand the difference between immutable and mutable collections; immutable collections never change, while mutable collections can be updated in place[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged).
7. **Pattern matching** – Explore Scala’s powerful pattern matching syntax which deconstructs values and can replace chains of `if/else` statements[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Pattern%20matching%20is%20a%20mechanism,a%20series%20of%20if%2Felse%20statements).
8. **Case classes** – Learn how case classes model immutable data and support pattern matching[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Matching%20on%20case%20classes).
9. **Getting started with sbt** – Research how to create Scala projects using sbt, manage dependencies and build tasks (see the Scala/Java Interop section for examples). The Scala for Java Programmers guide introduces sbt and dependency management[docs.scala-lang.org](https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#:~:text=Sidepoint%3A%20Third).
10. **Scala tooling** – Familiarize yourself with IDEs (IntelliJ IDEA, VS Code with Metals), the REPL, and the Scastie online playground for experimenting with Scala code quickly.

### 🔗 Validated Links (5)

|Resource|Why it’s useful|
|---|---|
|**Scala 3 features (Scala 3 Book)** – Official description of Scala’s high‑level and lower‑level features[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it).|Provides context on what makes Scala scalable and expressive.|
|**Scala for Java Programmers tutorial** – Differences between Scala and Java, and how to interoperate[docs.scala-lang.org](https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#:~:text=At%20a%20Glance%3A%20Why%20Scala%3F)[docs.scala-lang.org](https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#:~:text=Let%E2%80%99s%20look%20at%20an%20example,Switzerland%20use%20the%20same%20conventions).|Shows how to import Java classes and explains why Scala is “Java without semicolons.”|
|**Mutable vs immutable collections guide**[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged).|Explains how Scala collections differ by mutability and default choices.|
|**Pattern Matching (Tour of Scala)**[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Pattern%20matching%20is%20a%20mechanism,a%20series%20of%20if%2Felse%20statements).|Introduces the `match` expression, case clauses and pattern deconstruction.|
|**Classes and Traits (Tour of Scala)**[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=Classes%20in%20Scala%20are%20blueprints,covered%20later%20in%20the%20tour)[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=Traits%20are%20used%20to%20share,and%20therefore%20have%20no%20parameters).|Covers class definitions, constructors, traits and mixins.|

### ❓ Review Questions (15)

1. What does “Scala is scalable” mean, and what high‑level features support this claim[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it)?
2. Describe how Scala interacts seamlessly with Java and why most Java libraries can be reused without wrappers[docs.scala-lang.org](https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#:~:text=At%20a%20Glance%3A%20Why%20Scala%3F).
3. How does Scala’s static type system feel dynamic to programmers[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it)?
4. Explain the purpose of the `object` keyword in Scala and how it differs from Java’s `static` keyword[docs.scala-lang.org](https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#:~:text=What%20is%20less%20familiar%20to,first%20time%20it%20is%20used).
5. What advantages do traits offer compared to abstract classes[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=Traits%20are%20used%20to%20share,and%20therefore%20have%20no%20parameters)?
6. Differentiate between an immutable and a mutable collection in Scala[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged).
7. How does pattern matching improve code readability compared to traditional `if/else` constructs[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Pattern%20matching%20is%20a%20mechanism,a%20series%20of%20if%2Felse%20statements)?
8. Why are case classes particularly useful for modeling data and pattern matching[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Matching%20on%20case%20classes)?
9. Write the Scala syntax for defining a simple `Point` class with two `Int` coordinates[[docs.scala-lang.org](http://docs.scala-lang.org)]([https://docs.scala-lang.org/tour/classes.html#:~:text=class Point,)](https://docs.scala-lang.org/tour/classes.html#:~:text=class%20Point,\)).
10. Explain the role of the primary constructor in a Scala class and how it differs from constructors in Java[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=This%20,it%20is%20tagged%20with%20the).
11. What is sbt, and why is it commonly used in Scala projects?
12. Name two widely used IDEs for Scala development and describe how they help productivity.
13. What is the difference between a method and a function in Scala?
14. How can the REPL or Scastie be used to experiment with Scala concepts quickly?
15. Give an example of a trait that defines an `Iterator` interface and a class that implements it[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=trait%20Iterator%5BA%5D%20,A).

### 📔 Journal Prompts (3)

1. **First impressions** – After reading about Scala’s high‑level features[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it), reflect on why you want to learn Scala. How does its blend of FP and OOP appeal to you compared to Java or other languages?
2. **Type system and classes** – Journal about how Scala’s type inference and expressive type system influence your understanding of static typing. What benefits do you foresee in your future projects?
3. **Traits & pattern matching** – Describe how traits and pattern matching can simplify code you’ve written in other languages. Can you think of past problems where these features would have helped?

### 🧪 Mini‑Coding Exercises (10, ~1–3 hrs each)

1. **Hello Scala!** – Write a Scala program using an `object` with a `main` method that prints your name and a fun fact about Akron, Ohio.
2. **Classes vs Objects** – Implement a `Counter` class with a mutable `count` field and methods to increment and decrement. Then create a companion `object` with an `apply` method for easy instantiation.
3. **Traits practice** – Define a `Greeter` trait with an abstract `greet(name: String)` method. Implement classes `FriendlyGreeter` and `FormalGreeter` that extend the trait with different messages.
4. **Immutable vs mutable collections** – Create a program that uses an immutable `List` and a mutable `ArrayBuffer`. Demonstrate adding and removing elements from both and print the results.
5. **Pattern matching basics** – Write a method that takes an `Int` and returns `"even"` or `"odd"` using pattern matching. Extend it to match negative numbers separately.
6. **Case classes** – Define a sealed trait `Shape` with case classes `Circle(radius: Double)` and `Rectangle(width: Double, height: Double)`. Write a function `area` that computes each shape’s area using pattern matching.
7. **Type inference** – Write a method `sumList` that takes a `List[Int]` and returns the sum. Explicitly specify the types at first, then remove them and rely on type inference; observe that the code still compiles.
8. **Companion objects** – Create a class `Student` with a companion `object Student` that includes an `apply` method for constructing a `Student` without `new`. Also include a static factory `fromCSV` that creates a `Student` from a comma‑separated string.
9. **Higher‑order functions** – Implement a function `transformList` that takes a `List[Int]` and a function `(Int => Int)` and returns a new list with the function applied to each element.
10. **Simple build with sbt** – Initialize a small sbt project (`build.sbt` and `src/main/scala/Main.scala`). Add a dependency on `scala-parser-combinators` and write a simple parser for comma‑separated numbers.

### 🧩 Mini‑Projects (5, ~5–12 hrs each)

1. **Command‑Line Address Book** – Create an immutable in‑memory address book. Use classes and case classes to model contacts. Provide functions to add, remove and search contacts by name or city.
2. **Unit Converter Library** – Build a small library that converts between units (e.g., Fahrenheit to Celsius, miles to kilometers). Leverage traits to define converters and pattern matching for selecting conversions.
3. **Simple Calculator** – Implement a basic calculator that parses and evaluates arithmetic expressions (using pattern matching on an AST). You can use `scala-parser-combinators` to parse input.
4. **Journal App** – Develop a CLI journaling app using case classes to represent entries. Persist data to a JSON file using a library like `circe` or `uPickle`.
5. **Library Explorer** – Use sbt to add dependencies on a few Scala libraries (e.g., `scalatest` for testing, `cats` for functional programming). Write small examples demonstrating at least two functions from each library.

### 🏗️ Mega Projects (2, 12+ hrs)

1. **Functional Collections Library** – Implement your own immutable collection (e.g., a linked list or binary tree). Support common operations such as `map`, `filter`, `fold`, and provide your own pattern matching deconstruction.
2. **Scala Playground** – Create a mini web application (using a simple HTTP server like `http4s` or `Akka HTTP`) that allows users to write Scala code snippets and see the output. This will require learning about routing, concurrency, and safely evaluating code.

### 📚 Libraries to Explore (5–10)

- **Scala Standard Library** – Understand `List`, `Vector`, `Map`, `Option`, and `Either`.
- **scalatest** – Testing framework for unit tests.
- **cats** – Functional programming abstractions (Functor, Monad, etc.).
- **circe** or **uPickle** – JSON encoding/decoding for your projects.
- **scala‑parser‑combinators** – Construct simple parsers for custom DSLs.
- **sbt** – The build tool you’ll use across modules.
- **metals** – Language server providing IDE features for VS Code.

### 🎯 Project Ideas (20 – Optional, varied length)

1. Create a **To‑Do List CLI** using immutable collections.
2. Build a **simple blog engine** that reads Markdown files and generates HTML.
3. Port a small **Java utility library** to Scala, highlighting idiomatic changes.
4. Implement **JSON to CSV converter** using pattern matching and case classes.
5. Write a **file watcher** that monitors directory changes and logs events.
6. Develop a **mini shell** with custom commands and pipeline operations.
7. Create a **GUI notepad** using Scala.js and Laminar.
8. Write a **calculator REPL** that supports variables and functions.
9. Implement a **simple chat server** with sockets and concurrency primitives.
10. Build a **unit testing harness** with custom assertions and test runners.
11. Implement a **REST API client** for a public API (e.g., GitHub) using `sttp` or `Akka HTTP`.
12. Develop a **command‑line diary** with encryption using `scala‑crypto` libraries.
13. Write an **RSS feed aggregator** that downloads and parses feeds concurrently.
14. Create a **feature‑flag management service** with file‑based configuration.
15. Implement a **crossword puzzle generator** using functional backtracking.
16. Build a **simple scheduler** for scheduling tasks and notifications.
17. Design a **book recommendation system** that reads from a CSV and suggests books based on genre.
18. Port a **small Android app** to Scala.js using Scala 3 and Laminar.
19. Develop a **data analysis notebook** using Scala Native and interfacing with C libraries for speed.
20. Build a **multi‑file static site generator** that uses sbt for building and optional Scala.js for interactive pages.

### 🧠 Definitions, Concepts & Application

- **Definition of Scala:** A statically typed, high‑level programming language that fuses object‑oriented and functional programming and runs on the JVM and in the browser[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it).
- **Class:** Blueprint for creating objects; contains members like methods and variables. The primary constructor is part of the class signature[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=Classes%20in%20Scala%20are%20blueprints,covered%20later%20in%20the%20tour).
- **Trait:** A mechanism for sharing interfaces and fields. Traits can be extended by classes and objects but cannot be instantiated[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=Traits%20are%20used%20to%20share,and%20therefore%20have%20no%20parameters).
- **Case class:** Special class that exports its constructor parameters, provides structural equality, and supports pattern matching[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Matching%20on%20case%20classes).
- **Immutable vs mutable collections:** Immutable collections never change, while mutable collections can be updated in place[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged).
- **Pattern matching:** Mechanism for checking a value against patterns and deconstructing it[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Pattern%20matching%20is%20a%20mechanism,a%20series%20of%20if%2Felse%20statements).

**Concepts & Applications:**

- **Fusion of OOP and FP:** Scala allows you to use classes, objects, and inheritance alongside higher‑order functions and immutability.
- **Type safety and inference:** Static types catch errors at compile time while type inference reduces verbosity.
- **Immutability:** Encourages safer concurrent programming by avoiding side effects; use immutable collections by default.[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged).
- **Trait composition:** Enables flexible code reuse similar to multiple inheritance; mix in multiple traits to extend functionality of a class.
- **Pattern matching on case classes:** Simplifies deconstructing complex data types and is widely used in functional data modeling[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Matching%20on%20case%20classes).

**Applications:** Use these concepts to build reliable and maintainable code. For example, model domain entities as case classes, use traits for service interfaces, and pattern matching to handle different cases of a sealed trait.

### 🌟 Other Helpful Tips (10)

1. **Install Metals in VS Code** – provides autocompletion, diagnostics and go‑to‑definition for Scala.
2. **Use the Scala REPL or Scastie** for quick experimentation with syntax and functions.
3. **Read the Scala Style Guide** to adopt idiomatic formatting early.
4. **Explore community libraries** at [index.scala‑lang.org](https://index.scala-lang.org/) to see what’s available.
5. **Join Scala communities** such as the Discord server or the /r/scala subreddit to ask questions and share progress.
6. **Version control your exercises** using Git; commit after completing each exercise or mini‑project.
7. **Document your learning** in a Notion page or README; use the journal prompts above.
8. **Practice test‑driven development (TDD)** with `scalatest` when implementing the mini‑projects.
9. **Explore build automation** by writing custom sbt tasks to run, test and package your applications.
10. **Use `scalafmt`** to format your code automatically and ensure consistency.