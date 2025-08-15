## Module 4 – Concurrency & Asynchronous Programming (Weeks 7–8)

### 🎯 Research topics

- **Concurrency vs parallelism** – what they mean, why concurrency relates to structuring overlapping tasks and parallelism to executing many tasks at the same time.
- **The `Future` API** – creating futures, mapping and flat‑mapping, using combinators to compose asynchronous computations, and using `ExecutionContext` and thread pools to schedule work.
- **Promises and callbacks** – how promises provide a handle to complete a future and how callbacks execute when values arrive, including pitfalls like callback hell.
- **Handling errors in asynchronous code** – capturing exceptions in futures, recovering from failures, using `Try`/`Either` wrappers and supervision strategies.
- **Actors and message‑driven concurrency** – exploring Akka’s actor model where encapsulated actors exchange messages without locks. Actors avoid blocking by using message passing[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/typed/guide/actors-intro.html#:~:text=Use%20of%20actors%20allows%20us,to).
- **Fiber‑based concurrency** – understanding how ZIO’s fibers are lightweight threads, scheduled by the runtime, consuming little memory and supporting interruption[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO).
- **Cats Effect & IO** – using the `IO` monad for asynchronous computations, exploring its fiber implementation and resource safety[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Fast%3A%20Cats%20Effect%20provides%20lightweight,fast%20even%20under%20extreme%20load).
- **Reactive programming** – introduction to Reactive Streams and libraries like FS2 or Akka Streams for back‑pressure and data flows.
- **Concurrency patterns** – exploring fan‑out/fan‑in, workers, producers and consumers, pipelines and queues.
- **Testing concurrent code** – strategies for deterministic tests, using timeouts, simulated schedulers and property‑based testing.

### 🔗 Validated links (bullet list with descriptions)

- **Scala concurrency chapter** – official book chapter that introduces futures. It explains that a `Future` represents a value that may not yet be available and contrasts futures with actors[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=When%20you%20want%20to%20write,and%20covered%20in%20this%20chapter).
- **Akka actor model** – the Akka guide on how the actor model addresses modern concurrent systems. It shows that message passing avoids locks and actors process messages sequentially[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/typed/guide/actors-intro.html#:~:text=Use%20of%20actors%20allows%20us,to).
- **ZIO basic concurrency** – ZIO documentation explaining fibers, light‑weight virtual threads that consume little memory and can be interrupted safely[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO).
- **Cats Effect overview** – the Cats Effect site highlights its lightweight fibers, resource safety, back‑pressure and cancellation features for building asynchronous applications[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Fast%3A%20Cats%20Effect%20provides%20lightweight,fast%20even%20under%20extreme%20load).
- **Scala concurrency vs actors** – a short comparison of futures and actors: futures handle one‑shot computations and provide callbacks, whereas actors are long‑lived and handle many messages[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=When%20you%20want%20to%20write,and%20covered%20in%20this%20chapter).

### ❓ Review questions

1. What is the difference between **concurrency** and **parallelism**?
2. How does a `Future` represent an asynchronous computation in Scala, and how is it different from a Java `Thread`[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=When%20you%20want%20to%20write,and%20covered%20in%20this%20chapter)?
3. Explain how **promises** relate to futures. How do you complete a promise?
4. What is an `ExecutionContext` and why is it needed when running a future?
5. Describe two strategies for **handling exceptions** in asynchronous code.
6. How do actors use **message passing** to avoid locking and blocking[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/typed/guide/actors-intro.html#:~:text=Use%20of%20actors%20allows%20us,to)?
7. What are **fibers** in ZIO and why are they more scalable than OS threads[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO)?
8. What benefits does **Cats Effect** provide compared to plain futures[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Fast%3A%20Cats%20Effect%20provides%20lightweight,fast%20even%20under%20extreme%20load)?
9. Give an example of a **fan‑out/fan‑in** pattern and explain why it is useful.
10. How do you test time‑dependent asynchronous code deterministically?
11. When would you choose actors over futures? When would you prefer ZIO or Cats Effect?
12. What is back‑pressure and why is it important in reactive streams?
13. Explain the difference between **blocking** and **non‑blocking** operations. Give examples.
14. How does a scheduler decide which thread or fiber to run a task on?
15. What are the trade‑offs of using callback‑based APIs versus monadic APIs (e.g., `Future`/`IO`)?

### 📝 Journal prompts

1. Reflect on the **research topics** you studied today. How do concurrency abstractions like futures, actors and fibers solve similar problems in different ways? Compare their trade‑offs using examples.
2. Consider a project idea where you combine **asynchronous I/O** with **message‑driven actors**. Describe how you would structure the components and what potential pitfalls you foresee.
3. Write about how understanding **error handling** in asynchronous code affects your confidence. How can you integrate testing strategies to ensure reliability in concurrent programs?

### 🧪 Mini‑coding exercises (1–3 hrs each)

1. **Future basics** – write a program that creates several futures performing arithmetic operations and composes them using `map`/`flatMap`. Print the results when they complete.
2. **Promise completion** – implement a function that returns a future backed by a promise. After a delay, complete the promise; handle both success and failure cases.
3. **Execution contexts** – create your own `ExecutionContext` backed by a fixed thread pool and measure the difference in execution time vs. the global context.
4. **Error recovery** – write a function that calls an external API asynchronously. Simulate network failures and recover gracefully using `recover` or `recoverWith`.
5. **Actor ping‑pong** – using Akka, create two actors that send messages back and forth and count the number of exchanges before stopping.
6. **Fiber fork/join** – in ZIO or Cats Effect, launch two fiber‑based computations (e.g., computing Fibonacci numbers) and join them.
7. **Reactive stream** – build a small FS2 stream that generates numbers, processes them concurrently and collects results with back‑pressure.
8. **Concurrent file processing** – read a large file concurrently (split into chunks), process each chunk asynchronously and merge results.
9. **Timeouts** – implement a function that runs a future but cancels it if it does not complete within a given time limit.
10. **Thread vs. fiber** – compare memory usage and execution time between a program that spawns thousands of OS threads and one that spawns thousands of fibers.

### 💼 Mini‑projects (5–12 hrs)

1. **Chat server using actors** – implement a simple chat server using Akka actors. Clients connect via WebSockets or TCP and actors handle user sessions and broadcast messages.
2. **Asynchronous web crawler** – write a crawler that fetches pages concurrently using futures or Cats Effect and extracts links. Use a queue to avoid visiting the same URL multiple times.
3. **Task scheduler** – build a scheduling service that accepts tasks via an API and executes them at specified times using futures and timers. Persist tasks and handle retries.
4. **Concurrent prime sieve** – implement a concurrent version of the Sieve of Eratosthenes that distributes ranges among workers and merges results.
5. **Real‑time dashboard** – build a real‑time dashboard that consumes an event stream (e.g., stock prices) and updates a UI. Use reactive streams with back‑pressure to control data flow.

### 🏆 Mega projects (12+ hrs)

1. **Distributed task queue** – design a distributed task queue system using actors (Akka Cluster) or ZIO and message brokers. Ensure tasks are delivered reliably, support retries and scale horizontally.
2. **Functional concurrency library** – implement your own small concurrency abstraction inspired by `Future` and `IO`. Include combinators, error handling and resource management. Benchmark against built‑in libraries.

### 📚 Libraries/JVM technologies to explore

- `scala.concurrent.Future` & `Promise`
- **Akka actors & Akka Streams** for message‑driven systems
- **ZIO** (fibers, effect system)
- **Cats Effect** & **Cats IO**
- **Monix** (asynchronous tasks and observables)
- **FS2** (functional streaming)
- **Reactive Streams / RxScala**
- **ScalaCheck** (property‑based testing for concurrency)
- **Finagle** or **Akka HTTP** for asynchronous networking

### 💡 Project ideas (optional)

1. **Concurrent image processor** – download images concurrently, resize them and upload them to cloud storage.
2. **File synchronization tool** – monitor a directory for changes and synchronize files to a remote server concurrently.
3. **Concurrency benchmarks** – measure the performance of futures, actors, fibers and threads on various tasks.
4. **Online multiplayer game server** – handle game state and player interactions concurrently using actors or ZIO.
5. **Notification system** – build a service that consumes events and sends notifications via email/SMS with retries and throttling.
6. **Concurrent data pipeline** – process streaming sensor data, apply transformations and store it in a database.
7. **Microservices orchestration** – coordinate multiple microservices using asynchronous calls and handle failures gracefully.
8. **Parallel machine learning** – parallelize matrix operations or training tasks using concurrency primitives.
9. **Serverless function framework** – implement a basic serverless runtime that executes user functions concurrently in isolated contexts.
10. **Websocket chat client** – build a client using reactive streams to communicate with a server in real time.
11. **Priority queue scheduler** – design a scheduler that supports priority tasks and fair queuing.
12. **Concurrent simulation** – simulate a physics or traffic system where entities move concurrently and interact.
13. **Resource pool manager** – implement a resource pool (e.g., database connections) with concurrency safety.
14. **Concurrent shell** – build a shell that runs commands concurrently, capturing outputs and ordering results.
15. **File compression service** – compress large files concurrently and track progress using a UI.
16. **Actor‑based game engine** – design a simple game engine where each entity is an actor reacting to events.
17. **Asynchronous REST API wrapper** – wrap a third‑party API using `Future`/`IO` and provide a reactive interface.
18. **Concurrent sorting algorithms** – explore concurrent quicksort or mergesort implementations.
19. **Event‑driven IoT hub** – connect multiple IoT devices and process their events concurrently.
20. **Concurrency visualizer** – create a tool that visualizes the scheduling and execution of asynchronous tasks.

### 🧠 Definition Section

- **Concurrency** – structuring a program so that multiple tasks make progress at overlapping times; tasks may interleave on the same thread or run on separate threads.
- **Parallelism** – executing multiple tasks simultaneously on different processors/cores.
- **Future** – an abstraction representing a value that may not yet be available. When the computation completes, the future either contains the value or an exception[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/concurrency.html#:~:text=When%20you%20want%20to%20write,and%20covered%20in%20this%20chapter).
- **Promise** – a writable, single‑assignment container that completes an associated future by providing a value or an exception.
- **ExecutionContext** – a scheduler for running asynchronous computations; it manages threads and determines where callbacks run.
- **Actor** – a concurrency primitive that encapsulates state and behaviour; actors communicate by asynchronous message passing and process one message at a time[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/typed/guide/actors-intro.html#:~:text=Use%20of%20actors%20allows%20us,to).
- **Fiber** – a lightweight, managed thread provided by libraries like ZIO or Cats Effect; fibers consume very little memory and can be interrupted and scheduled efficiently[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO).
- **IO monad** – a data type in effect systems that represents a description of a program. It separates the definition of a computation from its execution and supports composition and concurrency[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Fast%3A%20Cats%20Effect%20provides%20lightweight,fast%20even%20under%20extreme%20load).
- **Back‑pressure** – a mechanism in reactive systems to slow down producers when consumers are overwhelmed.
- **Deadlock** – a state in which two or more tasks wait for each other indefinitely, preventing progress.

### 🔍 Concept Section

- **Composing asynchronous computations** – `map`, `flatMap`, for‑comprehensions and combinators like `zip` or `sequence` allow you to build complex workflows out of simple futures or IOs.
- **Error propagation and recovery** – asynchronous errors are represented inside futures or IOs. Use methods like `recover`, `fold`, `catchAll` or type class instances like `ApplicativeError` to handle failures gracefully.
- **Message‑driven architecture** – actors decouple senders and receivers via immutable messages. Because actors process messages sequentially, you avoid shared‑state race conditions[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/typed/guide/actors-intro.html#:~:text=Use%20of%20actors%20allows%20us,to).
- **Functional effects** – the `IO` and `ZIO` types model side effects as values. They provide referential transparency and enable reasoning about concurrency and resource safety[typelevel.org](https://typelevel.org/cats-effect/#:~:text=Fast%3A%20Cats%20Effect%20provides%20lightweight,fast%20even%20under%20extreme%20load).
- **Fibers vs threads** – fibers are scheduled onto fewer OS threads and can be created in large numbers. They support structured concurrency, timeouts and interruption[zio.dev](https://zio.dev/overview/basic-concurrency/#:~:text=ZIO%20is%20a%20highly%20concurrent,powers%20many%20features%20in%20ZIO).
- **Reactive streams** – stream libraries implement the publisher‑subscriber pattern with back‑pressure, allowing asynchronous data flows to be processed at the rate consumers can handle.
- **Deterministic testing** – using test schedulers or simulated time helps test concurrency deterministically; property‑based testing ensures that concurrency properties hold under many scenarios.

### ⚙️ Application Section

- **Building APIs** – wrap I/O‑bound operations (HTTP requests, database calls) in futures or IOs to avoid blocking threads. Compose operations using combinators and handle timeouts gracefully.
- **Actor systems** – divide a domain into actors (e.g., user sessions, workers, supervisors). Each actor processes messages sequentially and communicates using immutable messages. Use supervision strategies to restart failing actors.
- **Fiber‑based services** – write ZIO/Cats Effect programs where each request spawns a fiber. Use combinators like `parMapN` to run tasks in parallel; use resource management constructs like `use` or `bracket` to ensure resources are released.
- **Reactive data pipelines** – apply FS2 or Akka Streams to process streaming data with back‑pressure; combine flows and sinks; materialize results asynchronously.
- **Testing concurrency** – design test suites that simulate delays and failures. Use ScalaCheck to assert that results are consistent under different thread schedules.

### 🌱 Additional helpful tips

1. 🕒 **Measure and profile** – concurrency introduces overhead. Use profilers and metrics to understand where time is spent and adjust thread pools or fiber schedulers accordingly.
2. 🧯 **Avoid shared mutable state** – prefer immutable data structures or message passing to prevent race conditions.
3. 🧘 **Stay structured** – use structured concurrency constructs (e.g., fiber scopes) to ensure spawned tasks are joined or cancelled appropriately.
4. 🧠 **Learn by comparison** – implement the same problem using futures, actors and ZIO/Cats Effect. Compare code clarity, error handling and performance.
5. 🛡️ **Handle errors up front** – always plan for failure. Use timeouts, retries and fallback strategies to build resilient systems.
6. 🧾 **Read logs** – concurrency bugs can be subtle. Add contextual logging (including thread/fiber identifiers) to track execution paths.
7. 📑 **Document concurrency assumptions** – record which parts of your code are thread‑safe, which require synchronization and where side effects occur.
8. 📚 **Explore further resources** – the book _Functional Programming in Scala_ (the “Red Book”), blogs by Typelevel and the _Zionomicon_ for ZIO offer deep dives into effect systems.