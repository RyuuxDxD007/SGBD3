package org.example.sgbd3;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;


import java.io.IOException;

public class Calculator extends Application {

    private static String message = "Bonjour";
    private static boolean first = true;
    private static Text messageDisplay = new Text(message);
    private static double num1;
    private static double num2;
    private static char action;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Un titre");
        setScene(stage);
        stage.show();
    }

    static void setScene(Stage stage) {
        Scene scene = new Scene(Calculator.getContainer());
        stage.setScene(scene);
    }

    static Parent getContainer() {
        VBox vBox = new VBox();
        vBox.getChildren().addAll(
                messageDisplay,
                Calculator.button0(),
                Calculator.button1(),
                Calculator.button2(),
                Calculator.button3(),
                Calculator.button4(),
                Calculator.button5(),
                Calculator.button6(),
                Calculator.button7(),
                Calculator.button8(),
                Calculator.button9(),
                Calculator.buttonMultiplication(),
                Calculator.buttonDivision(),
                Calculator.buttonAddition(),
                Calculator.buttonSubtraction(),
                Calculator.buttonDot(),
                Calculator.buttonEnter(),
                Calculator.buttonDelete()
        );
        return vBox;
    }

    static Button button0() {
        Button button = new Button("0");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '0';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button1() {
        Button button = new Button("1");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '1';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button2() {
        Button button = new Button("2");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '2';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button3() {
        Button button = new Button("3");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '3';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button4() {
        Button button = new Button("4");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '4';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button5() {
        Button button = new Button("5");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '5';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button6() {
        Button button = new Button("6");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '6';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button7() {
        Button button = new Button("7");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '7';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button8() {
        Button button = new Button("8");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '8';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button button9() {
        Button button = new Button("9");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '9';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button buttonMultiplication() {
        Button button = new Button("X");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="Erreur";
                }
                else {
                    num1 = Double.parseDouble(message);
                    action = 'x';
                    message = message + " X ";
                    messageDisplay.setText(message);
                    first=true;
                }
            }
        });
        return button;
    }
    static Button buttonDivision() {
        Button button = new Button("/");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="Erreur";
                }
                else {
                    num1 = Double.parseDouble(message);
                    action = 'd';
                    message = message + " / ";
                    messageDisplay.setText(message);
                    first=true;
                }
            }
        });
        return button;
    }
    static Button buttonAddition() {
        Button button = new Button("+");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="Erreur";
                }
                else {
                    num1 = Double.parseDouble(message);
                    action = 'a';
                    message = message + " + ";
                    messageDisplay.setText(message);
                    first=true;
                }
            }
        });
        return button;
    }
    static Button buttonSubtraction() {
        Button button = new Button("-");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="Erreur";
                }
                else {
                    num1 = Double.parseDouble(message);
                    action = 's';
                    message = message + " - ";
                    messageDisplay.setText(message);
                    first=true;
                }
            }
        });
        return button;
    }
    static Button buttonDot() {
        Button button = new Button(".");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(first){
                    message="";
                    first=false;
                }
                message = message + '.';
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    static Button buttonEnter() {
        Button button = new Button("Enter (=)");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                num2 = Double.parseDouble(message);
                computeAnswer();
                messageDisplay.setText(message);
                first=true;
            }
        });
        return button;
    }
    static Button buttonDelete() {
        Button button = new Button("Delete");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(message.length()==1){
                    first=true;
                }
                message = message.substring(0, message.length()-1);
                messageDisplay.setText(message);
            }
        });
        return button;
    }
    private static void computeAnswer(){
        switch(action){
            case 'x': {
                message = Double.toString((num1*num2));
                break;
            }
            case 'd': {
                message = Double.toString((num1/num2));
                break;
            }
            case 'a': {
                message = Double.toString((num1+num2));
                break;
            }
            case 's': {
                message = Double.toString((num1-num2));
                break;
            }
        }

    }

    public static void main(String[] args) {
        launch();
    }



}
