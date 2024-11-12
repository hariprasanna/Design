package org.example.Logging;

public class InfoLevelLogProcesor extends LogProcessor {
    InfoLevelLogProcesor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int logLevel, String message) {
        if(logLevel == INFO_LEVEL) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }

}
