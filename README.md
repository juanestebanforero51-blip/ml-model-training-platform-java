# Machine Learning Training Platform - Java Backend

## Overview
A Java-based backend system designed to manage and evaluate Machine Learning model training experiments. This project focuses on strong Object-Oriented Programming (OOP) principles, UML-driven software architecture, and automated unit testing.

The platform coordinates multiple experiments launched by researchers, tracking the performance metrics (loss per epoch) of different AI models to evaluate their efficiency.

## Key Features
* **Metric Tracking:** Records and evaluates metrics per epoch, identifying the best (lowest loss) metric achieved by each model.
* **Experiment Management:** Associates researchers with active experiments and tracks the total number of epochs registered per session.
* **Robust OOP Architecture:** Designed following strict UML modeling, incorporating advanced relationships such as Composition, Aggregation, and Dependency.

## Technical Architecture (OOP Highlights)
* **Polymorphism & Inheritance:** Implemented a model hierarchy with a polymorphic `train()` method across different AI model subclasses.
* **Composition:** The `Experiment` class internally instantiates and manages the strict lifecycle of its `Model`.
* **Aggregation:** The `Platform` uses dynamic data structures (`ArrayList<Experiment>`) to orchestrate active executions.
* **Unit Testing:** Comprehensive test coverage using **JUnit** to ensure the integrity of the data structures and business logic.

## Tech Stack
* **Language:** Java
* **Testing:** JUnit 5
* **Design:** UML, Object-Oriented Programming (OOP)

## How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/juanestebanforero51-blip/ml-model-training-platform-java.git](https://github.com/juanestebanforero51-blip/ml-model-training-platform-java.git)
