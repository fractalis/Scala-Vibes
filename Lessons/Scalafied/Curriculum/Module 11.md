## Module 11 – Cross‑Platform Scala: Scala.js & Scala Native (Weeks 21–22)

**Why this matters:** Scala isn’t just for the JVM; it targets JavaScript and native binaries too! Cross‑platform development lets you reuse your Scala skills across frontend web, mobile, embedded, and command‑line applications.

### 📚 Ten Research Topics

1. **Scala.js Basics:** Understand how Scala code is compiled to JavaScript and can run in the browser or Node.js. Scala.js allows Scala programs to run in the same environments as JavaScript[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,other%20JavaScript%20and%20Scala%20libraries).
2. **Building UIs:** Explore frontend libraries such as Laminar, scalajs‑react, Slinky, and Vue.js bindings. Compare them with React in JavaScript.
3. **Facades & Interop:** Learn how to write facade types and use `@JSImport`, `@JSGlobal`, and `@JSExportTopLevel` to interact with JavaScript libraries.
4. **Cross‑Building:** Research how to configure SBT for cross‑building shared code across JVM, JS, and Native targets using `crossProject` and `ScalaModule`.
5. **Scala Native Overview:** Study features of Scala Native: low‑level primitives, interop with C, and instant startup time[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).
6. **FFI (Foreign Function Interface):** Learn how to call C code from Scala Native using `extern` objects and pointer types[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=,code).
7. **Memory Management:** Investigate how Scala Native manages memory via stack allocation (`stackalloc`) and interacts with the garbage collector.
8. **Node.js & Tooling:** Examine JavaScript environments (Node.js, JSDOM, Playwright, Selenium) available for running tests and applications in Scala.js[scala-js.org](https://www.scala-js.org/doc/project/js-environments.html#:~:text=In%20order%20to%20decide%20how,you%20need%20to%20install%20separately).
9. **Bundling & Packaging:** Research how to bundle Scala.js applications with Webpack or Vite, manage dependencies, and produce optimized output.
10. **WebAssembly & WASM:** Explore the experimental Scala.js support for emitting WebAssembly and how it may integrate with Scala Native.

### 🔗 Validated Links (with descriptions)

- **Scala.js vs JavaScript:** The Scala for JavaScript Developers page notes that Scala.js lets Scala programs run in environments where JavaScript runs and highlights similarities and differences between the languages[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,other%20JavaScript%20and%20Scala%20libraries).
- **Scala Native Features:** Official Scala Native docs describe low‑level primitives, seamless interop with native code, and instant startup thanks to ahead‑of‑time compilation[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).
- **JS Environments:** Scala.js documentation explains how to configure Node.js, JSDOM, PhantomJS, Playwright, and Selenium as JavaScript execution environments[scala-js.org](https://www.scala-js.org/doc/project/js-environments.html#:~:text=In%20order%20to%20decide%20how,you%20need%20to%20install%20separately).
- **SBT Cross‑Projects Guide:** Guides on how to use `crossProject` to build code for JVM and JS/Native targets.
- **Laminar/Scala.js React Docs:** Documentation for building reactive UIs in Scala.js.

### 🧠 Review Questions

1. According to the Scala for JavaScript Developers page, how does Scala.js allow Scala programs to run in the same environments as JavaScript, and what are some high‑level differences between the two languages[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,other%20JavaScript%20and%20Scala%20libraries)[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,expressions%20all%20have%20return)?
2. What are facades in Scala.js? How do `@JSImport` and `@JSGlobal` help you interact with JavaScript libraries?
3. Explain how cross‑building works in SBT. What is a `crossProject` and how does it help you share code across JVM, JS, and Native?
4. What low‑level primitives does Scala Native offer, and how do they enable hand‑tuning performance[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features)?
5. How do you call a C function from Scala Native using an `extern` object[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=,code)? Provide an example signature.
6. Describe the memory management differences between Scala Native and the JVM. When would you use `stackalloc`[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=val%20vec%20%3D%20stackalloc,%2F%2F%20initialize%20fields)?
7. What are the different JavaScript environments supported by Scala.js and how do you configure one (e.g., Node.js vs JSDOM vs Playwright)[scala-js.org](https://www.scala-js.org/doc/project/js-environments.html#:~:text=In%20order%20to%20decide%20how,you%20need%20to%20install%20separately)?
8. How do bundlers like Webpack or Vite integrate with Scala.js builds? What advantages do they provide?
9. What is WebAssembly, and why might compiling Scala code to WASM be interesting?
10. Compare building a CLI tool with Scala Native versus Scala JVM. What are the pros and cons in terms of performance and portability?

### ✍️ Journal Prompts

1. **🖥️ From JVM to Browser:** After creating your first Scala.js application, reflect on the differences in build process, tooling, and debugging compared to a traditional JVM application. What surprised you about running Scala code in the browser[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,other%20JavaScript%20and%20Scala%20libraries)?
2. **🔌 Bridging Worlds:** Write about your experience writing facades for a JavaScript library. How did you model the API types? What obstacles did you encounter when mapping dynamic JS patterns to static Scala types?
3. **⚙️ Systems Programming:** Consider your experience using Scala Native for a small CLI or FFI project. How did managing memory and interfacing with C change your perspective on high‑level vs low‑level development[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=val%20vec%20%3D%20stackalloc,%2F%2F%20pass%20by%20reference)?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Set up a simple Scala.js project with SBT; write a `main` method that prints “Hello, Scala.js!” in the browser console.
2. Use Laminar or scalajs‑react to build a small UI that captures a user’s name and greets them when a button is clicked.
3. Write a facade for a small JavaScript library (e.g., `moment.js`) and use it from Scala.js to format dates.
4. Configure an SBT `crossProject` that shares a model package between a JVM backend and a Scala.js frontend.
5. Write a Scala Native program that calls a C function (e.g., `malloc`) via an `extern` object to allocate memory[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=,code).
6. Implement a small command‑line tool using Scala Native that parses arguments and prints a table; compare its startup time to a JVM version.
7. Use scalapb to generate both Scala.js and JVM versions of a gRPC client; invoke a service from the browser and command line.
8. Add bundling to your Scala.js project with Webpack or Vite; produce a minified JavaScript bundle and load it in a static HTML page.
9. Write tests for your Scala.js code using a JavaScript environment (e.g., Node.js or JSDOM) and integrate them into your SBT build[scala-js.org](https://www.scala-js.org/doc/project/js-environments.html#:~:text=In%20order%20to%20decide%20how,you%20need%20to%20install%20separately).
10. Experiment with WebAssembly: compile a small Scala function to WASM (using Scala Native or a prototype Scala.js WASM pipeline) and call it from JavaScript.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Personal Finance Dashboard:** Build a front‑end in Scala.js using Laminar or scalajs‑react that reads budget data from a JVM backend and displays charts.
2. **Shared Library:** Create a library of business logic shared between JVM and JS; cross‑compile it and demonstrate usage on both platforms.
3. **Native CLI:** Write a CLI for file processing in Scala Native, including options for parallel processing. Compare performance to a JVM version.
4. **Browser‑Based Game:** Develop a simple game (e.g., Tic‑Tac‑Toe or Snake) using Scala.js, emphasising functional UI patterns.
5. **FFI Demo:** Build a program in Scala Native that interfaces with a C library (e.g., SQLite) to perform database operations.

### 🌐 Mega Projects (12+ hrs)

1. **Full‑Stack Application:** Develop a full‑stack web application: a Play or http4s backend and a Scala.js frontend (Laminar or scalajs‑react). Share model code via a crossProject; implement authentication, routing, and real‑time updates via websockets.
2. **Cross‑Platform Library & Tooling:** Create a library that provides a unified API across JVM, JS, and Native for a domain (e.g., cryptography or configuration). Provide examples and documentation for using it in web, server, and CLI contexts.

### 🔍 Libraries & Frameworks to Explore

- **Laminar / outwatch / scalajs‑react:** Functional reactive UI libraries for Scala.js.
- **Slinky / udash / scala‑js‑vue:** Additional frameworks for building front‑end applications.
- **scalajs-dom:** Provides typed access to the DOM API from Scala.js.
- **scalajs‑bundler / vite‑plugin‑scala:** Tools for bundling Scala.js output with Webpack or Vite.
- **Scala Native:** AOT compiler for building native executables[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).
- **Scalapb JS:** gRPC Scala.js code generation.
- **CrossProject (sbt‑crossproject):** SBT plugin for cross‑building code.
- **C Interface Libraries:** Use C standard/POSIX libraries available in Scala Native’s package system.

### 📖 Definitions

- **Scala.js:** A Scala compiler target that generates JavaScript; allows Scala code to run in the browser or other JS environments[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,other%20JavaScript%20and%20Scala%20libraries).
- **Scala Native:** An ahead‑of‑time compiler for Scala that targets native binaries via LLVM; features low‑level primitives and fast startup[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=Scala%20Native%20is%20an%20optimizing,It%20features).
- **Facade:** A Scala.js trait or object that declares types and signatures for JavaScript APIs, enabling static typing when calling JS functions.
- **crossProject:** SBT configuration that builds a project for multiple targets (JVM, JS, Native) from a shared codebase.
- **JS Environment:** Execution environment for Scala.js code; could be Node.js, JSDOM, Playwright, PhantomJS, or a real browser[scala-js.org](https://www.scala-js.org/doc/project/js-environments.html#:~:text=In%20order%20to%20decide%20how,you%20need%20to%20install%20separately).
- **FFI:** Foreign Function Interface; mechanism that allows a program to call functions written in another language (e.g., Scala Native calling C functions[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=,code)).
- **Bundler:** Tool (Webpack, Vite) that bundles JavaScript (including compiled Scala.js output) into packages for the browser.
- **WebAssembly (WASM):** Binary instruction format for a stack‑based virtual machine; provides near‑native performance in web environments.

### 💡 Concepts

- **Single Codebase:** Write logic once and reuse it across server, client, and native applications via cross‑projects.
- **Static Typing for JS:** Facades provide compile‑time safety when interacting with untyped JavaScript APIs.
- **Low‑Level Control:** Scala Native offers direct pointers and stack allocation, giving developers fine‑grained control over memory[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=val%20vec%20%3D%20stackalloc,%2F%2F%20pass%20by%20reference).
- **Interop:** Both Scala.js and Scala Native emphasize seamless interop (with JavaScript and C respectively)[scala-native.org](https://www.scala-native.org/en/stable/#:~:text=,code)[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,other%20JavaScript%20and%20Scala%20libraries).
- **Optimised Output:** Ahead‑of‑time compilation for native code removes warm‑up time; Scala.js linking removes unused code for smaller bundles.
- **Tools & Environments:** Understanding available JS environments (Node, JSDOM, Playwright) helps choose the right testing and execution environment[scala-js.org](https://www.scala-js.org/doc/project/js-environments.html#:~:text=In%20order%20to%20decide%20how,you%20need%20to%20install%20separately).

### 🧪 Applications

- **Front‑End Development:** Use Scala.js to build interactive web UIs, leveraging static typing and functional patterns.
- **Shared Domain Models:** Define case classes and business logic once and reuse them across the backend and frontend via cross‑builds.
- **Systems Programming:** Write native CLI tools with Scala Native, benefiting from rapid startup and low memory overhead.
- **Interop with Libraries:** Use facades to call JavaScript libraries (e.g., D3.js) or C libraries (e.g., libcurl) with type safety.
- **Hybrid Apps:** Combine Scala.js for the UI, Scala JVM for business logic, and Scala Native for performance‑critical modules.

### 📌 Additional Tips & Resources

1. **📦 Use `fastLinkJS` & `fullLinkJS`:** `fastLinkJS` speeds up development builds; `fullLinkJS` generates optimized bundles.
2. **🌐 Use `@JSImport`:** Import JS modules to use ES modules; helps integrate modern JavaScript packages.
3. **🛠️ Set up Live Reload:** Tools like Vite enable hot reloading for Scala.js front‑end development.
4. **🔋 Optimise Memory:** In Scala Native, prefer `stackalloc` for short‑lived allocations; free resources via RAII patterns or scopes.
5. **🧰 Use `scala-js-dom`:** Avoid manually writing JS wrappers; `scala-js-dom` provides typed access to DOM APIs.
6. **⚠️ Understand Linking:** The Scala.js linker removes unused code; ensure tree‑shaking by avoiding dynamic imports.
7. **🧪 Test with JSDOM:** Use Node.js with JSDOM for headless testing of DOM interactions[scala-js.org](https://www.scala-js.org/doc/project/js-environments.html#:~:text=In%20order%20to%20decide%20how,you%20need%20to%20install%20separately).
8. **🎯 Learn React Patterns:** Libraries like scalajs‑react map React hooks to Scala; understanding hooks will help build modern UIs.
9. **🤖 Explore WASM Tools:** Keep an eye on Scala WASM; early experiments may yield cross‑target opportunities.
10. **📚 Follow Community:** Join Scala.js and Scala Native Discord channels for support and updates.

### 💡 Project Ideas (optional)

1. **IDE in the Browser:** Build a lightweight code editor in Scala.js that compiles code with Scala.js or remote services and displays results.
2. **Visual Data Explorer:** Use Scala.js with D3.js (via a facade) to create interactive data visualisations.
3. **Native Image Converter:** Write a CLI tool in Scala Native that converts images (e.g., PNG to JPEG) using an external C library.
4. **Cross‑Platform Chat App:** Implement a chat backend in JVM Scala, a CLI chat client in Scala Native, and a browser client in Scala.js.
5. **Shared Math Library:** Build a math library that is cross‑compiled to JVM, JS, and Native; use it in web and CLI programs.
6. **Graphical IDE Plugin:** Create a Scala.js plugin that runs inside an IDE (e.g., Theia) to provide static analysis features.
7. **IoT Dashboard:** Combine a Scala Native daemon reading sensor data (C libraries) with a Scala.js dashboard for monitoring.
8. **Browser Game Engine:** Develop a simple game engine in Scala.js that supports basic physics and sprite rendering.
9. **Configuration Manager:** Build a cross‑platform configuration library that reads environment variables and JSON files uniformly across targets.
10. **File Synchroniser:** Write a tool that syncs files between a server and a browser using websockets; share code between front‑end and backend.
11. **Photo Gallery:** Build a static site generator in Scala Native and a dynamic gallery viewer in Scala.js.
12. **Native HTTP Client:** Develop an HTTP client for Scala Native using C’s `libcurl` and a Scala facade.
13. **Financial Calculator:** Create a cross‑platform financial calculator library and UI; use crossProject to share logic.
14. **Virtual DOM Library:** Build a minimal virtual DOM implementation in Scala.js and compare it to React.
15. **Browser‑based IDE for Scala:** Implement a basic REPL and code editor in the browser using Scala.js; compile code via a backend service.
16. **Embedded Monitoring Agent:** Write a memory‑efficient agent in Scala Native that collects metrics from an embedded device and sends them to a server.
17. **Game AI Library:** Create a library of AI routines for games that is cross‑compiled to run both in the browser and on the server.
18. **Declarative UI DSL:** Design a DSL for building user interfaces in Scala.js, similar to React’s JSX but statically typed.
19. **Browser Extension:** Build a browser extension using Scala.js that modifies web pages on the fly.
20. **Cross‑Target Encryption Toolkit:** Implement common cryptographic functions (hashes, AES, RSA) in a library that runs on all Scala targets.