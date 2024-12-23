import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in);
		int t=scn.nextInt();
		int cost[]=new int[26];
		int h[]=new int[26];
		String s;
		while(t-->0) {
		    for(int i=0;i < 26;i++) {
		        cost[i]=scn.nextInt();
		        h[i]=0;
		    }
		    s=scn.next();
		    for(int i=0;i < s.length();i++)
		        h[s.charAt(i)-'a']++;
		    int ans=0;
		    for(int i=0;i < 26;i++) {
		        if(h[i]==0)
		        ans+=cost[i];
		    }
		    System.out.println(ans);
		}
	}
}import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in);
		int t=scn.nextInt();
		int cost[]=new int[26];
		int h[]=new int[26];
		String s;
		while(t-->0) {
		    for(int i=0;i < 26;i++) {
		        cost[i]=scn.nextInt();
		        h[i]=0;
		    }
		    s=scn.next();
		    for(int i=0;i < s.length();i++)
		        h[s.charAt(i)-'a']++;
		    int ans=0;
		    for(int i=0;i < 26;i++) {
		        if(h[i]==0)
		        ans+=cost[i];
		    }
		    System.out.println(ans);
		}
	}
}