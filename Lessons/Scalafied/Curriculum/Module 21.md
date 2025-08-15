## 🖌️ Module 21 – Simulations, Creative Coding & Scala.js (Weeks 41–42)

**Why this matters:** Simulations help you understand complex systems; creative coding explores art through code; and Scala.js brings Scala to the browser. Together, these topics encourage experimentation, visualisation and cross‑platform thinking. Scala’s functional strengths and static typing make it an excellent platform for simulation and interactive web development.

### 📚 Ten Research Topics

1. **Creative Scala & Doodle:** Explore the Doodle library for compositional two‑dimensional vector graphics and creative coding[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle). Learn how to draw shapes, combine them and build animations.
2. **Chartreuse & Data Visualisation:** Investigate Chartreuse (built on Doodle) for compositional data visualisation. Understand how to build bar charts, line charts and scatter plots.
3. **Simulations & numerical modelling:** Study techniques for building simulations: discrete event simulation, agent‑based modelling, cellular automata, random walks and differential equations. Learn how to use libraries like Breeze for linear algebra.
4. **Generative art:** Research generative art concepts (fractals, noise, L‑systems, procedural textures) and implement them in Scala.
5. **Scala.js fundamentals:** Learn how Scala.js compiles Scala to JavaScript, enabling code reuse between backend and frontend. Understand its support for both browser and Node environments[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of).
6. **Frontend frameworks:** Explore Scala.js‑based UI frameworks like Laminar, Slinky, Outwatch and Tyrian. Study how they map to popular JavaScript libraries (React, React hooks, virtual DOM).
7. **Interop with JavaScript:** Investigate how to interoperate with JavaScript libraries (e.g., D3.js, Three.js) via facade types and scalajs‑dom. Understand how to call JS functions and handle promises.
8. **Animation & time management:** Study how to implement animations using requestAnimationFrame, delta time and functional reactive programming; explore FS2 or Laminar for reactive streams.
9. **Performance & optimisation:** Learn about performance considerations of Scala.js, such as bundling, dead code elimination and how to optimise the size of generated JavaScript.
10. **Deployment & tooling:** Research how to build and deploy Scala.js applications; explore sbt settings for cross‑projects and how to integrate with modern build tools (Vite, Webpack). Understand testing with scalajs‑test and using Scastie for quick experiments.

### 🔗 Validated Links (with descriptions)

