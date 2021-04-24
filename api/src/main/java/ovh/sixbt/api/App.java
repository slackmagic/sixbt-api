package ovh.sixbt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ovh.sixbt.business.ISixBtDomain;
import ovh.sixbt.business.impl.SixBtDomain;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("6BT API is Starting...");
        ISixBtDomain sixBtDomain = new SixBtDomain("A_PATH");
        sixBtDomain.getUsefulAddresses();

        SpringApplication.run(App.class, args);
    }
}