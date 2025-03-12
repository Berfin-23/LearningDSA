class SumOfDigits {
    public static void main(String[] args) {
        int num = -99999;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
            if (num == 0 && (sum > 9 || sum < -9)) {
                num = sum;
                sum = 0;
            }
        }
        System.out.println("Sum of digits: " + sum);
    }
}