## 🧭 Module 2 – Collections, Control Flow & Pattern Matching (Weeks 3–4)

This module dives deeper into Scala’s rich collection library, control structures, and pattern matching. You will learn how to manipulate data fluently and apply functional techniques.

### 🔍 Research Topics (10)

1. **Immutable vs mutable collections** – Revisit the characteristics and differences between immutable and mutable collections[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged).
2. **Concrete collection types** – Explore `List`, `Vector`, `Set`, `Map`, `ArrayBuffer` and `Queue`. Understand their performance characteristics and when to use each.
3. **Higher‑order methods** – Learn how methods like `map`, `filter`, `fold`, `reduce`, `flatMap` and `collect` transform collections.
4. **For comprehensions** – Study how `for` comprehensions provide syntactic sugar over `map`/`flatMap` and `filter` operations.
5. **Pattern matching & case classes** – Deepen your understanding of pattern matching syntax including guards, nested patterns, and extracting values from case classes[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Pattern%20matching%20is%20a%20mechanism,a%20series%20of%20if%2Felse%20statements)[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Matching%20on%20case%20classes).
6. **Sealed traits & ADTs** – Learn how sealed traits combined with case classes create algebraic data types (ADTs) used heavily in functional programming.
7. **Partial functions** – Investigate how partial functions model computations that are defined only for certain inputs and how they interplay with `collect` and pattern matching.
8. **Error handling: Option, Either & Try** – Study how to model optional values and error cases without exceptions.
9. **Pattern matching on collections** – Explore matching on sequences (e.g., `List(a, b, rest @ _*)`) and maps.
10. **Control structures** – Refresh knowledge of `if`, `while`, `do/while` and understand why they are rarely used compared to functional constructs.

### 🔗 Validated Links (5)

