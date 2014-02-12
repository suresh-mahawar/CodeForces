package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class AnnaAlarmClock {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int X[] = new int[N];
		int Y[] = new int[N]; 
		int hashX[] = new int[100001];
		int hashY[] = new int[100001];		
		String NM[] = new String[2];
		for(int i = 0 ;i<N ;i++){
			NM = br.readLine().split(" ");
			X[i] = Integer.parseInt(NM[0]);
			Y[i] = Integer.parseInt(NM[1]);
		}
		for(int i = 0 ; i<N ; i++){
			hashX[X[i]] = 1;
			hashY[Y[i]] = 1;
		}
		int Xcount = 0;
		int Ycount = 0;
		for(int i = 0 ; i<100001 ; i++){
			if(hashX[i]==1)
			    Xcount++;
			if(hashY[i]==1)
				Ycount++;
		}
		if(Xcount<Ycount){
			System.out.println(Xcount);
		}else{
			System.out.println(Ycount);
		}
	}

}
