This project is an exchange rate API with three endpoints namely:

| S/N | Endpoint | Method | Function |
|----------|----------|----------|----------|
| 1 | /currency | GET | Get all currencies supported by the API |
| 2 | /rates | GET | Get all the exchange rates for all the supported currencies |
| 3 | /rates/{currency} | GET | Get the exchange rates for a single currency |


You can clone the project using: `git clone https://github.com/catadetest/spring-docker-api.git`

Build the project using linux environment:
```bash
cd spring-docker-api
mvn -B -DskipTests clean package
mvn spring-boot:run
```bash

Test
