package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher matcher = pattern.matcher("duc@gmail.com");
        System.out.println("Input String matches regex - "+matcher.matches());
    }
}
