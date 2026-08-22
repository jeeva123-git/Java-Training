
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String[] names = new String[3];
	    int[] marks = new int[3];
	    for(int i = 0;i<3;i++)
	    {
	        
	        System.out.println("enter student mark and name:"+(i+1));
	        marks[i] = sc.nextInt();
	        sc.nextLine();
	        names[i] = sc.nextLine();
	    }
	    int s=1;
	    for(int i = 0;i<3;i++)
	    {
	        if(marks[i]>50)
	    {
	        System.out.println(s+ " mark is "+ names[i]);
	        s++;
	        
	    }
	    }
	   
	   
	    
	}
}
