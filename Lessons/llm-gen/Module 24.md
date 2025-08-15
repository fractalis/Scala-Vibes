## 🎯 Module 24 – Capstone Integration & Portfolio (Weeks 47–48)

**Why this matters:** The final module culminates your year‑long journey. By integrating skills across game development, system scripting, creative coding, simulations and full‑stack web applications, you reinforce mastery and build a portfolio that showcases your expertise. You’ll also plan for future learning and contribution.

### 📚 Ten Research Topics

1. **Capstone Planning:** Learn how to scope and plan a capstone project that integrates multiple technologies. Study agile project management, user stories and milestones.
2. **Multi‑Module Builds:** Research organising large projects with multiple modules (JVM, Scala.js, native) using sbt; understand dependency graphs and build optimisation.
3. **Continuous Deployment:** Investigate advanced CI/CD strategies, including staging environments, blue‑green deployments and canary releases. Explore GitOps approaches.
4. **Performance Tuning:** Deepen your knowledge of performance profiling across client and server (JVM tuning, GC tuning, JS performance). Learn about memory leaks and concurrency bottlenecks.
5. **Documentation & API Design:** Study best practices for writing documentation, API specifications (OpenAPI/Swagger), code comments and tutorials.
6. **Open Source Contribution:** Learn how to contribute to open source projects: reading contribution guides, submitting pull requests and reviewing code.
7. **Portfolio Building:** Research creating a personal website or portfolio to showcase your projects. Consider using Scala.js for interactive demos and SSG frameworks for static pages.
8. **Career & Networking:** Explore strategies for finding jobs in the Scala ecosystem, preparing for technical interviews, networking in the community and attending conferences/meetups.
9. **Ethics & Sustainability:** Reflect on ethical considerations in game design, automation and simulations; study the environmental impact of software (energy consumption, carbon footprint).
10. **Future of Scala:** Keep up with emerging trends: new language features, libraries, improvements in Scala Native and Scala.js, and evolving functional programming practices.

### 🔗 Validated Links (with descriptions)

