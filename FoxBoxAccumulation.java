package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoxBoxAccumulation {
	public static void main(String[] args) throws IOException{
	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	short N = Short.parseShort(br.readLine());
	short strength[] = new short[N];
	String s[] = new String[N];
	s = br.readLine().split(" ");
	for(int i = 0 ; i<N ; i++){
		strength[i] = Short.parseShort(s[i]);
	}
	short hash[] = new short[100];
	for(int i = 0 ; i<=100 ; i++){
		hash[i] = 0;
	}
	for(int i = 0 ; i<N ; i++){
		hash[strength[i]]++;
	}
	short max = hash[0];
	for(short i = 1 ; i<=100 ; i++){
		if(max<hash[i])max = hash[i];
	}	
	System.out.println(max);
	}	
}
