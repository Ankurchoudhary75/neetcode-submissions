class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[2*nums.length];
        for(int i=0;i<arr.length;i++){
            int a=i%nums.length;
            arr[i]=nums[a];
        }
        return arr;
    }
}