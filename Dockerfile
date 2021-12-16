FROM adoptopenjdk/openjdk8
COPY target/log4shell-poc-0.0.1-SNAPSHOT.jar log4shell-poc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "log4shell-poc-0.0.1-SNAPSHOT.jar"]
