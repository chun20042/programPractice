/*


practice:https://uva.onlinejudge.org/external/15/1585.html
coding by chun20042
*/
import java.util.Scanner;
public class score{
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		int	count=sc.nextInt();
		while(count>0){
			String str =sc.next();
			char []strArr =str.toCharArray();
			boolean isO=false;
			int countO=0;
			int sum=0;
			for(int i=0;i<strArr.length;i++){
				if(strArr[i]=='O'){
					isO=true;
					countO++;
				}else if (strArr[i]=='X'){
					isO=false;
					countO=0;
					continue;
				}
				if(isO){
					sum+=countO;

				}
			}
			System.out.println(sum);
			count--;
		}
	}


}