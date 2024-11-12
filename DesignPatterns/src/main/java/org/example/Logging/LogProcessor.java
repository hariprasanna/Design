package org.example.Logging;

public class LogProcessor {
    public static int INFO_LEVEL = 1;
    public static int DEBUG_LEVEL = 2;
    public static int ERROR_LEVEL = 3;

    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log(int logLevel, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }

}
