
zookeeper-server-start.bat C:\kafka_2.12-2.3.0\config\zookeeper.properties
kafka-server-start.bat C:\kafka_2.12-2.3.0\config\server.properties

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic TEST --from-beginning

https://github.com/confluentinc/kafka-streams-examples