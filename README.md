# sm-people-facade

Facade for sm-people-service, with caching.
* it depends on the sm-people-service and https://restcountries.eu
---
###API Documentation
OpenAPI Docs: http://localhost:30000/v3/api-docs

Swagger: http://localhost:30000/swagger-ui.html

---
Once the sm-people-service and associated docker container and this facade is running you can load a sample set of random people by using the load script.

`./loadUsers.sh random-users.json`
This will load 500 fake users into your database.

You will need to install `jq` to be able to use this script.  I used brew, but feel free to install it how you want `brew install jq`
