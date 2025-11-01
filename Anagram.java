import java.util.*;

class Anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the first string
        System.out.println("Enter the first string: ");
        String s = sc.nextLine().toLowerCase().trim(); // Convert to lowercase and remove leading/trailing spaces
        
        // Input for the second string
        System.out.println("Enter the second string: ");
        String ss = sc.nextLine().toLowerCase().trim(); // Convert to lowercase and remove leading/trailing spaces

        // Remove spaces from both strings
        String s1 = s.replace(" ", "");
        String ss1 = ss.replace(" ", "");
        
        // Check if lengths are equal
        if (s1.length() == ss1.length()) {
            // Convert strings to character arrays and sort them
            char[] arr1 = s1.toCharArray();
            char[] arr2 = ss1.toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            // Compare the sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}