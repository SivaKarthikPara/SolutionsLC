class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        //when row = 0, sorting diagonals
        for (int col = 0; col < n-1; col++) {
            sort(mat,0,col,m,n);
        }
        
        //when col = 0, sorting diagonals
        for (int row = 1; row < m-1; row++) {
            sort(mat,row,0,m,n);
        }
        
        return mat;
    }
    
    static void sort(int[][] a, int row, int col, int m, int n) {
        int r = row, c = col;
        List<Integer> list = new ArrayList<>();
        while(r<m && c<n){
            list.add(a[r][c]);
            r++;
            c++;
        }
        Collections.sort(list);
        int ind = 0;
        while(row<m && col<n){
            a[row][col] = list.get(ind);
            ind++;
            row++;
            col++;
        }
        
    }
}