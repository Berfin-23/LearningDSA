class StringMethod {
    public static void main(String[] args) {
        
        // 1) length() method
        // The length() method returns the number of characters in the string.
        // It returns an int value.
        // Cannot count emojis
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("THe length of the string is " + length);

        // 2) matches() method
        // The matches() method checks if the string matches a given regular expression.
        // It returns a boolean value.
        // The regular expression is a sequence of characters that forms a search pattern.
        String email = "example@gmail.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        boolean isValidEmail = email.matches(regex);
        System.out.println(isValidEmail ? "Valid email address" : "Invalid email address");

        // 3) offsetByCodePoints() method
        // The offsetByCodePoints() method returns the index within this string that is offset from the given index by the specified code point offset.
        // It returns an int value.
        // The code point is a number that represents a character in the Unicode standard.
        String str2 = "Hell❤️, World!";
        int index = 7;
        int codePointOffset = 2;
        System.out.println(str2.charAt(5));
        int newIndex = str2.offsetByCodePoints(index, codePointOffset);
        System.out.println("The new index is " + newIndex);


        // 4) regionMatches() method
        // The regionMatches() method compares a specified region of this string to a specified region of another string.
        // It returns a boolean value.
        // Parameters
        // boolean ignoreCase: if true, ignore case differences
        // int firstOffset: the starting offset of the region in this string
        // int secondOffset: the starting offset of the region in the other string
        // int len: the number of characters to compare
        // The regionMatches() method is case-sensitive by default.
        String string = "Hello, World!";
        String otherString = "world";
        int firstOffset = 7;
        int secondOffset = 0;
        int len = 5;
        boolean isEqual = string.regionMatches(true, firstOffset, otherString, secondOffset, len);
        System.out.println(isEqual ? "The regions are equal" : "The regions are not equal");
    }
}