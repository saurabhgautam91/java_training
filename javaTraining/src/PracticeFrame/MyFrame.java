package PracticeFrame;

import java.awt.*;
import java.awt.event.WindowAdapter;

public class MyFrame extends Frame {

    private TextField operend1Txt;
    private TextField operend2Txt;
    private Label answerLbl;

    public MyFrame(String title,boolean visible,int x, int y,int width, int height){
        this.setVisible(visible);
        this.setTitle(title);
        this.setBounds(x,y,width,height);

        this.setLayout(null);

        answerLbl = new Label();
        answerLbl.setBounds(20,80,150,20);
        add(answerLbl);


        Label operend1Lbl = new Label("Number 1");
        operend1Lbl.setBounds(20,40,100,20);
        add(operend1Lbl);

        operend1Txt = new TextField();
        operend1Txt.setBounds(140,40,80,20);
        add(operend1Txt);


        Label operend2Lbl = new Label("Number 2");
        operend2Lbl.setBounds(240,40,100,20);
        add(operend2Lbl);

        operend2Txt = new TextField();
        operend2Txt.setBounds(360,40,80,20);
        add(operend2Txt);

        Button addButton = new Button("Add");
        addButton.setBounds(20,120,80,30);
        add(addButton);
        addButton.addActionListener(new ActionHandler(this));



        Button subtractButton = new Button("Subtract");
        subtractButton.setBounds(120,120,80,30);
        add(subtractButton);
        subtractButton.addActionListener(new ActionHandler(this));

        this.addWindowListener(new WindowAdapter() {
        });

    }

    public void setOperend1Txt(TextField operend1Txt){
        this.operend1Txt = operend1Txt;
    }
    public TextField getOperend1Txt( ){
        return this.operend1Txt  ;
    }

    public void setOperend2Txt(TextField operend2Txt){
        this.operend2Txt = operend2Txt;
    }
    public TextField getOperend2Txt( ){
        return this.operend2Txt  ;
    }

    public void setAnswerLbl(Label answerLbl){
        this.answerLbl = answerLbl;
    }
    public Label getAnswerLbl( ){
        return this.answerLbl  ;
    }
}
