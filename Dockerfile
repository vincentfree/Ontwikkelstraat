# voert automatisch install uit
FROM maven:3-jdk-8-onbuild

# commando voor het uitvoeren van java jar
CMD ["java -jar Ontwikkelstraat-0.0.1-SNAPSHOT.jar"]