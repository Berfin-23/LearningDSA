import java.util.Scanner;

class SwapArrayElements{
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Enter number of left rotations:");
        Scanner scanner = new Scanner(System.in);
        int rotations = scanner.nextInt();
        scanner.close();
        int length = arr.length;

        System.out.println("Array before swapping:");
        for (int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }

        int n = rotations % length;
        
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[(i + length - n) % length] = arr[i];
        }
        
        System.out.println("\nArray after swapping:");
        for (int i = 0; i < length; i++){
            System.out.print(temp[i] + " ");
        }
    }
}