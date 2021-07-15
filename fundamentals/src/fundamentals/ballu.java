package fundamentals;
import java.util.Scanner;
public class ballu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next();
		//char check[]=new char[a.length()];
		String check="";
		String last="";
		boolean flag;
		int k=0;
		
		for(int i=0;i<a.length();i++)
		{
			flag=false;
			for(int j=0;j<check.length();j++)
			{
				if(a.charAt(i)==check.charAt(j))
				{
					flag=true;
				}
			}
			
			if(flag==false)
			{
				last=last+a.charAt(i);
				check+=a.charAt(i);
				k++;
			}
			
		}
		
		System.out.println(last);

	}

}
