
import java.util.*;
public class remove {

	public  String removeA(String s) {
		
		char[] ch=new char[s.length()];
		int j=0;
		int c=0;
		if(s.length()>=2) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='A'&&i<=1){ 
					continue;
				}
				c++;
				ch[j++]=s.charAt(i);
			}
		}
		String str=new String(ch);
		str=str.substring(0,c);
		return str;
	}
}
