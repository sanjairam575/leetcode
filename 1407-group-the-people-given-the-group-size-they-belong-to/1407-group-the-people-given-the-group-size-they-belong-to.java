class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>>map=new HashMap<>();
        int i=0;
        for(int nums:groupSizes){
            if(!map.containsKey(nums)){
                map.put(nums,new ArrayList<>());
            }
            map.get(nums).add(i);
            i++;
        }
        List<List<Integer>>li=new ArrayList<>();
        for(int key:map.keySet()){
            List<Integer>list=map.get(key);
            List<Integer>temp=new ArrayList<>();
            for(int x:list){
                temp.add(x);
                if(temp.size()==key){
                    li.add(temp);
                    temp=new ArrayList<>();
                }
            }
        }

    return li;
       
    }
}