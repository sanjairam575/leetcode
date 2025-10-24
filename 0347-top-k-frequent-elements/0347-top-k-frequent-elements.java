class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,List<Integer>>rev=new HashMap<>();
        for(int num:map.keySet()){
            int count=map.get(num);
            if(!rev.containsKey(count)){
                rev.put(count,new ArrayList<Integer>());
            }
            rev.get(count).add(num);
            
        }
        int res[]=new int[k];
        int ind=0;
        for(int i=n;i>=1;i--){
            if(rev.containsKey(i)){
                for(int num:rev.get(i)){
                    if(ind<k)
                     res[ind++]=num;
                    else
                     break;
                }
            }
            if(ind>=k) break;
        }
        return res;
    }
}
