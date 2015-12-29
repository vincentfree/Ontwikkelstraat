[![Stories in Ready](https://badge.waffle.io/vincentfree/Ontwikkelstraat.png?label=ready&title=Ready)](https://waffle.io/vincentfree/Ontwikkelstraat)
[![Build Status](https://travis-ci.org/vincentfree/Ontwikkelstraat.svg?branch=master)](https://travis-ci.org/vincentfree/Ontwikkelstraat)
[![Circle CI](https://circleci.com/gh/vincentfree/Ontwikkelstraat.svg?style=svg)](https://circleci.com/gh/vincentfree/Ontwikkelstraat)
[![Coverage Status](https://coveralls.io/repos/vincentfree/Ontwikkelstraat/badge.svg?branch=master&service=github)](https://coveralls.io/github/vincentfree/Ontwikkelstraat?branch=master)
# Ontwikkelstraat

### Afhankelijkheden

* Docker
* IDE voor JAVA
* Integratie met GIT repo

#### Project ontwikkelstraat voor atos.

Om te starten met Jenkins als CI service moeten we  een instantie van Jenkins kunnen starten.
In dit voorbeeld hebben we gebruik gemaakt van docker om Jenkins te starten.
Met het commando `docker run -d -p 8080:8080 -p 50000:50000 jenkins` start je in docker een instantie van Jenkins wat dient als de basis voor CI.

###### Jenkins Image met github plugins
Er is een image aangemaakt op [Docker Hub](https://hub.docker.com/r/dpmjansen/jenkins/) waarop plugins voor git zijn geconfigureerd, zodat deze niet telkens opnieuw hoeven te worden gedownload.

###### Persisteren van jobs/andere data lokaal
Om te zorgen dat je de jobs niet kwijt raakt na afloop van de configuratie is aan te raden om ***OF*** een datavolume aan te maken en deze te gebruiken ***OF*** een container met een data volume vanuit de host te starten.

*Concrete voorbeelden:*

Data volume aanmaken en daarna gebruiken:
```bash
$ docker create -v /var/jenkins_home --name jenkins-dv dpmjansen/jenkins
$ docker run -d -p 8080:8080 -p 50000:50000 --volumes-from jenkins-dv dpmjansen/jenkins
```

Container starten met data volume vanuit host directory:
```bash
$ docker run -d -p 8080:8080 -p 50000:50000 -v </jouw/pad/naar/je/eigen>/var/jenkins_home:/var/jenkins_home dpmjansen/jenkins
```
