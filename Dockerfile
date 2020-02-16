FROM openjdk:8

ADD target/case-investigation-app.jar case-investigation-app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "case-investigation-app.jar"]