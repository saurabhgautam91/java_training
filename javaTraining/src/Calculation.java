public class Calculation {

    public void addTwoNumbers(int val1, int val2) {

        int result = val1 + val2;
        System.out.println("Addition of numbers '" + val1 + "' + '" + val2 + "' is : '" + result+ "'");
    }

    public void addTwoNumbers(Float val1, Float val2) {

        Float result = val1 + val2;
       System.out.println("Addition of numbers '" + val1 + "' + '" + val2 + "' is : '" + result+ "'");
    }


    public void subtractTwoNumbers(int val1, int val2) {

        int result = val1 - val2;
        System.out.println("Subtraction of numbers '" + val1 + "' - '" + val2 + "' is : '" + result+ "'");

    }
    public void subtractTwoNumbers(Float val1, Float val2) {

        Float result = val1 - val2;
        System.out.println("Subtraction of numbers '" + val1 + "' - '" + val2 + "' is : '" + result+ "'");

    }


    public void multiplyTwoNumbers(int val1, int val2) {

        int result = val1 * val2;
        System.out.println("Multiplication of numbers '" + val1 + "' * '" + val2 + "' is : '" + result+ "'");

    }

    public void multiplyTwoNumbers(float val1, float val2) {

        float result = val1 * val2;
        System.out.println("Multiplication of numbers '" + val1 + "' * '" + val2 + "' is : '" + result+ "'");

    }

    public void divideTwoNumbers(int val1, int val2) {

        int result = val1 / val2;
        System.out.println("Division of numbers '" + val1 + "' / '" + val2 + "' is : '" + result+ "'");

    }

    public void divideTwoNumbers(float val1, float val2) {

        float result = val1 / val2;
        System.out.println("Division of numbers '" + val1 + "' / '" + val2 + "' is : '" + result+ "'");

    }

    public void squareOfNumber(int val1) {

        int result = val1 * val1;
        System.out.println("Square of number '" + val1 + "' is : '" + result+ "'");

    }

    public void squareOfNumber(Float val1) {

        Float result = val1 * val1;
        if(result.toString().contains("."))
        System.out.println("Square of number '" + val1 + "' is : '" + result+ "'");

    }

    public void cubeOfNumber(int val1) {

        int result = val1 * val1* val1 ;
        System.out.println("Cube of number '" + val1 + "' is : '" + result+ "'");

    }

    public void cubeOfNumber(float val1) {

        float result = val1 * val1* val1 ;
        System.out.println("Cube of number '" + val1 + "' is : '" + result+ "'");

    }

}
