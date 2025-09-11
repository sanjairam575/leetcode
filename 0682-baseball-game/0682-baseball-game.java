class Solution {
    public int calPoints(String[] str) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            if(!(str[i].equals("+")||str[i].equals("C")||str[i].equals("D"))){
                int num=Integer.parseInt(str[i]);
                list.add(num);
            }
            else if(str[i].equals("+")){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
            else if(str[i].equals("D")){
                list.add(list.get(list.size()-1)*2);
            }
            else if(str[i].equals("C")){
                list.remove(list.size()-1);
            }
        }   
        int sum=0;
        for(int arr:list){
            sum+=arr;
        }
        return sum;
    }
}