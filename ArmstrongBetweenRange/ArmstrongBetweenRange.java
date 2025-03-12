class ArmstrongBetweenRange {
    public static void main(String[] args) {
        int start = 1, end = 10000;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        int len = length(n);
        temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += exponential(rem, len);
            temp /= 10;
        }
        return sum == n;
    }

    static int exponential(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

    static int length(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}