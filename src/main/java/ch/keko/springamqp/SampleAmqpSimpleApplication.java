package ch.keko.springamqp;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SampleAmqpSimpleApplication {

    @Bean
    public Sender mySender() {
        return new Sender();
    }


    @Bean
    public Listerner myListener() {
        return new Listerner();
    }

    @Bean
    public Queue fooQueue() {
        return new Queue("foo");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleAmqpSimpleApplication.class, args);
    }

}