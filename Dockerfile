# voert automatisch install uit
FROM maven:3-jdk-8-onbuild

# kopieer jar
COPY /target/Ontwikkelstraat-0.0.1-SNAPSHOT.jar /opt/Ontwikkelstraat-0.0.1-SNAPSHOT.jar

# commando voor het uitvoeren van java jar
CMD ["java -jar /opt/Ontwikkelstraat-0.0.1-SNAPSHOT.jar"]