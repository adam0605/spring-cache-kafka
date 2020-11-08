# Spring-Cache-Kafka
spring에 포함된 패키지인 spring-kafka, spring-cache를 사용하여 간단한 예제를 구성한다.

# 목적
이 프로젝트는 spring-boot, spring-kafka 를 이용하여 데이터 수집 처리에 대한 학습을 한다.
더 나아가서는 spring-cache를 이용하여 데이터를 처리에 응용한다.  


기본 시나리오는 다음과 같다.

1. spring-scheduler를 이용하여 주기적으로 데이터베이스에 데이터를 적재한다.
2. 또다른 spring-scheduler를 이용하여 주기적으로 데이터베이스에 데이터를 조회한다.
    1. 조회한 데이터는 producer를 이용하여서 데이터를 kafka-broker에게 전송한다.
3. application에서 consumer 를 이용하여 데이터를 broker에서 꺼내온다.
    1. 꺼내온 데이터는 새로운 테이블에 적재를 한다.

이때 구조별로 어떻게 처리되는지를 확인한다. 

* 1개의 application이 데이터를 보낼 때(producer) kafka-broker에서는 데이터를 어떻게 처리하는가?
* 1개의 application이 데이터를 처리 할 때(consumer) kafka-broker에서는 데이터를 어떻게 보내고 consumer 는 데이터를 어떻게 처리하는가?
* N개의 application이 동일한 데이터를 보낼 때(producer) kafka-broker에서는 데이터를 어떻게 처리하는가?
* N개의 application이 동일한 데이터를 처리 할 때(consumer) kafka-broker에서는 데이터를 어떻게 보내고 consumer 는 데이터를 어떻게 처리하는가? 
