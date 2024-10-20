package faang;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	public static void main(String[] args) {
		String s = "leetcode";
		Set<String>set=new HashSet<>();
		set.add("leet");
		set.add("code");
		boolean canBeSegmeneted=wordBreak(s,set);
		System.out.println(canBeSegmeneted);
		
	}
 static boolean wordBreak(String string,Set<String>dic) {
	int length = string.length();
	boolean dp[]=new boolean[length+1];
	dp[0]=true;
	for(int i=1;i<=length;i++) {
		for(int j=0;j<i;j++) {
			if(dp[j]&&dic.contains(string.substring(j,i))) {
				dp[i]=true;
				break;
				
				
			}
			
		}
		
	}
	return dp[length];
	
}
}
