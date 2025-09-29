# dining-review-api

An api for reviwing dining menu
Here’s a simple README you can use for your **Dining Review API** project:

---

# Dining Review API

**Dining Review API** is a RESTful API built with **Spring Boot** to manage dining reviews. It allows users to submit, retrieve, and manage reviews for restaurants.

## Features

- Submit dining reviews
- Retrieve all reviews or by status
- Manage approval status of reviews
- Built using **Spring Boot**, **JPA**, and **PostgreSQL**

## Technologies

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Maven

## Getting Started

### Prerequisites

- Java 17
- PostgreSQL database
- Maven

### Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/dining-review-api.git
   ```

2. Create a PostgreSQL database (e.g., `portfoliodb`).
3. Configure your `.env` file:

   ```env
   SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/portfoliodb
   SPRING_DATASOURCE_USERNAME=postgres
   SPRING_DATASOURCE_PASSWORD=yourpassword
   ```

4. Build and run the application:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### API Endpoints

- `POST /reviews` – Submit a new review
- `GET /reviews` – Retrieve all reviews
- `GET /reviews/pending` – Retrieve pending approval reviews
- `PUT /reviews/{id}/approve` – Approve a review

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests.

## License

This project is licensed under the MIT License.
