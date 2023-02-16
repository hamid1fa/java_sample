package Strings;

public class string_sample {
    public static void main(String[] args) {
        Sample_String a = new Sample_String();
        // String Concatenation
        String str1 = "Rock";
        String str2 = "Star";
        // Method 1 : Using concat (adding two strings)
        String str3 = str1.concat(str2);
        System.out.println(str3);
        // Method 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);

        a.sample();

    }
}

class Sample_String {

    void sample() {

        // to find the length of string

        System.out.println("Constructor of Laptop class.");
        // Our sample string for this tutorial
        String str_Sample = "RockStar";
        // Length of a String
        System.out.println("Length of String: " + str_Sample.length());

        System.out.println("Character at position 5: " + str_Sample.charAt(5));
        // Index of a given character
        System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));

        // compare method

        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));

        // compare with ignore case

        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));

        // contains true or false (bool)

        System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));

        // ends with check (bool)

        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

        // replace with

        System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));

        // convert to lower case
        System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
        // Convert to UpperCase
        System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
        // ------------------------------------------------------------------

        // character at method

        String s1 = "This is String CharAt Method";
        // returns the char value at the 0 index
        System.out.println("Character at 0 position is: " + s1.charAt(0));
        // returns the char value at the 5th index
        System.out.println("Character at 5th position is: " + s1.charAt(5));
        // returns the char value at the 22nd index
        System.out.println("Character at 22nd position is: " + s1.charAt(27));
        // returns the char value at the 23th index
        char result = s1.charAt(2);
        System.out.println("Character at 23th position is: " + result);

        String str_Sample1 = "f";
        System.out.println("Compare To 'a' b is : " + str_Sample1.compareTo("c"));
        str_Sample = "b";
        System.out.println("Compare To 'b' a is : " + str_Sample1.compareTo("a"));
        str_Sample = "b";
        System.out.println("Compare To 'b' b is : " + str_Sample1.compareTo("b"));

        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
        // Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));

        // compare strings lexicographically 

        String c = "Guru1";
        String d = "Guru2";
        System.out.println("String 1: " + c);
        System.out.println("String 2: " + d);

        // Compare the two strings.
        int S = c.compareTo(d);

        // Show the results of the comparison.
        if (S < 0) {
            System.out.println("\"" + c + "\""+ "is lexicographically higher than " + "\"" + d + "\"" );
        } else if (S == 0) {
            System.out.println("\"" + c + "\"" + " is lexicographically  equal to " + "\"" + d + "\"");
        } else if (S > 0) {
            System.out.println("\"" + c + "\"" + " is lexicographically less than " + "\"" + d + "\"");
        }

        String str_Sample2 = "This is a String contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'ing': " + str_Sample2.contains("ing"));
        System.out.println("Contains sequence 'Example': " + str_Sample2.contains("Example"));
        //String contains method is case sensitive  
        System.out.println("Contains sequence 'example': " + str_Sample2.contains("example"));
        System.out.println("Contains sequence 'is String': " + str_Sample2.contains("is String"));

        // to remove white space

        String str = "Guru99 is a site providing free tutorials";
        //remove white spaces
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);

        // convert string to integer....

        String strTest = "100";
        int iTest = Integer.parseInt(strTest);
        System.out.println("Actual String:"+ strTest);
        System.out.println("Converted to Int:" + iTest);
        //This will now show some arithmetic operation
        System.out.println("Arithmetic Operation on Int: " + (iTest/4));

        String stringOne = "Hami99";
        String stringTwo = "Hami99";
        System.out.println("is Guru99 equal to Guru99: " + stringOne.compareTo(stringTwo));
        String stringThree = "HAMI99";
		// u = 117, U = 85, result = 117-85 = 32
        System.out.println("is Guru99 equal to GURU99: " + stringOne.compareTo(stringThree));
    
    }

}
