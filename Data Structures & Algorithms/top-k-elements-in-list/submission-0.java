class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        int[] ans=new int[k];

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue((a,b)->hm.get(a)-hm.get(b));
        for( Map.Entry<Integer,Integer> hms: hm.entrySet()){
            int  key=hms.getKey();
            int  value=hms.getValue();
            if(pq.size()<k){
                pq.offer(key);
            }
            else if(hm.get(pq.peek())<value){
                pq.poll();
                pq.offer(key);
           }


       
        
    }
     for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
    return ans;
}
}