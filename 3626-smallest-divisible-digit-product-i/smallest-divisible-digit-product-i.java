class Solution {
    private int productOfDigits(int i){
        int prod = 1;
        while(i > 0){
            prod *= (i % 10);
            i /= 10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        for(int i = n; i < n + 10; i++){
            if(productOfDigits(i) % t == 0) return i;
        }
        return n + 10;
    }
}