## 🖥️ Module 20 – Terminal UIs & System Scripting (Weeks 39–40)

**Why this matters:** Not every application needs a graphical interface. Terminal user interfaces (TUIs) are lightweight, accessible and ideal for dashboards, monitoring tools and interactive CLI applications. Scala’s scripting capabilities (Ammonite, Scala CLI) enable you to automate tasks and prototype ideas quickly without heavy build setups.

### 📚 Ten Research Topics

1. **TUI frameworks:** Explore TUI libraries such as Terminus (part of Creative Scala), Lanterna (Java library akin to curses), tui‑scala and JLine. Understand their capabilities for rendering text, colours, widgets and handling input.
2. **Creative Scala – Terminus:** Study how the Creative Scala project provides Terminus, a library for building terminal applications across JVM, JavaScript and Scala Native[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle).
3. **Ammonite scripting:** Investigate Ammonite’s REPL and scripting capabilities; learn how it improves on the default Scala REPL with syntax highlighting, multi‑line editing and loading dependencies[ammonite.io](https://ammonite.io/#:~:text=Ammonite%20lets%20you%20use%20the,the%20REPL%20or%20as%20scripts).
4. **Scala CLI:** Research Scala CLI as a modern tool for compiling, running and packaging Scala code. Compare it to sbt for scripting and small projects.
5. **Command‑line parsing:** Compare libraries like scopt, decline, case‑app and picocli. Understand how to define commands, options and subcommands.
6. **Automation & task runners:** Study how to automate system tasks (file manipulation, backups, HTTP requests) using Scala scripts and libraries like requests‑scala.
7. **Interactive dashboards:** Learn how to build interactive dashboards in the terminal that display real‑time data (e.g., system metrics, logs, stock prices).
8. **Text‑based games:** Explore designing interactive fiction and roguelike games using TUI libraries; learn about event loops and map rendering.
9. **Packaging CLI tools:** Research how to package scripts as native executables using GraalVM or Scala Native, and how to publish them as brew/apt packages.
10. **Remote scripting:** Look into using SSH libraries from Scala to run commands on remote servers; study secure credential handling and concurrency.

### 🔗 Validated Links (with descriptions)

- **Creative Scala – Terminus:** The Creative Scala website lists Terminus as a library for building terminal applications that runs on the JVM, JavaScript and Scala Native[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle).
- **Creative Scala mission:** Creative Scala’s goal is to create training materials and libraries that unleash digital creativity[creativescala.org](https://www.creativescala.org/#:~:text=Creative%20Scala%27s%20goal%20is%20to,libraries%20that%20unleash%20digital%20creativity), highlighting a community focus on non‑traditional programming approaches.
- **Ammonite scripting:** The Ammonite documentation states that it provides a modernised Scala REPL with syntax highlighting, multi‑line editing and the ability to load Maven artifacts[ammonite.io](https://ammonite.io/#:~:text=Ammonite%20lets%20you%20use%20the,the%20REPL%20or%20as%20scripts). It also explains that Scala scripts can be run without heavy project setup[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts) and aims to liberate code from heavyweight projects[ammonite.io](https://ammonite.io/#:~:text=The%20goal%20of%20Ammonite%20is,Scripts%20and%20run%20those%20later).
- **libGDX cross‑platform:** Even though primarily for games, libGDX’s cross‑platform model illustrates how the same code can be compiled for the desktop, browser and mobile[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS)—inspirational for TUI tools.
- **Scala for JavaScript Developers:** This page explains that Scala.js programs run in browsers and Node.js, and there are numerous libraries for React, Angular and other JavaScript frameworks[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of). This highlights that Terminus can run in JavaScript contexts.

### 🧠 Review Questions

1. What capabilities does the Terminus library provide for building terminal applications[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle)?
2. Compare Lanterna and Terminus. What advantages does each offer for TUI development?
3. How does Ammonite improve upon the default Scala REPL[ammonite.io](https://ammonite.io/#:~:text=Ammonite%20lets%20you%20use%20the,the%20REPL%20or%20as%20scripts)? Give examples of features that streamline scripting.
4. What are the benefits of using Scala CLI for scripts and small projects compared to sbt?
5. Describe how scopt and decline handle command‑line parsing. What are key differences in API style?
6. How can you build a dashboard that updates in real time within a terminal? What TUI framework features would you need?
7. Explain how you might structure a text‑based roguelike game using an event loop and map rendering.
8. What considerations are there when packaging a CLI tool into a native executable using GraalVM or Scala Native?
9. How does Ammonite allow you to include external libraries in scripts[ammonite.io](https://ammonite.io/#:~:text=Ammonite%20lets%20you%20use%20the,the%20REPL%20or%20as%20scripts)?
10. Describe the challenges of running scripts on remote servers; how can concurrency and error handling be managed?
11. What strategies can be used to test CLI applications and TUIs?
12. How might you convert a terminal application to run in a browser using Scala.js and Terminus[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle)?
13. What is the purpose of the `@main` annotation in Scala 3 CLI programs? How does it simplify entry points?
14. Explain the difference between interactive REPL usage and executing a `.sc` script file in Ammonite.
15. Describe how to handle asynchronous IO (e.g., HTTP requests) in a CLI tool using effect libraries like Cats Effect or ZIO.

### ✍️ Journal Prompts

1. **🎛️ Building TUIs:** After creating your first TUI dashboard, write about the experience. How did you handle layout and input? Did the library meet your expectations?
2. **📜 Script vs Project:** Reflect on situations where scripting with Ammonite was more productive than starting an sbt project. How did the REPL features improve your workflow[ammonite.io](https://ammonite.io/#:~:text=Ammonite%20lets%20you%20use%20the,the%20REPL%20or%20as%20scripts)[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts)?
3. **🕵️‍♂️ Automation Impact:** Document a system automation script you wrote. How did it simplify or improve a repetitive task? What challenges did you face handling errors and edge cases?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. **Argument Parser:** Build a CLI tool using scopt or decline that accepts flags (e.g., `-verbose`, `-output`) and prints parsed options.
2. **To‑Do List TUI:** Create a terminal to‑do list application using Terminus or Lanterna; support adding, editing and marking tasks complete.
3. **File Copier Script:** Write an Ammonite script that copies files from one directory to another and logs progress with colours.
4. **HTTP Fetcher:** Implement a script using requests‑scala to fetch data from a public API and display it in a formatted table in the terminal.
5. **System Monitor:** Build a dashboard that displays CPU and memory usage in real time; update values every second.
6. **Note‑Taking CLI:** Create a CLI tool that stores notes in JSON or CSV; support search and tagging.
7. **Interactive Fiction Prototype:** Develop a simple text adventure that parses user commands and updates game state.
8. **Remote Command Runner:** Use an SSH library to execute commands on a remote server and display output; handle authentication securely.
9. **Multicolour Chart:** Render a simple bar chart of random data in the terminal using a TUI library.
10. **CLI Installer:** Write a script that downloads a tool from GitHub releases and installs it in a user’s PATH; implement argument parsing and progress bar.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Terminal Dashboard:** Build a multi‑pane dashboard showing multiple data streams (e.g., logs, metrics, alerts) with interactive navigation and filtering.
2. **Personal Finance CLI:** Create an application that imports CSV bank statements, categorises transactions and outputs summaries and charts in the terminal.
3. **Text‑Based Game Engine:** Implement an engine for interactive fiction with a scripting language for rooms, items and NPC behaviours.
4. **Automated Backup Tool:** Write a tool that compresses and encrypts selected directories and uploads them to cloud storage; schedule via cron.
5. **Chat Client:** Develop a terminal chat client that connects to a messaging service (e.g., IRC, Slack via API) and supports emoji and notifications.

### 🌐 Mega Projects (12+ hrs)

1. **CLI Package Manager:** Create a package manager for managing small Scala scripts and binaries; implement commands to install, update, search and remove packages. Support native compilation via GraalVM.
2. **Terminal IDE:** Build a minimal integrated development environment within the terminal that includes syntax highlighting, file tree navigation, compilation and REPL integration.

### 📦 Libraries & Frameworks to Explore

- **Terminus:** Creative Scala’s cross‑platform TUI library[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle).
- **Lanterna:** Java library for text‑based GUIs, similar to curses.
- **tui‑scala:** Scala port inspired by tui‑rs; used to build dashboards and consoles.
- **JLine / fusesource Jansi:** Libraries for handling console input and coloured output.
- **Ammonite:** Modern REPL and scripting environment[ammonite.io](https://ammonite.io/#:~:text=Ammonite%20lets%20you%20use%20the,the%20REPL%20or%20as%20scripts)[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts).
- **Scala CLI:** Tool for running and packaging Scala code with minimal configuration.
- **scopt / decline / case‑app:** Command‑line parsing libraries with different API styles.
- **requests‑scala / sttp:** HTTP clients for making requests from scripts.
- **GraalVM / Scala Native:** Platforms for compiling Scala programs to native binaries.
- **log4s / fansi:** Logging and coloured text libraries for richer CLI output.

### 🧾 Definitions

- **Terminal User Interface (TUI):** An interface that uses text and ANSI escape codes to display information and accept input in a terminal.
- **REPL:** Read‑Eval‑Print Loop; an interactive environment that executes code line by line.
- **Scala CLI:** A command‑line tool for compiling, running and packaging Scala code without setting up sbt.
- **Command‑Line Parsing:** The process of interpreting CLI arguments and options into structured data using libraries.
- **Script:** A small, self‑contained program executed directly (often interpreted) without a build process.
- **Dashboard:** A UI that displays key information in panels or charts, often updated in real time.
- **Remote Execution:** Running commands or scripts on a different machine over a network connection.
- **Native Compilation:** Compiling Scala code to a platform’s native executable using GraalVM or Scala Native.
- **Interactive Fiction:** A narrative game genre where players type commands to interact with text descriptions.
- **Task Automation:** Using scripts to perform repetitive system tasks (file management, data retrieval) automatically.

### 💡 Concepts

- **Event‑Driven Programming:** TUIs handle input events (keypresses, mouse) and update the interface accordingly.
- **Functional CLI Design:** Using pure functions and algebraic data types to model commands and parse arguments.
- **Scripting vs Projects:** Scripts enable fast iteration and minimal boilerplate, while projects provide structure and dependency management.
- **Concurrency in TUIs:** Managing asynchronous IO (network, file system) while keeping the UI responsive; can use Futures, Cats Effect, ZIO.
- **Layout & Widgets:** Arranging text and UI components (tables, charts, forms) within limited terminal space using row/column grids.
- **Error Handling:** Catching and reporting errors gracefully in CLI tools; using Either or Try to model failures.
- **Input Abstraction:** Normalising input from keyboards, mice and remote terminals into a consistent event model.
- **Testing CLI:** Automating tests for CLI apps using golden files, unit tests and integration tests with expect‑like frameworks.
- **Distribution:** Packaging CLI tools for different platforms and distribution channels (Homebrew, apt, scoop).
- **Security:** Managing secrets and credentials securely when automating tasks or connecting to remote servers.

### 🛠 Applications (How to apply the principles)

- **Start with scripts:** Use Ammonite or Scala CLI to automate personal tasks (file renaming, data conversion) without creating an sbt project[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts).
- **Design TUIs with components:** Break dashboards into panels; use Terminus or Lanterna widgets to render tables, forms and charts.
- **Parse arguments elegantly:** Choose a command‑line parsing library that suits your style; define commands and options clearly.
- **Automate remote tasks:** Write scripts that use SSH libraries to manage servers, deploy code and monitor logs.
- **Monitor & visualise:** Build dashboards that poll APIs or system metrics and update the terminal view in real time.
- **Package as native:** Compile your scripts to native binaries using GraalVM or Scala Native for easier distribution.
- **Version control your scripts:** Keep scripts in a repository; use CI to run tests and ensure quality.
- **Iterate in the REPL:** Use Ammonite’s REPL for exploratory coding, loading dependencies on the fly and saving results[ammonite.io](https://ammonite.io/#:~:text=Ammonite%20lets%20you%20use%20the,the%20REPL%20or%20as%20scripts).
- **Integrate with CI/CD:** Use CLI tools in your CI pipeline to automate tests, packaging and deployments.
- **Ensure cross‑compatibility:** Test your scripts on multiple platforms (Linux, macOS, Windows) and adjust for differences in file paths and shell behaviour.

### 🎯 Project Ideas (optional)

1. **Interactive Stock Ticker:** Build a TUI that fetches and displays real‑time stock prices, with charts and alerts.
2. **Server Health Dashboard:** Monitor CPU, memory, disk usage and network traffic for multiple servers; display metrics in a multi‑pane TUI.
3. **Todoist CLI Client:** Create a CLI client for Todoist or another task management service; support offline mode and synchronisation.
4. **Git Manager:** Implement a tool that wraps Git commands with a cleaner interface; include visual commit history and stash management.
5. **Time Tracker:** Build a TUI time‑tracking app with start/stop timers, tags and reports; export data to CSV or JSON.
6. **Podcast Downloader:** Write a script that fetches podcast RSS feeds, downloads episodes, and organises them by date and podcast title.
7. **System Cleanup Tool:** Automate cleaning up old logs, temporary files and caches; include preview and confirmation.
8. **Text Adventure Generator:** Create a generator that compiles story scripts into interactive fiction games with branching narratives.
9. **DevOps Toolkit:** Combine multiple automation scripts into a cohesive CLI for deployment, log retrieval and environment management.
10. **Chatbot in Terminal:** Build a chatbot that uses NLP libraries to answer questions within a TUI interface.
11. **Email Inbox CLI:** Create a CLI tool for reading, searching and composing emails using IMAP/SMTP libraries.
12. **Backup Scheduler:** Schedule and manage backups to local or remote storage; support encryption and incremental backups.
13. **File Synchroniser:** Write a tool that synchronises directories across machines, handling conflicts and deletions gracefully.
14. **Recipe Manager:** Develop a TUI application that stores and organises recipes; include search, tagging and meal planning.
15. **Network Scanner:** Implement a CLI tool that scans your local network, discovers devices and reports open ports.
16. **Weather Dashboard:** Display weather forecasts and alerts from a public API; include ASCII art icons and coloured output.
17. **CSV Explorer:** Build a CLI tool for interactive exploration of CSV files; support filtering, summarisation and charts.
18. **Secure Password Manager:** Store and retrieve passwords securely from the terminal; use encryption and two‑factor authentication.
19. **News Aggregator:** Scrape news feeds or APIs and present headlines and summaries in a TUI with categories and search.
20. **Build System Runner:** Create a tool that orchestrates build commands for multiple projects; provide status and progress bars.