FROM java:8
MAINTAINER Lorena Martin Tejera
EXPOSE 8080
VOLUME /tmp
ADD /target/RestServidor-0.0.1-SNAPSHOT.jar practicalorena.jar
ENTRYPOINT ["java", "-jar", "practicalorena.jar"]