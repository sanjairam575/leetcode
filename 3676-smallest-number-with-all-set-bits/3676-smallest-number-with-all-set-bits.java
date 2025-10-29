class Solution {
    public int smallestNumber(int n) {
        String binary=Integer.toBinaryString(n);
        binary=binary.replaceAll("0","1");
        int num=Integer.parseInt(binary,2);
        return num;
    }
}