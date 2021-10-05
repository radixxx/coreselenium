package core;

import org.awaitility.Awaitility;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Wait {

    public static void until(Callable<Boolean> conditionEvaluator, long totalTimeToWait, long pollInterval) {
        Awaitility.await()
                .ignoreExceptionsMatching(e -> !e.getClass().equals(Exception.class))
                .atMost(totalTimeToWait, MINUTES)
                .pollInterval(pollInterval, SECONDS)
                .until(conditionEvaluator);
    }

    public static void until(Callable<Boolean> conditionEvaluator, long totalTimeToWait, TimeUnit timeUnit, long pollInterval) {
        Awaitility.await()
                .ignoreExceptionsMatching(e -> !e.getClass().equals(Exception.class))
                .atMost(totalTimeToWait, timeUnit)
                .pollInterval(pollInterval, MILLISECONDS)
                .until(conditionEvaluator);
    }


}
