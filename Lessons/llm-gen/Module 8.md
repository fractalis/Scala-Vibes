## 🧮 Module 8 – Big Data & Streaming with Scala (Weeks 15–16)

**Why this matters:** Large‑scale data processing is one of Scala’s strengths thanks to frameworks like Apache Spark and Kafka Streams. Understanding these tools opens opportunities in data engineering and real‑time analytics.

### 📚 Ten Research Topics

1. **Introduction to Apache Spark:** Study the high‑level architecture of a Spark application—driver program, cluster manager, executors—and the role of the main abstraction: RDDs.
2. **RDDs vs DataFrames/Datasets:** Compare Spark’s low‑level Resilient Distributed Datasets with higher‑level DataFrames and type‑safe Datasets. When do you choose each?
3. **Transformations and Actions:** Understand lazy transformations and actions; explore map, filter, reduce, join, groupBy, etc.
4. **Spark Persistence:** Investigate caching and persisting RDDs/Datasets in memory/disk and how this optimises computations[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures).
5. **Fault Tolerance & Lineage:** Learn how Spark recovers from node failures by recomputing lost partitions (lineage) [spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures).
6. **Spark Structured Streaming:** Explore building streaming applications with Spark’s structured streaming API; investigate windowing, watermarks, and sink options.
7. **Kafka Streams:** Study Kafka Streams as a library for writing real‑time applications and microservices; note that it combines ease of Java/Scala programming with benefits of Kafka’s cluster [kafka.apache.org](https://kafka.apache.org/documentation/streams/#:~:text=The%20easiest%20way%20to%20write,time%20applications%20and%20microservices) and provides exactly‑once semantics.
8. **Akka/pekko Streams:** Learn about reactive stream processing with Akka Streams (or Pekko Streams). Understand flows, sources, sinks, and back‑pressure mechanisms.
9. **FS2 & ZIO Streams:** Investigate purely functional streaming libraries like FS2 and ZIO Streams. Compare them to Spark and Kafka Streams.
10. **Data Formats & Serialisation:** Research common formats (JSON, Parquet, Avro, Protobuf) and libraries (Jackson, Circe) for serialising data within big‑data pipelines.

### 🔗 Validated Links (with descriptions)

- **Spark Programming Guide:** The official Spark guide explains that a driver program runs the main function, uses RDDs partitioned across cluster nodes, and enables transformations, persistence, and recovery from failures[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures).
- **Kafka Streams Overview:** Kafka Streams documentation describes it as a client library for building microservices; it combines simple Java/Scala development with Kafka’s cluster benefits and supports exactly‑once semantics[kafka.apache.org](https://kafka.apache.org/documentation/streams/#:~:text=The%20easiest%20way%20to%20write,time%20applications%20and%20microservices).
- **Spark Structured Streaming Guide:** Official docs for the structured streaming API covering event time, windows, and sinks.
- **Akka Streams Quickstart:** Introduces sources, flows, sinks, and the concept of back‑pressure for reactive stream processing.
- **FS2 Functional Streams Article:** Explains how FS2 offers type‑safe, resource‑safe streaming with support for concurrency and streaming I/O.

### 🧠 Review Questions

1. In Spark, what is a driver program and what role does it play when running a job across a cluster[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures)?
2. Explain the concept of an RDD. How are data partitions distributed across nodes and how does Spark recompute lost data[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures)?
3. What are the differences between RDDs, DataFrames, and Datasets? Provide use‑case scenarios for each.
4. Describe the difference between a transformation and an action in Spark. Why are transformations lazy?
5. What is Spark caching/persistence and how does it improve performance? How do you choose a storage level?
6. How does Spark’s lineage graph ensure fault tolerance? Illustrate with an example.
7. Why is Kafka Streams considered to have exactly‑once processing semantics and what benefits does it provide[kafka.apache.org](https://kafka.apache.org/documentation/streams/#:~:text=The%20easiest%20way%20to%20write,time%20applications%20and%20microservices)?
8. Compare Spark Structured Streaming with Kafka Streams and Akka Streams. What are the strengths of each for different streaming scenarios?
9. What is back‑pressure in Akka Streams and why is it important for reactive systems?
10. How do Avro and Parquet differ in data serialisation? When would you choose one over the other?

### ✍️ Journal Prompts

1. **🌩️ Spark Exploration:** Reflect on building your first Spark job. What surprised you about the driver/executor model[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures)? Which transformations felt intuitive, and which required deeper thought?
2. **🌀 Streaming Complexity:** After experimenting with Spark Structured Streaming and Kafka Streams, compare the mental models of each. What difficulties did you encounter in dealing with state and time windows?
3. **⚖️ Choosing a Tool:** Based on your research of FS2, Akka Streams, and Kafka Streams, discuss when you might choose one library over another for a given problem (e.g., back‑pressure requirements, cluster deployment, or pure functional approach).

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Set up a local Spark session in Scala and load a text file, then count the number of lines containing a given word.
2. Write a Spark application that reads a CSV of users, filters by age, groups by city, and counts the number of users per city.
3. Persist the resulting DataFrame in memory and benchmark the time for repeated queries with and without caching.
4. Create a simple Spark Structured Streaming job that reads from a directory where JSON files arrive and prints each record to the console.
5. Build a Kafka Streams application in Scala that consumes a topic of numbers, squares each number, and writes to a new topic.
6. Use Akka Streams to process a stream of integers: multiply by two, filter out odd results, and collect the first 100 values.
7. Implement a FS2 stream that reads lines from a file, transforms them to uppercase, and writes them out to another file.
8. Compare the performance of processing a large file with Spark vs FS2. Document memory consumption and processing time.
9. Serialise a Scala case class to Avro and Parquet using appropriate libraries; read the data back and verify correctness.
10. Build a simple interactive REPL that allows running Spark queries and streaming operations from a console.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Log Processor:** Build a Spark application that ingests log files, extracts error messages, aggregates counts by error type, and writes results to Parquet.
2. **Real‑Time Word Count:** Write a Kafka Streams or Spark Structured Streaming app that counts word occurrences in real time from a network socket and displays top words over sliding windows.
3. **Data Enrichment Pipeline:** Use Spark to join streaming sensor data with static reference data (e.g., location metadata) and output enriched streams.
4. **Reactive File Watcher:** Create an Akka Streams application that watches a directory for new files, processes each file, and writes outputs to another directory, demonstrating back‑pressure.
5. **Benchmark Suite:** Develop a small suite that benchmarks the same data-processing tasks implemented with Spark, Kafka Streams, Akka Streams, and FS2; record throughput and resource usage.

### 🌐 Mega Projects (12+ hrs)

1. **Streaming Analytics Platform:** Create an end‑to‑end analytics pipeline using Spark Structured Streaming to ingest data from Kafka, perform aggregations and windowed operations, and serve results via a REST API (maybe built with Play or http4s). Include exactly‑once semantics and fault tolerance.
2. **Data Lake Generator:** Build a tool that ingests raw data from multiple sources, cleans and normalises it with Spark, serialises it to Parquet/Avro, and exposes a Scala API for querying the stored data. Add support for streaming ingestion using Kafka or Akka Streams.

### 🔍 Libraries & Frameworks to Explore

- **Apache Spark Core & SQL:** The foundation of big data processing in Scala.
- **Kafka Streams:** Library for real‑time stream processing with Kafka[kafka.apache.org](https://kafka.apache.org/documentation/streams/#:~:text=The%20easiest%20way%20to%20write,time%20applications%20and%20microservices).
- **Akka Streams/Pekko Streams:** Reactive stream processing with back‑pressure.
- **FS2:** Functional Streams for Scala; purely functional, safe streaming.
- **ZIO Streams:** Effect‑based streaming library with built‑in concurrency and resource safety.
- **Apache Flink (Scala API):** Another distributed stream processor; compare with Spark.
- **Circe & Avro4s:** Libraries for serialising JSON and Avro in Scala.
- **Delta Lake or Iceberg:** Transactional storage layers built on top of Parquet; explore how they integrate with Spark.

### 📖 Definitions

- **Driver Program:** The main program in a Spark application that defines transformations/actions on RDDs and coordinates workers across the cluster[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures).
- **Resilient Distributed Dataset (RDD):** A distributed collection of elements partitioned across nodes that can be operated on in parallel; supports transformations and automatic recovery from node failures[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures).
- **Transformation:** A lazy operation on an RDD/DataFrame (e.g., `map`, `filter`) that defines a new dataset but doesn’t trigger computation until an action is invoked.
- **Action:** An operation that triggers execution of the DAG and returns results (e.g., `collect`, `count`).
- **Lineage Graph:** Spark’s record of transformations applied to data; used to recompute lost partitions after a node failure[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures).
- **Structured Streaming:** An extension of the Spark SQL API that allows streaming computations expressed similarly to batch queries.
- **Back‑Pressure:** Mechanism used by reactive streams libraries to ensure that faster producers don’t overwhelm slower consumers; built into Akka Streams.
- **Exactly‑Once Semantics:** Guarantee that each record in a stream is processed exactly once, even in the presence of failures; provided by Kafka Streams[kafka.apache.org](https://kafka.apache.org/documentation/streams/#:~:text=The%20easiest%20way%20to%20write,time%20applications%20and%20microservices).

### 💡 Concepts

- **Lazy Evaluation:** Transformations build a plan (DAG) and only execute when an action is called; this allows Spark to optimise and batch operations.
- **Parallelism & Partitioning:** Data is split into partitions processed in parallel across executors; understanding partitioning helps tune performance.
- **Fault Tolerance:** Spark maintains a lineage graph of operations. When nodes fail, it uses this graph to recompute lost partitions[spark.apache.org](https://spark.apache.org/docs/latest/rdd-programming-guide.html#:~:text=At%20a%20high%20level%2C%20every,automatically%20recover%20from%20node%20failures).
- **Structured vs Unstructured Streaming:** Structured streaming provides high-level, SQL-like operations over streaming data; unstructured streaming (e.g., FS2, Akka Streams) gives more control over event flows and back‑pressure.
- **Data Serialisation:** Choosing the right format (Parquet for columnar analytics, Avro for row‑oriented storage) affects storage and query performance.

### 🧪 Applications

- **Batch Analytics:** Use Spark to process large volumes of data (e.g., logs, clickstream) with complex transformations and join operations.
- **Real‑Time Dashboards:** Combine Kafka Streams or Spark Structured Streaming with a web framework to display real-time metrics.
- **Microservice Data Processing:** Use Akka Streams to process events within a microservice, benefiting from back‑pressure and composability.
- **Functional ETL Pipelines:** Use FS2 or ZIO Streams to build streaming pipelines that are purely functional, resource‑safe, and testable.

### 📌 Additional Tips & Resources

1. **🧮 Partition Tuning:** Experiment with `repartition` and `coalesce` in Spark to optimise data distribution.
2. **🧼 Clean Input Data:** Always validate and clean incoming data before performing joins or aggregations to avoid skewed results.
3. **🕒 Monitor Streaming Lag:** Use Spark UI or Kafka metrics to monitor processing latency and lag in streaming jobs.
4. **💾 Choose the Right Format:** Use Parquet for analytics; Avro for streaming data; JSON for human readability; Protobuf for network efficiency.
5. **🔧 Use Checkpoints:** Configure checkpointing in streaming jobs to allow stateful recovery.
6. **⚠️ Beware of Wide Transformations:** Operations like `groupByKey` can cause shuffle; prefer `reduceByKey` or pre‑aggregations.
7. **🏷️ Use Schemas:** In Spark, define explicit schemas to avoid expensive inference at runtime.
8. **🎛️ Tune Memory:** Adjust Spark’s executor memory and storage fraction to balance caching and processing.
9. **🧰 Explore GraphX & MLlib:** Beyond core APIs, explore Spark’s graph processing and machine-learning libraries.
10. **🧪 Use Data Locality:** Ensure tasks run close to the data; avoid unnecessary shuffling by optimising partitioning and caching strategies.

### 💡 Project Ideas (optional)

1. **Sensor Data Pipeline:** Ingest IoT sensor data using Kafka, process with Spark Streaming, store in Parquet, and visualise using a web dashboard.
2. **Clickstream Analysis:** Build a pipeline that processes web click logs in real time to compute session statistics and user journeys.
3. **Fraud Detection:** Stream transaction data, join with user profiles, and flag suspicious patterns using sliding windows.
4. **ETL Framework:** Develop a library that reads from multiple sources (CSV, JSON, Parquet), applies transformations, and writes out to various sinks.
5. **Social Media Sentiment:** Stream tweets or posts, perform sentiment analysis using Spark MLlib or external models, and update a dashboard.
6. **Stock Price Alert System:** Consume stock tick data from Kafka, compute moving averages, and alert on anomalies.
7. **File System Monitor:** Use Akka Streams to watch directories for new files and process them concurrently, applying back‑pressure to avoid overload.
8. **Image Processing Pipeline:** Build a Spark job that distributes image processing tasks (e.g., resizing, feature extraction) across a cluster.
9. **Streaming Game Leaderboard:** Process multiplayer game events in real time, compute scores, and maintain a leaderboard updated via websockets.
10. **Data Quality Reporter:** Create a Spark job that analyses dataset quality (missing values, duplicates), produces metrics, and reports via email or Slack.
11. **IoT Simulator:** Simulate sensors generating data, feed into Kafka, and process with FS2 or Akka Streams to test pipeline resilience.
12. **Composable ETL:** Build a DSL on top of FS2 or ZIO Streams for defining streaming transformations; compile it to Spark or local pipeline code.
13. **Graph Analytics:** Use Spark’s GraphX to perform PageRank or community detection on a large network dataset.
14. **Streaming Data Lake Ingestion:** Build a service that ingests streaming data into a data lake format like Delta Lake, ensuring ACID guarantees.
15. **Event‑Driven Microservice Platform:** Create a platform where microservices communicate exclusively via Kafka; implement services in Scala using Kafka Streams.
16. **Weather Alerting System:** Collect weather data streams, compute anomalies, and send alerts to users.
17. **Genomic Data Processor:** Build a Spark job that processes large genomic datasets using distributed algorithms.
18. **Chat Application:** Use Akka Streams to handle chat messages, apply moderation filters, and deliver to connected clients.
19. **Stream‑to‑Batch Converter:** Build a tool that takes streaming events, buckets them into daily partitions, and writes to Parquet.
20. **Distributed Web Crawler:** Use Spark or Flink to crawl websites, process content, and store results for analysis.