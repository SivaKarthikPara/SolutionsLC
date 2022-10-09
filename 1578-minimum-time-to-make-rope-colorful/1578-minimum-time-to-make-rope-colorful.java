class Solution {
    public int minCost(String colors, int[] neededTime) {
        char [] arr = colors.toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                sum = sum + Math.min(neededTime[i], neededTime[i+1]);
                if(neededTime[i+1] < neededTime[i])
                    neededTime[i+1] = neededTime[i];
            }
            // System.out.println(arr[i]+" = "+sum);
        }
        
        return sum;
    }
}