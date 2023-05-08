package PracticeFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    MyFrame cf ;
    public ActionHandler(MyFrame calculatorFrame) {
        this.cf = calculatorFrame;
    }

    public void actionPerformed(ActionEvent e) {


        int a = Integer.parseInt(cf.getOperend1Txt().getText());
        int b = Integer.parseInt(cf.getOperend2Txt().getText());
        int result;
        if(e.getActionCommand().equalsIgnoreCase("Add")) {

            result = a+b;
            cf.getAnswerLbl().setText("Answer = "+ result);

        }else if(e.getActionCommand().equalsIgnoreCase("Subtract")) {

            result = a-b;
            cf.getAnswerLbl().setText("Answer = "+ result);
        }
    }
}
