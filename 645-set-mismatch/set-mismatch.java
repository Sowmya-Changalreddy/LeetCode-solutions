class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet <Integer> hs=new HashSet<>();
        int dup=0;
        for (int i=0;i<nums.length;i++){
            if (!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                dup=nums[i];
            }
        }
        int mis=0;
        int n=nums.length;
        for (int i=1;i<=n;i++){
            if (!hs.contains(i)){
                mis=i;
            }
        }
        int arr[]=new int[2];
        arr[0]=dup;
        arr[1]=mis;
        return arr;
    }
}