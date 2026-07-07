class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int ele:nums){
            r^=ele;
        }
        return r;
    }
}
