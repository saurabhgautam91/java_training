import java.io.IOException;

public class Menu {

    /*
      public Float show()
      will show a menu and accept the choice
       1. Add
       2. Subtract
       3. Multiply
       4. Divide
       // Please enter your choice
       */

    public void show() throws IOException {
        Calculation cal = new Calculation();

        StringBuilder options = new StringBuilder();
        options.append(" Please choose an option from the Menu \n");
        options.append("1. Add \n");
        options.append("2. Subtract \n");
        options.append("3. Multiply \n");
        options.append("4. Divide \n");
        options.append("5. Square \n");
        options.append("6. Cube ");

        System.out.println(options);
        String userInput = BasicInput.readString();

        System.out.println("You have entered = " + userInput);

        if (userInput.toLowerCase().contains("add")) {
            System.out.println(" Please enter first number and press enter key ");
            Float num1 = BasicInput.readFloat();
            System.out.println(" Please enter second number and press enter key ");
            Float num2 = BasicInput.readFloat();

            cal.addTwoNumbers(num1, num2);

        } else if (userInput.toLowerCase().contains("subtract")) {
            System.out.println(" Please enter first number and press enter key ");
            Float num1 = BasicInput.readFloat();
            System.out.println(" Please enter second number and press enter  key ");
            Float num2 = BasicInput.readFloat();

            cal.subtractTwoNumbers(num1, num2);
        } else if (userInput.toLowerCase().contains("multiply")) {
            System.out.println(" Please enter first number and press enter  key ");
            Float num1 = BasicInput.readFloat();
            System.out.println(" Please enter second number and press enter key ");
            Float num2 = BasicInput.readFloat();

            cal.multiplyTwoNumbers(num1, num2);
        } else if (userInput.toLowerCase().contains("divide")) {
            System.out.println(" Please enter first number and press enter key ");
            Float num1 = BasicInput.readFloat();
            System.out.println(" Please enter second number and press enter key ");
            Float num2 = BasicInput.readFloat();

            cal.divideTwoNumbers(num1, num2);
        } else if (userInput.toLowerCase().contains("square")) {
            System.out.println(" Please enter a number and press enter key ");
            Float num1 = BasicInput.readFloat();

            cal.squareOfNumber(num1);
        } else if (userInput.toLowerCase().contains("cube")) {
            System.out.println(" Please enter a number and press enter key ");
            Float num1 = BasicInput.readFloat();

            cal.cubeOfNumber(num1);
        } else {
            System.out.println("What you entered is not in the Menu. Please correct and try again! ");
        }


    }
}