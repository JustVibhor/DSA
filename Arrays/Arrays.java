package Arrays;

public class Arrays {


    public int countPrimes(int n) {
        boolean[] seen = new boolean[n];
        int ans = 0;
        for (int num = 2; num < n; num++) {
            if (seen[num]) continue;
            ans += 1;
            for (long mult = (long)num * num; mult < n; mult += num)
                seen[(int)mult] = true;
        }
        return ans;
    }


    // brute force solution
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;

        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0; i<row.size(); i++) {
            int index = row.get(i);

            for(int j=0; j<n; j++) {
                matrix[index][j] = 0;
            }
        }

        for(int j=0; j<col.size(); j++) {
            int index = col.get(j);
            for(int i=0; i<m; i++) {
                matrix[i][index] = 0;
            }
        }
        
    


}
