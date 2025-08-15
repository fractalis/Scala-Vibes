## 🎯 Module 3 – Object‑Oriented & Functional Programming Fusion (Weeks 5–6)

This module explores how Scala harmoniously blends object‑oriented programming (OOP) with functional programming (FP). You will learn about advanced traits, inheritance, composition, and functional abstractions.

### 🔍 Research Topics (10)

1. **Advanced class design** – Study constructors with default and named parameters, visibility modifiers, getters/setters, and companion objects[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=Classes%20in%20Scala%20are%20blueprints,covered%20later%20in%20the%20tour).
2. **Inheritance and overriding** – Learn how subclasses extend classes and traits, override methods, and call superclass constructors.
3. **Composition with traits** – Understand how multiple traits can be mixed into a class to provide modular functionality[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=Traits%20are%20used%20to%20share,and%20therefore%20have%20no%20parameters).
4. **Abstract classes vs traits** – Compare when to use abstract classes and when to prefer traits.
5. **Companion objects** – Dive deeper into companion objects for factory methods, private constructors, and pattern matching unapply methods.
6. **Method notations** – Explore infix, postfix and prefix notation, operator overloading, and apply/update methods (e.g., defining `apply` in companion objects).
7. **Closures and anonymous functions** – Understand how closures capture variables and how to define anonymous functions with succinct syntax.
8. **Functional combinators** – Study common higher‑order combinators like `map`, `flatMap`, `filter`, `fold`, `scan`, and `zipWithIndex` in functional programming.
9. **Implicits and contextual abstractions (given/using)** – Learn how implicit parameters and contextual abstractions provide dependency injection and type class instances.
10. **OOP & FP interoperability** – Examine patterns where OOP and FP co‑exist gracefully, such as using ADTs inside classes or using traits to implement type class instances.

### 🔗 Validated Links (5)

|Resource|Why it’s useful|
|---|---|
|**Classes & Constructors (Tour of Scala)**[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=Classes%20in%20Scala%20are%20blueprints,covered%20later%20in%20the%20tour)|Demonstrates class definitions, constructors, and overriding methods.|
|**Traits (Tour of Scala)**[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=Traits%20are%20used%20to%20share,and%20therefore%20have%20no%20parameters)|Shows how traits are defined and extended.|
|**Scala 3 features – high‑level view**[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it)|Provides context for FP/OOP fusion and expressive type system.|
|**Pattern Matching (Tour of Scala)**[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Pattern%20matching%20is%20a%20mechanism,a%20series%20of%20if%2Felse%20statements)|Useful when writing `unapply` methods in companion objects.|
|**Scala Native features**[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features)|Illustrates how Scala can compile ahead‑of‑time, giving you an idea of low‑level interop when exploring native abstractions later.|

### ❓ Review Questions (15)

1. What are the benefits of using default and named parameters in constructors[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=class%20Point,var%20y%3A%20Int%20%3D%200)?
2. How do you restrict access to class members using `private` and `protected` modifiers[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=Private%20Members%20and%20Getter%2FSetter%20Syntax)?
3. Describe how multiple traits can be mixed into a single class and how conflicts are resolved.
4. When should you choose an abstract class over a trait?
5. What is a companion object, and how can it be used for factory methods?
6. Explain the `apply` and `unapply` methods and their roles in object construction and pattern matching.
7. Demonstrate prefix, infix and postfix method notation with examples.
8. What is a closure, and how does it capture external variables?
9. How do higher‑order combinators encourage functional style? Provide an example using `scan` or `zipWithIndex`.
10. What are implicit parameters/contextual abstractions, and how do they support type classes?
11. Give an example of an OOP structure that internally uses functional combinators.
12. How would you override a method from a trait and call the trait’s default implementation?
13. Describe how to create a private constructor and force usage of a companion object for instantiation.
14. What is the difference between `val`, `var`, and `def` in class definitions?
15. Explain how pattern matching can be used in combination with companion objects via `unapply`.

### 📔 Journal Prompts (3)

