public class LogLine {

    private String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']'));

        switch (level){
            case "TRC" :
                return LogLevel.TRACE;
            case "DBG" :
                return  LogLevel.DEBUG;
            case "INF" :
                return  LogLevel.INFO;
            case "WRN" :
                return  LogLevel.WARNING;
            case "ERR" :
                return  LogLevel.ERROR;
            case "FTL" :
                return  LogLevel.FATAL;
            default:
                return  LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        String msg1 = String.valueOf(getLogLevel().getNumberLogLevel());
        String[] msg2 = logLine.split(":",2);
        return  msg1 + ":" + msg2[1].trim();
    }
}
