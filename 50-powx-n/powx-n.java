class Solution {
    private double power(double x, long n){
        if(n == 0) return 1.0;
        double halfPower = power(x * x, n / 2);
        if(n % 2 == 0) return halfPower;
        return x * halfPower;
    }
    public double myPow(double x, int n) {
        long exp = n;
        // if(n == 0) return 1;
        if(n > 0) return power(x, exp);
        return 1 / power(x, -exp);
    }
}