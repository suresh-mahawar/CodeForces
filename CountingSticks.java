package codeforces;
import java.util.*;
public class CountingSticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char in[] = input.toCharArray();
		int a = 0, b  = 0, c = 0;
		boolean f1=true,f2=false,f3=false;
		for(char ch : in){
			if(f1 && ch!='+' && ch!='=' && ch=='|'){
				a++;
			}else if(ch=='+'){
				f1 = false;
				f2 = true;
				continue;
			}else if(f2 && ch!='=' && ch=='|'){
				b++;
			}else if(ch=='='){
				f2 = false;
				f3 = true;
				continue;
			}else if(f3 && ch=='|'){
				c++;
			}else{
				break;
			}
		}
		if((a+b)==c){
			System.out.println(input);
		}else if((a+b-1)==c+1){
			if(a>1){
				System.out.println(input.substring(1)+"|");
			}else{
				System.out.println(input.replace("|=", "=|"));
			}
		}else if((a+b+1)==c-1){
			if(c>1){
				System.out.println("|"+input.substring(0,input.length()-1));
			}else{
				System.out.println(input.replace("=|", "|="));
			}
		}else{
			System.out.println("Impossible");
		}
	}

}
