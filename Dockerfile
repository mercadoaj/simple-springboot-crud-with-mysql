FROM openjdk:11
ADD build/libs/demo.jar demo.jar
EXPOSE 9991
ENTRYPOINT ["java","-jar","/demo.jar"]