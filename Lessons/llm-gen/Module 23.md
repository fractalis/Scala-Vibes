## 🌐 Module 23 – Full‑Stack Web & Microservices with Scala.js (Weeks 45–46)

**Why this matters:** Combining Scala on the backend and Scala.js on the frontend allows you to share code and types across the stack, fostering type safety and reducing duplication. Exploring microservices, real‑time communication and deployment will prepare you to build production web applications.

### 📚 Ten Research Topics

1. **Full‑Stack Architecture:** Study how to structure projects that share domain models between JVM backends and Scala.js frontends. Investigate sbt cross‑projects and code sharing patterns.
2. **HTTP Frameworks:** Compare http4s, Pekko HTTP, Finatra and ZIO HTTP. Understand routing, middleware, streaming responses and effect systems.
3. **GraphQL & gRPC:** Research building GraphQL APIs with Sangria and gRPC services using ScalaPB. Learn how to consume these APIs in Scala.js via generated clients.
4. **WebSockets & Real‑Time:** Explore building chat apps and dashboards using WebSockets and Server‑Sent Events. Understand how to manage connection state and backpressure.
5. **Authentication & Security:** Study OAuth2, OpenID Connect, JWT tokens and CSRF protection. Learn how to secure both REST and WebSocket endpoints.
6. **Serverless & Cloud:** Investigate deploying Scala code to serverless platforms (AWS Lambda via GraalVM or Scala Native) and using Scala.js on Cloudflare Workers.
7. **Testing & Debugging:** Research how to test Scala.js code using scalajs‑jest or uTest; learn about integration testing with Playwright or Selenium. Understand source maps for debugging.
8. **Bundling & Code Splitting:** Learn how to configure Webpack or Vite for Scala.js projects; explore dynamic imports, code splitting and tree shaking to reduce bundle size and improve load times.
9. **Internationalisation (i18n) & Accessibility:** Study i18n in front‑end frameworks and learn accessibility best practices (ARIA roles, keyboard navigation).
10. **Progressive Web Apps (PWA):** Research service workers, caching strategies, offline support and push notifications. Learn how to make Scala.js apps installable.

### 🔗 Validated Links (with descriptions)

