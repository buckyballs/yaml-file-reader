package co.ishtiaq.yamlfilereader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service // @Componnet, @Service, @Configuration all works here
@ConfigurationProperties(prefix ="stackstorm-columbus" )
public class StackStormConfig {

    //@Value("${hostname}")
    private String hostname;

    @Value("${stackstorm-columbus.trigger.time}")
    private String triggerTime;

    //@Value("${username}")
    private String username;

    @Value("${stackstorm-columbus.password}")
    private String password;

    //@Value("${auth}")
    private String auth;

    //@Value("${headername}")
    private String headername;

    //@Value("${resources}")
    private String resources;

    //@Value("${pings}")
    private int pings;

    //@Value("${delay}")
    private int delay;

    //@Value("${fixed}")
    private int fixed;

    private String anotherString;


    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getHeadername() {
        return headername;
    }

    public void setHeadername(String headername) {
        this.headername = headername;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public int getPings() {
        return pings;
    }

    public void setPings(int pings) {
        this.pings = pings;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getFixed() {
        return fixed;
    }

    public void setFixed(int fixed) {
        this.fixed = fixed;
    }

    public String getAnotherString() {
        return anotherString;
    }

    public void setAnotherString(String anotherString) {
        this.anotherString = anotherString;
    }

    @Override
    public String toString() {
        return "StackStormConfig{" +
                "hostname='" + hostname + '\'' +
                ", triggerTime='" + triggerTime + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", auth='" + auth + '\'' +
                ", headername='" + headername + '\'' +
                ", resources='" + resources + '\'' +
                ", pings=" + pings +
                ", delay=" + delay +
                ", fixed=" + fixed +
                ", anotherString='" + anotherString + '\'' +
                '}';
    }
}
