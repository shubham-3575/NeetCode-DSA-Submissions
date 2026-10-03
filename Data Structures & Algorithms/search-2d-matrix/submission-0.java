class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length-1, row = 0;
        while(left <= right){
            int mid = left+(right-left)/2;
            int val = matrix[mid][0];
            if(val <= target && matrix[mid][matrix[mid].length-1]>=target){
                row = mid;
                break;
            }
            else if(val < target)
                left = mid+1;
            else
                right = mid-1;
        }


        int l = 0, r = matrix[row].length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(target == matrix[row][mid])
                return true;
            else if(target < matrix[row][mid])
                r = mid-1;
            else
                l = mid+1;
        }
        return false;
    }
}
