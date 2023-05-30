FROM openjdk:17
EXPOSE 3030
ADD ./target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]