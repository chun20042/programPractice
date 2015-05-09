/*


practice:http://uva.onlinejudge.org/external/4/409.html
coding by chun20042
*/
import java.util.Scanner;
import java.util.ArrayList;
public class excuses{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int set=0;
		while(sc.hasNext()){
			set++;
			int K=sc.nextInt();
			int E=sc.nextInt();
			sc.nextLine();
			ArrayList<String[]> keyword=new ArrayList<String[]>();
			ArrayList<String> word=new ArrayList<String>();
			int mark[]=new int [E];
			int maxNum=0;
			for(int i =0;i<K;i++){
				String str=sc.nextLine();
				keyword.add(str.toUpperCase().split(" "));
			}
			for(int i =0;i<E;i++){
				int count=0;
				String str=sc.nextLine();
				word.add(str);
				str=str.toUpperCase();
				for(int j=0;j<K;j++){//finding the keyword in the statement
					for(int l=0;l<keyword.get(j).length;l++){
						String [] tStr=keyword.get(j);
						int since=0;
						while(str.indexOf(tStr[l].toUpperCase(),since)!=-1){
						count++;
						since=str.indexOf(tStr[l].toUpperCase(),since)+1;
						}
					}
				}
				mark[i]=count;
				if(maxNum<count){
					maxNum=count;
				}
			}

			System.out.println("Excuse Set #"+set);
			for(int i=0;i<E;i++){	
						if(mark[i]<maxNum){
							continue;
						}
						else{
							System.out.println(word.get(i));
						}
			}
				

		}

	}


} 