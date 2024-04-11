class Logger {
    public Map<String, Integer> dict;
    public Logger() {
        dict = new HashMap<String, Integer>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!dict.containsKey(message)) {
            dict.put(message, timestamp);
            return true;
        }

        int oldtimeStamp = dict.get(message);
        if(timestamp-oldtimeStamp >=10) {
            dict.put(message, timestamp);
            return true;
        } else  
            return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
