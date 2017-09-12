package co.ishtiaq.yamlfilereader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


/**
 * @Configuration marks the class as a source of bean definitions
 * @ConfigurationProperties binds and validates the external configurations to a configuration class
 * @EnableConfigurationProperties this annotation is used to enable @ConfigurationProperties annotated beans in the Spring application
 */

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {

    private String name;
    private String environment;
    private List<String> servers = new ArrayList<>();

    @Value("${stackstorm-columbus.myString}")
    private String myString;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    @Override
    public String toString() {
        return "YAMLConfig{" +
                "name='" + name + '\'' +
                ", environment='" + environment + '\'' +
                ", servers=" + servers +
                ", myString='" + myString + '\'' +
                '}';
    }
}