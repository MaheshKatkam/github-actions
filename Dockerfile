FROM openjdk:17
EXPOSE 8888
ADD target/docker-spring-boot-demo.jar docker-spring-boot-demo.jar
ENTRYPOINT ["java","-jar","/docker-spring-boot-demo.jar"]