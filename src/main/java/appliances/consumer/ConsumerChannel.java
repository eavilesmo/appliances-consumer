package appliances.consumer;

import static appliances.consumer.AmqpConfiguration.MICROWAVE_BEEPED_QUEUE;
import static appliances.consumer.AmqpConfiguration.OVEN_BEEPED_QUEUE;
import static appliances.consumer.AmqpConfiguration.WASHING_MACHINE_BEEPED_QUEUE;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Slf4j
public class ConsumerChannel {

  @RabbitListener(queues = OVEN_BEEPED_QUEUE)
  public void ovenConsumer(String message) {
    log.info("New notification received from the oven!");
    log.info(message);
  }

  @RabbitListener(queues = WASHING_MACHINE_BEEPED_QUEUE)
  public void washingMachineConsumer(String message) {
    log.info("New notification received from the washing machine!");
    log.info(message);
  }

  @RabbitListener(queues = MICROWAVE_BEEPED_QUEUE)
  public void microwaveConsumer(String message) {
    log.info("New notification received from the microwave!");
    log.info(message);
  }
}
