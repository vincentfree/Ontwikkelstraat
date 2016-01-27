# voert automatisch install uit
FROM anapsix/alpine-java:jdk8
ENV MAVEN_VERSION 3.3.3
ENV PATH /usr/share/apache-maven-${MAVEN_VERSION}/bin:${PATH}

RUN apk --update add curl && \
    curl http://apache.mirror.anlx.net/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz > /usr/share/maven.tar.gz && \
    cd /usr/share && \
    tar xvzf maven.tar.gz && \
    rm -f maven.tar.gz
#uit maven onbuild
RUN mkdir -p /usr/share/app
WORKDIR /usr/share/app
COPY . /usr/share/app
CMD mvn install -Dmaven.test.skip=true
# commando voor het uitvoeren van java jar
CMD ["java", "-jar", "/usr/share/app/target/Ontwikkelstraat-0.0.1-SNAPSHOT.jar"]
