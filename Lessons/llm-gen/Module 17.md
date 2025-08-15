## 📡 Module 17 – Streaming & Reactive Systems (Weeks 33–34)

**Why this matters:** Many modern applications need to process data as it arrives rather than in large batches. Streaming frameworks let you build reactive, real‑time systems that handle high volumes of events, apply transformations, and maintain state with back‑pressure and fault‑tolerance.

### 📚 Ten Research Topics

1. **FS2 Overview:** Study FS2, a purely functional, effectful, concurrent streaming library. Its site notes that it provides functional, effectful, concurrent streams for Scala, supports I/O computations in constant memory, stateful transformations, resource safety, and is built on Cats Effect[fs2.io](https://fs2.io/#/#:~:text=,for%20Scala).
2. **Akka Streams & Back‑Pressure:** Learn how Akka Streams implements the Reactive Streams specification. The Akka docs emphasise that Akka Streams propagate back‑pressure from sinks to sources by default to avoid unbounded buffering[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html#:~:text=Back).
3. **Reactive Streams Standard:** Research the interfaces (Publisher, Subscriber, Subscription, Processor) and how FS2 and Akka Streams interoperate with them.
4. **Windowing & Time:** Explore event‑time vs processing‑time, tumbling and sliding windows, and watermarks. Understand when to use each for aggregations.
5. **Stateful vs Stateless Operations:** Learn about map, filter, flatMap (stateless) versus aggregations, joins, and state machines (stateful) and their impact on memory.
6. **Integration with Message Brokers:** Investigate connecting FS2/Akka Streams to Kafka, Pulsar, RabbitMQ using Alpakka or fs2‑kafka. Understand partitioning, consumer groups, and offset management.
7. **Structured Streaming (Spark):** Review Spark Structured Streaming’s micro‑batch model, exactly‑once processing, and integration with DataFrames.
8. **Building End‑to‑End Pipelines:** Compose sources, transformations, and sinks. Handle errors, retries, and resource cleanup in streaming pipelines.
9. **Monitoring & Observability:** Study how to instrument streams with metrics, logs, and tracing. Use tools like Kamon, Micrometer, Prometheus, and OpenTelemetry.
10. **Deployment & Scaling:** Examine strategies for deploying stream processors to Kubernetes or serverless platforms. Explore horizontal scaling and elasticity.

### 🔗 Validated Links (with descriptions)

- **FS2 Introduction:** The FS2 site highlights that FS2 offers functional, effectful, concurrent streams for Scala with constant memory, stateful transformations, resource safety, and is built on Cats Effect[fs2.io](https://fs2.io/#/#:~:text=,for%20Scala).
- **Akka Streams Back‑Pressure:** The Akka Streams quickstart guide explains that Akka Streams propagate back‑pressure from sinks to sources to prevent unbounded buffering and failures[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html#:~:text=Back).
- **Reactive Streams Specification:** The official Reactive Streams specification defines the interfaces for asynchronous stream processing with non‑blocking back‑pressure.
- **Alpakka Connectors:** Alpakka is a collection of Akka Streams connectors for integrating with external systems like Kafka, Kinesis, and S3.
- **Spark Structured Streaming:** The Spark docs describe Structured Streaming as a unified engine for streaming and batch with exactly‑once semantics.

### 🧠 Review Questions

1. According to the FS2 site, what are the key properties of FS2 streams[fs2.io](https://fs2.io/#/#:~:text=,for%20Scala)?
2. How does Akka Streams propagate back‑pressure and why is this important[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html#:~:text=Back)?
3. Describe the four interfaces defined by the Reactive Streams specification. How do they work together?
4. Compare FS2 and Akka Streams. When might you choose one over the other?
5. Explain the difference between event time and processing time. How do watermarks help handle late data?
6. What is a window in streaming, and how does a sliding window differ from a tumbling window?
7. What mechanisms ensure exactly‑once processing when streaming from Kafka to a database?
8. How would you connect a Scala streaming application to Kafka and manage consumer offsets?
9. What metrics and logs would you collect to monitor a long‑running stream? How would you surface back‑pressure issues?
10. Discuss deployment strategies for stream processors. How do you handle scaling and fault tolerance?

### ✍️ Journal Prompts

1. **🌊 First Flow:** Build a simple FS2 or Akka Streams pipeline (e.g., reading lines from a file and counting words). Reflect on how the library’s compositional operators helped you reason about the stream. Did you encounter any back‑pressure issues[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html#:~:text=Back)?
2. **⚖️ Choosing a Library:** After experimenting with FS2 and Akka Streams, write about the pros and cons of each. Which mental model (pull‑based vs push‑based) was more intuitive for you?
3. **⏱️ Time & Windows:** Implement an aggregation using tumbling or sliding windows (e.g., count events per minute). Discuss how event time semantics and late data affected the implementation.

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Use FS2 to read numbers from a file, filter out negatives, and compute a running sum.
2. Write an Akka Streams pipeline that consumes strings from a `Source.queue`, converts them to uppercase, and writes them to a sink that prints to stdout.
3. Implement a Kafka consumer using fs2‑kafka that consumes messages and writes them to a database; handle offset commits.
4. Use Alpakka to read messages from a RabbitMQ queue, transform them, and publish results to another queue.
5. Create a sliding window aggregation that computes a moving average over the last N elements in a stream.
6. Simulate a sensor stream generating random readings; use a window to detect if the average exceeds a threshold and trigger an alert.
7. Build a stream that merges two sources (e.g., user clicks and page impressions) and correlates events by key.
8. Write a spark structured streaming job that reads from a directory of CSV files, filters rows, and writes to Parquet in append mode.
9. Instrument an FS2 stream with a simple metric (e.g., count processed records per second) and expose it via HTTP.
10. Use Akka Streams `Flow` with `buffer` and an `OverflowStrategy` to drop old elements when the consumer is slow. Experiment with different strategies.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Event Counter Service:** Build a service that counts occurrences of events in real time. Use FS2 to aggregate counts and expose results via HTTP. Add back‑pressure handling.
2. **Twitter Stream Analysis:** Consume tweets via a streaming API (or a simulated feed), filter by hashtags, compute rolling metrics, and write to a dashboard using Akka Streams.
3. **Log Ingestion Pipeline:** Read logs from a file or Kafka topic, parse them into structured records, enrich with metadata, and write to Elasticsearch or ClickHouse.
4. **Fraud Detection Stream:** Build a pipeline that consumes transaction events and flags suspicious patterns using stateful aggregations or windows.
5. **Real‑Time Notification System:** Subscribe to events from multiple sources (e.g., orders, inventory changes) and send user notifications with deduplication and retries.

### 🌐 Mega Projects (12+ hrs)

1. **Streaming ETL Platform:** Develop a modular streaming platform using FS2 or Akka Streams. It should support multiple connectors (Kafka, HTTP, JDBC), dynamic configuration of pipelines, metrics, and monitoring. Deploy it on Kubernetes.
2. **Time‑Series Analytics Engine:** Create a system that ingests sensor data, applies windowed aggregations, stores results in a time‑series database, and exposes real‑time dashboards. Handle late events and state persistence.

### 🔍 Libraries & Frameworks to Explore

- **FS2:** Functional, effectful, concurrent streaming library[fs2.io](https://fs2.io/#/#:~:text=,for%20Scala).
- **Akka Streams / Pekko Streams:** Reactive Streams implementation with back‑pressure[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html#:~:text=Back).
- **Reactive Streams:** Interfaces for asynchronous, non‑blocking stream processing.
- **fs2‑kafka / Akka Kafka / Alpakka:** Connectors for Kafka and other brokers.
- **Apache Kafka / Pulsar / RabbitMQ:** Messaging platforms for streaming.
- **Spark Structured Streaming:** Unified engine for batch and streaming.
- **Apache Flink / Flink‑Scala:** Stream processing engine with event‑time semantics.
- **Kamon / Micrometer:** Metrics instrumentation libraries.
- **OpenTelemetry / Prometheus / Grafana:** Observability tools.
- **Kinesis / Google Pub/Sub:** Managed streaming services on cloud providers.

### 📖 Definitions

- **Stream:** A potentially unbounded sequence of elements processed incrementally.
- **Back‑Pressure:** A feedback mechanism that signals upstream producers to slow down when consumers can’t keep up, preventing unbounded buffering[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html#:~:text=Back).
- **Reactive Streams:** A standard set of interfaces (Publisher, Subscriber, Subscription, Processor) for asynchronous stream processing with non‑blocking back‑pressure.
- **Source / Sink / Flow:** In Akka Streams, a `Source` produces elements, a `Sink` consumes them, and a `Flow` transforms them.
- **Window:** A finite segment of a stream used for aggregations; can be tumbling (non‑overlapping) or sliding (overlapping).
- **Watermark:** A marker indicating that events earlier than a certain timestamp have been observed, used to handle late data.
- **Event Time vs Processing Time:** Event time refers to when an event actually occurred, whereas processing time is when it was processed by the system.
- **Stateful Operation:** An operation (e.g., aggregation, join) that maintains internal state across multiple elements.
- **Exactly‑Once Processing:** Guarantee that each input event affects the output exactly once, even in case of failures.
- **Connector:** A component that bridges a stream processing framework with an external system (database, message broker, file system).

### 💡 Concepts

- **Compositionality:** Streams can be composed from simple building blocks. FS2 and Akka Streams provide combinators like `map`, `filter`, `merge`, `broadcast`.
- **Resource Safety:** FS2 ensures resources (files, connections) are acquired and released safely, even in case of errors[fs2.io](https://fs2.io/#/#:~:text=,for%20Scala).
- **Push vs Pull:** Akka Streams uses a push‑based model, while FS2 uses a pull‑based model; this affects back‑pressure and composition.
- **Time Semantics:** Distinguish between event time and processing time; choose appropriate windows and triggers.
- **Fault Tolerance:** Stream processors should handle retries, offsets, and state recovery for resilience.
- **Back‑Pressure Strategies:** Use buffers with overflow strategies (drop, fail, back‑pressure) to handle bursts[doc.akka.io](https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html#:~:text=Back).
- **Integration Patterns:** Connectors (Kafka, HTTP) allow integration with external systems; ensure at‑least‑once or exactly‑once semantics.
- **Monitoring:** Expose metrics (throughput, lag), logs, and traces to diagnose performance and errors.
- **Scalability:** Partition data and scale processing horizontally by running multiple instances or using consumer groups.
- **Deployment Models:** Deploy stream processors as long‑running services, serverless functions, or as part of a data platform.

### 🧪 Applications

- **Real‑Time Analytics:** Process clickstream data to compute rolling metrics and drive dashboards.
- **Monitoring & Alerting:** Ingest logs/metrics, detect anomalies, and send alerts.
- **Data Ingestion:** Stream data from IoT devices into databases or data lakes.
- **Event‑Driven Microservices:** Use streams to implement domain events and reactive microservices that respond to changes.
- **Streaming ETL:** Transform and enrich data on the fly before persisting it.
- **Recommendation Systems:** Process user interactions in real time to update recommendations.
- **Fraud Detection:** Detect suspicious transactions using sliding windows and pattern matching.
- **Stock Tickers:** Ingest and aggregate stock prices for live dashboards.
- **Chat & Collaboration Tools:** Implement chat rooms and presence updates with streaming frameworks.

### 📌 Additional Tips & Resources

1. **🧪 Start Simple:** Begin with small streams to understand operators before building complex pipelines.
2. **🧠 Learn the Reactive Streams API:** Understanding the core interfaces helps when switching between implementations.
3. **📏 Size Buffers Appropriately:** Too small buffers cause back‑pressure; too large may waste memory. Monitor and adjust.
4. **🛡️ Handle Errors Gracefully:** Use error‑handling operators (`handleErrorWith`, supervision strategies) to recover from failures.
5. **🧘 Keep It Pure:** FS2’s pure streams encourage side‑effects at the edge; use this discipline to simplify reasoning.
6. **🔗 Use Connectors:** Don’t reinvent the wheel; leverage libraries like fs2‑kafka and Alpakka for integration.
7. **📊 Instrument Early:** Add metrics and tracing from the start to diagnose issues later.
8. **🏗️ Avoid Blocking Calls:** Use asynchronous drivers and non‑blocking APIs to avoid blocking the stream.
9. **⚙️ Tuning:** Experiment with parallelism, batch sizes, and window sizes to optimise throughput and latency.
10. **🛠️ Explore Flink & Pulsar:** Broaden your knowledge by studying other stream processing engines and messaging platforms.

### 💡 Project Ideas (optional)

1. **Streaming Word Count:** Build a classic word‑count pipeline using FS2 or Akka Streams that reads from a socket, splits words, and counts frequencies over sliding windows.
2. **Real‑Time Leaderboard:** Ingest game events and maintain a leaderboard of top players in real time. Persist state and handle resets.
3. **IoT Data Pipeline:** Collect sensor readings from multiple devices via MQTT or Kafka, filter and enrich data, and store results in a time‑series database.
4. **Live Chat Service:** Implement a chat server using streams to manage rooms, deliver messages, and broadcast notifications.
5. **Ad Click Fraud Detector:** Stream ad click events, join with user behaviour, and flag suspicious patterns using stateful processing.
6. **Order Fulfillment System:** Build a pipeline that processes orders, validates stock, charges payment, and sends notifications.
7. **Multi‑Tenant Metrics Collector:** Create a service that collects metrics from various applications, attaches tenant identifiers, and writes to a central store.
8. **Event Replay Service:** Implement a tool that replays events from a Kafka topic, optionally filtering or transforming them.
9. **Streaming Data Enrichment:** Join streaming data with static lookup tables (e.g., GeoIP data) to add context.
10. **Social Media Sentiment Analysis:** Stream tweets or posts, analyse sentiment, and update a dashboard in real time.
11. **Multi‑Source Joiner:** Combine streams from multiple message brokers and correlate events using unique identifiers.
12. **Dynamic Pipeline Builder:** Create a DSL or UI that allows users to compose streaming pipelines at runtime.
13. **Stateful Payment Processor:** Implement a transaction stream that detects double charges and handles compensation.
14. **Stock Price Alert System:** Monitor stock prices and send alerts when thresholds are crossed.
15. **Resource‑Aware Stream:** Build a stream that adjusts its processing rate based on CPU or memory usage.
16. **Video Analytics Pipeline:** Stream video frames, apply machine learning, and flag anomalies.
17. **Real‑Time ETL for Data Warehouse:** Ingest data from multiple sources, transform, and load into a warehouse with deduplication.
18. **Event‑Driven Workflow Engine:** Orchestrate tasks via events using streams and maintain workflow state.
19. **Weather Data Aggregator:** Collect weather data from sensors and public APIs; compute daily statistics and provide API endpoints.
20. **Disaster Alert System:** Ingest earthquake or disaster events, correlate with locations, and dispatch alerts to users.