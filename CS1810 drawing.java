import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class CS1702_Lab8_Finch {

	 public static void main(final String[] args)
     {
     Finch myFinch = new Finch();

//     8.5 A User Defined Function for the Finch Robot

     long timeToRun = 8000;
     long noOfObst = 0;
     
     
     noOfObst = noOfObstacles(timeToRun, myFinch);
     
     System.out.println(noOfObst + " found!");

     myFinch.quit();
     System.exit(0);
     }
	
	 public static long noOfObstacles(long runtime, Finch John)
	 {
		 
//		8.5 A User Defined Function for the Finch Robot
//		Write a function/method that takes as input an integer corresponding to a time in milliseconds (ms) 
//		and then moves the Finch Robot around randomly for this time counting the number of obstacles it encounters using both obstacle detectors.
//		This number of obstacles is returned by the function/method.

		 long result=0;
		 boolean [] sensors = John.getObstacleSensors();
		 
		 while (runtime > time)
		 {
			 while (sensors [0] == false && sensors[1] == false)
			 {
				 // random action
				 
			 }
			 
			 
			 result++;
		 }
		 return (result);
		 
	 }
	 
	
}