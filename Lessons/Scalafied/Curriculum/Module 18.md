## Module 18 – Data Engineering & ETL Pipelines (Weeks 35–36)

**Why this matters:** Most organisations rely on moving and transforming data at scale. Data engineering combines software engineering and data management to build reliable, maintainable pipelines that feed analytics, machine learning, and operational systems.

### 📚 Ten Research Topics

1. **Spark DataFrames for ETL:** Study how Spark’s DataFrame API is the primary interface for machine learning and data processing. The Spark docs emphasise that DataFrames provide a user‑friendly API, enable optimisations (Catalyst/Tungsten), and unify algorithms across languages[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
2. **Schema & File Formats:** Understand columnar formats (Parquet, ORC, Avro) versus row‑oriented formats (CSV, JSON). Learn about schema evolution and compatibility.
3. **Data Lake & Lakehouse:** Research architectures that separate storage and compute. Explore Delta Lake, Apache Hudi, and Iceberg for ACID transactions and time travel.
4. **ETL vs ELT:** Compare traditional Extract‑Transform‑Load with modern Extract‑Load‑Transform workflows. Consider where transformation occurs (compute cluster vs warehouse).
5. **Orchestration Tools:** Investigate workflow orchestrators like Apache Airflow, Dagster, Prefect, and Luigi. Understand DAGs, scheduling, retries, and sensors.
6. **Change Data Capture (CDC):** Learn how tools like Debezium stream database changes. Use CDC to build incremental pipelines.
7. **Data Quality & Validation:** Study tools like Great Expectations and Deequ for ensuring data quality. Learn about tests, expectations, and anomaly detection.
8. **Partitioning & File Layout:** Understand how partitioning by date, user id, or other columns can improve query performance and lower costs.
9. **Scalable I/O & Connectors:** Research JDBC, ODBC, and other connectors to read from and write to relational databases, object stores, and messaging systems.
10. **Governance & Lineage:** Explore metadata management, lineage tracking (e.g., Apache Atlas, DataHub), and access controls.

### 🔗 Validated Links (with descriptions)

- **Spark DataFrame vs RDD:** The Spark documentation explains that the DataFrame‑based API is now the primary API for machine learning because it offers a user‑friendly interface and benefits from Catalyst/Tungsten optimisations[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
- **DataFrame Capabilities:** The MLlib guide notes that MLlib provides algorithms and utilities for classification, regression, clustering, collaborative filtering, feature engineering, and pipelines[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=MLlib%20is%20Spark%E2%80%99s%20machine%20learning,it%20provides%20tools%20such%20as), which are often orchestrated using DataFrames.
- **Parquet Documentation:** Official Parquet docs describe its columnar storage format and how it enables efficient compression and predicate pushdown.
- **Airflow Documentation:** Airflow’s docs explain DAGs, operators, scheduling, retries, and how to author workflows as code.
- **Great Expectations:** Great Expectations documentation introduces how to define and test data quality expectations for pipelines.

### 🧠 Review Questions

1. According to the Spark documentation, why has the DataFrame API become the primary interface for ML and ETL processing[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API)?
2. Compare the benefits of columnar formats like Parquet and ORC to row‑oriented formats like CSV and JSON. When would you choose each?
3. What advantages do data lakehouse technologies (e.g., Delta Lake) provide over traditional data lakes?
4. Explain the difference between ETL and ELT. What factors influence the choice between them?
5. How does a workflow orchestrator like Airflow manage task dependencies and retries? What is a DAG?
6. Describe how Change Data Capture (CDC) works. How can Debezium be used to build streaming pipelines?
7. What is data partitioning and how does it affect query performance and cost?
8. Outline a strategy for ensuring data quality in a pipeline. How would you integrate tools like Great Expectations or Deequ?
9. What are the trade‑offs between storing raw data in a data lake versus loading it into a data warehouse?
10. How can metadata and lineage tools help with governance? What information should they capture?

### ✍️ Journal Prompts

1. **🗃️ DataFrame in Action:** After performing an ETL task using Spark DataFrames (e.g., reading a CSV, cleaning, and writing to Parquet), reflect on how the API simplified or complicated the job. Did optimisations like predicate pushdown or Catalyst help?[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API)
2. **🔁 Orchestrating Workflows:** Build a simple Airflow DAG that reads data, transforms it, and writes output. Describe your experience defining tasks, dependencies, and handling retries.
3. **🔍 Ensuring Quality:** After adding data quality checks to your pipeline (using Great Expectations or Deequ), write about the types of errors detected and how early detection improved reliability.

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Use Spark to read a large CSV file into a DataFrame, drop rows with nulls, and write the result as partitioned Parquet by year.
2. Implement an Airflow DAG (in Python) that triggers a Scala Spark job via `spark-submit`. Include sensors and retries.
3. Use Spark’s schema inference to infer a schema for JSON data, then enforce a custom schema and handle schema mismatches.
4. Write a Scala program that uses JDBC to read data from a relational database into a Spark DataFrame and joins it with another dataset.
5. Create a Delta Lake table, insert data, update records, and query previous versions using time travel.
6. Implement a simple data quality check using Deequ or Great Expectations to validate that numeric columns fall within expected ranges.
7. Stream CDC events from a PostgreSQL database using Debezium and write them to a Kafka topic. Consume them with Spark Structured Streaming and update a Delta table.
8. Use partitioning and bucketing when writing a Parquet table. Measure performance differences when querying with and without partition pruning.
9. Build a Scala CLI that reads a directory of CSV files, merges them into a single DataFrame, and writes the result to a compressed format.
10. Configure a workflow orchestrator (Airflow, Prefect, or Dagster) to run an ETL pipeline daily, including notifications on failure.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Daily Sales ETL:** Build a pipeline that ingests daily sales CSVs, cleans and aggregates data, and writes results to a data warehouse. Use Airflow for scheduling and data quality checks.
2. **CDC‑Based Replication:** Capture changes from a MySQL database using Debezium, apply transformations in Spark Structured Streaming, and write to a Delta Lake or Hudi table.
3. **Data Lakehouse Demo:** Set up a mini data lakehouse using Delta Lake. Ingest raw JSON data, transform and merge updates, and use time travel to query historical versions.
4. **Data Quality Dashboard:** Develop a dashboard (using Scala.js or a web framework) that visualises results of data quality tests across pipelines.
5. **Metadata & Lineage Tracker:** Build a simple metadata service that records datasets, schemas, dependencies, and run history. Integrate it with your ETL pipelines.

### 🌐 Mega Projects (12+ hrs)

1. **Enterprise‑Scale ETL Framework:** Design and implement an extensible ETL framework in Scala. Features should include configurable connectors, transformation pipelines, data quality checks, error handling, logging, and metadata tracking. Provide an Airflow integration and a UI for managing pipelines.
2. **Real‑Time Data Lakehouse:** Build a streaming pipeline that ingests CDC events, processes them with Spark Structured Streaming, and writes to a Delta Lake or Hudi table. Implement upserts, compaction, schema evolution, and time travel. Provide dashboards and governance metadata.

### 🔍 Libraries & Frameworks to Explore

- **Apache Spark (DataFrame & SQL):** Distributed processing and transformation engine. DataFrames provide optimised API for ETL[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
- **Delta Lake / Apache Hudi / Apache Iceberg:** Storage layers that bring ACID transactions and schema evolution to data lakes.
- **Apache Airflow / Dagster / Prefect / Luigi:** Workflow orchestrators for scheduling and monitoring ETL pipelines.
- **Debezium:** Change Data Capture tool that streams database changes to Kafka.
- **Great Expectations / Deequ:** Data quality and validation libraries.
- **JDBC & Spark Connectors:** For reading from and writing to relational databases, data warehouses, and message brokers.
- **Apache Kafka / Pulsar / Kinesis:** Messaging systems for streaming ingestion.
- **Parquet / ORC / Avro:** Columnar storage formats with compression and schema support.
- **DataHub / Apache Atlas:** Metadata and lineage tracking systems.
- **Spark SQL Extensions (Delta Connector, Hudi Utilities):** Tools for integrating Spark with lakehouse storage layers.

### 📖 Definitions

- **DataFrame:** A distributed table with named columns and optimisations like predicate pushdown and Catalyst. It is the primary API for ETL and ML in Spark[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
- **Schema:** The structure of a dataset (field names, types, nullability) that defines how data is stored and interpreted.
- **Partitioning:** Dividing data into separate files/directories based on column values to improve query performance.
- **Change Data Capture (CDC):** Technique to capture database changes (inserts, updates, deletes) and stream them to downstream systems.
- **ETL / ELT:** Processes that Extract, Transform, and Load data; the order of operations differs between ETL and ELT.
- **Data Lake:** A central repository that stores raw and processed data in its native format. Often built on object storage.
- **Data Lakehouse:** Architecture that combines data lake flexibility with data warehouse features like transactions and schema management.
- **Workflow Orchestrator:** Tool that manages task execution order, scheduling, retries, and dependencies.
- **Data Quality Check:** Test that validates data against expectations (ranges, uniqueness, completeness, referential integrity).
- **Metadata / Lineage:** Information describing datasets, schemas, and the transformations applied to them.

### 💡 Concepts

- **Pushdown & Optimisation:** Spark’s Catalyst optimizer and Tungsten engine automatically optimise DataFrame operations[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
- **Columnar Storage Benefits:** Columnar formats compress and encode each column separately, enabling efficient scanning and predicate pushdown.
- **Schema Evolution:** Storage layers like Delta Lake allow adding or modifying columns while maintaining backward compatibility.
- **Idempotent Jobs:** ETL tasks should be designed to be idempotent so they can safely re‑run without duplicating data.
- **Data Quality as Code:** Treat expectations and tests as code committed to version control and executed alongside pipelines.
- **Incremental Processing:** Use CDC and watermarking to process only new or changed data, reducing latency and load.
- **Data Governance:** Track ownership, provenance, and access controls to ensure compliance and auditability.
- **Lakehouse vs Warehouse:** Lakehouses provide ACID transactions and schema enforcement on data lake storage; warehouses historically offered these features but with less flexibility.
- **Partition Pruning:** Query engines can skip partitions that don’t match filter predicates, improving performance.
- **Resource Planning:** Consider cluster size, memory, shuffle partitions, and file sizes when designing pipelines.

### 🧪 Applications

- **Batch Ingestion:** Load CSV or JSON files into a data lake; transform and aggregate using Spark DataFrames[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
- **Streaming ETL:** Use Spark Structured Streaming to process CDC events and update Delta Lake tables in real time.
- **Lakehouse Analytics:** Query Delta/Hudi/Iceberg tables directly with Spark SQL for ad‑hoc analysis.
- **Data Quality Gates:** Integrate data validation steps into ETL pipelines to catch bad data early.
- **Workflow Automation:** Schedule pipelines with Airflow; monitor and retry failures automatically.
- **Metadata Catalogues:** Register datasets and schemas in a metadata service to enable discovery and lineage tracking.
- **Incremental Loads:** Use partition and file metadata to load only new data, reducing compute costs.
- **Data Governance:** Apply access control lists and audit logs to sensitive datasets.
- **Schema Evolution:** Update schemas gradually, ensuring backward compatibility and proper migrations.
- **Hybrid Processing:** Combine batch and streaming (e.g., micro‑batch pipelines) to handle both historical and real‑time data.

### 📌 Additional Tips & Resources

1. **📂 Use Columnar Formats:** Write data to Parquet or ORC for better compression and query performance.
2. **🧮 Partition Intelligently:** Partition by columns used in filtering (e.g., date, region) to improve pruning; avoid small files.
3. **🔍 Validate Early:** Add data quality checks at the start of the pipeline to catch issues sooner.
4. **🧪 Test Pipelines:** Write unit and integration tests for ETL logic; use small sample datasets in CI.
5. **💾 Manage Metadata:** Maintain a central metadata catalogue to track datasets, owners, and lineage.
6. **📊 Monitor Jobs:** Collect metrics (duration, data volume) for each pipeline run; set up alerts for anomalies.
7. **🔄 Reprocess When Needed:** Design pipelines to reprocess data when schemas change or bugs are fixed; use idempotent writes.
8. **⚙️ Tune Spark:** Adjust shuffle partitions, broadcast joins, and caching strategies for optimal performance.
9. **🛡️ Secure Data:** Encrypt sensitive data at rest and in transit; restrict access using IAM roles and ACLs.
10. **📚 Keep Learning:** Data engineering is evolving—follow community blogs, conferences, and documentation to stay current.

### 💡 Project Ideas (optional)

1. **Customer 360 Pipeline:** Build a pipeline that combines customer data from CRM, e‑commerce, and support systems into a unified profile. Handle CDC, deduplication, and data quality checks.
2. **Data Lakehouse Setup:** Create a mini data lakehouse on your laptop using Delta Lake. Ingest synthetic data, perform updates and deletes, and query historical snapshots.
3. **Audit Log Processor:** Stream database audit logs via Debezium, apply transformations, and load them into a searchable index like Elasticsearch.
4. **Data Lineage Visualiser:** Build a tool that visualises data lineage graphs from metadata collected during pipeline runs.
5. **Automated Data Quality Reporting:** Develop a system that runs Great Expectations tests on daily ingests and sends summary reports to Slack.
6. **Streaming CDC Replicator:** Capture MySQL or PostgreSQL CDC events and replicate them to multiple downstream systems (Delta Lake, Elasticsearch, Kafka).
7. **Partition Optimiser:** Build a utility that analyses the size and distribution of partitions in a data lake and recommends optimal partitioning strategies.
8. **Self‑Service ETL:** Create a DSL or UI that allows non‑technical users to define simple ETL tasks (join, filter, aggregate) that generate Spark jobs under the hood.
9. **Data Governance Portal:** Implement a web portal for registering datasets, managing ownership, and tracking schema changes.
10. **Historical Replay Engine:** Develop a system that replays historical events through the latest pipeline logic to rebuild datasets.
11. **Resource Usage Analyser:** Monitor resource utilisation of Spark jobs (CPU, memory, IO) and provide recommendations for cost reduction.
12. **Multi‑Cloud Data Pipeline:** Design a pipeline that ingests data from AWS S3, processes it in Azure Databricks, and loads results into Google BigQuery.
13. **Data Drift Detector:** Build a tool that detects drift in data distributions between ingests and triggers alerts.
14. **Schema Evolution Manager:** Create a service that applies schema migrations automatically and ensures compatibility across versions.
15. **ETL Testing Framework:** Develop a Scala testing library to assert expectations on DataFrames and pipelines.
16. **Data Contract Enforcement:** Implement a system where producers and consumers agree on data contracts enforced via schema validation.
17. **End‑to‑End Data Catalog:** Integrate metadata from Airflow, Spark, and storage layers into a unified catalog.
18. **Streaming Analytics API:** Provide a GraphQL or REST API that exposes results from streaming aggregations in real time.
19. **Data Retention Manager:** Build a service that deletes or archives data based on retention policies while maintaining audit logs.
20. **Cost‑Optimised Storage Tiering:** Design a pipeline that moves cold data from expensive storage to cheaper tiers automatically.