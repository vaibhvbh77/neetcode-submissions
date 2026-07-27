class TimeMap {
    HashMap<String,List<TimeValue>>map;


    public TimeMap() {
        map=new HashMap<String,List<TimeValue>>();
    }
    
    public void set(String key, String value, int timestamp) {
        TimeValue pair=new TimeValue(value,timestamp);
        if (!map.containsKey(key)) {
           map.put(key, new ArrayList<>());
            }
        map.get(key).add(pair);
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
        return "";
        List<TimeValue> list = map.get(key);
        int size=list.size()-1;
        int low=0;
        int high=size;
        if(list.get(0).timeStamp>timestamp){return "";}

        TimeValue ans=list.get(0);
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(list.get(mid).timeStamp==timestamp){return list.get(mid).value;}

            if(list.get(mid).timeStamp<timestamp){
                ans=list.get(mid);
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return ans.value;
    }
}
class TimeValue{
    String value;
    int timeStamp;
        public TimeValue(String value, int timeStamp) {
        this.value = value;
        this.timeStamp = timeStamp;
    }
}
