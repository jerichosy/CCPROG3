// import java.util.*;

public class IndivActAPI {
    public static void main(String[] args) {
        String str1 = "lozolawwwabcde";
        // String str2 = "wow korea lol";
        String str3 = "dabcdeaijij";
        System.out.println(str1.length());
        System.out.println("ANIMO".length());
        System.out.println(str1.toUpperCase());
        System.out.println("ANIMO".toLowerCase());

        // System.out.println(str1.indexOf(97));
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.replace('a', '@'));

        // System.out.println(str2.indexOf(' ', 0));

        System.out.println(str1.substring(str1.indexOf('a')));
        System.out.println(str3.substring(str3.indexOf('a'), str3.lastIndexOf('a')));

        System.out.println(str1.replace('a', str1.charAt(str1.length() - 1)));

        System.out.println(str1.substring(str1.indexOf('a')));
    }
}
