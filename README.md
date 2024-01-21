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
```
The `mvn -B -DskipTests clean package` command will clear the `target` directory if existed, builds the project and skip test during the build. Finally, the `mvn spring-boot:run` command will run the project on the default port.

By default, your application will be served to port 8080. Navigate to `http://127.0.0.1:8080/rates` in order to review the JSON response.