|Resource|Why it’s useful|
|---|---|
|**Mutable and Immutable Collections overview**[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged)|Explains differences and packages where collections reside.|
|**Pattern Matching (Tour of Scala)**[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Pattern%20matching%20is%20a%20mechanism,a%20series%20of%20if%2Felse%20statements)|Provides syntax for `match` expressions and examples.|
|**Case Classes (Tour of Scala)**[docs.scala-lang.org](https://docs.scala-lang.org/tour/pattern-matching.html#:~:text=Matching%20on%20case%20classes)|Shows how case classes work with pattern matching.|
|**Classes & Traits**[docs.scala-lang.org](https://docs.scala-lang.org/tour/classes.html#:~:text=Classes%20in%20Scala%20are%20blueprints,covered%20later%20in%20the%20tour)[docs.scala-lang.org](https://docs.scala-lang.org/tour/traits.html#:~:text=Traits%20are%20used%20to%20share,and%20therefore%20have%20no%20parameters)|Useful when defining ADTs using sealed traits.|
|**Scala 3 features – high‑level view**[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-features.html#:~:text=Looking%20at%20Scala%20from%20the,the%20following%20statements%20about%20it)|Reminder that Scala supports fusion of FP and OOP and runs on the JVM and in the browser.|

### ❓ Review Questions (15)

1. What packages contain immutable and mutable collections in Scala[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged)?
2. Compare `List` and `Vector` in terms of performance for random access and appending.
3. Explain the difference between `map` and `flatMap` and provide code examples.
4. How does a `for` comprehension translate into `map`/`flatMap` and `filter` calls?
5. Why are sealed traits used with case classes to define ADTs? Give an example.
6. Write a pattern that matches a list with exactly three elements; what happens if the list length differs?
7. How do partial functions differ from total functions? Describe a scenario where a partial function is appropriate.
8. When should you use `Option` versus `Either` or `Try` for error handling?
9. Using pattern matching, how would you extract the first element and the rest of a list?
10. Explain the purpose of pattern guards in `case` clauses.
11. What is the difference between `foldLeft` and `reduceLeft`? When might `reduceLeft` throw an exception?
12. How can you pattern match on a `Map[String, Int]` to find a specific key?
13. Describe how immutable collections help avoid side effects in concurrent programs.
14. What are some common pitfalls when using mutable collections in a multithreaded context?
15. Why might functional control structures (`map`/`fold`) be preferred over loops?

### 📔 Journal Prompts (3)

1. **Collection choices** – Reflect on how you decide between using `List`, `Vector`, or `Set` for a problem. Document real‑world scenarios from your projects where you might apply each.
2. **Pattern matching power** – Write about a situation where pattern matching dramatically simplified a problem compared to imperative code. What trade‑offs did you encounter?
3. **Error modeling** – Consider how you handle errors in other languages. How could using `Option`, `Either` or `Try` improve reliability and readability?

### 🧪 Mini‑Coding Exercises (10)

1. **List operations** – Write functions that perform element‑wise addition of two lists using `zip` and `map`. Handle lists of unequal length gracefully.
2. **Vector vs List** – Benchmark (using simple timing) appending 10 000 elements to a `List` vs a `Vector`. Observe performance differences.
3. **For comprehension practice** – Given two lists of names and actions, use a `for` comprehension to generate sentences like “Alice likes running.”
4. **Pattern matching on collections** – Write a function that takes a `List[Int]` and returns “empty,” “singleton,” or “longer” based on its length using pattern matching.
5. **Sealed trait ADT** – Define a sealed trait `Expr` with case classes `Number`, `Sum`, and `Prod`. Implement an `eval` function that computes the result.
6. **Partial functions** – Create a partial function that only accepts even numbers and multiplies them by 2. Use `collect` to apply it to a mixed list of ints.
7. **Option/Either/Try** – Write three versions of a division function: one returning `Option[Double]`, one returning `Either[String, Double]`, and one returning `Try[Double]`.
8. **Fold practice** – Implement `length` using `foldLeft`, and implement `reverse` using `foldLeft`.
9. **Pattern guard** – Write a match expression that matches `Person(age)` but only returns “adult” if `age >= 18`, otherwise “minor.”
10. **Queue simulation** – Use a mutable `Queue` to simulate a line of customers; support enqueue, dequeue and peek operations.

### 🧩 Mini‑Projects (5)

1. **CSV Data Analyzer** – Read a CSV file into a list of case class instances. Provide operations to filter by column, compute aggregates and output a summary report.
2. **Expression Evaluator** – Extend the `Expr` ADT with subtraction and division. Add support for variables using a `Map[String, Double]` environment.
3. **Immutable Shopping Cart** – Build an immutable cart that supports adding items, removing items, and computing totals. Use pattern matching to implement actions.
4. **Contact List Web Service** – Create a simple RESTful API (using `http4s` or Akka HTTP) that stores contacts in an in‑memory mutable map. Use pattern matching to route requests.
5. **Pattern‑Based Router** – Write a pattern matcher for command‑line arguments; e.g., commands like `add user`, `delete user`, `list users` matched to functions.

### 🏗️ Mega Projects (2)

1. **Collection Framework Benchmark Suite** – Build a program that benchmarks various collections (immutable vs mutable) on operations such as insertion, deletion, search and concatenation. Present results in a report with charts.
2. **DSL for Data Queries** – Create a domain‑specific language (DSL) for querying a collection of case class records. Support `where`, `select`, `sortBy` operations and compile them into Scala collections operations using pattern matching and for comprehensions.

### 📚 Libraries to Explore (5–10)

- **scala‑collection‑contrib** – Additional collection types not in the standard library (e.g., MultiSet, SortedMultiMap).
- **Monocle** – Optics library for manipulating nested immutable data structures.
- **scalaz or Cats** – Abstract collection operations and add functional combinators.
- **fs2** – Streaming library built on functional programming; great for processing large collections as streams.
- **kyo** – Library for effectful programming that integrates with collections and control flows.

### 🎯 Project Ideas (20 – Optional)

1. **Music Playlist Manager** – Manage playlists using lists and sets; support shuffle and search.
2. **Todo App with Undo** – Use immutable data structures to implement undo/redo functionality.
3. **Binary Tree Visualizer** – Construct binary trees from lists and visualize them using ASCII art.
4. **Functional Sudoku Solver** – Model the Sudoku board as a list of lists and solve it using backtracking and pattern matching.
5. **Bank Transaction Processor** – Process CSV transactions and generate account summaries using folds.
6. **Log File Analyzer** – Parse server log files and compute metrics like error counts or response times.
7. **Recipe Recommendation Engine** – Use case classes to model recipes and ingredients; implement search and recommendation.
8. **Mini Spreadsheet** – Represent cells as a map and evaluate simple formulas (sum, average) using pattern matching.
9. **File Organizer** – Organize files into folders based on their extensions; implement using `Queue` and `List`.
10. **Functional Minesweeper** – Build a command‑line Minesweeper game using immutable maps and pattern matching.
11. **Chess Move Generator** – Generate legal moves for chess pieces using ADTs and pattern matching.
12. **Movie Rating Aggregator** – Read JSON data of movie ratings, group by genre and compute averages.
13. **Mini ETL Pipeline** – Extract data from CSV, transform using functional operations, load into JSON or database.
14. **Immutable Graph Library** – Represent graphs as adjacency lists and implement BFS/DFS with pattern matching.
15. **Calendar Event Scheduler** – Manage events in chronological order using ordered collections.
16. **DNS Resolver** – Implement a simple caching DNS resolver using a mutable `Map` for cache and `Try` for error handling.
17. **Portfolio Tracker** – Track stock transactions and compute positions using `foldLeft`.
18. **Functional Hangman Game** – Use pattern matching to reveal letters and update game state.
19. **Deck of Cards Simulator** – Model cards as case classes and implement shuffling, drawing and sorting.
20. **E‑commerce Cart** – Use sealed traits to represent cart operations and pattern match to compute totals and apply discounts.

### 🧠 Definitions, Concepts & Application

- **Immutable Collection:** A collection that never changes after creation; operations return new collections[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged).
- **Mutable Collection:** A collection that can be modified in place[docs.scala-lang.org](https://docs.scala-lang.org/overviews/collections-2.13/overview.html#:~:text=Scala%20collections%20systematically%20distinguish%20between,leave%20the%20old%20collection%20unchanged).
- **Higher‑Order Function:** A function that takes another function as an argument or returns a function.
- **For Comprehension:** Syntactic sugar translating into `map`, `flatMap` and `filter` operations.
- **Partial Function:** A function defined only for a subset of its input domain.
- **Sealed Trait:** A trait that can only be extended in the same source file; useful for defining ADTs.
- **Option/Either/Try:** Types used to model missing values and errors without exceptions.

**Concepts & Applications:**

- **Functional collections**: Use operations like `map`, `fold` and `flatMap` to transform data without mutation.
- **Pattern matching on collections**: Deconstruct lists and trees elegantly; combine with partial functions for specialized transformations.
- **ADTs & exhaustivity checking**: Sealed traits with case classes allow the compiler to check that all cases are handled.
- **Error modeling**: Encapsulate failure and optionality in types, leading to safer code.

### 🌟 Other Helpful Tips (8)

1. **Use the REPL** to experiment with collection methods quickly.
2. **Prefer immutable collections** unless there’s a compelling performance reason to use mutable ones.
3. **Learn to use `scalafmt` and `scalafix`** to format and lint your code automatically.
4. **Read the collection performance characteristics** section in the Scala docs to pick the right data structure.
5. **Practice recursion** – Many collection operations can be implemented recursively; this deepens understanding.
6. **Avoid nulls** – Use `Option` instead; nulls can lead to `NullPointerException`.
7. **Leverage pattern guards** to add extra boolean conditions in match cases.
8. **Explore `scala‑collection‑contrib`** for specialized data structures like multi‑maps and tries.