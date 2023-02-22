FROM openjdk:8-jdk-alpine
# Đưa bản java 8 về để chạy
ADD target/medicine-0.0.1-SNAPSHOT.jar app.jar
# Khi mình build có được file .jar trong mục target rồi thì add vào để build image
ENTRYPOINT ["java","-jar","/app.jar"]
