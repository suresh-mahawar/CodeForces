package codeforces;
//import java.io.*;
import java.util.*;
public class VanyaandCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] in = new int[n];
		int[] h = new int[2*x+1];
		for(int i = 0 ; i<n ; i++){
			in[i] = sc.nextInt();
			if(in[i]>0){
				if(h[x+in[i]]==0)
			  h[in[i]]++;
				else h[in[i]]--;
			}else if(in[i]<0){
				if(h[Math.abs(in[i])]==0)
				h[x+Math.abs(in[i])]++;
				else h[x+Math.abs(in[i])]--;
			}
		}
		int count = 0;
		for(int i = 1; i<=x ; i++){
			count += h[i]-h[x+i];
		}
		System.out.println(count);
	}

}
