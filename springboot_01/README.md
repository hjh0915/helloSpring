下载jar包
========
spring-context-5.2.5.RELEASE.jar  
spring-core-5.2.5.RELEASE.jar  
spring-beans-5.2.5.RELEASE.jar  
spring-aop-5.2.5.RELEASE.jar  
spring-expression-5.2.5.RELEASE.jar  
spring-jdbc-5.2.5.RELEASE.jar  
spring-tx-5.2.5.RELEASE.jar  

commons-logging-1.2.jar  
postgresql-42.2.12.jar 

spring-boot-2.2.5.RELEASE.jar
spring-boot-starter-2.2.5.RELEASE.jar
spring-boot-autoconfigure-2.2.5.RELEASE.jar

slf4j-api-1.8.0-beta2.jar


注解说明
======
@SpringBootApplication = (默认属性)@Configuration + @EnableAutoConfiguration + @ComponentScan


执行
===
mkdir -p ./build/classes/java/main

javac -d ./build/classes/java/main -cp ./libs/postgresql-42.2.12.jar:./libs/slf4j-api-1.8.0-beta2.jar:./libs/spring-boot-2.2.5.RELEASE.jar:./libs/spring-boot-autoconfigure-2.2.5.RELEASE.jar:./libs/spring-jdbc-5.2.5.RELEASE.jar:./libs/spring-tx-5.2.5.RELEASE.jar:./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:libs/spring-beans-5.2.5.RELEASE.jar:.:./build/classes/java/main ./src/main/java/com/mine/config/*.java ./src/main/java/com/mine/model/*.java ./src/main/java/com/mine/service/*.java ./src/main/java/com/mine/*.java

cp ./src/main/resources/application.properties ./build/classes/java/main/com/mine

***启动spring时要加上spring-boot-starter-2.2.5.RELEASE.jar包和spring-boot-2.2.5.RELEASE.jar包***

java -classpath ./libs/postgresql-42.2.12.jar:./libs/slf4j-api-1.8.0-beta2.jar:./libs/spring-boot-2.2.5.RELEASE.jar:./libs/spring-boot-starter-2.2.5.RELEASE.jar:./libs/spring-boot-autoconfigure-2.2.5.RELEASE.jar:./libs/spring-jdbc-5.2.5.RELEASE.jar:./libs/spring-tx-5.2.5.RELEASE.jar:./libs/spring-context-5.2.5.RELEASE.jar:./libs/spring-core-5.2.5.RELEASE.jar:libs/spring-beans-5.2.5.RELEASE.jar:./libs/spring-aop-5.2.5.RELEASE.jar:./libs/commons-logging-1.2.jar:./libs/spring-expression-5.2.5.RELEASE.jar:./build/classes/java/main:. com.mine.App

自动装配
======
数据库配置
将连接数据库信息写入resourses/application.properties中