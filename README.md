# Spring-Boot-Microservices
Spring boot microservice using Zuul api gateway, Eureka server, Fiegn client, Zipkin, Hystrix circuit breaker, Config server and Database connection with MySQL.
Zipkin used to trace the log of each microservice.


For Hystrix stream
http://localhost:9191/actuator/hystrix.stream

For Hystrix Dashboard
http://localhost:9006/hystrix/

To download the Zipkin jar:		
https://search.maven.org/remote_content?g=io.zipkin&a=zipkin-server&v=LATEST&c=exec

To run the zipkin executable jar:
java -jar zipkin.jar


To Download ELK :
https://www.elastic.co/downloads/logstash
			
https://www.elastic.co/downloads/elasticsearch
			
https://www.elastic.co/downloads/kibana