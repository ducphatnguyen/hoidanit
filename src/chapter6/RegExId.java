package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExId {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^0\\d{11}$");
        Matcher matcher = pattern.matcher("086201000423");
        System.out.println("Input String matches regex - "+matcher.matches());
    }
}
