package codeforces;
import java.util.*;
public class GeneticEngineering {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char str[] = s.toCharArray();
		int ans = 0;
		int isEven = 0;
		for(int i = 0 ; i<str.length ; i++){
			isEven = 1;
			while((i+1)<str.length && str[i]==str[i+1]){
				i++;
				isEven++;
			}
			if(isEven%2==0)ans++;
		}
		System.out.println(ans);
	}

}
