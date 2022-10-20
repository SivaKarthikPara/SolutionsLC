class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int [] arr = new int[matrix[0].length * matrix.length];
        int n = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                arr[n++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}