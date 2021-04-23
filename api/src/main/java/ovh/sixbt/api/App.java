package ovh.sixbt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
      System.out.println("6BT API is Starting...");
        SpringApplication.run(App.class, args);
    }
}