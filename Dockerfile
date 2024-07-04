FROM openjdk:17-alpine
EXPOSE 8091
ADD target/Gestion_des_ressources-0.0.1-SNAPSHOT.jar ressources.jar
ENTRYPOINT ["java","-jar","ressources.jar"]
