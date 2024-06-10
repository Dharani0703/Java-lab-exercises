package functions;
import java.util.*;
public class ConsPEx 
{
	
        ConsPEx(String PAN)
        {
        	System.out.println(PAN);
        }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your PAN number:");
		String pan=sc.next();
		ConsPEx on= new ConsPEx(pan);
	}

}