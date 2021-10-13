package core.builder;


import core.context.EnvironmentContext;
import org.aeonbits.owner.ConfigFactory;

public class ContextBuilder {

    private static EnvironmentContext environmentContext;

    public static EnvironmentContext getEnvironmentContext() {
        return environmentContext != null ? environmentContext :
                (environmentContext = ConfigFactory.create(EnvironmentContext.class, System.getProperties()));
    }

}
