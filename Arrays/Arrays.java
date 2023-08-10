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


    // Optimal Solution without using extra space
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

    // Find First and Last Position of Element in Sorted Array
    // 1. horrible brute force solution

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                list.add(i);
            }
        }

        if(list.size() == 0) {
            return new int[]{-1, -1};
        }
        if(list.size() == 1) {
            return new int[]{list.get(0), list.get(0)};
        }

        return new int[]{list.get(0), list.get(list.size()-1)};
    }

    // 1295. Find Numbers with Even Number of Digits

    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num: nums) {
            if(checkEvenDigit(num)) {
                count++;
            }
        }

        return count;
    }

    public boolean checkEvenDigit(int num) {
        int count = 0;

        while(num > 0) {
            num = num/10;
            count++;
        }

        return count%2 == 0;
    }

    // Optimized Version of the above solution using some previous math wits

    public int OptimizedfindNumbers(int[] nums) {
        int count = 0;

        for(int num: nums) {
            if(checkEvenDigit(num)) {
                count++;
            }
        }

        return count;
    }

    boolean OptimizedcheckEvenDigit(int num) {
        if(num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num) + 1) % 2 == 0;
    }


    // 1672. Richest Customer Wealth
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int[] customer: accounts) {
            int sum = 0;
            for(int wealth: customer) {
                sum += wealth;
            }

            if(max < sum) {
                max = sum;
            }
        }

        return max;
    }


        
        
    


}
