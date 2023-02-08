FROM amazoncorretto:11-alpine-jdk
MAINTAINER MGB
COPY target/portfolioargprog-0.0.1-SNAPSHOT.jar portfolioargprog-app.jar
ENTRYPOINT ["java", "-jar", "/portfolioargprog-app.jar"]