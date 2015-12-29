# Begin in image java:8
FROM java:8-jdk

#Bouw nieuwe artifact
RUN mvn install

# kopieer jar
COPY target/Ontwikkelstraat-0.0.1-SNAPSHOT.jar /opt/Ontwikkelstraat-0.0.1-SNAPSHOT.jar

# commando voor het uitvoeren van java jar
CMD ["java -jar /opt/Ontwikkelstraat-0.0.1-SNAPSHOT.jar"]