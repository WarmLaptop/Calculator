//The following import statement brings the Scanner class from the library.
import java.util.Scanner;
/**
 * Created by Jordan on 5/29/2017.
 */
public class Calculator {
//Main Method for Calculator.
    public static void main(String[] args) {

//Assign String statement "Quit" to String variable KILL which is used to terminate the program.
        String KILL = "Quit";
//Assign String used to receive user input.
        String Operation;
// This do block will loop infinitely until the user inputs "Quit" at any input instance.
        do{
//The system outputs the command expression so that user knows that an input is needed.
            System.out.println("Enter an arithmetic operation of choice:\nAddition\nSubtraction\nMultiplication\nDivision\nExponentiation\nFactorial");
            Scanner keyboard = new Scanner(System.in);
            Operation = keyboard.nextLine();
//This if block will end do loop when user inputs "Quit".
            if (Operation.equals(KILL)) break;

// So far, the program acknowledge what operation the user wants to perform by scanning the input.
// Now, the program determines what switch case the operation input String will dictate and will require additional integer inputs depending on the operation.
            switch(Operation){
                case "Addition":
// The program now asks two numbers to be added. Note that there is a 'kill switch' for every input instance.
                    System.out.println("Enter the first number:");
    //The first number is stored in Number1Addition
                    Scanner keyboard1Addition = new Scanner(System.in);
                    String Number1Addition = keyboard1Addition.nextLine();
                    if (Number1Addition.equals(KILL)) break;

                    System.out.println("Enter the second number:");
    //The second number is stored in Number2Addition.
                    Scanner keyboard2Addition = new Scanner(System.in);
                    String Number2Addition = keyboard2Addition.nextLine();
                    if (Number2Addition.equals(KILL)) break;
// The String input is now parsed into integer and added.
                    int ResultAddition = Integer.parseInt(Number1Addition) + Integer.parseInt(Number2Addition);
                    System.out.println("The answer for addition is " + ResultAddition+"\n");
                    break;
//The break now breaks open from the switch block and falls back into the do infinite loop. Other cases follow the same structure.

                case "Subtraction":
                    System.out.println("Enter the first number:");
                    Scanner keyboard1Subtraction = new Scanner(System.in);
                    String Number1Subtraction = keyboard1Subtraction.nextLine();
                    if (Number1Subtraction.equals(KILL)) break;

                    System.out.println("Enter the second number:");
                    Scanner keyboard2Subtraction = new Scanner(System.in);
                    String Number2Subtraction = keyboard2Subtraction.nextLine();
                    if (Number2Subtraction.equals(KILL)) break;

                    int ResultSubtraction = Integer.parseInt(Number1Subtraction) - Integer.parseInt(Number2Subtraction);
                    System.out.println("The answer for subtraction is " + ResultSubtraction+"\n");
                    break;

                case "Multiplication":
                    System.out.println("Enter the first number:");
                    Scanner keyboard1Mult = new Scanner(System.in);
                    String Number1Mult = keyboard1Mult.nextLine();
                    if (Number1Mult.equals(KILL)) break;

                    System.out.println("Enter the second number:");
                    Scanner keyboard2Mult = new Scanner(System.in);
                    String Number2Mult = keyboard2Mult.nextLine();
                    if (Number2Mult.equals(KILL)) break;

                    int ResultMult = Integer.parseInt(Number1Mult) * Integer.parseInt(Number2Mult);
                    System.out.println("The answer for multiplication is " + ResultMult+"\n");
                    break;

                case "Division":
                    System.out.println("Enter the first number:");
                    Scanner keyboard1Div = new Scanner(System.in);
                    String Number1Div = keyboard1Div.nextLine();
                    if (Number1Div.equals(KILL)) break;

                    System.out.println("Enter the second number:");
                    Scanner keyboard2Div = new Scanner(System.in);
                    String Number2Div = keyboard2Div.nextLine();
                    if (Number2Div.equals(KILL)) break;

                    double ResultDiv = (double)Integer.parseInt(Number1Div) / Integer.parseInt(Number2Div);
                    System.out.println("The answer for division is " + ResultDiv+"\n");
                    break;

                case "Exponentiation":
                    System.out.println("Enter the first number:");
                    Scanner keyboard1Exp = new Scanner(System.in);
                    String Number1Exp = keyboard1Exp.nextLine();
                    if (Number1Exp.equals(KILL)) break;

                    System.out.println("Enter the second number:");
                    Scanner keyboard2Exp = new Scanner(System.in);
                    String Number2Exp = keyboard2Exp.nextLine();
                    if (Number1Exp.equals(KILL)) break;

                    double ResultExp =Math.pow(Integer.parseInt(Number1Exp), Integer.parseInt(Number2Exp));
                    System.out.println("The answer for exponentiation is " + ResultExp+"\n");
                    break;
//Special Case: Factorial does not require a second number.
                case "Factorial":
                    System.out.println("Enter the factorial number:");
                    Scanner keyboardFact = new Scanner(System.in);
                    String NumberFact = keyboardFact.nextLine();
                    if (NumberFact.equals(KILL)) break;
                    int ResultFact=1;
//The for loop define the factorial value of the input NumberFact.
//num++ statement will occur until num>Integer.parseInt(NumberFact), where that case ends the loop.
                    for (int num = 1; num <= Integer.parseInt(NumberFact); num++) {
                        ResultFact *= num;
                    }
                    System.out.println(ResultFact + " is the factorial of " + Integer.parseInt(NumberFact)+"\n");
                    break;
//When the user strays from the Operation String input required for the switch block to run, it returns to the default and breaks the switch right away.
                default:
                    System.out.println("The operation is invalid. Please use one of the following operations, case sensitive:\nAddition\nSubtraction\nMultiplication\nDivision\nExponentiation\nFactorial\nQuit to end program at any point.\n");
                    break;
            }
//Infinite loop:
        } while (true);

    System.out.println("Thanks for using the calculator!");
    }

}


