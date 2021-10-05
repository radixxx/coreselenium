package core.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class Log {

    private static Logger logger;

    public static void info (String message){
        logger.info(message);
    }

    public static void info(String message, Object firstArg){
        logger.info(message, firstArg);
    }

    public static void info(String message, Object firstArg, Object secondArg){
        logger.info(message, firstArg, secondArg);
    }

    public static void info(String message, Object firsArg, Object secondArg, Object thirdArg){
        logger.info(message, firsArg, secondArg, thirdArg);
    }

    public static void warn(String message){
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void error(String message, Throwable throwable){
        logger.error(message, throwable);
    }

    public static void error(String message, Object firstArg){
        logger.error(message, firstArg);
    }

    public static void error(String message, Object firstArg, Object secondArg){
        logger.error(message, firstArg, secondArg);
    }

    public static void error(String message, Object firstArg, Object secondArg, Object thirdArg){
        logger.error(message, firstArg, secondArg, thirdArg);
    }

    public static void fatal(String message){
        logger.fatal(message);
    }

    public static void debug(String message){
        logger.debug(message);
    }

    public static void initialize(String name){
        System.setProperty("logFilename", name);
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        context.reconfigure();
        logger = context.getLogger("Economist");
    }

}
