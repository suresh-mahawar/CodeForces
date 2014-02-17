package codeforces;
import java.util.*;
import java.io.*;

public class TheTournament {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String nk[] = new String[2];
		nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int p[] = new int[n];
		int e[] = new int[n];
		for(int i = 0 ; i<n ; i++){
			String pe[] = new String[2];
			pe = br.readLine().split(" ");
			p[i] = Integer.parseInt(pe[0]);
			e[i] = Integer.parseInt(pe[1]);
		}
		for(int i = 0 ; i<n ; i++){
			if(e[i]==0) p[i]++;
		}
		int cp[] = new int[n];
		for(int i = 0 ; i<n ; i++){
			cp[i] = p[i];
		}
		Arrays.sort(cp);		
		sort(e,p);
		int count = 0;
		int nn = n-1;
		int ee = 0;
		int r = 0;
		for(int i = 0 ; i<n ; i++){
			if(cp[nn]>count){
				if(e[i]!=0){
					count++;
				ee+=e[i];
				}
			}else{
				r++;
				if(k<r){
					ee = -1;
					break;
				}
				count = 0;
				nn--;
			}
		}
		System.out.println(ee);
	}
	public static void sort(int e[],int p[]){
		for(int i = 1 ; i<e.length ;  i++){
			int currentElement = e[i];
			int currentP = p[i];
			int backPointer = i-1;
			while(backPointer >= 0 && e[backPointer] > currentElement){
				e[backPointer+1] = e[backPointer];
				p[backPointer+1] = p[backPointer];
				backPointer--;
			}
			e[backPointer+1] = currentElement;
			p[backPointer+1] = currentP;
		}
	}
}
