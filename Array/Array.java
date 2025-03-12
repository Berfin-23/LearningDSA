import java.util.Scanner;

class Array {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Elements in the array are: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}