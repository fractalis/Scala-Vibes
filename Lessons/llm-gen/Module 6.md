## 🧪 Module 6 – Type Classes & Functional Libraries (Weeks 11–12)

### 🎯 Research topics

- **Understanding type classes** – study how type classes provide ad‑hoc polymorphism in Scala, letting you add new behaviour to closed types without inheritance[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=A%20type%20class%20is%20an,T).
- **Implementing type classes** – learn how to define type class traits and provide `given` or `implicit` instances in Scala 3 and Scala 2[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=The%20first%20step%20in%20creating,it%E2%80%99s%20written%20like%20this).
- **Common type classes** – explore functor, applicative, monad, monoid, semigroup, foldable and traversable. Understand their laws and how they model computation.
- **Cats library** – overview of Cats and its goals of providing modular, typeful and efficient functional programming abstractions[typelevel.org](https://typelevel.org/cats/#:~:text=Cats%20is%20a%20library%20which,in%20the%20Scala%20programming%20language).
- **Cats data types** – study `OptionT`, `EitherT`, `Validated`, `Writer`, `Reader`, `State`, `Kleisli` and how they aid in structuring effects.
- **Cats Effect** – dive deeper into the effect system. Understand `IO`’s asynchronous and concurrent capabilities, resource management and tracing features[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Asynchronous).
- **ZIO vs Cats Effect** – compare the design philosophy and capabilities of ZIO and Cats Effect, focusing on fibers, interruption and environment types[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO)[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Asynchronous).
- **Functional streaming** – look at FS2 streams for building pure, compositional streams; compare with Akka Streams.
- **Algebraic reasoning** – use type class laws to reason about program correctness; explore property‑based testing for functional abstractions.
- **Extending the ecosystem** – discover libraries built on Cats, such as http4s (HTTP), doobie (database), Circe (JSON) and fs2 (streams).

### 🔗 Validated links (bullet list with descriptions)

- **Type classes explained** – the Scala 3 book defines a type class as an abstract, parameterized type that lets you add new behaviour to closed data types without sub‑typing[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=A%20type%20class%20is%20an,T).
- **Type class implementation** – the book shows how to declare a parameterized trait (e.g., `Showable`) and provide instances with `given`/`implicit` values[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=The%20first%20step%20in%20creating,it%E2%80%99s%20written%20like%20this).
- **Cats overview** – the Cats documentation states that Cats provides functional programming abstractions that are core, binary‑compatible, modular, approachable and efficient[typelevel.org](https://typelevel.org/cats/#:~:text=Cats%20is%20a%20library%20which,in%20the%20Scala%20programming%20language).
- **Cats Effect concurrency** – the Cats Effect site highlights its `IO` monad for asynchronous and concurrent programming, using lightweight fibers and guaranteeing resource safety[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Asynchronous).
- **ZIO fibers** – ZIO documentation explains that fibers consume little memory, are interruptible and can be scheduled across OS threads[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO).

### ❓ Review questions

1. What is a **type class** and how does it differ from a regular trait[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=A%20type%20class%20is%20an,T)?
2. How do you implement a type class and provide instances in Scala 3 using `given`[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=The%20first%20step%20in%20creating,it%E2%80%99s%20written%20like%20this)?
3. Describe the purpose of the **Functor**, **Applicative** and **Monad** type classes. How do their laws ensure correctness?
4. What problems do **Monoid** and **Semigroup** solve, and how do they relate to combining values?
5. How does the Cats library aim to support functional programming in Scala[typelevel.org](https://typelevel.org/cats/#:~:text=Cats%20is%20a%20library%20which,in%20the%20Scala%20programming%20language)?
6. Give an example of using the `OptionT` transformer to lift an `Option` into a monadic context.
7. Explain the difference between `Validated` and `Either` in Cats. When would you use `Validated`?
8. What are the main differences between Cats Effect’s `IO` and ZIO’s `ZIO`? Consider concurrency models, environment types and error handling[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO)[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Asynchronous).
9. How do FS2 streams achieve compositional and resource‑safe streaming? Compare them with Akka Streams.
10. Describe how property‑based testing can be used to verify type class laws.
11. What is the `Kleisli` data type and where might it be useful?
12. How do you combine multiple type class constraints in a single function signature using context bounds or implicit/given parameters?
13. Explain the difference between `Writer` and `State` monads. How do they capture log output and state respectively?
14. What does it mean for a library to be **binary compatible**, and why is that important for Cats[typelevel.org](https://typelevel.org/cats/#:~:text=Cats%20is%20a%20library%20which,in%20the%20Scala%20programming%20language)?
15. How does Cats Effect handle resource management and cancellation[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Asynchronous)?

### 📝 Journal prompts

1. After implementing a simple **type class** (e.g., `Showable`), reflect on how this pattern allows you to add behaviour to types you don’t own. How does it compare to inheritance or extension methods?
    
    Suggest ways you could use type classes in your own code.
    
2. Explore a **functional library** (Cats, ZIO, FS2). Record how the abstractions provided by this library changed the way you write code. Which parts felt intuitive, and which required additional study?
    
3. Consider the advantages and challenges of using **two different effect systems** (Cats Effect vs ZIO). How would you decide which system to use for a project?
    

### 🧪 Mini‑coding exercises (1–3 hrs each)

1. **Implement a `Show` type class** – define a `Show` trait with a `show` method. Provide instances for `Int` and `Person` and add an extension method to use it elegantly[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=The%20first%20step%20in%20creating,it%E2%80%99s%20written%20like%20this).
2. **Functor & Monad laws** – implement generic functions to verify the identity and composition laws for functors and the left/right identity and associativity laws for monads using property‑based testing.
3. **Validated vs Either** – write functions that accumulate validation errors using `ValidatedNel` and compare them with `Either`‑based validation.
4. **Transformers** – use `OptionT` or `EitherT` to compose effects, such as reading configuration (which may fail) and performing asynchronous work.
5. **Cats Effect concurrency** – write a program that spawns several `IO` fibers to download data concurrently and then combine the results[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Asynchronous).
6. **ZIO environment** – create a small ZIO program that accesses an environment type (e.g., a configuration) and logs messages. Provide the environment using `ZIO#provide`.
7. **Functional streaming** – use FS2 to build a stream that emits random numbers, filters and maps them, and writes them to a file.
8. **Reader/Writer/State monads** – implement simple programs using the Reader, Writer and State monads from Cats. Compare how they manage dependencies, logs and state.
9. **Monoid & Semigroup** – define your own `Monoid` for a custom data type (e.g., `Vector3D`) and implement `combine` and `empty`.
10. **Kleisli composition** – use the `Kleisli` data type to chain functions that return `Either` or `Option`, avoiding nested map/flatMap calls.

### 💼 Mini‑projects (5–12 hrs)

1. **Functional microservice** – build a microservice using http4s. Use Cats Effect for concurrency, Doobie for database access, FS2 for streaming and Circe for JSON. Apply type classes to model domain behaviour.
2. **Configuration library** – implement a small library for loading and validating configuration files. Use type classes to define how different types are parsed and validated.
3. **Domain specific language (DSL)** – create a DSL for describing mathematical expressions. Define a type class for evaluation and provide interpreters for integer and floating‑point evaluation.
4. **Functional pipeline** – design a data processing pipeline using FS2 that consumes CSV data, transforms it using monadic functions and writes the results to multiple sinks.
5. **Effectful game engine** – develop a simple text adventure game using Cats Effect or ZIO. Use type classes to abstract over effect types and FS2 for user input streams.

### 🏆 Mega projects (12+ hrs)

1. **Streaming analytics platform** – implement a platform that ingests events, processes them using FS2 and persists them. Provide a REST API using http4s and ensure concurrency with Cats Effect or ZIO.
2. **Type‑class‑driven ORM** – build a mini ORM that uses type classes to convert between domain models and database rows. Support multiple effect types (Cats Effect and ZIO) and provide law‑tested abstractions.

### 📚 Libraries/JVM technologies to explore

- **Cats** core, free and mtl modules
- **Cats Effect** (effect system)
- **ZIO** and the **Zio Prelude**
- **FS2** (functional streams)
- **http4s** – HTTP server built on Cats Effect
- **Doobie** – type‑safe, functional database access
- **Circe** – JSON library built around type classes
- **Monix** – reactive streams and tasks
- **scalaz** – historic type class library
- **shapeless** – generic programming library using type classes

### 💡 Project ideas (optional)

1. **Functional to‑do app** – build a full‑stack to‑do application using http4s, Doobie and FS2. Use type classes for serialization and validation.
2. **CSV/JSON converter** – implement a converter that reads CSV files and outputs JSON, using type classes to support multiple data formats.
3. **Type‑safe SQL DSL** – create a DSL for building SQL queries with type safety. Provide type class instances for converting Scala types to SQL types.
4. **Algebraic calculator** – design an algebraic expression evaluator using the Free Monad or Tagless Final style. Provide interpreters for evaluation and printing.
5. **Async job scheduler** – build a scheduler with Cats Effect or ZIO that manages timed jobs, persists them and handles failures and retries.
6. **FS2 file watcher** – watch a directory for new files using FS2 streams and process them with concurrency and back‑pressure.
7. **Functional WebSocket chat** – implement a chat server using FS2 and http4s. Use type classes to abstract over serialization.
8. **Effect‑agnostic logging library** – design a logging library that works with any effect type (Cats IO, ZIO, Monix). Use type classes to abstract over effect types.
9. **Monoid‑based analytics** – compute statistics (mean, variance, histograms) using monoids and foldables to combine data streams.
10. **Graph traversal library** – create a library that uses monads and monoids to perform breadth‑first and depth‑first search on graphs.
11. **Functional CLI builder** – implement a CLI parser using the Reader monad or Free Applicative. Provide interpreters for different effect types.
12. **State machine DSL** – build a DSL for describing finite state machines. Use type classes to define state transitions and side effects.
13. **Effect tracing tool** – build a tool that records the execution of Cats Effect or ZIO programs and visualizes their fiber trees and timing.
14. **Functional reactive UI** – experiment with Laminar (Scala.js) and Cats Effect to build a reactive front‑end.
15. **Rules engine** – design a rules engine using monads and monoids to combine rule evaluations.
16. **Streaming file compressor** – compress and decompress files using FS2 with a type class abstraction for compression algorithms.
17. **Functional query language** – create a query language interpreter using the Free Monad, with interpreters for evaluation and optimization.
18. **Typed configuration** – build a library that loads configuration from multiple sources and uses type classes for parsing and validation.
19. **Parallel data scraper** – implement a scraper that concurrently fetches pages and extracts structured data using effectful streams.
20. **Domain modeling toolkit** – assemble a toolkit for building domain models with smart constructors, validations and type class derivation.

### 🧠 Definition Section

- **Type class** – an abstract, parameterized type that allows you to add new behaviour to closed data types without modifying them or using inheritance[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=A%20type%20class%20is%20an,T). You provide implementations via `given` or `implicit` values.[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=The%20first%20step%20in%20creating,it%E2%80%99s%20written%20like%20this)
- **Functor** – a type class that supports the `map` operation, applying a function to a wrapped value while preserving structure.
- **Applicative** – extends Functor by providing `pure` (to lift a value) and `ap`/`map2` to combine independent computations.
- **Monad** – further extends Applicative with `flatMap`, enabling sequencing of dependent computations; satisfies left/right identity and associativity laws.
- **Monoid** – defines a binary associative operation and an identity element, enabling combination of values (e.g., numbers under addition).
- **Semigroup** – like a monoid but without an identity element.
- **Functor Hierarchy** – includes **Bifunctor**, **Contravariant**, **Invariant**, etc., each describing how functions act over parameterized types.
- **Type class laws** – algebraic laws (e.g., associativity, identity) that instances must satisfy to ensure predictable behaviour.
- **Free Monad** – a construction that allows you to build computations from any functor and provide interpreters later.
- **Tagless Final** – a style of encoding algebras using type classes and higher‑kinded types to abstract over effect types.

### 🔍 Concept Section

- **Ad‑hoc polymorphism** – type classes provide ad‑hoc polymorphism by decoupling behaviour from data types. Instances can be defined after the fact and automatically resolved by the compiler[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/ca-type-classes.html#:~:text=A%20type%20class%20is%20an,T).
- **Instance resolution** – Scala resolves type class instances using implicit search or `given` resolution. Specific instances can be overridden locally.
- **Composition of type classes** – many abstractions build upon each other. For example, a `Monad` is also an `Applicative` and a `Functor`. Composing instances yields derived behaviour.
- **Effect polymorphism** – by abstracting over effect types (e.g., using type class constraints like `Monad[F]`), you can write code that is agnostic to whether it runs in Cats Effect, ZIO or another system.
- **Transformers & stacks** – monad transformers (e.g., `OptionT`) layer effects, enabling composition of multiple effects such as state, logging and asynchronous I/O.
- **Type class derivation** – libraries like shapeless or Scala 3’s `derives` can automatically generate instances for case classes based on existing instances for their fields.
- **Law‑testing** – frameworks like discipline or cats‑laws let you test that your type class instances satisfy their laws. Combine with ScalaCheck for property‑based testing.
- **Interoperability** – Cats and ZIO provide type class instances for each other. You can use Cats abstractions on ZIO effects or vice versa.[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Asynchronous)[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO)

### ⚙️ Application Section

- **Designing APIs** – when designing libraries, expose functionality via type class constraints (e.g., `def sum[F[_]: Monad](xs: List[Int]): F[Int]`). This allows users to run your code in any effect type.
- **Writing interpreters** – build programs using Free Monads or algebras and write interpreters that map these abstract programs to specific effect types.
- **Combining effects** – use monad transformers or effect libraries like **Cats Mtl** or **ZIO environment** to stack multiple concerns (logging, state, validation, async) without tangling them.
- **Using data types** – adopt Cats’ data types (e.g., `Validated` for accumulating errors, `Writer` for logging, `State` for stateful computations) to write clearer, pure code.
- **Effectful streaming** – build streaming pipelines with FS2 or Akka Streams, leveraging their type classes for resource safety and concurrency.
- **Functional error handling** – prefer `Either`/`Validated` or type class based error handling instead of exceptions; propagate and recover from errors explicitly.
- **Type class derivation** – use automatic derivation (e.g., Circe’s `Encoder/Decoder`) to reduce boilerplate when serializing and deserializing domain objects.

### 🌱 Additional helpful tips

1. 📖 **Read “Scala with Cats”** – this book offers an accessible introduction to type classes and Cats. Work through the exercises.
2. 🧩 **Visualize type class hierarchies** – draw diagrams of how functor, applicative and monad relate; understanding the hierarchy helps in selecting the right abstraction.
3. 🔄 **Practice law‑testing** – use Cats’ `laws` and `discipline` libraries to test your instances. This builds confidence in your abstractions.
4. 🛠️ **Experiment with shapeless** – generic programming can automate type class derivation. Explore `Generic` and `LabelledGeneric` in shapeless.
5. 🧪 **Mix effect systems** – write examples that use both Cats Effect and ZIO. Understand how to convert between `IO` and `ZIO` to interoperate.
6. 🧱 **Start small** – when learning a new type class, implement instances for simple types (e.g., `Option`, `List`) before tackling complex data types.
7. 📚 **Explore the ecosystem** – libraries like http4s, Doobie, Circe and FS2 are built atop Cats and showcase type classes in action.
8. 🚦 **Watch for implicit clashes** – large imports can bring conflicting instances into scope. Use fully qualified names or local imports to resolve ambiguity.
9. 🎓 **Teach others** – explaining type classes to someone else helps cement your own understanding.
10. 🔍 **Stay curious** – functional programming evolves rapidly. Follow the Typelevel blog and community discussions to stay up to date.