- **Creative Scala mission:** Emphasises making Scala fun and accessible through training materials and libraries[creativescala.org](https://www.creativescala.org/#:~:text=Creative%20Scala%27s%20goal%20is%20to,libraries%20that%20unleash%20digital%20creativity)—an example of community contribution and education.
- **libGDX cross‑platform:** libGDX promotes writing once and deploying everywhere[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS), aligning with building cross‑platform portfolios.
- **Ammonite philosophy:** Ammonite liberates Scala code from heavyweight projects[ammonite.io](https://ammonite.io/#:~:text=The%20goal%20of%20Ammonite%20is,Scripts%20and%20run%20those%20later)—inspiration for writing scripts and tools during capstone development.
- **Scala.js environments:** Scala.js supports running Scala code in browsers and Node.js[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of), enabling interactive portfolio sites.
- **Scala vs JavaScript:** The advantages of Scala’s static typing and expressiveness[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=Also%20at%20a%20high%20level%2C,between%20JavaScript%20and%20Scala%20are) illustrate why using Scala across projects can improve reliability.

### 🧠 Review Questions

1. What are the key considerations when planning a capstone project? How do you manage scope and avoid feature creep?
2. Describe how multi‑module builds can organise shared code across JVM, Scala.js and native targets. What pitfalls might arise?
3. Explain blue‑green deployments and canary releases. How do they reduce risk in continuous deployment pipelines?
4. What tools and techniques would you use to profile a JVM application vs a Scala.js frontend?
5. How do you write clear API documentation using OpenAPI/Swagger? What should be included besides endpoints and parameters?
6. What etiquette should you follow when contributing to an open source project? How do you write a good pull request?
7. Discuss strategies for presenting your projects in a portfolio. What information is essential for prospective employers?
8. How can you stay involved in the Scala community? Name conferences, forums or groups you could join.
9. What ethical issues can arise in game development or automation (e.g., addiction, privacy, fairness)? How can developers address them?
10. Describe recent and upcoming features in Scala (e.g., Scala 3 contextual abstractions). How might they influence your future work[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=Also%20at%20a%20high%20level%2C,between%20JavaScript%20and%20Scala%20are)?
11. How would you plan to maintain and evolve your capstone project after the course ends?
12. What benefits do static site generators provide for building a portfolio site? Could you write one in Scala.js?
13. Explain the differences between asynchronous concurrency models (Futures, ZIO, Cats Effect) and when you might choose each for a large project.
14. Discuss the environmental impact of software development (energy usage). What practices can reduce your project’s carbon footprint?
15. What steps can you take to ensure your codebase remains approachable and maintainable for new contributors?

### ✍️ Journal Prompts

1. **📘 Capstone Reflections:** Describe your vision for your capstone project. What technologies will you integrate, and what problems do you hope to solve or showcase?
2. **🌿 Ethical Considerations:** Reflect on ethical concerns related to your capstone. How will you design responsibly (e.g., privacy, inclusivity, energy use)?
3. **🌱 Growth & Next Steps:** After completing the curriculum, write about the skills you want to develop next and how you plan to stay engaged with the Scala community.

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. **Build Script:** Write an sbt script that compiles multiple modules (JVM, Scala.js, native) and publishes artifacts locally.
2. **CI Configuration:** Configure a GitHub Actions workflow that runs unit tests, linting and static analysis on push; deploys to a staging environment upon merge.
3. **Profiler Setup:** Set up JFR (Java Flight Recorder) or VisualVM for a JVM application and capture a performance profile. Identify one optimisation.
4. **API Documentation:** Generate OpenAPI/Swagger documentation for an existing microservice using sbt‑openapi. Publish docs to your portfolio site.
5. **Static Site Generator:** Build a simple static site generator in Scala.js that converts Markdown files into HTML pages with a template.
6. **Contribution Exercise:** Find a small open source Scala project and submit a minor contribution (e.g., fixing a typo or adding a test). Reflect on the process.
7. **Portfolio Sketch:** Create the skeleton of your portfolio site using a Scala.js framework. Add a section for your capstone project.
8. **GC Tuning:** Experiment with JVM garbage collector options (G1, ZGC) for your game or backend; compare memory usage and pause times.
9. **Cross‑Project Migration:** Convert one of your earlier assignments into a cross‑project (shared, JVM, JS). Note the challenges.
10. **Carbon Footprint Estimator:** Write a script that estimates the energy consumption of your build pipeline (e.g., CI runs, cloud functions) and suggests optimisations.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Portfolio Site:** Build a polished personal website using Scala.js and a static site framework (e.g., Scalatags or Laminar). Showcase all major projects, with interactive demos and code snippets.
2. **Capstone Milestone:** Complete the first milestone of your capstone (e.g., working prototype). Document your process and create an issue tracker for remaining features.
3. **Contribution Weekend:** Spend a weekend contributing to an open source Scala library that you used during the curriculum. Submit at least one meaningful pull request.
4. **CI Dashboard:** Develop a dashboard that visualises the status of your projects’ CI pipelines, test coverage and performance metrics using Scala.js.
5. **OpenAPI Explorer:** Build a web tool that reads an OpenAPI specification and renders interactive API documentation; implement in Scala.js and deploy it to your portfolio.

### 🌐 Mega Projects (12+ hrs)

1. **Capstone Project:** Deliver a comprehensive project that integrates multiple domains: for example, a multiplayer simulation game with a Scala backend, Scala.js frontend, TUI admin console and creative coding visualisations. Include documentation, tests and deployment scripts.
2. **Scala Learning Platform:** Create an online learning platform that teaches Scala through interactive coding exercises, games and visualisations. Include a backend for storing progress, a Scala.js frontend and automated assessment.

### 📦 Libraries & Frameworks to Explore

- **sbt‑native‑packager / sbt‑assembly:** Tools for packaging applications into Docker images, native installers or shaded JARs.
- **GitHub Actions / Jenkins / GitLab CI:** CI/CD platforms for automating builds and deployments.
- **Swagger / OpenAPI Tools:** Libraries for generating API docs and client code (e.g., `endpoints4s`).
- **Docusaurus / Hugo / Eleventy:** Static site generators you can integrate with Scala.js for your portfolio.
- **ZIO / Cats Effect:** Advanced effect systems for managing concurrency and resources.
- **JFR / VisualVM / JMC:** Profiling tools for JVM applications.
- **Scalafmt / Scalafix / WartRemover:** Code formatting and linting tools to enforce quality standards.
- **Git / GitHub / GitLab:** Version control platforms and workflows; issues, pull requests and actions.
- **Scala Language SIPs:** Keep an eye on ongoing Scala Improvement Proposals to understand future language direction.
- **AWS / GCP / Azure SDKs:** Libraries for interacting with cloud services, serverless functions and managed databases.

### 🧾 Definitions

- **Capstone Project:** A large, integrative project that demonstrates mastery by combining multiple skills and technologies.
- **Multi‑Module Build:** An sbt structure containing several subprojects (e.g., core, frontend, backend) with shared dependencies.
- **Blue‑Green Deployment:** A release strategy that maintains two production environments (blue and green) and switches traffic between them to minimise downtime.
- **OpenAPI Specification:** A standard, language‑agnostic description of RESTful APIs that enables automatic documentation and client generation.
- **Open Source Contribution:** The act of submitting code, documentation or other improvements to a publicly accessible software project.
- **Portfolio Site:** A personal website showcasing projects, skills and experience; often includes links to code and live demos.
- **Garbage Collector (GC):** Part of the JVM that automatically frees memory by removing objects no longer referenced.
- **Ethical Coding:** Considering the social and environmental consequences of software, and making design choices that minimise harm.
- **Scala SIP:** Scala Improvement Proposal; a process for proposing language changes and new features.
- **CI/CD:** Continuous Integration and Continuous Deployment; practices that automate building, testing and releasing software.

### 💡 Concepts

- **Scope Management:** Defining project boundaries, prioritising features and delivering iteratively to avoid scope creep.
- **Documentation Driven:** Writing documentation early and treating it as a first‑class deliverable; helps clarify requirements and guides design.
- **Contribution Workflow:** Fork, branch, commit, pull request, review and merge—a typical workflow for contributing to open source.
- **Portfolio Curation:** Selecting projects that best represent your skills and presenting them with clear context and narratives.
- **Interview Preparation:** Practising coding problems, system design and behavioural questions; understanding employers’ expectations in the Scala ecosystem.
- **Sustainability:** Designing software that is energy‑efficient, maintainable and mindful of its environmental impact.
- **Networking & Community:** Building relationships via meetups, conferences, online forums and mentorship; learning from and giving back to peers.
- **Continuous Learning:** Keeping up with new Scala versions, libraries, blogs and books; experimenting with side projects.
- **Cross‑Platform Showcases:** Demonstrating that your projects run on desktop, web and mobile by deploying multiple versions.
- **Quality Gates:** Enforcing standards via automated checks (formatting, linting, tests) before code is merged.

### 🛠 Applications (How to apply the principles)

- **Plan your capstone:** Break your project into milestones; create a backlog of tasks and update it regularly; prioritise essential features.
- **Organise modules:** Use sbt to set up separate modules for core logic, backend, front‑end and tools; share code via a common module.
- **Automate builds:** Configure CI/CD pipelines that compile, test and deploy each module; use blue‑green deployment for safe releases.
- **Profile end‑to‑end:** Run profilers on both client and server; identify memory leaks, hot methods and slow network requests; tune GC and code.
- **Document thoroughly:** Write a README, API docs and user guides; generate OpenAPI specs; create diagrams illustrating architecture.
- **Contribute back:** Identify an issue in a library you used and submit a patch. Write a blog post or tutorial summarising your contributions.
- **Build your portfolio:** Use Scala.js to create interactive demos of your projects; host on GitHub Pages; add stories about challenges and learnings.
- **Prepare for interviews:** Review Scala fundamentals, functional programming concepts and systems design patterns; practise coding problems.
- **Consider impact:** Evaluate the social and environmental effects of your project; optimise for energy usage and respect user privacy.
- **Stay engaged:** Attend Scala conferences (e.g., Scala Days), participate in forums ([users.scala-lang.org](http://users.scala-lang.org)) and keep exploring new topics and libraries.

### 🎯 Project Ideas (optional)

1. **Full‑Year Showcase:** Integrate the best features of your previous assignments into a single demonstration application (e.g., a simulation game with a web dashboard and TUI tools). Document the architecture and lessons learned.
2. **Developer Portfolio:** Build a dynamic portfolio site with interactive code demos, blog posts and an RSS feed; implement serverless functions for contact forms.
3. **Open Source Contribution Tracker:** Create a tool that aggregates your GitHub contributions, displays graphs and highlights contributions to notable projects.
4. **CI/CD Visualiser:** Build a web app that displays your projects’ build pipelines, test coverage and deployment status in real time.
5. **Eco‑Metrics Dashboard:** Develop a dashboard that monitors the environmental impact (energy consumption, carbon emissions) of your projects and suggests optimisation strategies.
6. **Conference Scheduler:** Create a system for managing conference sessions, speakers and attendees; include a Scala.js front‑end and TUI for staff.
7. **Scala Learning Community:** Build an online platform where users can create, share and rate Scala learning modules; integrate creative coding challenges and leaderboards.
8. **Ethics Simulator:** Design a simulation that presents ethical dilemmas in technology (e.g., algorithmic bias); allow users to explore consequences of different decisions.
9. **OpenAPI Explorer:** Enhance the OpenAPI Explorer you built by adding code generation for clients/servers and interactive testing tools.
10. **Job Board:** Create a job board focused on Scala opportunities; integrate company pages, application tracking and real‑time chat for recruiters.