1. **OOP vs FP** – Reflect on your experience blending OOP and FP. Which style do you naturally gravitate toward? How does Scala make it easier to use both?
2. **Traits & composition** – Journal about designing a class with multiple traits. How does composition via traits compare to inheritance? Note any pitfalls you encounter.
3. **Implicit magic** – After learning about implicits/contextual abstractions, document how they reduce boilerplate. What concerns do you have regarding readability and maintainability?

### 🧪 Mini‑Coding Exercises (10)

1. **Default/named parameters** – Define a class `EmailConfig` with default host `"localhost"` and port `25`. Instantiate it using named parameters.
2. **Inheritance** – Create an abstract class `Animal` with an abstract method `sound`. Implement subclasses `Dog` and `Cat`. Override `sound` and add a new method `name`.
3. **Trait composition** – Create traits `Logger` and `Timestamped`. `Logger` should have an abstract method `log(message: String)`; `Timestamped` should provide a method `timestamp(): String`. Implement a class `ConsoleLogger` mixing in both traits.
4. **Companion factory** – Implement a class `User` with a private constructor and a companion object with `apply(name: String)` and `unapply` for pattern matching.
5. **Operator overloading** – Define a class `Vector2D(x: Double, y: Double)` and implement `+` and operators for vector addition and scalar multiplication using method names `+` and .
6. **Closures** – Write a function that returns another function which multiplies its input by a captured multiplier variable. Demonstrate using this closure.
7. **Combinators** – Use `scanLeft` to generate the running totals of a list of numbers.
8. **Implicit parameters** – Define a trait `Monoid[A]` with an `empty` and `combine(a: A, b: A): A`. Provide an implicit instance for `Int` and write a generic `sumList` that requires an implicit `Monoid`.
9. **Method notation** – Show the difference between calling a method in infix notation (`a + b`) versus standard notation (`a.+(b)`). Use your `Vector2D` class.
10. **Companion unapply** – Add an `unapply` method to your `Vector2D` companion to allow pattern matching on its components.

### 🧩 Mini‑Projects (5)

1. **Shape Hierarchy** – Create an abstract class `Shape` with methods `area` and `perimeter`. Implement `Circle` and `Rectangle`. Add a trait `Colored` to associate a color with each shape. Provide companion objects with factory methods.
2. **Event Logging Framework** – Design a trait `Appender` with a `write(msg: String)` method. Implement classes for console and file appenders. Create a logger class that mixes in appenders and a timestamp trait.
3. **Polynomial Arithmetic Library** – Implement a `Polynomial` class that stores coefficients in a `Vector[Double]`. Support addition, subtraction and multiplication via operator overloading. Provide a companion object with `apply` and `unapply`.
4. **Simple Dependency Injection** – Use implicits/contextual abstractions to inject a `Database` service into a repository class. Write a test harness providing a mock database.
5. **Type Class Demo** – Define a type class `Show[A]` with a method `show(a: A): String`. Provide instances for built‑in types and your own `Vector2D`. Write a generic function `printAll(list: List[A])(using Show[A])`.

### 🏗️ Mega Projects (2)

1. **Chat Application** – Build a chat application where each user is represented by a class. Messages are modeled as ADTs. Use traits for sending/receiving messages and mix them into user classes. Implement message persistence using implicit services.
2. **Functional Game Engine** – Design a simple 2D game engine using classes for game objects, traits for behaviors (e.g., movable, drawable), and functional loops (`foldLeft`/`scanLeft`) to update game state. Provide a DSL for describing game scenes.

### 📚 Libraries to Explore (5–10)

- **Akka Actors** – Actor model for concurrency and distribution; explore how actors encapsulate state and behavior.
- **Cats Effect** – Provides functional I/O and concurrency primitives (useful for the game engine project).
- **Shapeless or Magnolia** – Generic programming libraries enabling type‑class derivation.
- **Scalacheck** – Property‑based testing library.
- **Slick or Doobie** – Functional relational database access via monads and combinators.
- **Scala Native** – Ahead‑of‑time compilation to native code; inspect low‑level features like pointers and instant startup[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).

### 🎯 Project Ideas (20)

