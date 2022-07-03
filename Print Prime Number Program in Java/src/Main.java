import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner (System.in);
        System.out.print("PLEASE add any number: ");
		while(!UserInput.hasNextInt()) {
            UserInput.next();

            System.out.print("PLEASE add any number: ");
            System.err.println("You Entered INVALID input");

		}

            int result,Num = UserInput.nextInt(); //convert UserInput object to int
           boolean isPrime = true; // to save the result
            
           for (int i=2;i<= Num;i++) {
        	   result=Num%i;
        	   if(result == 0) {
        		   isPrime=false;
                   System.out.println("The "+Num+" is Not a prime number");
                   System.out.println("It is divisible by "+i);
                   break;
               }
           }
           if(isPrime ==true) {
               System.out.println("The "+Num+" is a prime number");

           }
           System.out.println("THANK YOU");

        UserInput.close();
	}

}
