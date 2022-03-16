# sweetvillas
RESTFUL API Service with JPA for User Management!

In [create.sql](https://github.com/alessio-de-padova/sweetvillas-ecommerce/blob/main/src/main/resources/create.sql) you can find the ddl to create the database. It will be regularly updated.  

You can of course generate it through the following properties in application.properties:
spring.jpa.properties.javax.persistence.schema-generation.scripts.action=create
spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target=create.sql
spring.jpa.properties.javax.persistence.schema-generation.scripts.create-source=metadata

In order to run it, connect to the database through application.properties and you'll be fine. 
