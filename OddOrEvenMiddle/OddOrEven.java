class OddOrEven {
    public static void main(String[] args) {
        int num = 1;
        if (num < 0) {
            System.out.print("Invalid input");
            return;
        } else if (num < 10) {
            System.out.println(num % 2 == 0 ? "Even" : "Odd");
            return;
        }
        int mid = num / 10;
        System.out.println(mid % 2 == 0 ? "Even" : "Odd");
    }
}