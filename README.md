# simple-springboot-crud-with-mysql
springboot crud with mysql

This is a simple springboot crud with mysql.


## SET-UP
#### what you need:

1. Java 11
2. gradle
3. mysql

#### HOW TO SET-UP MYSQL

##### mysql local:
* Go to your _src/main/resources/application.properties_ . Edit the datasource url, username and password. It should look similar to this: 
  ```
  spring.datasource.url= jdbc:mysql://localhost:2222/db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&rewriteBatchedStatements=true
  spring.datasource.username= root
  spring.datasource.password= root
  
* If you want to see it on mysql workbench, it would simply look something like this:
  ![ScreenShot](/docs/mysql-local.PNG)
 
##### mysql using AWS RDS:
* Create your AWS RDS using mysql. *Don't forget your database username and password*
* Go to your AWS mysql RDS and take note of your port and endpoint:
  ![ScreenShot](/docs/aws-rds.PNG)
* Go to your _src/main/resources/application.properties_ . Edit the datasource url, username and password with the value from your AWS RDS. It should look similar to this: 
  ```
  spring.datasource.url= jdbc:mysql://ajdb.c6rfecclsu5u.ap-southeast-1.rds.amazonaws.com:3306/db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&rewriteBatchedStatements=true
  spring.datasource.username= admin
  spring.datasource.password= password
      
 * If you want to view it on mysql workbench, the connection set-up looks like this:
   ![ScreenShot](/docs/mysql-aws.PNG)
   
 #### Build and Run:
 
 to build and run, just simply do:
``` 
.\gradlew build
.\gradlew bootRun
