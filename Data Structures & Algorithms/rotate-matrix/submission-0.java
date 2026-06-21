class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Diagonal flip
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++ ) {
                if (i + j != n) {
                    swap(matrix, new Pair<>(i, j), new Pair<>(n-j-1, n-i-1));
                }
            }
        }
        // Vertical flip
        for(int i = 0; i < n/2; i++) {
            for(int j = 0; j < n; j++) {
                swap(matrix, new Pair<>(i, j), new Pair<>(n-i-1, j));
            }
        }
    }

    private void swap(int[][] matrix, Pair<Integer, Integer> loc1, Pair<Integer, Integer> loc2) {
        int temp = matrix[loc1.getKey()][loc1.getValue()];
        matrix[loc1.getKey()][loc1.getValue()] = matrix[loc2.getKey()][loc2.getValue()];
        matrix[loc2.getKey()][loc2.getValue()] = temp;
    }
}