package capabl;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Student Name: ");
	String Student=sc.nextLine();
	System.out.print("Enter the student Roll no: ");
	int roll=sc.nextInt();
	System.out.print("Enter the no of Subject student was pursuing: ");
	int NO_of_Subject=sc.nextInt();
	System.out.println("Name of the Subjects: ");
	for(int i=1;i<=NO_of_Subject;i++) {
		 System.out.println("Subject"+i);
	}
	
	int i;
	int score;
	for(i=1;i<=NO_of_Subject;i++){
	      System.out.println("Sub"+i+"_Score=");
	      System.out.print(score=sc.nextInt());
	      System.out.print("   Grade=");
	      if(score>=90)
	    	  System.out.println(" A"); 
	      else if(score<90 && score >=75) 
	    	  System.out.println(" B");
	      else if(score<75 && score>=50) 
			  System.out.println(" C"); 
	      else if(score<50 && score>=35) 
			   System.out.println(" D"); 
		  else
			   System.out.println(" F"); 
	      }
}
}

