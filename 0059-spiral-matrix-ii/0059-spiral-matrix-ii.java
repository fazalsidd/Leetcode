class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 1;
        int startingRow = 0;
        int startingCol =0;
        int endingRow = row-1;
        int endingCol = col-1;
        while(count<n*n){
            for(int index = startingCol; index<=endingCol;index++){
                matrix[startingRow][index]=count++;
            }
            startingRow++;
            for(int index = startingRow; index<=endingRow;index++){
                     matrix[index][endingCol]=count++;
            }
            endingCol--;
            for(int index= endingCol; index>=startingCol;index--)
            {
                 matrix[endingRow][index]=count++;

            }
            endingRow--;
            for(int index= endingRow; index>=startingRow;index--){
                matrix[index][startingCol]=count++;
                }
            startingCol++;
            }
            if(n%2==1)
            {
                matrix[n/2][n/2]=n*n;
            }
            return matrix;
    }
}