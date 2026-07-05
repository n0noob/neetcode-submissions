class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // if out of range
        int m = matrix.length;
        int n = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) {
            return false;
        }

        int rowId = this.getRowId(matrix, target);
        int low = 0;
        int high = n - 1;
        int mid = (low + high)/2;
        while (low < high) {
            if (target == matrix[rowId][mid]) {
                return true;
            } else if (target < matrix[rowId][mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
            mid = (low + high)/2;
        }
        return matrix[rowId][mid] == target? true: false;
    }

    private int getRowId(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int mid = (low + high)/2;
        int n = matrix[0].length;

        while (low < high) {
            if (target >= matrix[mid][0] && target <= matrix[mid][n-1]) {
                return mid;
            } else if (target < matrix[mid][0]) {
                high = mid;
            } else {
                low = mid + 1;
            }
            mid = (low + high)/2;
        }
        return mid;
    }
}