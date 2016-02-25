import java.util.Scanner;
import static java.lang.Math.*;
public class AdvCalculator {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      String runLower = "yes";
      //Calculator runs w/in in while loop
      while(runLower.equals("yes")) {
         //User chooses operation
         System.out.println("Please enter the corresponding number for your chosen operation:");
         System.out.println("1. Add | 2. Subtract | 3. Multiply | 4. Divide | 0. More Operations");
         int operation = input.nextInt();
         while(operation < 0 || operation > 5) {
            System.out.println("Please enter a valid operation:");
            System.out.println("1. Add | 2. Subtract | 3. Multiply | 4. Divide | 0. More Operations");
            operation = input.nextInt();
         }
         int trigOp = 0;
         if(operation == 0) {
            System.out.println("5. Exponential Expression | 6. Logarithm | 7. Root | 8. Trig. Functions");
            operation = input.nextInt();
            if(operation == 8) {
               System.out.println("Which trig. function do you wish to use?");
               System.out.println("1. Sine | 2. Cosine | 3. Tangent | 4. Cosecant | 5. Secant | 6. Cotangent");
               trigOp = input.nextInt();
               while(trigOp < 1 || trigOp > 6) {
                  System.out.println("Please enter a valid function:");
                  System.out.println("1. Sine | 2. Cosine | 3. Tangent | 4. Cosecant | 5. Secant | 6. Cotangent");
                  trigOp = input.nextInt();
               }
            }
            while(operation < 5 || operation > 8) {
               System.out.println("Please enter a valid operation:");
               System.out.println("5. Exponential Expression | 6. Natural Logarithm | 7. Root");
               operation = input.nextInt();
            }
         }
         //User enters arguments for basic operations
         double num1 = 0;
         double num2 = 0;
         if(operation >= 1 && operation <=4) {
            System.out.println("Please enter the two numbers.");
            System.out.println("First number:");
            num1 = input.nextDouble();
            System.out.println("Second number:");
            num2 = input.nextDouble();
         }
         //Calculations
         switch(operation) {
            case 1:
               //Addition
               double sum = num1 + num2;
               System.out.println("Sum: " + sum);
               break;
            case 2:
               //Subtraction
               double dif = num1 - num2;
               System.out.println("Difference: " + dif);
               break;
            case 3:
               //Multiplication
               double pro = num1 * num2;
               System.out.println("Product: " + pro);
               break;
            case 4:
               //Division
               while(num2 == 0) {
                  System.out.println("Please enter a non-zero number for the divisor:");
                  num2 = input.nextDouble();
               }
               double quo = num1 / num2;
               System.out.println("Quotient: " + quo);
               break;
            case 5:
               //Exponential expression
               System.out.println("Please enter your inital number and the power to which you want to raise it.");
               System.out.println("Inital number:");
               double expNum1 = input.nextDouble();
               System.out.println("Exponent:");
               double expNum2 = input.nextDouble();
               double expSolution = pow(expNum1, expNum2);
               System.out.println("Result: " + expSolution);
               break;
            case 6:
               //Logarithm
               System.out.println("Would you like to determine the natural logarithm or the base 10 logarithm?");
               System.out.println("1. Natural Logarithm | 2. Base 10 Logarithm");
               int logOp = input.nextInt();
               while(logOp < 1 || logOp > 2) {
                  System.out.println("Please enter the number for a valid operation:");
                  System.out.println("1. Natural Logarithm | 2. Base 10 Logarithm");
                  logOp = input.nextInt();
               }
               System.out.println("Please enter the input of the logarithm:");
               double logArg = input.nextDouble();
               while(logArg <= 0) {
                  System.out.println("Please enter a non-zero, non-negative number:");
                  logArg = input.nextDouble();
               }
               double logSolution = 0;
               if(logOp == 1) {
                  logSolution = log(logArg);
               } else {
                  logSolution = log10(logArg);
               }
               System.out.println("Result: " + logSolution);
               break;
            case 7:
               //Root expression
               System.out.println("Please enter the input and degree of the root expression:");
               System.out.println("Input:");
               double rootArg = input.nextDouble();
               while(rootArg < 0) {
                  System.out.println("Please enter a non-negative number:");
                  rootArg = input.nextDouble();
               }
               System.out.println("Degree:");
               double rootDegree = 1 / input.nextDouble();
               System.out.println("Result: " + pow(rootArg, rootDegree));
               break;
            case 8:
               //Trig. functions
               switch(trigOp) {
                  case 1:
                     //Sine
                     System.out.println("Please enter the input of the sine function:");
                     double sinArg = input.nextDouble();
                     System.out.println("Result " + sin(sinArg));
                     break;
                  case 2:
                     //Cosine
                     System.out.println("Please enter the input of the cosine function:");
                     double cosArg = input.nextDouble();
                     System.out.println("Result " + cos(cosArg));
                     break;
                  case 3:
                     //Tangent
                     System.out.println("Please enter the input of the tangent function:");
                     double tanArg = input.nextDouble();
                     System.out.println("Result " + tan(tanArg));
                     break;
                  case 4:
                     //Cosecant
                     System.out.println("Please enter the input of the cosecant function:");
                     double cscArg = input.nextDouble();
                     System.out.println("Result " + asin(cscArg));
                     break;
                  case 5:
                     //Secant
                     System.out.println("Please enter the input of the secant function:");
                     double secArg = input.nextDouble();
                     System.out.println("Result " + acos(secArg));
                     break;
                  case 6:
                     //Cotangent
                     System.out.println("Please enter the input of the cotangent function:");
                     double cotArg = input.nextDouble();
                     System.out.println("Result " + atan(cotArg));
                     break;
               }
          }
          System.out.println("Would you like to do another calculation? (Yes or no)");
          String run = input.next();
          runLower = run.toLowerCase();
      }
   }
}