1. **Financial Portfolio Simulator** – Model accounts and trades as classes; use functional combinators to calculate performance.
2. **Plugin System** – Design a framework where features are added via traits mixed into a core application class.
3. **GraphQL Client** – Generate case classes from a GraphQL schema and use implicits to encode/decode JSON responses.
4. **Asynchronous File Server** – Use `Cats Effect` and `fs2` streams to serve files concurrently. Model requests as ADTs and handle them with pattern matching.
5. **Interactive Fiction Engine** – Represent scenes as case classes and transitions as functions. Compose scenes using combinators.
6. **Extensible Calculator** – Use type classes to add new operations without modifying existing code.
7. **HTTP Proxy** – Intercept and log HTTP requests/responses using traits for logging and pattern matching on request types.
8. **Machine Learning Toy** – Implement linear regression from scratch using functional style and classes to encapsulate model state.
9. **Reactive Dashboard** – Use Scala.js with Laminar to build a dashboard that updates based on WebSocket messages from an Akka HTTP server.
10. **Custom Serialization Framework** – Create a library that serializes case classes to a custom binary format using shapeless or Magnolia for type‑class derivation.
11. **Dependency Injection Container** – Use implicits/contextual abstractions to wire together services at runtime.
12. **ECS Game Engine** – Implement an Entity‑Component‑System using case classes for components and functions for systems.
13. **Real‑time Analytics** – Process streaming data with FS2 and display results in a Scala.js front‑end.
14. **Polymorphic Smart Home** – Model smart devices as traits and classes; implement patterns like observer and visitor.
15. **Code Linter** – Write a linter that checks for code style and anti‑patterns; use pattern matching on syntax trees.
16. **Chatbot Framework** – Build a DSL for defining chatbots; support commands, pattern matching on messages and state transitions.
17. **Transaction Manager** – Manage database transactions using Doobie; use type classes for different database operations.
18. **Scientific Computing Library** – Implement matrices and vectors with operator overloading and type classes for numeric operations.
19. **Interactive Notebook** – Combine Scala Native for performance‑critical code with Scala.js for UI to build a data‑analysis notebook.
20. **Social Network Model** – Model users, posts, comments and likes as classes; use functional patterns to analyze interactions.

### 🧠 Definitions, Concepts & Application

- **Abstract Class:** A class that may include abstract methods and can hold state. It can be partially implemented and subclassed.
- **Trait:** Similar to Java interfaces but can contain concrete methods and fields; used for composition[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=Traits%20are%20used%20to%20share,and%20therefore%20have%20no%20parameters).
- **Companion Object:** An object with the same name as a class; used to hold factory methods, apply/unapply, and shared state.
- **Implicit/Contextual Abstraction:** Mechanism for passing values implicitly into functions; widely used to implement type classes and dependency injection.
- **Closure:** A function that captures variables from its surrounding scope.
- **Higher‑Order Combinator:** A function that operates on or returns other functions (`map`, `flatMap`, `scan`, etc.).

**Concepts & Applications:**

- **Composition over inheritance:** Use traits to assemble behavior rather than relying solely on single inheritance.
- **Factory methods:** Provide `apply` methods in companion objects to encapsulate object creation and enforce invariants.
- **Pattern matching with `unapply`:** Use companion objects to allow case‑class‑like matching for ordinary classes.
- **Implicit instances:** Provide type class instances implicitly to let generic code operate on specific types without verbose syntax.
- **Fusion of OOP and FP:** Design classes to encapsulate state but use immutable data structures and functional combinators to manipulate it.

### 🌟 Other Helpful Tips (8)

1. **Prefer composition** (traits) over deep inheritance hierarchies.
2. **Use named/default parameters** to make APIs clearer and avoid parameter misordering.
3. **Document your implicits** – always comment or group implicit definitions to maintain clarity.
4. **Avoid overusing implicits** – while powerful, too many can make code hard to understand; consider alternatives like explicit parameters.
5. **Explore Scala Native** – to understand how Scala can compile to native code with instant startup and C interoperability[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).
6. **Study type classes** in Cats or Scalaz to see how implicits and companion objects enable ad‑hoc polymorphism.
7. **Experiment with operator overloading** to create DSLs but avoid making code cryptic.
8. **Balance FP and OOP** – choose the paradigm that best solves your problem; Scala lets you mix both gracefully.