package rsa;



import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class RegexExample1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".k");
		Matcher m = p.matcher("gk");
   boolean v = p.matches(null, null);
   System.out.println(v);
	}

}
