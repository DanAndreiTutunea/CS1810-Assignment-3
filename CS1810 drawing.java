import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class CS1810_drawing {

	 public static void main(final String[] args){

     Finch HK_14 = new Finch();

     // init a list of path objects
     

     
     //reads the command
     //creates a path object based on the command
     //if command is valid then adds it to the list of path objects executes it
     //the result of the executed command is then stored in correct field of the path object

     
    
     
     

     HK_14.quit();
     System.exit(0);
     }


     public static String[] readCommand(){

         //instructs the user to input data and reads the data

     }

     public static void printCommandList( args TBD ){
         
         //prints the list of executed commands before exiting

     }

     public static int executeMovement(Finch John, path move){
         
         //executes the movement as per the object received while making sure the movement is not interupted

     }

     public static boolean obstacle(Finch John){

         //checks for obstacles

     }


}











//set of movement instructions

class moveInstruction {

private int speedLeft, speedRight; //full list of variables to be determined

moveInstruction( ARGS ){ //args to be determined

}

}












//class calculating the move steps to achieve the required command

class path {

int shape, lenght, width, lengthA, lengthB, lengthC, angleA, angleB, angleC;
int error, result;
ArrayList<moveInstruction> PathSteps = new ArrayList<moveInstruction>();

path(final String[] input){

//init all
//validate based on shape - if T also calculate angles and validate they can be real
//calculate the list of movement steps


}


private int validateInput(){
    // validates input based on shape required and lenghts
    // will set the error variable to 0 if all correct, or a set code if incorrect
    //if T and lenghts ok, calculate angles - function will return a value depending on whether angles can exist

}

private int triangleAngles(){
    //function returns a value dependent of whether angles can be correctly calclated based on side lenghts

}

private void claculate(){
    // calculates the list of steps in order to achieve the required steps

}

public void setResult(){
    //sets the result as reported during or after command execution

}


}





