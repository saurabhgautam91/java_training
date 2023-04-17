// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b= 20;

        Calculation cal = new Calculation();

        cal.addTwoNumbers(a,b);
        cal.subtractTwoNumbers(a,b);
        cal.divideTwoNumbers(a,b);
        cal.multiplyTwoNumbers(a,b);
        cal.squareOfNumber(a);
        cal.cubeOfNumber(a);

    }
}