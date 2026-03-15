package Strings;
import java.util.*;

public class strings {
    public static void main(String[] args) {
        char arr[] = {'h', 'e', 'l', 'l', 'o'};
        String str = "abcd";
        String str2 = new String("xyz");

        //strings are immutable in java i.e. cannnot be changed once created. we can change the reference but not the value of string.

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine(); //input from user, whole line
        System.out.println(name);
        
        // .length() method to find the length of string
        // System.out.println(str.length());
        // .charAt() method to find the character at a specific index
        // System.out.println(str.charAt(2));
        // .substring() method to find the substring of a string
        // System.out.println(str.substring(1, 3)); //start index is inclusive and end index is exclusive
        // .indexOf() method to find the index of a specific character or substring
        // System.out.println(str.indexOf('c'));
        // .lastIndexOf() method to find the last index of a specific character or substring
        // System.out.println(str.lastIndexOf('a'));
        // .equals() method to compare two strings
        // System.out.println(str.equals(str2));
        // .equalsIgnoreCase() method to compare two strings ignoring case
        // System.out.println(str.equalsIgnoreCase(str2));
        // .toUpperCase() method to convert a string to uppercase
        // System.out.println(str.toUpperCase());
        // .toLowerCase() method to convert a string to lowercase
        // System.out.println(str.toLowerCase());
        // .trim() method to remove leading and trailing spaces from a string
        // String str3 = "   hello world   ";
        // System.out.println(str3.trim());
        // .replace() method to replace a specific character or substring with another character or substring
        // System.out.println(str.replace('a', 'e'));
        // .split() method to split a string into an array of substrings based on a specific delimiter
        // String str4 = "hello world";
        // String[] arr2 = str4.split(" ");
        // for (String s : arr2) {
        //     System.out.println(s);
        // }
        
    
    }
}
