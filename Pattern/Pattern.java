class Pattern {
    public static void main(String[] args){
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++){
            int totalColsInRow = i > n ? 2 * n - i : i;
            int spaces = n - totalColsInRow;
            for (int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= totalColsInRow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}