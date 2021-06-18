# sm-people-facade

Facade for sm-people-service, with caching.
* it depends on the sm-people-service and https://restcountries.eu
---
###API Documentation
OpenAPI Docs: http://localhost:30000/v3/api-docs

Swagger: http://localhost:30000/swagger-ui.html

---
Once the sm-people-service and associated docker container is running you can load a sample set of random people by useing the load script

`./loadUsers.sh random-users.json`
This will load 500 fake users into your database.
