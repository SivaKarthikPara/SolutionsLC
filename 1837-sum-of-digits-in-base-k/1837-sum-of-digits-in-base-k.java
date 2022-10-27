class Solution {
    public int sumBase(int n, int k) {
        int num = Integer.parseInt(Integer.toString(Integer.parseInt(String.valueOf(n), 10), k));
        System.out.println(num);
        int sum = 0;
        while(num>0){
            sum = sum + num % 10;
            num /= 10;
        }
        return sum;
    }
}