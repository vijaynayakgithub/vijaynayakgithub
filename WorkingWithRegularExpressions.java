package Assignments.com;

import java.util.regex.*;

public class WorkingWithRegularExpressions {

	public static void main(String[] args) {
		String[] words= {"hi", "Hello","How are you"};
		String find="hi",nofind="way on the way";
		boolean a=meth(find,words);
		boolean b=meth(nofind,words);
		System.out.println(a);
		System.out.println(b);
		


	}
	static boolean meth(String find,String[] words) {
		Pattern pattern=Pattern.compile(find);
		boolean flag=false;
		for(int i=0;i<words.length;i++) {
			Matcher m =pattern.matcher(words[i]);
			while(m.find()) {
				flag=true;
			}
		}
		return flag;
	}

}