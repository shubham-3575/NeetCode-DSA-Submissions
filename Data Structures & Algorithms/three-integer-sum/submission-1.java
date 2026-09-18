class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int target = -nums[i];
            int j = i+1, k = nums.length-1;
            while(j<k){
                int sum = nums[j]+nums[k];
                if(sum < target)
                    j++;
                else if(sum > target)
                    k--;
                else{
                    lst.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return lst;
    }
}
