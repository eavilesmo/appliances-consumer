package appliances.consumer;


import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class AmqpConfiguration {

  public static final String OVEN_BEEPED_QUEUE = "appliances.oven.beeped";
  public static final String WASHING_MACHINE_BEEPED_QUEUE = "appliances.washingMachine.beeped";
  public static final String MICROWAVE_BEEPED_QUEUE = "appliances.microwave.beeped";

  @Bean
  Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
    return new Jackson2JsonMessageConverter();
  }

  @Bean
  ConsumerChannel consumerChannel() {
    return new ConsumerChannel();
  }
}
