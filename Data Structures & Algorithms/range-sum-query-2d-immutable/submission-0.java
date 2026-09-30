class NumMatrix {

    private int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        
        prefixSum = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            prefixSum[i][0] = matrix[i][0];
            for(int j=1; j<cols; j++) {
                prefixSum[i][j] = prefixSum[i][j-1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;

        for(int i=row1; i<=row2; i++) {
            if(col1 > 0) {
                sum += prefixSum[i][col2] - prefixSum[i][col1-1];
            }
            else {
                sum += prefixSum[i][col2];
            }
        }

        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */