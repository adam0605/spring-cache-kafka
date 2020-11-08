# Spring-Cache-Kafka
spring에 포함된 패키지인 spring-kafka, spring-cache를 사용하여 간단한 예제를 구성한다.

# 목적
이 프로젝트는 spring-boot, spring-kafka 를 이용하여 데이터 수집 처리에 대한 학습을 한다.
더 나아가서는 spring-cache를 이용하여 데이터를 처리에 응용한다.  

* 1개의 application이 데이터를 보낼 때(producer) topic에서는 데이터를 어떻게 처리하는가?
* 1개의 application이 데이터를 처리 할 때(consumer) topic에서는 데이터를 어떻게 보내고 consumer 는 데이터를 어떻게 처리하는가?
* N개의 application이 동일한 데이터를 보낼 때(producer) topic에서는 데이터를 어떻게 처리하는가?
* N개의 application이 동일한 데이터를 처리 할 때(consumer) topic에서는 데이터를 어떻게 보내고 consumer 는 데이터를 어떻게 처리하는가? 
