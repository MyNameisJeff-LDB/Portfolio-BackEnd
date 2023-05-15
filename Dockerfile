FROM amazoncorretto:17

MAINTAINER Leandro_Balceda

COPY target/MyPortfolio-0.0.1-SNAPSHOT.jar MyPortfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/MyPortfolio-0.0.1-SNAPSHOT.jar"]