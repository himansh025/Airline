plugins {
    java
    id("org.springframework.boot") version "3.5.4"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")

    compileOnly("org.projectlombok:lombok:1.18.30")// Use the latest stable version
    annotationProcessor("org.projectlombok:lombok:1.18.30") // Use the latest stable version

    // For testing purposes, if you use Lombok in test classes
    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")

//    oauth
    implementation("org.springframework.security:spring-security-oauth2-client:6.5.1")
//    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")

    // JWT Dependencies
    implementation("io.jsonwebtoken:jjwt-api:0.12.3")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.12.3")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.12.3")

    implementation ("org.springframework.boot:spring-boot-starter-mail")

    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.mysql:mysql-connector-j")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    // https://mvnrepository.com/artifact/com.auth0/java-jwt
    compileOnly("org.projectlombok:lombok:1.18.34") // Use the latest stable version
    annotationProcessor("org.projectlombok:lombok:1.18.34") // Use the latest stable version
}

tasks.withType<Test> {
    useJUnitPlatform()
}
