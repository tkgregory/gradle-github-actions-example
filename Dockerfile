FROM openjdk:8
 
EXPOSE 8080
 
COPY ./build/libs/gradle-github-actions-example.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "gradle-github-actions-example.jar"]
