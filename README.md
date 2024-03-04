# JDBC and MySQL Operations

This repository contains a study project that demonstrates the use of JDBC (Java Database Connectivity) and MySQL for performing CRUD (Create, Read, Update, Delete) operations. 

The project is structured using the Factory and DAO (Data Access Object) design patterns. The Factory pattern is used to create instances of DAOs, while the DAO pattern is used to abstract and encapsulate all access to the data source.

The main goal of this project is to provide a practical example of how to use JDBC and MySQL together, and how to structure a Java project using Factory and DAO patterns. This project is intended for educational purposes only. While this project focuses on JDBC and SQL, it's worth noting that in many real-world applications, an Object-Relational Mapping (ORM) tool might be used to handle database operations. However, the choice between using an ORM or direct SQL can depend on the specific requirements and complexity of the application. Understanding the underlying principles of JDBC and SQL, as demonstrated in this project, can provide a solid foundation for making this decision.

This project is an integral part of the Java Database course, instructed by Professor Nelio Alves. I wish to express my deep appreciation for his insightful guidance and invaluable teachings.

## Features

- Demonstrates the use of JDBC for database connectivity with MySQL.
- Implements CRUD operations.
- Uses Factory and DAO design patterns for better code organization and scalability.

## How to Use

To clone and run this application, you'll need Git and Java installed on your computer. From your command line:

```bash
# Clone this repository
$ git clone https://github.com/yourusername/JDBC-and-MySQL-Documentation

# Go into the repository
$ cd JDBC-and-MySQL-Documentation

# Compile the project
$ javac src/**/*.java

# Run the project
$ java -cp src application.Program1
$ java -cp src application.Program2

