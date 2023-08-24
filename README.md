# sweetvillas
RESTFUL API Service with JPA for User Management!

To instantiate the db, set up an image then:
docker run -d --name name-of-container  -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=sweetvillas -p 5432:5432 postgres:latest

The [create.sql](https://github.com/alessio-de-padova/sweetvillas-ecommerce/blob/main/src/main/resources/create.sql) will be generated on each run and can be used to create the main tables.

