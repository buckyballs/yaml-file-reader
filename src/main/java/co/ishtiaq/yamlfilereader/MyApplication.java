package co.ishtiaq.yamlfilereader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication implements CommandLineRunner {

    @Autowired
    private YAMLConfig myConfig;

    @Autowired
    private StackStormConfig stackStormConfig;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyApplication.class);
        app.run();
    }

    public void run(String... args) throws Exception {
        System.out.println("YAMLConfig: " + myConfig.toString());
        System.out.println("StackStormConfig: " + stackStormConfig.toString());
    }
}
