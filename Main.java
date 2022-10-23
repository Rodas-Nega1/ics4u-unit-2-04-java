/*
* This program uses the RodasStack
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-10-22
*/

import java.util.Scanner;
/**
* Class Main.
*/

final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        try {
            final Scanner myObj = new Scanner(System.in);
            final RodasStack newStack = new RodasStack();
            final int peekOption = -2;
            final int clearOption = -3;

            while (true) {

                System.out.print("Enter an integer: ");
                final int userNumber = myObj.nextInt();

                if (userNumber == -1) {
                    newStack.stackArray();
                    System.out.println(newStack.popClass());
                    newStack.stackArray();
                    break;
                } else if (userNumber == peekOption) {
                    newStack.stackArray();
                    newStack.peekClass();
                    newStack.stackArray();
                    break;
                } else if (userNumber == clearOption) {
                    newStack.stackArray();
                    newStack.clearClass();
                    newStack.stackArray();
                } else {
                    newStack.pushClass(userNumber);
                }
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nThat is an invalid input.");
        }
        System.out.println("\nDone.");
    }
}
