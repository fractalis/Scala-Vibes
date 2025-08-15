## 🛠️ Module 5 – Build Tools, Testing & Cross‑Platform (Weeks 9–10)

### 🎯 Research topics

- **sbt fundamentals** – explore sbt as the primary build tool for Scala; understand its directory structure and tasks[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=You%20can%20use%20several%20different,Play%20web%20framework%2C%20and%20more).
- **build.sbt configuration** – learn how to declare project settings, dependencies, Scala version and plugins. Explore multi‑module builds.
- **Dependency management** – using Ivy/Maven repositories, specifying library versions and scopes, updating dependencies.
- **Custom tasks & plugins** – write your own sbt tasks, use plugins like sbt‑assembly, sbt‑native‑packager and scalafmt.
- **Packaging & publishing** – package applications as JARs, publish artifacts to Maven Central or a private repository.
- **Testing frameworks** – get familiar with ScalaTest, MUnit and uTest. Learn about test suites, assertions and test styles[docs.scala-lang.org](https://docs.scala-lang.org/getting-started/sbt-track/testing-scala-with-sbt-on-the-command-line.html#:~:text=There%20are%20multiple%20libraries%20and,a%20Scala%20project%20with%20sbt).
- **Test‑driven development (TDD)** – cycle of writing tests before code, continuous integration, code coverage tools.
- **Scala.js** – understand how Scala code can target JavaScript environments. Learn about linking, bundling and using JavaScript libraries[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,concurrency%20uses%20futures%20and%20promises).
- **Scala Native** – study the AOT compiler that produces native executables, low‑level primitives and C interoperability[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).
- **Alternative build tools** – look at Mill, Scala CLI and Gradle with the Scala plugin. Compare with sbt.

### 🔗 Validated links (bullet list with descriptions)

- **sbt overview** – Scala Book article describing sbt’s history as a build tool designed for Scala and supported by Lightbend[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=You%20can%20use%20several%20different,Play%20web%20framework%2C%20and%20more).
- **sbt directory structure** – the sbt documentation shows the standard `src/main` and `src/test` directories used for Scala, Java and resources[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=The%20sbt%20directory%20structure).
- **Creating a simple build.sbt** – the sbt article demonstrates a minimal `build.sbt` file with `name`, `version` and `scalaVersion` settings[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=Creating%20a%20first%20build).
- **Testing with ScalaTest** – the Scala documentation tutorial introduces ScalaTest within sbt: you create a project using `sbt new` and run tests via `sbt test`[docs.scala-lang.org](https://docs.scala-lang.org/getting-started/sbt-track/testing-scala-with-sbt-on-the-command-line.html#:~:text=There%20are%20multiple%20libraries%20and,a%20Scala%20project%20with%20sbt).
- **Scala Native features** – Scala Native docs highlight its AOT compiler, low‑level primitives, seamless native interop and instant startup time[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).

### ❓ Review questions

1. Why was sbt created specifically for Scala and how does it differ from Maven or Gradle[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=You%20can%20use%20several%20different,Play%20web%20framework%2C%20and%20more)?
2. Describe the standard directory structure expected by sbt[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=The%20sbt%20directory%20structure).
3. What key fields are required in a minimal `build.sbt` file[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=Creating%20a%20first%20build)?
4. How do sbt plugins extend the build tool, and what are some examples of useful plugins?
5. What is the role of `libraryDependencies` and how do you specify a dependency version?
6. How does sbt support **multi‑project builds**, and why is this useful for large codebases?
7. Compare ScalaTest, MUnit and uTest. When would you choose each framework[docs.scala-lang.org](https://docs.scala-lang.org/getting-started/sbt-track/testing-scala-with-sbt-on-the-command-line.html#:~:text=There%20are%20multiple%20libraries%20and,a%20Scala%20project%20with%20sbt)?
8. How do you run tests from the sbt command line and interpret the results[docs.scala-lang.org](https://docs.scala-lang.org/getting-started/sbt-track/testing-scala-with-sbt-on-the-command-line.html#:~:text=There%20are%20multiple%20libraries%20and,a%20Scala%20project%20with%20sbt)?
9. What benefits do you gain by practicing test‑driven development when building Scala applications?
10. Explain how Scala.js allows Scala code to run in a browser or Node.js environment[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,concurrency%20uses%20futures%20and%20promises).
11. What does Scala Native offer that the JVM does not[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features)? What trade‑offs should you consider when choosing Scala Native?
12. How can you publish your Scala library to Maven Central using sbt?
13. What are the steps to create a new sbt project using `sbt new`?
14. Discuss the pros and cons of alternative build tools like Mill or Scala CLI.
15. How can continuous integration tools integrate with sbt to automatically run builds and tests?

### 📝 Journal prompts

1. Today you configured an sbt project and wrote tests. Reflect on how the **project structure**, dependencies and testing frameworks affected your workflow. What difficulties did you encounter and how did you solve them?
2. Compare your experience building a Scala.js or Scala Native project. What did you learn about cross‑platform compilation, and how would you decide between JVM, JS and native targets?
3. Consider writing a plugin or custom task for sbt. How could automation improve your development process? Sketch out what this plugin might do and how you would test it.

### 🧪 Mini‑coding exercises (1–3 hrs each)

1. **Hello sbt** – initialize a new sbt project from scratch, define a `build.sbt` with `name`, `version` and `scalaVersion`, and implement a small program that prints “Hello sbt!”.
2. **Adding dependencies** – add the Cats library as a dependency. Write code using `Option` and `Validated` from Cats and compile it via sbt.
3. **Multi‑module build** – create two modules in one sbt build: a core library and an app that depends on it. Ensure both modules compile and run.
4. **ScalaTest basics** – write a few test cases using ScalaTest’s `AnyFunSuite` style to test your core library. Run them via `sbt test`[docs.scala-lang.org](https://docs.scala-lang.org/getting-started/sbt-track/testing-scala-with-sbt-on-the-command-line.html#:~:text=There%20are%20multiple%20libraries%20and,a%20Scala%20project%20with%20sbt).
5. **Custom sbt task** – define a simple task that counts the number of lines of code in your `src` directory.
6. **Scala.js build** – configure your sbt project to cross‑build for Scala.js. Create a small web page that calls Scala functions compiled to JavaScript and interacts with the DOM.
7. **Scala Native build** – set up a Scala Native project. Write a native C function and call it from Scala using `extern` to understand seamless interop[scala-native.org](https://scala-native.org/en/stable/#:~:text=,code).
8. **Testing with MUnit or uTest** – rewrite your ScalaTest tests in another framework to compare syntax and performance.
9. **Continuous integration** – write a GitHub Actions workflow file that runs `sbt compile` and `sbt test` on push.
10. **Formatting & linting** – add scalafmt and scalafix plugins to your build and configure them to enforce a coding style.

### 💼 Mini‑projects (5–12 hrs)

1. **Build a blogging engine** – create a multi‑module project with a data model, a rendering module (Scala.js front‑end) and a persistence module. Use sbt to orchestrate builds and tests across modules.
2. **Testing suite** – write a comprehensive test suite for an existing project using ScalaTest and property‑based testing. Integrate code coverage tools like scoverage.
3. **Package & deploy** – build a CLI application and package it using sbt‑native‑packager. Publish it to a private repository and create installation instructions.
4. **Scala Native CLI tool** – implement a small file‑copy utility in Scala Native. Compare its startup time and binary size to the JVM version[scala-native.org](https://scala-native.org/en/stable/#:~:text=).
5. **Scala.js & JavaScript interop** – build a front‑end using Scala.js that integrates with a JavaScript library (e.g., a charting library). Explore how to write facade types and interact with JavaScript APIs[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,concurrency%20uses%20futures%20and%20promises).

### 🏆 Mega projects (12+ hrs)

1. **Cross‑platform library** – design a library (e.g., a math or date library) that cross‑compiles to the JVM, Scala.js and Scala Native. Manage the build with sbt and write tests targeting all platforms.
2. **Build tool plugin** – implement a sbt plugin that automates a repetitive task in your workflow (e.g., generating documentation or scaffolding new modules). Publish it and write documentation for users.

### 📚 Libraries/JVM technologies to explore

- **sbt** core and its plugin ecosystem (sbt‑assembly, sbt‑native‑packager, sbt‑site)
- **ScalaTest**, **MUnit**, **uTest**, **ScalaCheck** (testing frameworks)
- **Scala.js** core and libraries such as `scalajs-dom` or `scalajs-react`
- **Scala Native** and libraries like `scalanative-posix` and `sn-bindgen`
- **Mill** and **Scala CLI** as alternative build tools
- **coursier** for dependency management and launching Scala applications
- **scoverage** and **scapegoat** for coverage and static analysis

### 💡 Project ideas (optional)

1. **Personal knowledge base** – build a personal knowledge manager with a Scala.js front‑end and a JVM back‑end. Use sbt to manage multiple modules and write tests for each.
2. **Native system utility** – create a native tool (e.g., a file deduplicator) and package it for multiple OSes using sbt‑native‑packager[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).
3. **Library release pipeline** – automate the release of a Scala library, including version bumping, changelog generation and publishing to Sonatype.
4. **Test harness** – write a test harness that generates random data and checks an algorithm using multiple testing frameworks.
5. **Static site generator** – implement a static site generator with a Scala.js front‑end preview and a JVM back‑end for file IO.
6. **Plugin collection** – develop a suite of sbt plugins to automate various tasks (e.g., code formatting, dependency updates) and document them.
7. **Dependency graph visualizer** – create a tool that reads `build.sbt` files and visualizes module and dependency graphs.
8. **Cross‑platform game** – build a simple game that runs on the JVM, in the browser and as a native binary, demonstrating cross‑compilation.
9. **Continuous deployment pipeline** – set up CI/CD pipelines that compile, test and deploy Scala projects automatically.
10. **Benchmarking harness** – write a small framework for benchmarking JVM vs. Scala Native vs. Scala.js for a given algorithm.
11. **Documentation generator** – implement a doc generator plugin for sbt that extracts comments and generates HTML/Markdown.
12. **sbt course** – create an interactive tutorial that teaches sbt fundamentals through exercises and tasks.
13. **Package manager** – design a simple package manager or plugin manager using sbt’s dependency resolver.
14. **Custom REPL** – build a REPL that loads dependencies dynamically using coursier and runs user code.
15. **Testing matrix** – build a tool that runs tests across multiple Scala versions and output formats.
16. **Native GUI app** – explore Scala Native’s bindings to create a desktop GUI application.
17. **Cross‑language build** – integrate Scala with another JVM language (e.g., Kotlin) in a single sbt project.
18. **sbt profiler** – develop a plugin that profiles sbt tasks and reports bottlenecks.
19. **JS library wrapper** – write scalajs typings for a JavaScript library and publish it for community use.
20. **Automated release notes** – create an sbt task that generates release notes from Git commit messages.

### 🧠 Definition Section

- **sbt (Simple Build Tool)** – the primary build tool for Scala. It was created for Scala projects and is supported by Lightbend[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=You%20can%20use%20several%20different,Play%20web%20framework%2C%20and%20more). sbt uses a Scala‑like DSL for configuring builds and runs tasks incrementally.
- **Project structure** – sbt expects a standard directory layout: `src/main/scala`, `src/main/java`, `src/main/resources`, `src/test/scala`, etc.[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=The%20sbt%20directory%20structure).
- **build.sbt** – a file that defines project settings, dependencies and tasks. A minimal file defines the project name, version and Scala version[docs.scala-lang.org](https://docs.scala-lang.org/overviews/scala-book/scala-build-tool-sbt.html#:~:text=Creating%20a%20first%20build).
- **Plugin** – an extension that adds tasks or settings to sbt. Examples include `sbt‑assembly` (fat JARs) or `sbt‑site` (documentation generation).
- **ScalaTest** – a popular testing framework that supports multiple styles. You can create a project with ScalaTest using `sbt new` and run tests via `sbt test`[docs.scala-lang.org](https://docs.scala-lang.org/getting-started/sbt-track/testing-scala-with-sbt-on-the-command-line.html#:~:text=There%20are%20multiple%20libraries%20and,a%20Scala%20project%20with%20sbt).
- **Scala.js** – a Scala compiler backend that targets JavaScript environments. It allows Scala code to run in browsers or Node.js and has access to JS libraries[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,concurrency%20uses%20futures%20and%20promises).
- **Scala Native** – an ahead‑of‑time compiler that produces native executables. It offers low‑level primitives and seamless interop with C code[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).
- **Continuous integration** – the practice of automatically building and testing code on every commit, often using tools like GitHub Actions.
- **Alternative build tools** – tools such as Mill, Scala CLI or Gradle that provide different models for building Scala projects. They trade off features, performance and configuration style.

### 🔍 Concept Section

- **Incremental compilation** – sbt only recompiles files that have changed, speeding up builds during development.
- **Dependency resolution** – sbt uses Coursier or Ivy to download and manage library dependencies. Version conflicts are resolved according to the dependency graph.
- **Multi‑project builds** – sbt lets you define multiple projects in a single build. You can specify dependencies between projects to organize code modules logically.
- **Task graph** – builds consist of tasks connected in a directed acyclic graph. sbt evaluates tasks lazily and caches results.
- **Test styles** – ScalaTest provides `FunSuite`, `FlatSpec`, `WordSpec`, etc., each offering a different way to write tests. MUnit offers a minimal syntax; uTest is lightweight.
- **Cross‑compilation** – sbt can build your code against multiple Scala versions or platforms (JVM, JS, Native), allowing you to maintain a single codebase across targets.
- **Plugin ecosystem** – a rich collection of plugins exists to automate packaging, formatting, static analysis and deployment.
- **Interop with Java/JS/C** – Scala’s cross‑platform tooling lets you interoperate with Java libraries on the JVM, JavaScript libraries in Scala.js and C libraries in Scala Native[scala-native.org](https://scala-native.org/en/stable/#:~:text=,code).

### ⚙️ Application Section

- **Configure dependencies** – use `libraryDependencies +=` in `build.sbt` to add libraries, specify versions and scopes (e.g., `Test`). Use `dependencyOverrides` to resolve conflicts.
- **Custom tasks** – define new tasks using sbt’s DSL to automate repetitive actions such as code generation or deployment. Use the `taskKey` and `:=` syntax.
- **Publishing** – set up `publishTo` and `credentials` in your build to publish artifacts. Use `sbt release` to manage versioning.
- **Testing** – run `sbt test`, `sbt testOnly` or `sbt ~test` for continuous testing. Write tests early and often to drive design decisions.
- **Scala.js projects** – enable the Scala.js plugin in `build.sbt`, define JS dependencies and configure bundling with tools like webpack or vite. Write facade types to call JavaScript APIs[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,concurrency%20uses%20futures%20and%20promises).
- **Scala Native projects** – enable the Scala Native plugin and configure `clang` and `libc`. Use `extern` objects to call C functions and explore low‑level primitives[scala-native.org](https://scala-native.org/en/stable/#:~:text=,code).
- **CI pipelines** – create workflow files (e.g., `.github/workflows/ci.yml`) that run sbt commands on push. Use caching to speed up dependency downloads.

### 🌱 Additional helpful tips

1. 🗂️ **Organize your build** – group related modules and tasks logically; large builds benefit from clear structure.
2. 🔄 **Use reload or `~`** – sbt’s `~` prefix automatically reruns commands when files change, providing immediate feedback.
3. ✍️ **Document your build** – comments in `build.sbt` or separate documentation help collaborators understand custom settings.
4. 🧪 **Keep tests fast** – isolate slow integration tests into a separate configuration and run them selectively.
5. 📦 **Manage versions centrally** – store library versions in variables to avoid duplicating values across modules.
6. 🛠️ **Explore plugins** – leverage the community: `sbt‑scalafmt` for formatting, `sbt‑scapegoat` for static analysis, `sbt‑revolver` for reloading apps.
7. 🌐 **Try alternative tools** – experiment with Mill or Scala CLI for small projects; they may offer quicker startup or simpler configuration.
8. 📖 **Read official docs** – sbt’s documentation and the Scala.js/Native guides provide examples and troubleshooting tips.[scala-native.org](https://scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features)