FROM eclipse-temurin
WORKDIR /app
COPY target .
# RUN "cd target"
CMD ["java","-cp","aithal-1.0-SNAPSHOT.jar","rahul.App"]