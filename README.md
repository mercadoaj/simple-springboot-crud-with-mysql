# simple-springboot-crud-with-mysql
springboot crud with mysql

This is a simple springboot crud with mysql.


## SET-UP
#### what you need:

1. Java 11
2. gradle
3. mysql

#### how to set up mysql:
* mysql local:
  * go to _src/main/resources/application.properties_ . Edit the datasource url, username and password. It should look similar to this: 
  ```
  spring.datasource.url= jdbc:mysql://localhost:2222/db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&rewriteBatchedStatements=true
  spring.datasource.username= root
  spring.datasource.password= root
 ```
  * if you want to view in mysql workbench, you can set it up like this:
  ![alt text](https://github.com/mercadoaj/simple-springboot-crud-with-mysql/blob/main/docs/mysql-local.PNG)
