package org.example.Logging;

public class ErrorLevelLogProcessor extends LogProcessor {
    ErrorLevelLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int logLevel, String message) {
        if(logLevel == ERROR_LEVEL) {
            System.out.println(message);
        } else {
            nextLogProcessor.log(logLevel, message);
        }
    }
}
