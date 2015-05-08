/*

practice:http://uva.onlinejudge.org/external/5/591.html
coding by chun20042
*/
import java.util.Scanner;
public class BoxOfBricks{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int setCount=0;
		while(sc.hasNext()){
			setCount++;	
			int intArr[]=new int[n];
			int sum=0;
			int count=0;
			int average=0;
			try{
				for(int i=0;i<intArr.length;i++){
					intArr[i]=sc.nextInt();
					sum+=intArr[i];
				}
				average=sum/n;
				System.out.println(average);
				for(int i=0;i<intArr.length;i++){
						if(average<intArr[i])
						{
							count+=(intArr[i]-average);
						}
				}
				System.out.println("Set #"+setCount);
				System.out.println("The minimum number of moves is "+count);
			}
			catch(Exception e){
				break;
			}
		}
	}


}