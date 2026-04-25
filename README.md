# Product-service
## it says failing in the badge i dont understand why but when you click the ci badge it says passing 
[![CI Status](https://github.com/Habtamuzeleke/Product-service/actions/workflows/ci.yml/badge.svg)](https://github.com/Habtamuzeleke/Product-service/actions/workflows/ci.yml/badge.svg)
https://github.com/Habtamuzeleke/Product-service/actions/workflows/ci.yml/badge.svg
A RESTful product microservice built with Spring Boot 3.

## Getting Started

mvn spring-boot:run

## Endpoints
| Method | Path | Description |
|--------|------------------|------------------------|
| GET | /products | List all products |
| GET | /products/{id} | Get product by ID |
| POST | /products | Create a new product |
| GET | /health | Service health check |
