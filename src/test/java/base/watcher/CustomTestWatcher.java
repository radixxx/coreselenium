package base.watcher;

import core.logger.Log;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class CustomTestWatcher implements TestWatcher, BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static final String START_TIME = "Start of execution";
    private static final String END_TIME = "End of execution";

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason){
        Log.info("Status : DISABLED");
    }

    //@Override
    public void testSuccessfull(ExtensionContext context){
        Log.info("Status : PASSED");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Log.info("Status : FAILED");
        Log.error("Caused by {} on {}", cause.toString(), cause.getStackTrace()[0]);
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        Log.info("Status : ABORTED");
    }


    @Override
    public void beforeTestExecution(ExtensionContext context) {
        Log.initialize(context.getDisplayName());
        getStore(context).put(START_TIME, System.currentTimeMillis());
        Log.info("Test Name : {}", context.getDisplayName());
        Log.info(START_TIME);
    }

    @Override
    public void afterTestExecution(ExtensionContext context) {
        long startTime = getStore(context).remove(START_TIME, long.class);
        long duration = System.currentTimeMillis() - startTime;
        Log.info("{}, took {} ms to run", END_TIME, duration);
    }

    private ExtensionContext.Store getStore(ExtensionContext context) {
        return context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()));
    }
}
