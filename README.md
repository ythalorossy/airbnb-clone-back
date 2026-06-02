# Airbnb Clone Backend

Spring Boot REST API backend for an Airbnb-style accommodation booking platform. Built as a learning project to practice fullstack development with modern Spring Boot.

## Features

- **Listings** — property listings with pictures, categories, and details
- **Bookings** — booking management with date ranges
- **User Authentication** — JWT-based auth with Spring Security
- **PostgreSQL** — data persistence with Docker Compose

## Tech Stack

| Component | Technology |
|---|---|
| Framework | Spring Boot 3.3.3 |
| Language | Java 17+ |
| Database | PostgreSQL |
| Auth | JWT / Spring Security |
| API | REST |
| Build | Maven |
| Container | Docker Compose |

## Project Structure

```
src/main/java/fr/codecake/airbnbcloneback/
├── listing/
│   ├── domain/          # Listing, ListingPicture, BookingCategory
│   ├── repository/      # ListingRepository, ListingPictureRepository
│   └── mapper/          # ListingMapper, ListingPictureMapper
├── booking/
│   ├── domain/          # Booking entity
│   └── repository/      # BookingRepository
├── user/
│   ├── domain/          # User, Authority
│   ├── application/      # DTOs
│   ├── mapper/          # UserMapper
│   └── presentation/     # AuthResource (REST endpoints)
├── infrastructure/
│   └── config/          # Security config, Database config
└── sharedkernel/
    └── domain/          # AbstractAuditingEntity
```

## Getting Started

### Prerequisites
- Java 17+
- Docker / Docker Compose

### Run with Docker Compose

```bash
docker compose up -d
```

The API will be available at `http://localhost:8080`

### Run Locally (without Docker)

```bash
./mvnw spring-boot:run
```

### Run Tests

```bash
./mvnw test
```

### Build

```bash
./mvnw package -DskipTests
```

## Database

PostgreSQL schema is initialized via `init.sql` using Docker Compose. The database uses a `airbnb_clone` schema.

## Related Projects

- [airbnb-clone-front](https://github.com/ythalorossy/airbnb-clone-front) — Angular frontend for this API

---

**YRoss** · [LinkedIn](https://www.linkedin.com/in/ythalorossy/) · [GitHub Profile](https://github.com/ythalorossy)