public class RemoveVowels {


 public static void main(String args[]) {

        String str1 = "Hi i am purab !! How are you??!";
        String str2 = str1.replaceAll("[aeiouAEIOU]", "  ");
        System.out.println(str2);

    }

}