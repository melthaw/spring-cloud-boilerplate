# Overview

The boilerplate for spring cloud with following feature enabled

feature  |  implementation | version
---|---|---
discovery | eureka | Dalston.SR1
gateway | zuul | Dalston.SR1

> Please check out gradle/dependencies.gradle

# Get Started

> Please make sure Java , Gradle & Docker are ready on your dev machine.

env | version
---|---
Java | 1.8.x
Gradle | 2.14.x
Docker | 17.x
Docker Compose | 1.16.*

## Build

```
gradle clean build
docker-compose build
```

### Start

```
docker-compose up -d
```

### Stop

```
docker-compose down
```

# Configuration


## discovery

* gradle

> discovery/build.gradle

```
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath "org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}"
    }
}

apply plugin: "io.spring.dependency-management"
apply plugin: 'org.springframework.boot'

dependencyManagement {
    imports {
        mavenBom "org.springframework.cloud:spring-cloud-starter-parent:${springCloudVersion}"
        mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"
    }
}

dependencies {
    compile "org.springframework.cloud:spring-cloud-starter-eureka-server"
}

```

* spring boot - bootstrap.yml

> discovery/src/main/resources/bootstrap.yml

```
spring:
  application:
    name: discovery
```

* spring boot - application.yml

> discovery/src/main/resources/application.yml

```
server:
  port: 8761

eureka:
  instance:
    hostname: localhost
  server:
    enable-self-preservation: false
    eviction-interval-timer-in-ms: 60000
  client:
    registerWithEureka: false
    fetchRegistry: false
    serviceUrl:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/

```

## gateway

* gradle

> gateway/build.gradle

```
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath "org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}"
    }
}

apply plugin: "io.spring.dependency-management"
apply plugin: 'org.springframework.boot'

dependencyManagement {
    imports {
        mavenBom "org.springframework.cloud:spring-cloud-starter-parent:${springCloudVersion}"
        mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"
    }
}

dependencies {
    compile "org.springframework.cloud:spring-cloud-starter-eureka"
    compile "org.springframework.cloud:spring-cloud-starter-zuul"

    testCompile "org.springframework.boot:spring-boot-starter-test"
}

```

* spring boot - bootstrap.yml

> gateway/src/main/resources/bootstrap.yml

```
spring:
  application:
    name: gateway
```

* spring boot - application.yml

> gateway/src/main/resources/application.yml

```
server:
  port: 10000

eureka:
  instance:
    hostname: ${EUREKA_INSTANCE_HOST:localhost}
    non-secure-port: ${EUREKA_INSTANCE_PORT:10000}
    prefer-ip-address: false
#    instance-id: ${spring.application.name}:${eureka.instance.hostname}:${eureka.instance.non-secure-port}:${random.value}
  client:
    registerWithEureka: false
    fetchRegistry: true
    serviceUrl:
       defaultZone: ${EUREKA_SERVICE_URL:'http://localhost:8761/eureka/'}

```

# Customization

`TODO`

