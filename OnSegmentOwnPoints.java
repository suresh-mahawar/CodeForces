package codeforces;

import java.util.*;

public class OnSegmentOwnPoints {
/* package whatever; // don't place package name! */
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l[] = new int[n];
		int r[] = new int[n];
		int hash[] = new int[102];
		boolean overlap[] = new boolean[102];
		for(int i = 0 ; i<n ; i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for(int i = 0 ; i<102 ; i++){
			hash[i] = -1;
			overlap[i] = false;
		}
		for(int i = 0 ; i<n ; i++){
			for(int j = l[i] ; j<=r[i] ; j++){
				if(!overlap[j] && hash[j]==-1){
					hash[j] = 1;
				}else{
					overlap[j] = true;
					hash[j] = 0;
				}
			}
		}
		int count = 0;
		for(int i = l[0] ; i<=r[0] ; i++){
			if(hash[i]==1){
				if(hash[i+1]==0 && (i+1)<=r[0]){
					count++;
				}
				if((i-1)>=l[0] && (hash[i-1]==0 || hash[i-1]==1)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
}