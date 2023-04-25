import Util.MyDate;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();

        //menu.show();
        MyDate dateUtil = new MyDate(-10,2,2024);
        System.out.println(dateUtil);

    }
}