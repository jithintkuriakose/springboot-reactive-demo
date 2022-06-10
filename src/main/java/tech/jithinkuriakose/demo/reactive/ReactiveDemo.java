package tech.jithinkuriakose.demo.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories(basePackages = {
    "tech.jithinkuriakose.demo.reactive.dao"
})
@ComponentScan({
    "tech.jithinkuriakose.demo"
})
public class ReactiveDemo {
  public static void main(String[] args) {
    SpringApplication.run(ReactiveDemo.class);
  }
}
