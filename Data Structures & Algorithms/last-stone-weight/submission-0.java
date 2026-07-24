class Solution {
    public int lastStoneWeight(int[] stones) {
             PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones){
            pq.add(x);
        }
        while(pq.size()>1){
            int first= pq.poll();
            int second= pq.poll();
            int diff=first-second;
            if(diff==0){
                continue;
            }
            else {
                pq.add(Math.abs(first-second));
            }
        }
  return pq.isEmpty() ? 0 : pq.poll();
    }
}
