//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int p=map.get(nums[i]);
                if(i-p<=k){
                    return true;
                }
            }
                map.put(nums[i],i);
            
        }
        return false;
    }
}
