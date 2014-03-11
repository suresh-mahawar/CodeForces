package codeforces;

import java.io.*;

public class YetAnotherNumberSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		long n = Long.parseLong(input[0]);
		long k = Long.parseLong(input[1]);
		System.out.println(anotherFibo(n,k));
	}
	static long result = 0;
	public static long anotherFibo(long n,long k){
		long a=1,b=2;;
		result += 1 + power(2,k+1);
		int j = 3;
		while(j<=n){
			long c  = (a + b)%1000000007;
			long p = power(j,k)%1000000007;
			result = (result + (c*p)%1000000007)%1000000007;
			a = b%1000000007;
			b = c%1000000007;
			j++;
		}
		return result%1000000007;
	}
	public static long power(long x, long n){
		if(n==0) return 1;
		else if(n==1)return x%1000000007;
		else{
			if(n%2==0){
				return (power(x%1000000007,n/2)%1000000007)*(power(x%1000000007,n/2)%1000000007)%1000000007;
			}else{
				return (power(x%1000000007,n/2)%1000000007)*(power(x%1000000007,(n/2)+1)%1000000007)%1000000007;
			}
		}
	}
	

}
