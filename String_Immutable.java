public class String_Immutable{
    public static void main (String [] args){
        String text = "World";
        System.out.println("Original Text: "+text);
        text = "Hello " + text;
        System.out.println("String Concatenation: "+text); 
        text = text.replaceAll("Hello", "Hi");
        System.out.println("String Replacing: "+text);
        text = text.substring(2);
        System.out.println("Substring Replace: "+text);
    }
}

// public class String_Immutable{
//     public static void main(String[] args) {
//         String word = "Hello";
//         System.out.println("Og word: " + word);
//         word.concat(" World");
//         // word = word.concat(" World");

//         System.out.println(word);
//         // System.out.println("Storing concatenation part: " + word);
//     }
// }