- **Scala.js environments:** The Scala 3 book notes that Scala.js programs can run in browsers and Node.js, and points to numerous libraries supporting React, Angular and other JavaScript frameworks[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of).
- **Scala vs JavaScript:** The same page contrasts JavaScript’s dynamic typing with Scala’s static typing, immutability and expressive syntax[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=Also%20at%20a%20high%20level%2C,between%20JavaScript%20and%20Scala%20are)—advantages for full‑stack development.
- **Creative Scala mission:** Creative Scala aims to make Scala fun by providing training material and libraries for creative coding[creativescala.org](https://www.creativescala.org/#:~:text=Creative%20Scala%27s%20goal%20is%20to,libraries%20that%20unleash%20digital%20creativity); this highlights the community’s focus on education and experimentation.
- **Ammonite scripting:** Ammonite’s ability to run Scala scripts without project setup[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts) is useful for building deployment scripts and tooling.
- **libGDX cross‑platform:** The cross‑platform philosophy of libGDX (single codebase for multiple targets)[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS) inspires the idea of sharing code between client and server in full‑stack development.

### 🧠 Review Questions

1. How do sbt cross‑projects enable code sharing between Scala JVM and Scala.js modules? What limitations exist?
2. Compare the routing models of http4s and Pekko HTTP. Which would you choose for a streaming API and why?
3. What are the benefits of using GraphQL over REST? Describe how Sangria implements GraphQL in Scala.
4. Explain how WebSockets work compared to HTTP. How do you manage state and reconnects in a WebSocket chat app?
5. Describe the OAuth2 authorisation flow. How do you validate JWT tokens in a Scala backend?
6. What are the advantages and challenges of deploying Scala functions on AWS Lambda using GraalVM native images?
7. How do you test Scala.js applications? What tools support unit tests and end‑to‑end tests?
8. Explain how code splitting and tree shaking reduce bundle size in Scala.js projects. How does the optimiser perform dead code elimination[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of)?
9. What considerations are there for making your app accessible (e.g., ARIA, keyboard navigation)?
10. Describe how service workers enable offline functionality in a Progressive Web App. How does caching policy affect user experience?
11. What is Cross‑Site Request Forgery (CSRF), and how do you prevent it in both REST and WebSocket communications?
12. How can you implement hot module replacement (HMR) for a Scala.js application during development? What tools or plugins are involved?
13. Compare gRPC and GraphQL in terms of type safety, performance and client generation. When would you prefer each?
14. How might you share validation logic between the backend and frontend in a full‑stack Scala application?
15. Describe a deployment pipeline for a full‑stack Scala/Scala.js application using GitHub Actions.

### ✍️ Journal Prompts

1. **🧩 Code Sharing:** Reflect on your experience building a cross‑project. How did sharing domain models between client and server influence development speed and bug prevention?
2. **🔐 Secure Communications:** After implementing OAuth2 authentication and WebSockets, write about the challenges you encountered securing both synchronous and asynchronous channels.
3. **🚀 Deployment Story:** Document your deployment process for a full‑stack app. What tools did you use to bundle, test and deploy your Scala.js frontend and Scala backend? How did you ensure reliability and scalability?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. **Shared Models:** Create a cross‑project with shared case classes representing a `User` and `Todo`. Use them in both backend and frontend.
2. **REST API:** Build a small REST API with http4s that returns a list of tasks. Consume it in a Scala.js front‑end using sttp or fetch API.
3. **GraphQL Endpoint:** Implement a simple GraphQL API using Sangria to query books and authors. Write a Scala.js client to fetch and render data.
4. **WebSocket Chat:** Create a chat server using Pekko HTTP with WebSocket support. Build a Scala.js client that connects and displays messages.
5. **OAuth2 Integration:** Integrate your application with GitHub OAuth; implement login on the frontend and token validation on the backend.
6. **Service Worker:** Add a service worker to cache static assets in a Scala.js project. Test offline behaviour and update strategies.
7. **Bundle Analysis:** Use Webpack or Vite to bundle your Scala.js project. Analyse bundle size and experiment with code splitting.
8. **Accessibility Audit:** Add ARIA roles and keyboard navigation to your frontend. Use a tool like Lighthouse to audit accessibility.
9. **Serverless Function:** Deploy a Scala function to AWS Lambda (via GraalVM native image or Scala Native) that returns JSON. Test it via API Gateway.
10. **End‑to‑End Test:** Use Playwright or Selenium to write an integration test that opens your web app, logs in and performs a CRUD operation.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Full‑Stack Todo App:** Build a to‑do list application with a Scala backend (http4s or ZIO HTTP) and a Scala.js frontend (Laminar or Slinky). Share validation logic and models via a cross‑project.
2. **Real‑Time Dashboard:** Create a dashboard that displays real‑time sensor data using WebSockets. Implement backpressure handling on the server.
3. **GraphQL Blog Platform:** Develop a blog engine with a GraphQL API (Sangria) and a Scala.js client. Include authentication and markdown rendering.
4. **File Upload Service:** Implement a microservice for file uploads and downloads. Build a Scala.js client with a drag‑and‑drop UI and progress bars.
5. **PWA Recipe Book:** Build a recipe book app that can be installed as a PWA, supports offline reading and syncs data when online.

### 🌐 Mega Projects (12+ hrs)

1. **Microservices Suite:** Develop a suite of microservices (user management, products, orders) using http4s or ZIO HTTP with a shared domain model. Build a Scala.js admin dashboard to manage data. Include authentication, rate limiting and monitoring.
2. **Collaborative Document Editor:** Create a collaborative text editor using WebSockets or WebRTC for real‑time editing. Share code and document models across client and server. Implement conflict resolution (CRDTs) and offline support.

### 📦 Libraries & Frameworks to Explore

- **http4s / Pekko HTTP / ZIO HTTP:** Scala server frameworks supporting functional programming, streaming and effects.
- **Sangria / Caliban:** GraphQL server implementations for Scala.
- **ScalaPB / gRPC:** Tools for generating Scala code from Protocol Buffer definitions.
- **Laminar / Slinky / Tyrian:** Front‑end frameworks for reactive UI development in Scala.js.
- **sttp / fetch API:** HTTP client libraries for Scala and Scala.js.
- **play‑framework / Finatra:** Full‑stack web frameworks with templating and integrated HTTP services.
- **Webpack / Vite / Scala‑js Bundler:** Tools for bundling Scala.js code and managing assets.
- **Scalajs‑Test / uTest / MUnit:** Testing frameworks for Scala.js code.
- **OAuth2 providers:** Libraries like pac4j and `play‑silhouette` for handling authentication.
- **Docker / Kubernetes:** Containerisation and orchestration tools for deploying microservices.

### 🧾 Definitions

- **Cross‑Project:** An sbt configuration that produces both JVM and Scala.js artifacts from shared source code.
- **WebSocket:** A persistent, full‑duplex communication channel over a single TCP connection between client and server.
- **GraphQL:** A query language for APIs that allows clients to specify exactly what data they need and aggregate multiple resources in one request.
- **OAuth2:** An authorisation framework enabling third‑party applications to obtain limited access to an HTTP service on behalf of a user.
- **Serverless:** A cloud computing model where providers automatically manage the infrastructure; developers deploy individual functions without provisioning servers.
- **Code Splitting:** Breaking a JavaScript bundle into smaller chunks loaded on demand to improve initial load time.
- **PWA (Progressive Web App):** A web application that uses modern capabilities to deliver an app‑like experience, including offline support and installability.
- **CSRF:** A web security vulnerability where a malicious site triggers unwanted actions on behalf of an authenticated user on another site.
- **Service Worker:** A script that runs in the background, separate from a web page, enabling features like offline caching and push notifications.
- **CI/CD Pipeline:** A series of automated steps that compile code, run tests, analyse quality and deploy applications.

### 💡 Concepts

- **Shared Types:** Using a common set of case classes or interfaces across client and server to avoid duplicating models and potential mismatches.
- **Pure Functional APIs:** Building HTTP services with effects and streaming support, enabling composability and testability.
- **Real‑Time Communication:** Using WebSockets or Server‑Sent Events to push updates from the server to the client without polling.
- **Authentication vs Authorisation:** Differentiating identity verification from permission checks; implementing both across microservices.
- **Immutable Front‑End State:** Managing state in the frontend using immutable data structures and reactive signals for reliability[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=Also%20at%20a%20high%20level%2C,between%20JavaScript%20and%20Scala%20are).
- **Testing Strategies:** Combining unit tests, property‑based tests, integration tests and end‑to‑end tests to ensure quality.
- **Bundle Optimisation:** Minimising JavaScript output with tree shaking, dead code elimination and code splitting[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of).
- **Internationalisation:** Designing applications to support multiple languages and locales, including date/time formatting and right‑to‑left text.
- **Accessibility:** Ensuring that web applications are usable by people with disabilities through proper semantics, keyboard navigation and contrast.
- **Serverless Economics:** Considering cold starts, concurrency limits and pricing models when deploying functions to the cloud.

### 🛠 Applications (How to apply the principles)

- **Share models:** Create a shared source folder for case classes and validation logic. Use the same models in server endpoints and client views.
- **Build modular services:** Use http4s or ZIO HTTP to create composable endpoints; separate concerns with middleware.
- **Implement GraphQL:** Use Sangria to define schemas and resolvers. Generate type‑safe client code for Scala.js.
- **Add WebSockets:** Use Pekko Streams or http4s to handle WebSocket connections; broadcast messages to connected clients.
- **Secure your app:** Implement OAuth2 flows; validate JWT tokens on each request; protect WebSocket endpoints.
- **Optimise bundles:** Configure Webpack or Vite to split vendors and app code; enable compression and caching headers.
- **Write tests:** Use scalajs‑test or uTest for frontend unit tests; use MUnit/ScalaTest for backend tests; write integration tests with Selenium.
- **Deploy serverless:** Package a simple service as a GraalVM native image; deploy to AWS Lambda or Google Cloud Functions; monitor cold starts.
- **Use service workers:** Register a service worker to cache assets and API responses; implement an offline fallback page.
- **Automate:** Set up a GitHub Actions pipeline that compiles, tests, bundles and deploys your full‑stack application.

### 🎯 Project Ideas (optional)

1. **Real‑Time Collaboration App:** Build an app where users can collaborate on documents or drawings. Use WebSockets for real‑time updates and share models across client and server.
2. **E‑commerce Platform:** Create a microservices‑based webshop with product, cart and payment services. Build a Scala.js storefront consuming those services.
3. **Online Quiz Platform:** Develop a quiz engine with GraphQL API, real‑time leaderboards and PWA capabilities; support offline quizzes and sync results when online.
4. **Chat & Video Conference:** Implement a chat application with optional video calls using WebRTC; handle signaling via a Scala backend.
5. **Serverless Blog:** Build a blog with content stored in a Git repository; compile Markdown to HTML using Scala.js on the client and deploy via serverless functions.
6. **IoT Dashboard:** Visualise sensor data from IoT devices using a WebSocket‑driven dashboard; provide controls to send commands back to devices.
7. **Multiplayer Drawing Board:** Create a collaborative drawing canvas where multiple users can draw simultaneously; support undo/redo and export images.
8. **Fitness Tracker:** Track workouts and nutrition; synchronise data between devices via a backend; implement offline support and charts.
9. **Event Management System:** Manage events, tickets and attendees; integrate payment gateways and email notifications.
10. **Gamified Learning Platform:** Combine educational content with gamification elements (badges, levels); use GraphQL for API and Scala.js for front‑end.