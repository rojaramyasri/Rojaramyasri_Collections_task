package Epam_Collections.List_Collections;
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner scan=new Scanner(System.in);
    	List<Integer> list1 = new ArrayList<Integer>();
    	list1.add(1);list1.add(1);list1.add(3);list1.add(4);list1.add(5);list1.add(6);list1.add(7);list1.add(8);list1.add(9);
    	list1.add(10);
    	while(true) {
    	LOGGER.info("\nEnter your choice 1.Fetching 2.Add 3.Remove 4.Print list 5.Exit\n");
    	int ch=scan.nextInt();
    	switch(ch)
    	{
    	case 1:LOGGER.info("\nEnter index to fetch from the list\n");
    	       int ind=scan.nextInt();
    	       LOGGER.info(list1.get(ind)+"\n");break;
    	case 2:LOGGER.info("\nEnter number to insert \n");
    	       int num=scan.nextInt();
    	       list1.add(num);break;
    	case 3:LOGGER.info("\nEnter number to remove\n");
	           int n=scan.nextInt();
	            list1.remove(n);break;
    	case 4:LOGGER.info(" \nprinting the list \n");
	       LOGGER.info(list1);break;
    	
    	}
    	if(ch==5)
    		break;
    	}
    }
}
