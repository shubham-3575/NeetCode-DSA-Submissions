class TimeMap {
    private HashMap<String, TreeMap<Integer, String>> dict;
    public TimeMap() {
        dict = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        dict.computeIfAbsent(key,k->new TreeMap<>()).put(timestamp,value);

    }
    
    public String get(String key, int timestamp) {
        if(!dict.containsKey(key)){
            return "";
        }
        TreeMap<Integer, String> val = dict.get(key);
        Integer time = val.floorKey(timestamp);
        if(time == null)
            return ""; 
        return val.get(time);
    }
}
