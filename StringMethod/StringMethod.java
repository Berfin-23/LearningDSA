class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Length of String: " + str.length());
        System.out.println("Substring(0, 5): " + str.substring(0, 5));
        System.out.println("Substring(7, 12): " + str.substring(7, 12));
        System.out.println("Substring(7): " + str.substring(7));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Index of 'o' after 5: " + str.indexOf('o', 5));
        System.out.println("Index of 'o' after 8: " + str.indexOf('o', 8));
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));
        System.out.println("Last Index of 'o' before 5: " + str.lastIndexOf('o', 5));
        System.out.println("Last Index of 'o' before 8: " + str.lastIndexOf('o', 8));
        System.out.println("Character at 7: " + str.charAt(7));
        System.out.println("Character at 8: " + str.charAt(8));
        System.out.println("Concatenation: " + str.concat(" Goodbye!"));
        System.out.println("Replace: " + str.replace('o', 'x'));
        System.out.println("Replace: " + str.replace("World", "Universe"));
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Trim: " + "  Hello, World!  ".trim());
    }
}