## 🧪 Module 14 – Testing, Debugging & Quality Assurance (Weeks 27–28)

**Why this matters:** High‑quality software requires rigorous testing and tooling. Scala offers multiple test frameworks, property‑based testing, code quality tools, and profiling techniques that ensure reliability and maintainability.

### 📚 Ten Research Topics

1. **Unit Testing Frameworks:** Compare ScalaTest, MUnit, Specs2, uTest, and JUnit for writing unit and integration tests.
2. **Property‑Based Testing:** Study ScalaCheck and ScalaTest’s property‑based testing support; explore how properties specify behaviour over many inputs[scalacheck.org](https://scalacheck.org/#:~:text=ScalaCheck%20is%20a%20library%20written,also%20ventured%20into%20its%20own)[scalatest.org](https://www.scalatest.org/user_guide/property_based_testing#:~:text=Property).
3. **Mocking & Stubbing:** Research mocking libraries such as Mockito‑Scala, ScalaMock, and how to stub behaviours for dependencies.
4. **Test Styles:** Explore different testing styles (FunSuite, FlatSpec, WordSpec, FreeSpec) and how they influence readability.
5. **Test Fixtures & Shared State:** Understand fixture patterns for setting up and tearing down resources; consider using FunFixtures in MUnit.
6. **Coverage Tools:** Learn about Scoverage for measuring test coverage and spotting uncovered code.
7. **Static Analysis & Formatting:** Investigate Scalafix for code rewrites, Scalafmt for consistent formatting, and how they integrate with your toolchain[scalameta.org](https://scalameta.org/scalafmt/#:~:text=Spend%20more%20time%20discussing%20important,between%20people%20on%20your%20team).
8. **Benchmarking & Profiling:** Explore JMH (Java Microbenchmark Harness) for performance testing, and tools like VisualVM or YourKit for profiling JVM applications.
9. **Logging & Debugging:** Study structured logging libraries (e.g., Logback, Log4s, Pureconfig logging), and debugging techniques using breakpoints and remote debugging.
10. **CI/CD & Automation:** Research how to configure continuous integration pipelines (GitHub Actions, GitLab CI, Jenkins) for Scala projects; learn how to run tests, code formatters, and static analysis in CI.

### 🔗 Validated Links (with descriptions)

- **ScalaCheck Overview:** ScalaCheck is a property‑based testing library inspired by Haskell’s QuickCheck; it integrates with sbt, ScalaTest, specs2, and standalone test runners[scalacheck.org](https://scalacheck.org/#:~:text=ScalaCheck%20is%20a%20library%20written,also%20ventured%20into%20its%20own).
- **ScalaTest Property‑Based Testing:** The ScalaTest user guide explains that property‑based testing specifies high‑level properties that hold for a range of data and contrasts it with example‑based testing[scalatest.org](https://www.scalatest.org/user_guide/property_based_testing#:~:text=Property).
- **Scalafmt:** The Scalafmt documentation emphasises that it formats code consistently and integrates with editors and build tools[scalameta.org](https://scalameta.org/scalafmt/#:~:text=Spend%20more%20time%20discussing%20important,between%20people%20on%20your%20team).
- **Scoverage:** Official docs explain how to add Scoverage to sbt projects to measure code coverage and generate reports.
- **JMH:** Documentation for the Java Microbenchmark Harness demonstrates how to write and run microbenchmarks in Scala.

### 🧠 Review Questions

1. What is property‑based testing, and how does it differ from example‑based testing[scalatest.org](https://www.scalatest.org/user_guide/property_based_testing#:~:text=Property)? Provide an example property.
2. According to ScalaCheck, what are the benefits of integrating with sbt and test frameworks like ScalaTest or specs2[scalacheck.org](https://scalacheck.org/#:~:text=ScalaCheck%20is%20a%20library%20written,also%20ventured%20into%20its%20own)?
3. Compare the main testing frameworks in Scala (ScalaTest, MUnit, Specs2, uTest). Which would you choose for different scenarios?
4. How does mocking help isolate units under test? What differences exist between Mockito‑Scala and ScalaMock?
5. What is a fixture in testing, and how do you manage shared state in ScalaTest vs MUnit?
6. How does Scoverage measure code coverage and how would you add it to an sbt project?
7. Why should you use a code formatter like Scalafmt, and how does it improve code reviews[scalameta.org](https://scalameta.org/scalafmt/#:~:text=Spend%20more%20time%20discussing%20important,between%20people%20on%20your%20team)?
8. Describe how to create a simple microbenchmark in Scala using JMH. Why is it important to avoid microbenchmark pitfalls?
9. What are the typical steps for debugging a Scala application (using IDE breakpoints, logs, etc.)? How does remote debugging work?
10. Outline a basic CI/CD pipeline for a Scala project, including tests, formatting, static analysis, packaging, and deployment.

### ✍️ Journal Prompts

1. **🔍 Property Discovery:** After writing property‑based tests for a function, reflect on how this approach uncovered edge cases compared to example tests. Did you find any surprising inputs?
2. **🧪 Test Framework Choice:** Write about your experience comparing testing frameworks (ScalaTest vs MUnit vs Specs2). Which style resonated with you and why?
3. **⚙️ Quality Automation:** Document your efforts to integrate Scalafmt, Scalafix, Scoverage, and CI in a project. How did automation change your development workflow and team collaboration?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Write unit tests for a simple library using ScalaTest’s FunSuite; then rewrite the same tests using MUnit and compare readability.
2. Add a property‑based test using ScalaCheck to verify that concatenating two strings results in a longer string[scalacheck.org](https://scalacheck.org/#:~:text=ScalaCheck%20is%20a%20library%20written,also%20ventured%20into%20its%20own).
3. Mock a repository dependency in a service class using Mockito‑Scala; assert that methods are called with expected arguments.
4. Create an sbt project and configure Scoverage; write tests and generate a coverage report.
5. Format a codebase using Scalafmt; experiment with different style settings and enforce formatting in CI.
6. Use Scalafix to rewrite deprecated APIs in your code; write a custom rule if needed.
7. Implement a microbenchmark with JMH that compares performance of two sorting algorithms.
8. Profile a simple Scala application using VisualVM; identify memory hotspots and optimize accordingly.
9. Configure a GitHub Actions workflow that runs tests, checks formatting, and measures coverage on every push.
10. Set up a logging framework (e.g., Logback with Log4j2 integration) and write logs at different levels (INFO, WARN, ERROR).

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Test-Driven Development:** Develop a small library (e.g., a Roman numeral converter) using TDD; write tests first and refactor as needed.
2. **Property‑Based API Tests:** Build a REST API and write property‑based tests that generate random requests and verify responses.
3. **Mock Service Integration:** Create a microservice with external dependencies; use mocking to simulate these dependencies for integration tests.
4. **Code Quality Plugin:** Develop an sbt plugin that runs Scalafmt, Scalafix, Scoverage, and JMH in one command; integrate with CI.
5. **Benchmark Suite:** Write a suite of microbenchmarks for different collection operations (List vs Vector vs Array) and graph the results.

### 🌐 Mega Projects (12+ hrs)

1. **CI/CD Pipeline:** Build a comprehensive CI/CD pipeline using Jenkins or GitHub Actions that compiles Scala code, runs tests, measures coverage, enforces formatting, performs static analysis, packages artifacts, and deploys to a staging environment.
2. **Quality Dashboard:** Develop a dashboard that visualises code coverage, test results, benchmark results, and static analysis warnings over time. Use Scala.js or a web framework for the front‑end.

### 🔍 Libraries & Frameworks to Explore

- **ScalaTest / MUnit / Specs2 / uTest:** Core testing frameworks.
- **ScalaCheck:** Property‑based testing library[scalacheck.org](https://scalacheck.org/#:~:text=ScalaCheck%20is%20a%20library%20written,also%20ventured%20into%20its%20own).
- **Mockito‑Scala / ScalaMock:** Mocking libraries.
- **Scoverage:** Code coverage tool for Scala.
- **Scalafmt / Scalafix:** Code formatting and automated refactoring tools[scalameta.org](https://scalameta.org/scalafmt/#:~:text=Spend%20more%20time%20discussing%20important,between%20people%20on%20your%20team).
- **JMH:** Java Microbenchmark Harness for performance testing.
- **VisualVM / YourKit / Flight Recorder:** Profilers for JVM applications.
- **Logback / Log4s / SLF4J:** Logging libraries for structured logs.
- **GitHub Actions / Jenkins / GitLab CI:** CI/CD systems.
- **SonarQube / Codacy:** Platforms for static code analysis and quality monitoring.

### 📖 Definitions

- **Unit Test:** A small piece of code that verifies the behaviour of a specific unit (e.g., a method) in isolation.
- **Property‑Based Test:** A test that states a property which should hold for a range of inputs; test runners generate random inputs to check the property[scalatest.org](https://www.scalatest.org/user_guide/property_based_testing#:~:text=Property).
- **Mock / Stub:** Fake implementations of components used to isolate units under test by simulating dependencies.
- **Coverage:** A metric indicating the proportion of code executed by tests; tools like Scoverage compute it.
- **Static Analysis:** Analysis of code without executing it; tools like Scalafix and SonarQube identify issues and enforce style.
- **Microbenchmark:** A small program that measures the performance of specific operations using JMH to reduce noise.
- **Fixture:** Setup and teardown logic shared across multiple tests to provide consistent test environments.
- **Continuous Integration (CI):** Practice of automatically building and testing code on every commit to detect issues early.
- **Continuous Deployment (CD):** Automating the release of software after successful testing and verification.
- **Profiler:** A tool that measures resource usage (CPU, memory) to identify performance bottlenecks.

### 💡 Concepts

- **Test Pyramid:** Structure emphasising many unit tests, fewer integration tests, and even fewer end‑to‑end tests.
- **Determinism:** Tests should be deterministic; property‑based tests with generators may require constraints to avoid non‑deterministic failures.
- **Isolation:** Unit tests should isolate the unit being tested; mocking and stubbing help achieve this.
- **Fail Fast vs Error Collection:** Some tests should fail on the first error; property‑based tests may collect errors across many inputs.
- **Automation:** Running tests, formatting, and static analysis automatically ensures consistent quality and reduces manual effort.
- **Measuring & Profiling:** Benchmarking and profiling identify performance issues; avoid optimizing prematurely and focus on hotspots.
- **Evolutionary Code:** Tools like Scalafix help refactor code safely as APIs evolve.

### 🧪 Applications

- **TDD Practice:** Use test-driven development to design APIs and ensure they meet specifications.
- **Property Validation:** Use property‑based tests to validate invariants, such as ordering or idempotency of operations.
- **Mocking External Services:** Simulate external services (databases, APIs) in unit tests to avoid network calls.
- **Performance Analysis:** Benchmark critical functions and profile to identify performance bottlenecks.
- **CI/CD Setup:** Automate build, test, formatting, static analysis, and deployment to maintain quality and accelerate delivery.

### 📌 Additional Tips & Resources

1. **🔁 Run Tests Frequently:** Integrate tests into your editor or IDE to get immediate feedback.
2. **🧼 Maintain Test Readability:** Use descriptive names and clear structure; tests are documentation.
3. **🧠 Limit Mocking:** Overusing mocks can hide integration issues; consider real implementations with in‑memory databases or stub servers.
4. **🧮 Use Generators Wisely:** Customise generators in ScalaCheck to generate valid and meaningful test data.
5. **🔋 Keep Benchmarks Isolated:** JMH requires proper annotations and warm‑up iterations to produce reliable measurements.
6. **🛠️ Combine Tools:** Use Scalafmt for formatting and Scalafix for transformations; run them in CI to enforce consistency.
7. **📢 Add Test Tags:** Use tagging in ScalaTest to categorize slow tests or integration tests and run subsets locally.
8. **🧰 Use Testcontainers:** For integration tests, use Testcontainers to spin up databases or message brokers on demand.
9. **📈 Visualise Coverage:** Generate HTML coverage reports with Scoverage; integrate them into your quality dashboard.
10. **⚠️ Avoid Flaky Tests:** Ensure that tests are independent of timing, environment, or ordering to prevent flakes.

### 💡 Project Ideas (optional)

1. **Testing Kata:** Solve a kata (e.g., bowling score calculator) using TDD and multiple test frameworks; compare the workflows.
2. **Static Analysis Rule Set:** Write custom Scalafix rules enforcing your project’s coding standards and automatically fix violations.
3. **Benchmark Library:** Create a microbenchmark library for common data structures (Lists, Vectors, Streams) and publish results.
4. **Full Test Suite:** Take an existing open‑source project and improve its test coverage, add property‑based tests, and integrate coverage reporting.
5. **CI/CD Template:** Build a reusable GitHub Actions template for Scala projects with test, lint, format, coverage, and release steps.
6. **Mocking Abstraction:** Design a mocking abstraction that simplifies the use of Mockito or ScalaMock; provide syntactic sugar.
7. **Performance Regression Tracker:** Automate running JMH benchmarks on every commit and report regressions.
8. **Code Review Assistant:** Develop a tool that integrates with GitHub PRs to run Scalafmt, Scalafix, and Scalastyle; comment inline on issues.
9. **Test Data Generator:** Build a library that generates realistic test data based on JSON schema or case class definitions.
10. **Profiler Integration:** Create a plugin for your IDE that triggers profiling sessions and presents results inline.
11. **Scenario Test Runner:** Build a DSL for writing scenario tests with clear given/when/then semantics; integrate with testing frameworks.
12. **Distributed Test Harness:** Design a system to run tests across multiple machines (for long integration tests) and aggregate results.
13. **Mutation Testing:** Integrate mutation testing (e.g., using stryker4s) to measure the effectiveness of your tests.
14. **Visual Log Viewer:** Implement a viewer that aggregates logs from multiple services and highlights errors.
15. **Coverage Badge Generator:** Create a tool that publishes coverage badges to README files automatically.
16. **Test Fixture Library:** Provide pre‑built fixtures for common dependencies (databases, HTTP servers) to speed up test development.
17. **Quality Bot:** Build a Slack or Discord bot that reports test failures, coverage, and code quality metrics after each build.
18. **Test Data DSL:** Create a DSL for describing test data scenarios that generates random but valid data sets.
19. **Migrate Tests:** Convert an old test suite from JUnit to ScalaTest; document the migration and lessons learned.
20. **Performance Explorer:** Build a GUI that allows exploring JMH benchmark results over time, highlighting regressions and improvements.