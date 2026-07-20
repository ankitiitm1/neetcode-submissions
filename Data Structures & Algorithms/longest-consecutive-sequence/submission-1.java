class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        HashSet<Integer> hm=new HashSet();
        int max=Integer.MIN_VALUE;
        int lcs=1;
        ArrayList<Integer> sstart =new ArrayList();


        for(int x: nums){
            if(x>max){
                max=x;
            }
            if(!hm.contains(x)){hm.add(x);}
        }


        // for(int y: hm){
        // if(hm.contains(y-1)){
        //         continue;
        // }else{
        //     sstart.add(y);
        // }


        for(int x: hm){  
            int currlength=1;
          if(!hm.contains(x-1)){
            for(int i=x+1;i<=max;i++){
                if(hm.contains(i)){
                    currlength++;
                }else{
                    break;
                }
            }

            if(currlength>lcs){
                lcs=currlength;
            }

        }

        }
       return lcs;

    }
}

