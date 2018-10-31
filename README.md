# Spring boot 2 with mybatis, flyway and swagger

### Prerequisites

Java 8

### Flyway
Migration scripts are located under:
```src/main/resources/db.migration``` 


### Building 

To build the app run: 
```
gradle build
```

### Actuator
Actuator information is available at:
```
http://localhost:8081/actuator/
```

### Swagger
The Swagger UI is available at: 
```
http://localhost:8080/swagger-ui.html
```
### Code coverage
Code coverage is available in xml and html at:
```
$projectdir/build/jacoc/test/
```
 