class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int []ans=new int[k];
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        //map ready
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());


        //sorting logic
          Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();
        }
        return ans;

    }
}
