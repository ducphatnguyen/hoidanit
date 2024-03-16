package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPassword {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(.{6,})$");
        Matcher matcher = pattern.matcher("abcdef");
        System.out.println("Input String matches regex - "+matcher.matches());
    }
}