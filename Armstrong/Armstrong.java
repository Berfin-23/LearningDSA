class Armstrong {
    public static void main(String args[]){
        int n = 153;
        int temp = n;
        int digit, sum = 0;
        while( n > 0){
            digit = n % 10;
            n = n / 10;
            sum = sum + (digit * digit * digit);
        }
        if (sum == temp){
            System.out.print("Armstrong");
        } else {
            System.out.print("Not Armstrong");
        }

    }
}