package demoTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2016-10-25.
 */
public class little
{
    public static void main(String[] args) {
        String s1="result asdfalksjdfk";
        String regex="^result ";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s1);

        while (matcher.find()){
            String temp=s1.substring(matcher.end(),s1.length());
            s1=temp;

        }
        System.out.println(s1);
    }
}
