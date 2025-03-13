class SwapNumbers {
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        System.out.println("Swapping with temp variable");
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);

        a = 5;
        b = 10;
        System.out.println("Swapping without temp variable");
        System.out.println("Before swapping without temp: a = " + a + ", b = " + b);
        
        a = a + b; 
        b = a - b; 
        a = a - b;
        
        System.out.println("After swapping without temp: a = " + a + ", b = " + b);
    }
}