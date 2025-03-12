class Extract{
    public static void main(String args[]){
        int n = 12345;
        int digit, sum = 0;
        while( n > 0){
            digit = n % 10;
            n = n / 10;
            sum = sum + digit;
        }
        System.out.print(sum);
    }
}