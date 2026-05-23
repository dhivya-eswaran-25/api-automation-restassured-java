package config;
import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface Configuration extends Config {
    @Key("base.url")
    String baseUrl();
}
