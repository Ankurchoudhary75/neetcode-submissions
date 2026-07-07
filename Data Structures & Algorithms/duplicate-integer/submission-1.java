class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> fr=new HashSet<>();
        for(int c:nums){
            if(fr.contains(c)) return true;
            fr.add(c);
        }
        return false;
    }
}