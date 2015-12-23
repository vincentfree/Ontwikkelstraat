[![Stories in Ready](https://badge.waffle.io/vincentfree/Ontwikkelstraat.png?label=ready&title=Ready)](https://waffle.io/vincentfree/Ontwikkelstraat)
# Ontwikkelstraat

### Afhankelijkheden

* Docker
* IDE voor JAVA
* Integratie met GIT repo

#### Project ontwikkelstraat voor atos.

Om te starten met Jenkins als CI service moeten we  een instantie van Jenkins kunnen starten.
In dit voorbeeld hebben we gebruik gemaakt van docker om Jenkins te starten.
Met het commando `docker run -d -p 8080:8080 -p 50000:50000 jenkins` start je in docker een instantie van Jenkins wat dient als de basis voor CI.


## Bugfix
```xml
<properties>
    <start-class>nl.atos.ontwikkelstraat.OntwikkelstraatApplication</start-class>
</properties>
```
Bovenstaande toegevoegd, zodat jenkins weet waar het startpunt is van spring-boot