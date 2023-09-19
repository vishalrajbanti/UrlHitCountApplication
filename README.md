
# Url Hit Counter Application

## Table of content 
   - [Frameworks and Language Used](#frameworks-and-language-used)
- [Data Flow](#data-flow)
  - [1. Controller](#1-controller)
  - [2. Services](#2-Services)
  - [2. Repository](#2-Repository)
- [API Reference](#API-Reference)
- [Data Structures Used ](#Data-Structures-Used)
 - [Key Features](#Key-Features)
   - [1. User CRUD Operations](#1-User-CRUD-Operations)
   - [2. Key Features](#2-Key-Features)
   - [3. Customizable and Extendable](#3-Customizable-and-Extendable)
- [Project Summary](#project-summary)
- [Acknowledgments](#Acknowledgments)
- [Support](#Support)



## Frameworks and Language Used
- Spring Boot
- Java
- Maven

## Data Flow

### 1. Controller
- Controller handles incoming HTTP requests.
- It defines endpoints for adding, retrieving, updating, and deleting user information.


### 2. Services
- The services in the Url Hit Counter Application are responsible for encapsulating the business logic and operations related to restaurant management. They serve as an intermediary layer between the controllers (which handle HTTP requests) and the repositories (which interact with the database)

### 3.repository
- The repository in the Url Hit Counter Application project is a crucial component that facilitates the interaction between the application and the database.

## API Reference

#### Post urlHit

```http
  POST url
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`Request body`  | `UrlHit object` | **Required**. list to add. |

#### Get all visitors

```http
  GET visitors
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| ``      | `` | **Required**. list to  fetch the size |

#### GET  a url hitcount
```http
  Get api/v1/visitor-count-app/username/{name}/count
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `pathVariable`      | `userName` | **Required**. list to  fetch |







## Data Structures Used

In the Url Hit Counter Application, the following data structures are used:




- **userName**: Field to store the name of the restaurant.




- **count**: Field to store the urlHit count.

## Key Features

The Url Hit Counter Application is designed to provide efficient user management capabilities. Here are the key features of this application:

### 1. User CRUD Operations

- **Add Url**: Create new user profiles by providing essential details, including  username, count.

- **Get url by UserName**: Retrieve url information by specifying a unique userName.

- **Get All Visitors**: Retrieve a count of all visitors in the system.

- **Update User Information**: Modify url count .



### 2. Scalable and Maintainable Architecture

- Utilizes the Spring Boot framework for building robust and scalable applications.

- Follows a well-structured layered architecture, separating concerns between controllers, services, and repositories, ensuring maintainability and testability.



### 3. Customizable and Extendable

- Easily extensible to add more features or attributes to the user profile.


## Project Summary
This project is a Url Hit Counter Application built using Spring Boot. It provides a set of RESTful API endpoints for managing user information, including adding, retrieving, updating, and deleting user records. The project follows a layered architecture with controllers handling HTTP requests, services containing business logic, and a repository for database operations. User data is stored in a database table with attributes restaurantId, restaurantName, Name, restaurantAddress, and restaurantPhoneNumber.




## Acknowledgments

We would like to express our gratitude to the following individuals and projects for their contributions and support to the Url Hit Counter Application:

- **[Vishal Raj]**: Lead developer and project coordinator.
- **[Mainak Ghosh]**: Contributor to the project, helping with [SpringBoot to complete this project].
- **[maven]**: We utilized [maven] for [dependencies] in our project.
- **Stack Overflow Community**: For their invaluable assistance in resolving technical challenges.
- **Spring Framework**: For providing a robust and efficient platform for building our application.


We appreciate the  effort and support that made this project possible.



## Support

For support, email vishalrajbanti@gmail.com.

## thank you.