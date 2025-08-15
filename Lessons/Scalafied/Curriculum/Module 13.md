## 📊 Module 13 – Data Science & Machine Learning with Scala (Weeks 25–26)

**Why this matters:** The data revolution isn’t slowing down. Scala and its ecosystem (Spark MLlib, Breeze, Smile) offer scalable and expressive tools for data processing, machine learning, and numerical computing.

### 📚 Ten Research Topics

1. **Overview of MLlib:** Discover Spark’s machine learning library and its main components—algorithms for classification, regression, clustering, collaborative filtering, feature engineering, pipelines, persistence, and utilities[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=MLlib%20is%20Spark%E2%80%99s%20machine%20learning,it%20provides%20tools%20such%20as).
2. **DataFrame vs RDD API:** Understand why the DataFrame‑based API is now the primary ML API in Spark; DataFrames provide a user‑friendly API, support optimizations, and unify ML algorithms across languages[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
3. **ML Pipelines:** Research how to build ML workflows using estimators, transformers, and evaluators; study hyperparameter tuning and cross‑validation.
4. **Feature Engineering:** Explore techniques for feature extraction, selection, transformation, and dimensionality reduction (e.g., one‑hot encoding, TF‑IDF, PCA).
5. **Breeze:** Learn about Breeze, a numerical processing library used by MLlib, providing linear algebra and statistics functionality.
6. **Smile (Statistical Machine Intelligence & Learning Engine):** Investigate Smile’s algorithms for classification, regression, clustering, and graphs; compare it to Spark MLlib.
7. **Graph Processing:** Study graph algorithms with GraphX or more recent libraries like GraphFrames to perform PageRank, connected components, and community detection.
8. **Deep Learning Frameworks:** Survey DeepLearning4j, BigDL, and JTensorFlow for running neural networks on the JVM; examine how they integrate with Scala.
9. **Visualization Libraries:** Explore libraries like Vegas (a Scala wrapper for Vega-Lite), EvilPlot, Plotly Scala, and Breeze‑viz for creating charts and dashboards.
10. **Data Science Environments:** Research using Jupyter notebooks (via Almond/Scala kernel) or Zeppelin for interactive data exploration and model development.

### 🔗 Validated Links (with descriptions)

- **Spark MLlib Main Guide:** The MLlib guide states that MLlib provides algorithms for classification, regression, clustering, collaborative filtering, feature extraction, pipelines, and utilities[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=MLlib%20is%20Spark%E2%80%99s%20machine%20learning,it%20provides%20tools%20such%20as).
- **DataFrame API Emphasis:** Spark documentation explains that the DataFrame‑based API is now the primary ML API because it offers a user‑friendly interface and benefits from Catalyst/Tungsten optimisations[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
- **Breeze Documentation:** Breeze is a numerical processing library used by MLlib; its docs cover linear algebra, statistics, and optimisation routines.
- **Smile Library:** Smile’s documentation describes its rich set of machine learning algorithms and visualisation tools for Scala and Java.
- **Almond (Scala kernel for Jupyter):** Almond docs show how to run Scala code in Jupyter notebooks for interactive data science.

### 🧠 Review Questions

1. According to the MLlib guide, what categories of algorithms and tools does MLlib provide[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=MLlib%20is%20Spark%E2%80%99s%20machine%20learning,it%20provides%20tools%20such%20as)?
2. Why did Spark shift its primary ML API from RDDs to DataFrames, and what benefits do DataFrames offer[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API)?
3. Describe the components of an ML pipeline (estimators, transformers, evaluators). How does cross‑validation improve model selection?
4. What are some common feature engineering techniques? Provide an example of when you would use PCA.
5. Compare Breeze and Smile: what strengths does each library have for numerical computing and machine learning?
6. How does GraphX represent graphs using RDDs? What is an alternative (GraphFrames) and its advantages?
7. List some differences between Spark MLlib and deep learning frameworks like DL4J or BigDL.
8. How can you create a line chart or scatter plot in Scala using Vegas or EvilPlot? What are the advantages of declarative plotting?
9. What is collaborative filtering and where is it used? Name the algorithm in Spark MLlib that implements it.
10. Describe how to set up and use the Almond Scala kernel in Jupyter for interactive data analysis.

### ✍️ Journal Prompts

1. **📈 Building Pipelines:** After constructing a small ML pipeline in Spark, reflect on how modular components (e.g., transformers and estimators) improved or complicated your workflow. How did DataFrames make the process easier[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API)?
2. **🧮 Numerics in Scala:** Write about your experience using Breeze for linear algebra and Smile for machine learning. What did you like or dislike about each library? Did you encounter any performance issues or API quirks?
3. **📊 Visual Storytelling:** Create a plot using Vegas or EvilPlot. Describe how data visualisation affected your understanding of the model results and the data.

### 💻 Mini‑Coding Exercises (1–3 hrs each)

1. Load a CSV dataset into a Spark DataFrame and compute descriptive statistics (mean, std, min, max) for numeric columns.
2. Build a logistic regression model in Spark MLlib to classify iris species; split data into train and test sets and evaluate accuracy.
3. Implement k‑means clustering with MLlib on a synthetic dataset; visualise clusters using Vegas or EvilPlot.
4. Use Breeze to solve a system of linear equations and compute the eigenvalues of a matrix.
5. Train a collaborative filtering recommendation model using alternating least squares (ALS) on movie ratings.
6. Use Smile to perform decision tree classification on a dataset; compare its API to Spark’s and evaluate performance.
7. Write a Spark pipeline that tokenises text, computes TF‑IDF, and trains a Naïve Bayes classifier.
8. Use GraphX to compute PageRank on a small social graph; extract the top‑ranked nodes.
9. Create a Jupyter notebook with the Almond kernel that reads a CSV file, performs a simple regression, and plots results.
10. Build a simple multi‑layer perceptron using DL4J or BigDL and train it on the MNIST dataset.

### 🛠️ Mini‑Projects (5–12 hrs)

1. **Customer Churn Prediction:** Use Spark to train and evaluate models that predict customer churn; perform feature engineering and cross‑validation.
2. **Recommender System:** Build a movie recommendation engine using collaborative filtering (ALS) and evaluate its precision/recall.
3. **Clustering News Articles:** Use Spark or Smile to cluster news articles based on text embeddings; visualise clusters with dimensionality reduction.
4. **Network Analysis:** Analyse a social network using GraphX; compute metrics like degree distribution, centrality, and community detection.
5. **Time Series Forecasting:** Explore time series with Spark (e.g., using Prophet or ARIMA packages) to predict future trends.

### 🌐 Mega Projects (12+ hrs)

1. **End‑to‑End ML Pipeline:** Build an end‑to‑end pipeline that ingests raw data, cleans and transforms it, trains multiple models, tunes hyperparameters, and deploys the best model as a REST API. Use Spark for large‑scale processing and integrate visualisation.
2. **Graph Analytics Platform:** Develop a platform that loads large graphs, runs analysis algorithms (PageRank, community detection), and provides an interactive dashboard for exploring results. Use GraphX or GraphFrames, Breeze for computation, and a Scala front‑end for visualisation.

### 🔍 Libraries & Frameworks to Explore

- **Spark MLlib:** Machine learning algorithms and pipelines[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=MLlib%20is%20Spark%E2%80%99s%20machine%20learning,it%20provides%20tools%20such%20as).
- **Breeze:** Linear algebra and numerical computing (used by MLlib).
- **Smile:** Comprehensive ML library with algorithms and plotting capabilities.
- **GraphX / GraphFrames:** Libraries for distributed graph processing.
- **DeepLearning4j / BigDL:** Deep learning frameworks on the JVM.
- **Vegas / EvilPlot / Plotly Scala:** Data visualisation libraries for Scala.
- **Almond & Zeppelin:** Interactive notebooks for Scala data science.
- **H2O / XGBoost4J:** Additional ML libraries with advanced algorithms.
- **Breeze‑viz:** Plotting extension for Breeze.
- **Sparkling Water:** Integration of H2O with Spark.

### 📖 Definitions

- **DataFrame:** A distributed table with named columns supporting SQL and functional transformations. It is the primary API for ML in Spark[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=Announcement%3A%20DataFrame,API).
- **Estimator:** An algorithm that can be fit on a DataFrame to produce a model (e.g., `LogisticRegression`).
- **Transformer:** A function that transforms one DataFrame into another (e.g., `Tokenizer`, `PCA`).
- **Pipeline:** An ordered sequence of stages (transformers and estimators) that defines a workflow for model training and prediction.
- **Collaborative Filtering:** A recommendation technique that predicts user preferences by learning latent factors from user-item interactions.
- **Clustering:** An unsupervised learning technique that groups similar data points; algorithms include k‑means and Gaussian Mixture.
- **Regression:** Predicting continuous outcomes using models like linear regression, decision trees, and random forests.
- **Classification:** Predicting discrete labels; algorithms include logistic regression, SVM, and decision trees.
- **GraphX:** Spark API for graph-parallel computation; represents graphs as RDDs of vertices and edges.
- **Feature Engineering:** The process of creating, selecting, and transforming variables to improve ML model performance.

### 💡 Concepts

- **Scalability:** Spark MLlib scales machine learning across clusters, enabling processing of large datasets that don’t fit into memory.[spark.apache.org](https://spark.apache.org/docs/latest/ml-guide.html#:~:text=MLlib%20is%20Spark%E2%80%99s%20machine%20learning,it%20provides%20tools%20such%20as)
- **Pipeline Abstraction:** Pipelines encapsulate the workflow from raw data to model training and prediction, making experiments repeatable.
- **Lazy Evaluation:** DataFrame transformations are lazily executed; actual computation happens during actions (e.g., `fit`, `transform`).
- **Model Persistence:** Trained models and pipelines can be saved and loaded for later use, facilitating deployment.
- **Distributed Graphs:** GraphX partitions graphs across a cluster, enabling parallel algorithms like PageRank and community detection.
- **Visualisation:** Visual tools help interpret data and model results, making insights more accessible and decisions more informed.

### 🧪 Applications

- **Classification & Regression:** Build predictive models for churn, credit risk, or sales forecasting using Spark MLlib.
- **Clustering & Segmentation:** Segment customers or products using k‑means or hierarchical clustering.
- **Recommendation Systems:** Use collaborative filtering to recommend movies, products, or articles.
- **Graph Analytics:** Analyse social networks or communication networks to understand connectivity and influence.
- **Deep Learning:** Explore neural network models with BigDL or DL4J for image or language data.

### 📌 Additional Tips & Resources

1. **📜 Clean Your Data:** Always inspect and clean data before modelling; handle missing values and outliers.
2. **⚖️ Balance Classes:** When dealing with imbalanced datasets, use techniques like down‑sampling, up‑sampling, or class weights.
3. **🧪 Experiment:** Try multiple algorithms and feature sets; use cross‑validation to find the best model.
4. **🔍 Evaluate:** Choose appropriate metrics (accuracy, precision, recall, ROC AUC) depending on the problem.
5. **⚙️ Tune Hyperparameters:** Use grid search or random search to find optimal hyperparameters for your models.
6. **🧬 Understand Overfitting:** Regularisation (e.g., L1, L2) and cross‑validation help prevent overfitting.
7. **📈 Scale Features:** Standardise or normalise numerical features for algorithms sensitive to scale (e.g., k‑means, logistic regression).
8. **🧠 Visualise:** Use plots to understand distributions, correlations, and model performance.
9. **🐍 Learn from Python:** Many examples are in PySpark; translate them to Scala to deepen understanding.
10. **📚 Keep Reading:** Explore further resources like the _Advanced Analytics with Spark_ book and courses on data science with Scala.

### 💡 Project Ideas (optional)

1. **Music Recommendation Engine:** Use collaborative filtering to recommend songs based on user listening history and evaluate with metrics.
2. **Real Estate Price Predictor:** Train regression models on property data to predict house prices; include visualisation of feature importance.
3. **Social Influence Analysis:** Compute centrality metrics (PageRank, betweenness) on social graphs and identify influencers.
4. **Fraud Detection:** Build a classification model to detect fraudulent transactions using a highly imbalanced dataset.
5. **Topic Modelling:** Perform LDA or word2vec on a corpus of documents to discover underlying topics.
6. **Movie Sentiment Analysis:** Use MLlib or Smile to classify movie reviews as positive or negative; visualise confusion matrices.
7. **Anomaly Detection:** Implement clustering or autoencoders to detect anomalies in network traffic data.
8. **Flight Delay Prediction:** Predict delays using weather, carrier, and route features; incorporate time series analysis.
9. **Recommendation & Visualisation Platform:** Combine recommendation algorithms with an interactive UI built in Scala.js.
10. **GraphX Community Detector:** Implement community detection algorithms (e.g., Louvain method) and visualise communities.
11. **Multilingual Text Classifier:** Use Spark MLlib with custom tokenisers to classify text in multiple languages.
12. **Time Series Dashboard:** Build a streaming dashboard that visualises and predicts sensor data in real time.
13. **Cross‑validation Explorer:** Create a tool that compares multiple models and hyperparameters and produces charts summarising results.
14. **Genome Analysis:** Use Spark to process genomic data and apply clustering or classification algorithms.
15. **Customer Segmentation App:** Build an end‑to‑end tool that segments customers and suggests marketing strategies.
16. **Graph Neural Network Prototype:** Implement a simple GNN using DL4J or Smile; apply it to social network data.
17. **Energy Consumption Forecast:** Analyse and forecast energy usage; incorporate weather and historical consumption.
18. **Traffic Flow Prediction:** Use ML to predict traffic and plan routes; integrate data from sensors and map APIs.
19. **Health Risk Analysis:** Predict health risks based on patient data; handle missing values and privacy considerations.
20. **Podcast Recommendation Service:** Build a service recommending podcasts based on listening patterns and content similarity.