package utils;

import core.builder.ContextBuilder;

public class Config {

    public static String SitePage = ContextBuilder.getEnvironmentContext().prodUrl();

}
