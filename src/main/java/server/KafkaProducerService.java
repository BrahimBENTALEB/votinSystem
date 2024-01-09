import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaProducerService {
    private KafkaProducer<String, String> producer;
    private String topic;

    public KafkaProducerService(String topic) {
        this.topic = topic;
        // Initialize Kafka producer with properties
    }

    public void sendVote(String vote) {
        producer.send(new ProducerRecord<>(topic, vote));
    }

    // Add methods to initialize and close the producer
}
