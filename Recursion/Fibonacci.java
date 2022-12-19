class Fibonacci{
    public static void main(String[] args) {
        Fibonacci recursion = new Fibonacci();
        var rec = recursion.fibonaccii(-2);
        System.out.println(rec);
    }

    public int fibonaccii(int n){
        if(n<0){
            return -1;

        }
        if(n==0 || n==1){
            return n;
        }
        return fibonaccii(n+1) + fibonaccii(n+2);
    }
}