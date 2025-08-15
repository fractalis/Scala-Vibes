## 🎮 Module 19 – Game Development with Scala (Weeks 37–38)

**Why this matters:** Video games showcase the intersection of graphics, physics, input, audio and concurrency. Scala can leverage the robust Java ecosystem (libGDX, LWJGL) to create cross‑platform games. Understanding game loops, rendering pipelines and asset management will strengthen your grasp of real‑time programming and system design.

### 📚 Ten Research Topics

1. **libGDX overview:** Investigate libGDX, a cross‑platform, open‑source game development framework based on OpenGL. It provides batteries‑included tools for 2D/3D graphics, audio, input and physics, and emphasises performance by avoiding garbage collection[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS).
2. **LWJGL & jMonkeyEngine:** Learn about the Lightweight Java Game Library (LWJGL) and jMonkeyEngine. Understand how they expose OpenGL and Vulkan bindings and provide scene‑graph abstractions for 3D games.
3. **Game loops and delta timing:** Study fixed‑time‑step vs variable‑time‑step game loops, delta timing, and how to handle update and render cycles without dropping frames.
4. **Entity‑Component‑System (ECS):** Research ECS architecture for games (e.g., Artemis‑ODB, Ashley). Understand how decoupling behaviour (systems) from data (components) helps scalability and flexibility.
5. **Physics & collision detection:** Explore Box2D (included in libGDX) and bullet physics for 2D/3D collisions; examine bounding boxes, circle collision, and spatial partitioning (quadtrees).
6. **Asset management:** Learn about asset pipelines (textures, spritesheets, audio) and how to load and manage resources efficiently; investigate libGDX’s AssetManager.
7. **Input handling:** Study how to handle keyboard, mouse, touch and gamepad input; examine event listeners vs polling.
8. **Audio & sound design:** Understand audio APIs for playback and mixing; explore libraries like libGDX’s audio module and OpenAL.
9. **Cross‑platform deployment:** Investigate how to package games for desktop (Java application), web (HTML5 / WebGL), Android and iOS using the same code base[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS).
10. **Scala game libraries:** Research Scala‑specific wrappers or utilities such as ScalaFX (built on JavaFX), [FXGL](https://github.com/AlmasB/FXGL) (Java/Scala game library), and the [Catacombs of Scala](https://github.com/LWJGLX/catacombs) as examples of games built with Scala.

### 🔗 Validated Links (with descriptions)

- **libGDX website:** The libGDX home page introduces it as a cross‑platform Java framework offering 2D/3D graphics, audio, input and physics. It emphasises being open source, feature‑packed and avoiding garbage collection to maximise performance[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS).
- **Cross‑platform deployment:** The libGDX docs explain that developers can publish games on Windows, Linux, macOS, Android, iOS and the browser from a single code base[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS).
- **Ammonite overview:** While not a game library, the Ammonite site shows how Scala scripts can be run without heavy project setup and features a modern REPL[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts). This can be useful for quick game prototypes.
- **Creative Scala – Doodle:** Creative Scala lists Doodle as a library for compositional 2D vector graphics and creative coding[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle), which can be used to prototype game visuals.
- **ECS resources:** The Artemis‑ODB wiki introduces entity‑component‑system patterns, describing systems processing components and enabling flexible game design.

### 🧠 Review Questions

1. What features make libGDX a compelling choice for cross‑platform game development[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS)?
2. Explain the differences between LWJGL and jMonkeyEngine. When might you choose one over the other?
3. Describe fixed‑time‑step and variable‑time‑step game loops. What are the pros and cons of each?
4. What problem does the Entity‑Component‑System architecture solve in game development?
5. How does libGDX avoid garbage collection overhead in performance‑sensitive game loops[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS)?
6. What is delta timing, and why is it important for consistent movement across devices?
7. Outline how Box2D handles collision detection and response in a 2D world.
8. How does libGDX’s AssetManager help with resource management? Why is it important to load assets asynchronously?
9. Describe how you would handle player input from both keyboard and touch screens in a single code base.
10. What steps are required to package a libGDX game for desktop, Android, and HTML5?
11. Compare and contrast ScalaFX/FXGL with libGDX. Which aspects of ScalaFX might make it attractive for certain game genres?
12. What is an ECS system and how does it relate to components and entities? Give an example of a system processing multiple components.
13. Explain how audio can be managed in libGDX. What are the differences between music and sound effects?
14. What considerations are there for designing user interfaces (HUDs, menus) in a game engine?
15. How can Scala’s functional features (e.g., immutability) be leveraged to manage game state?

### ✍️ Journal Prompts

1. **🎨 Game Loop Insights:** After implementing a simple game loop, reflect on the challenges you encountered with timing and concurrency. How did delta timing or using futures affect smoothness and responsiveness?
2. **🧱 ECS Architecture:** Write about your experience organising game entities using an ECS pattern. How did it change your approach to adding new behaviours or features?
3. **🌍 Platform Deployment:** Document your first multi‑platform build (desktop, Android, HTML5). What worked out‑of‑the‑box with libGDX[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS) and what required extra configuration?

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. **Pong Clone:** Implement a basic Pong game using libGDX; handle paddle movement, ball collision and scoring.
2. **Sprite Animation:** Create a walking animation by cycling through frames of a spritesheet; use libGDX’s `Animation` class.
3. **Tile‑Based Map:** Build a simple tile map loader using Tiled and render a 2D level; add collision layers.
4. **Input Handling:** Implement input controls supporting both keyboard and touch; create an abstraction that dispatches events accordingly.
5. **Audio Mixer:** Play background music and triggered sound effects; adjust volume and implement pause/resume.
6. **Particle System:** Design a particle effect (e.g., explosion, fire) using libGDX’s `ParticleEffect` class.
7. **Physics Demo:** Use Box2D to simulate bouncing balls with gravity and friction; visualise collisions.
8. **UI Overlay:** Build a simple heads‑up display (score, health bar) using libGDX’s `Scene2D` API.
9. **Input Lag Measurement:** Measure and log frame rates and input latency; experiment with different update/render strategies.
10. **Cross‑Compile Test:** Export your mini game to HTML5 and run it in a browser. Note differences in performance or behaviour.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Platformer Prototype:** Create a side‑scrolling platformer with multiple levels, enemies and power‑ups; implement basic physics and collision detection.
2. **Top‑Down Shooter:** Build a shooter where the player controls a spaceship avoiding obstacles and firing at enemies; include power‑ups and boss battles.
3. **Puzzle Game:** Develop a match‑three or tile‑sliding puzzle; design levels and implement scoring and timed challenges.
4. **Rogue‑like Dungeon Crawler:** Generate procedural dungeons, manage inventory and implement turn‑based combat.
5. **Educational Game:** Create a game that teaches math or language skills; include levels, scoring and adaptive difficulty.

### 🌐 Mega Projects (12+ hrs)

1. **2D Adventure Game:** Design and implement a full‑fledged adventure game with story, characters, quests, inventory and multiple areas. Use libGDX or FXGL; include save/load functionality and cross‑platform deployment.
2. **3D Game with Physics:** Build a simple 3D racing or platform game using jMonkeyEngine or LWJGL; implement physics, collisions, lighting and textures.

### 📦 Libraries & Frameworks to Explore

- **libGDX:** Cross‑platform Java/Scala framework providing graphics, audio, input and physics[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS).
- **LWJGL:** Lightweight Java Game Library exposing OpenGL/Vulkan/AL APIs.
- **jMonkeyEngine:** 3D engine with scene‑graph, physics and asset tools.
- **ScalaFX / FXGL:** Scala bindings and JavaFX‑based game library with built‑in game loop and UI components.
- **Artemis‑ODB / Ashley:** Entity‑Component‑System libraries for game architecture.
- **Box2D / Bullet Physics:** Physics engines for 2D and 3D simulations.
- **Kryo / KryoNet:** Serialization and networking libraries for real‑time games.
- **Doodle / Chartreuse:** Creative coding and vector graphics libraries useful for prototypes[creativescala.org](https://www.creativescala.org/#:~:text=,adds%20interactive%20visualizations%20to%20Doodle).
- **Ammonite:** Modern REPL and scripting engine that speeds up prototyping[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts).

### 🧾 Definitions

- **Game Loop:** The continuous cycle that updates game state and renders frames; typically consists of input processing, world updates and rendering.
- **Delta Time:** The elapsed time between frames, used to scale movement and animations so they remain consistent across varying frame rates.
- **Entity‑Component‑System:** An architecture where entities are simple identifiers, components hold data and systems process entities with relevant components.
- **Sprite:** A 2D bitmap or texture used to represent characters or objects.
- **Asset Pipeline:** Processes that convert raw art and audio into game‑ready assets (textures, sounds, levels) and load them efficiently.
- **Physics Engine:** Software that simulates physical laws such as gravity, collisions and friction to produce realistic movement.
- **Scene Graph:** A data structure organising objects in a hierarchy to simplify transformations and rendering, often used in 3D engines.
- **Cross‑platform Deployment:** The ability to run the same code on multiple platforms (desktop, mobile, web)[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS).
- **Garbage Collection Avoidance:** Minimising heap allocations in critical loops to reduce GC pauses and improve performance[libgdx.com](https://libgdx.com/#:~:text=libGDX%20is%20a%20cross,Android%2C%20your%20browser%20and%20iOS).
- **ECS System:** A piece of code that operates on entities containing specific components in an ECS architecture.

### 💡 Concepts

- **Real‑Time Constraints:** Games must maintain consistent frame rates; latency and jitter directly impact user experience.
- **Functional Game Programming:** Leveraging immutability and pure functions to manage state changes and event handling; using monads or actors to model asynchronous events.
- **Resource Management:** Loading and unloading assets to manage memory usage, using caching and reference counting.
- **Design Patterns:** Patterns such as state machines, command patterns and ECS help manage complexity in games.
- **Game Architecture:** Separation of concerns between rendering, input, physics, AI and UI; layering code to facilitate maintenance.
- **Input Abstraction:** Building an input layer that maps device‑specific events to game actions, enabling multi‑platform support.
- **Scene Management:** Handling transitions between different game states (menus, levels, cutscenes) via state machines or scene stacks.
- **Physics & Collision:** Using bounding volumes, spatial partitioning and continuous collision detection for performance and accuracy.
- **Audio Engineering:** Balancing music and effects, using channels and mixing to create immersive soundscapes.
- **Performance Profiling:** Using profiling tools to identify bottlenecks (rendering, physics) and optimise code and assets.

### 🛠 Applications (How to apply the principles)

- **Prototype quickly:** Use libGDX’s simple setup and Ammonite scripts to prototype game mechanics without heavy build systems[ammonite.io](https://ammonite.io/#:~:text=Scala%20Scripts).
- **Iterate on game loops:** Experiment with fixed vs variable time steps; measure frame time and adjust update rates.
- **Componentise:** Design game objects as collections of components; write systems that operate on them independently.
- **Manage assets:** Use AssetManager to load assets asynchronously; free resources when changing scenes.
- **Cross‑target:** Configure your build to output desktop, Android and HTML5 versions; adjust controls for each platform.
- **Profile regularly:** Use profilers (e.g., VisualVM) to monitor memory and CPU usage; avoid unnecessary allocations.
- **Leverage libraries:** Integrate Box2D for physics, Artemis‑ODB for ECS and Doodle for UI overlays.
- **Test small segments:** Develop test harnesses for physics or AI in isolation before integrating them into the full game.
- **Collaborate with artists:** Define asset formats and pipelines early; use tools like TexturePacker to compress sprites.
- **Document your process:** Keep design docs and code comments up to date; this aids debugging and collaboration.

### 🎯 Project Ideas (optional)

1. **Endless Runner:** Create a procedurally generated runner game where the player avoids obstacles and collects power‑ups.
2. **Tower Defence:** Build a tower defence game with multiple enemy types, towers and upgrade mechanics.
3. **Multiplayer Arena:** Develop a networked arena shooter using KryoNet for real‑time networking and ECS for game logic.
4. **Puzzle Platformer:** Combine puzzle elements with platforming (e.g., time manipulation, gravity flips) and implement level editing.
5. **Card Strategy Game:** Design a digital card game with deck building, AI opponents and online multiplayer.
6. **AI Sandbox:** Implement a simulation where autonomous agents learn behaviours via reinforcement learning algorithms.
7. **RPG Engine:** Develop a modular role‑playing engine with dialogue trees, quests, inventory and combat systems.
8. **Physics Playground:** Create an interactive environment where users can create and manipulate physics objects; include toggles for gravity, friction and elasticity.
9. **Educational Sim:** Build a simulation that teaches physics concepts (e.g., pendulums, orbital mechanics) with interactive visualisation.
10. **Game Editor Tool:** Construct a level editor for your game; implement saving/loading of levels and previewing within the editor.
11. **Retro Arcade Collection:** Remake several classic arcade games (Snake, Breakout, Space Invaders) in one package.
12. **Virtual Pet:** Program a Tamagotchi‑style pet simulation with mood, hunger, and growth; implement cross‑platform saving.
13. **Business Tycoon:** Create a management sim where players manage resources, staff and growth; apply functional patterns for simulation logic.
14. **Music Rhythm Game:** Build a rhythm game that matches user input to beats; include audio analysis to extract beats from songs.
15. **AR/VR Game:** Explore AR/VR by integrating with frameworks like jMonkeyEngine and using head‑tracking or augmented reality overlays.
16. **Game Jam Toolkit:** Build a set of reusable components and systems (physics, audio, UI) to accelerate future game jam projects.
17. **Voice Controlled Game:** Use speech recognition libraries to control a character or game; apply concurrency for audio processing.
18. **Procedural Generation Toolkit:** Develop a toolkit for generating terrain, mazes and dungeons; provide noise functions and random walkers.
19. **Educational Narrative:** Craft an interactive story that teaches programming concepts; implement branching narrative and puzzles.
20. **Social Party Game:** Develop a digital party game with mini‑games, remote multiplayer and social features.