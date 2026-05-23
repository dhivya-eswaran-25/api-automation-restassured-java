package config;
import org.aeonbits.owner.Config.*;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:config.properties"})
public interface Configuration extends Config {
    @Key("base.url")
    String baseUrl();
}