- **Creative Scala libraries:** Creative Scala lists Doodle and Chartreuse as libraries for compositional graphics, data visualisation and terminal applications, illustrating the ecosystem’s emphasis on creative coding[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle).
- **Creative Scala mission:** The site emphasises making Scala fun by providing training material and libraries that unleash digital creativity[creativescala.org](https://www.creativescala.org/#:~:text=Creative%20Scala%27s%20goal%20is%20to,libraries%20that%20unleash%20digital%20creativity).
- **Scala.js environments:** The Scala 3 book notes that Scala.js programs can run in browsers and Node.js, and points to numerous libraries supporting React, Angular and other JS frameworks[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of).
- **Scala vs JavaScript:** The same page contrasts JavaScript’s dynamic typing with Scala’s static typing, immutability and expressive syntax[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=Also%20at%20a%20high%20level%2C,between%20JavaScript%20and%20Scala%20are)—traits that influence how you write frontend code.
- **Ammonite scripting:** Ammonite’s ability to run scripts without heavyweight projects[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts) can be leveraged to prototype simulations quickly.

### 🧠 Review Questions

1. According to Creative Scala, what is the purpose of the Doodle and Chartreuse libraries[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle)?
2. Describe how Scala.js compiles Scala code to run in browsers and Node.js[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of). What advantages does this offer?
3. How do Scala’s static typing and immutability compare to JavaScript’s dynamic typing[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=Also%20at%20a%20high%20level%2C,between%20JavaScript%20and%20Scala%20are)? How does that influence code safety?
4. Explain the difference between agent‑based modelling and cellular automata. Provide examples where each is appropriate.
5. What is generative art? Discuss common techniques such as fractals, Perlin noise and L‑systems.
6. How can you integrate JavaScript libraries (e.g., D3.js) in a Scala.js project? What are facade types?
7. Describe the workflow for building a Scala.js project that shares code with a JVM backend. How does sbt cross‑project configuration work?
8. Explain how reactive streams or functional reactive programming can be used to build animations and simulations in the browser.
9. What tools exist to optimise Scala.js bundle size and performance? How do dead code elimination and tree shaking work?
10. Compare Laminar and Slinky; what paradigms do they adopt (e.g., virtual DOM vs reactive values)?
11. What challenges might you encounter when using Scala.js for interactive graphics compared to JavaScript frameworks? How can you overcome them?
12. Discuss how you would implement a predator‑prey simulation; what data structures and concurrency considerations arise?
13. What are the benefits of writing creative coding or simulations in Scala rather than directly in JavaScript?
14. How does Ammonite help in prototyping simulations or generative art quickly[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts)?
15. Explain how to deploy a Scala.js application to GitHub Pages or a static hosting provider. What build steps are necessary?

### ✍️ Journal Prompts

1. **🎨 Generative Experiment:** After creating a piece of generative art, reflect on your artistic and coding choices. How did Scala’s type safety influence your exploration? What surprised you?
2. **⚛️ Front‑End Reflection:** Write about your first experience building a Scala.js web application. What were the biggest hurdles and how did static typing help or hinder productivity[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=Also%20at%20a%20high%20level%2C,between%20JavaScript%20and%20Scala%20are)?
3. **🐟 Simulation Insights:** Document your approach to building a simple simulation (e.g., boids or predator‑prey). What modelling decisions did you make, and how did the results compare to expectations?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. **Random Walk:** Implement a random walk in two dimensions using Scala and visualise it with Doodle; experiment with step sizes and path colours.
2. **Conway’s Game of Life:** Build Conway’s Game of Life simulation; render cells on a grid and allow user‑controlled speed.
3. **Perlin Noise Terrain:** Generate 2D Perlin noise and visualise it as a heightmap; adjust parameters to create varied terrain.
4. **Fractal Tree:** Draw a fractal tree recursively with Doodle; add random variation to angles and branch lengths.
5. **Boids Simulation:** Implement a flocking simulation (boids) with separation, alignment and cohesion rules; visualise using Doodle.
6. **React Counter App:** Build a simple counter application using Laminar or Slinky; include increment, decrement and reset buttons.
7. **Scala.js Chart:** Use Chartreuse or another Scala.js plotting library to create an interactive line chart from synthetic data.
8. **Animated Sorting:** Visualise sorting algorithms (e.g., bubble sort, quicksort) step by step; control speed via UI.
9. **JS Interop Example:** Write a Scala.js component that calls a JavaScript library (e.g., a date picker) and binds events back into Scala code.
10. **Scastie Experiment:** Use Scastie to experiment with a creative coding idea and share the link. Document your findings.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Predator‑Prey Simulation:** Build a simulation of predators and prey on a 2D grid; visualise population dynamics and provide controls for parameters.
2. **Interactive Art Gallery:** Create a web app that displays generative art pieces; allow users to adjust parameters and regenerate artwork.
3. **Weather Visualisation:** Fetch weather data from an API and display interactive charts and animations in the browser using Scala.js.
4. **Cellular Automata Explorer:** Develop a tool that lets users define rules and initial states for cellular automata and observes outcomes.
5. **Physics Sandbox:** Implement a 2D physics sandbox in the browser; users can drop objects, apply forces and watch interactions.

### 🌐 Mega Projects (12+ hrs)

1. **Interactive Simulation Platform:** Build a web platform where users can create, run and share simulations (e.g., diffusion, traffic flow, ecosystem). Provide a visual editor for parameters and a repository of simulations.
2. **Generative Design App:** Develop an application that combines generative art with user interactivity (e.g., drawing tools with generative effects); support exporting high‑resolution images and animations.

### 📦 Libraries & Frameworks to Explore

- **Doodle / Chartreuse:** Libraries for compositional vector graphics and data visualisation[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle).
- **Laminar / Tyrian / Outwatch / Slinky:** UI frameworks for Scala.js; provide reactive and virtual DOM abstractions.
- **Scala.js:** Compiler and runtime for running Scala in browsers and Node.js[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of).
- **Ammonite:** Rapid scripting environment to prototype simulations and creative coding ideas[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts).
- **Breeze:** Numerical processing and linear algebra library useful for simulations.
- **scalajs‑dom / scalajs‑react:** Facades for interacting with the DOM and React from Scala.js.
- **FS2 / Cats Effect / ZIO:** Functional streams and effects for managing time, concurrency and resources in simulations.
- **Three.js (via facades):** 3D graphics library that can be called from Scala.js for more advanced visualisations.
- **Processing & p5.js:** Java and JavaScript creative coding environments that you can interoperate with from Scala via wrappers.
- **Scala Cross Projects:** sbt settings enabling shared code between JVM and Scala.js modules.

### 🧾 Definitions

- **Creative Coding:** The practice of writing code to create visual art, animations and interactive experiences.
- **Simulation:** A model that imitates the behaviour of a real or imagined system over time, often using random processes or differential equations.
- **Scala.js:** A compiler that translates Scala code to JavaScript, enabling execution in web browsers and Node.js[docs.scala-lang.org](https://docs.scala-lang.org/scala3/book/scala-for-javascript-devs.html#:~:text=,page%2C%20you%E2%80%99ll%20find%20dozens%20of).
- **Facade Type:** A Scala.js trait or class that describes the API of a JavaScript library, enabling type‑safe interop.
- **Reactive Programming:** A paradigm focused on data streams and the propagation of change; used for animations and interactive UIs.
- **Generative Art:** Artistic works generated algorithmically by code, often using randomness and procedural techniques.
- **Cellular Automaton:** A grid of cells updated in discrete time steps according to simple rules based on neighbouring cells.
- **Agent‑Based Model:** A simulation where individual agents follow simple rules, leading to emergent behaviour.
- **Cross‑Compilation:** Building the same code for multiple targets (JVM and JavaScript) to maximise code reuse.
- **Bundler:** A tool that packages JavaScript (or Scala.js) code and dependencies into a bundle for deployment; examples include Webpack and Vite.

### 💡 Concepts

- **Functional Modelling:** Representing simulation state with immutable data structures and pure functions to ensure determinism and reproducibility.
- **Randomness & Noise:** Using random number generators and noise functions (e.g., Perlin noise) to create organic patterns in simulations and art.
- **Reactive UI:** Building UIs where the view automatically updates when underlying data changes; frameworks like Laminar adopt this.
- **Interop:** Seamlessly calling JavaScript functions from Scala.js and vice versa; using facades to map types and functions.
- **Performance Trade‑offs:** Balancing expressive Scala code with JavaScript output size and runtime performance; using optimization flags and code splitting.
- **Asynchronous Timing:** Coordinating animations and simulations with requestAnimationFrame and functional streams; dealing with concurrency in the browser.
- **Visual Composition:** Combining simple shapes into complex visuals; using algebraic composition to build scenes from primitives.
- **Data‑Driven Visualisation:** Mapping data to visual properties (position, colour, size); using Chartreuse or D3 via Scala.js.
- **Testing Simulations:** Verifying correctness of models via unit tests, property‑based tests and visual sanity checks.
- **Deployment:** Configuring sbt to produce production‑ready JavaScript bundles and hosting them on static sites or CDNs.

### 🛠 Applications (How to apply the principles)

- **Start with Doodle:** Use Doodle to draw shapes, combine them and animate them; gradually compose more complex scenes[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle).
- **Model Simulations Functionally:** Represent the state of a simulation using case classes and update it with pure functions; use random seeds to control reproducibility.
- **Experiment in Scastie:** Test ideas quickly in Scastie or Ammonite without setting up a project[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts).
- **Cross‑compile Code:** Set up an sbt cross project to share simulation logic between a JVM backend and a Scala.js frontend.
- **Use Reactive Streams:** Build animations or interactive data visualisations using Laminar or FS2 streams; handle time and events declaratively.
- **Incorporate JS Libraries:** Write facade types for JavaScript libraries like D3 or Three.js; call them from Scala.js to leverage existing ecosystems.
- **Optimise Output:** Use sbt settings like `scalaJSLinkerConfig` to enable full optimisation and dead code elimination; split code into modules to reduce bundle size.
- **Deploy Static Sites:** Use GitHub Pages or Netlify to host Scala.js applications; automate builds in CI.
- **Visualise Data:** Use Chartreuse to build interactive charts; map simulation data to visual attributes.
- **Document Exploration:** Keep a sketchbook of generative art experiments; record parameters and results to track progress.

### 🎯 Project Ideas (optional)

1. **City Traffic Simulator:** Simulate traffic flow on a grid of streets; visualise congestion and experiment with traffic light timing.
2. **Ecosystem Model:** Create a predator‑prey ecosystem with multiple species and food sources; visualise population changes over time.
3. **Generative Wallpaper:** Generate algorithmic patterns (e.g., Voronoi diagrams, L‑systems) and export them as high‑resolution wallpapers.
4. **Interactive Music Visualiser:** Visualise audio input (e.g., microphone) with real‑time animations and reactive shapes; allow parameter tweaking.
5. **Climate Change Simulation:** Model global temperature changes or CO₂ concentrations; visualise predictions and scenario outcomes.
6. **Data‑Driven Art Installation:** Fetch real‑world data (e.g., stock prices, weather, social media) and generate evolving visuals based on it.
7. **Educational Tool:** Create a tool that demonstrates mathematical concepts (e.g., Fourier series, fractals) through interactive visualisation.
8. **Genetic Algorithm Playground:** Implement a genetic algorithm that evolves solutions to a problem (e.g., path finding); visualise the evolution process.
9. **Procedural Terrain Generator:** Build a 3D terrain generator using noise functions and render it with Three.js facades.
10. **Social Network Simulator:** Simulate and visualise the spread of information or influence in a network; tune parameters and observe outcomes.
11. **Cross‑platform Game:** Build a simple game that runs on both JVM and in the browser using a shared codebase; deploy to a static site.
12. **Artistic Clock:** Create a clock that displays time as generative art (e.g., flowing patterns or shapes that change every second).
13. **Interactive Cookbook:** Build a web app where users explore recipes represented as graphs; ingredients link to interactive visualisations.
14. **Population Dynamics Dashboard:** Visualise real‑world population data and forecast growth; include interactive controls and scenario comparison.
15. **Simulated Stock Market:** Create a simplified stock market simulation where agents trade; visualise price movements and investor behaviours.
16. **Astronomy Simulator:** Simulate planetary orbits and star systems; allow users to manipulate gravitational constants and observe results.
17. **Firefly Synchronisation:** Model and visualise the synchronised flashing of fireflies; explore emergent synchrony in oscillators.
18. **Artificial Life:** Simulate a world of simple creatures with survival rules; study emergent behaviours and ecosystem equilibrium.
19. **Collatz Visualisation:** Visualise the Collatz conjecture sequences as a tree or animation; explore patterns and distributions.
20. **Interactive Storytelling Platform:** Combine creative coding, simulation and UI frameworks to let users build and share interactive stories with branching narratives and visual effects.