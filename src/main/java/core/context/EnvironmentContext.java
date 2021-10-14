package core.context;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/${env}/env.properties"})
public interface EnvironmentContext extends Config {

    @Key("db.config")
    String localDbConfig();

    @Key("prod.url")
    String prodUrl();

}
