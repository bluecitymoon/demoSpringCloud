FROM java:8-jre

ADD ./target/servicejerry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761