/*


practice:http://uva.onlinejudge.org/external/109/10922.html
coding by chun20042
*/
import java.util.Scanner;
public class _2the9s{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		do{
			char [] strArr=str.toCharArray();
			int [] intArr =new int [strArr.length];
			for(int i=0;i<strArr.length;i++){//put the input to the int type array
				intArr[i]=Integer.parseInt(String.valueOf(strArr[i]));
			}
			int remainder=0;
			boolean flag=false;
			int sum=0;
			for(int i=0;i<intArr.length;i++){//coumpting number remainder using intArray 
				remainder=(remainder*10+intArr[i])%9;
				System.out.print(intArr[i]);
				sum+=intArr[i];
				}
				if(remainder==0){
					int count=0;
					flag=true;
					while(sum>1){
						sum/=9;
						count++;
					}
					System.out.printf(" is  a multiple of 9 and has 9-degree %d.\n",count);	
				}
				if(!flag){
				System.out.println(" is not a multiple of 9.");	
				}				
			str=sc.nextLine();
		}while(!str.equals("0"));
	}
}