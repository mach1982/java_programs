/*
   Author:Ailin Mac Hugh
   Date:29/01/2018
   Version: 1.0

   JavaFX implemention of a desktop Calculator


 */



//Imports
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.web.*;
import java.lang.*;



public class myCalcFx extends Application {


public static void main(String[] args) {

        launch(args);
}//end main


/*

   Strt method


 */

@Override
public void start  (Stage primaryStage)   {

        //Declaring the primaryStage
        primaryStage.setTitle("Calculator!");

        //Declaring  the TextField object
        TextField input = new TextField();

        //Declaring the  buttons
        Button btnOne = new Button("1");
        Button btnTwo = new Button("2");
        Button btnThree = new Button("3");
        Button btnFour= new Button("4");
        Button btnFive = new Button("5");
        Button btnSix = new Button("6");
        Button btnSeven = new Button("7");
        Button btnEight= new Button("8");
        Button btnNine = new Button("9");
        Button btnZero = new Button("0");

        Button btnDecPoint = new Button(".");
        Button btnEquals = new Button("=");

        Button btnAdd = new Button("+");
        Button btnSub= new Button("-");
        Button btnMul = new Button("x");
        Button btnDiv = new Button("/");
        Button btnPrecent = new Button("%");
        Button btnSqrt = new Button("\u221A");
        Button btnSqur = new Button("x\u00B2");

        Button btnCE = new Button("CE");



        //adding the Pane and GridPane Objects
        Pane mainPane = new Pane();
        GridPane grid = new GridPane();

        //setting up the sacping fro the buttons
        grid.setHgap(10);
        grid.setVgap(20);

        //setting up the textfile
        input.setMaxWidth(250);
        input.setMinWidth(250);
        input.setPrefWidth(250);

        //sett the lay of the TextField
        input.layoutXProperty().bind(mainPane.widthProperty().subtract(input.widthProperty()).divide(2));

        // setting up the widgets
        btnOne.setMinWidth(50.0);
        btnOne.setMaxWidth(50.0);
        btnOne.setPrefWidth(50.0);

        btnTwo.setMaxWidth(50.0);
        btnTwo.setMinWidth(50.0);
        btnTwo.setPrefWidth(50.0);

        btnThree.setMaxWidth(50.0);
        btnThree.setMinWidth(50.0);
        btnThree.setPrefWidth(50.0);

        btnFour.setMaxWidth(50.0);
        btnFour.setMinWidth(50.0);
        btnFour.setPrefWidth(50.0);

        btnFive.setMaxWidth(50.0);
        btnFive.setMinWidth(50.0);
        btnFive.setPrefWidth(50.0);

        btnSix.setMaxWidth(50.0);
        btnSix.setMinWidth(50.0);
        btnSix.setPrefWidth(50.0);

        btnSeven.setMaxWidth(50.0);
        btnSeven.setMinWidth(50.0);
        btnSeven.setPrefWidth(50.0);

        btnEight.setMaxWidth(50.0);
        btnEight.setMinWidth(50.0);
        btnEight.setPrefWidth(50.0);

        btnNine.setMaxWidth(50.0);
        btnNine.setMinWidth(50.0);
        btnNine.setPrefWidth(50.0);

        btnZero.setMaxWidth(50.0);
        btnZero.setMinWidth(50.0);
        btnZero.setPrefWidth(50.0);

        btnDecPoint.setMaxWidth(50.0);
        btnDecPoint.setMinWidth(50.0);
        btnDecPoint.setPrefWidth(50.0);

        btnEquals.setMaxWidth(50.0);
        btnEquals.setMinWidth(50.0);
        btnEquals.setPrefWidth(50.0);

        btnAdd.setMaxWidth(50.0);
        btnAdd.setMinWidth(50.0);
        btnAdd.setPrefWidth(50.0);

        btnSub.setMaxWidth(50.0);
        btnSub.setMinWidth(50.0);
        btnSub.setPrefWidth(50.0);

        btnMul.setMaxWidth(50.0);
        btnMul.setMinWidth(50.0);
        btnMul.setPrefWidth(50.0);

        btnDiv.setMaxWidth(50.0);
        btnDiv.setMinWidth(50.0);
        btnDiv.setPrefWidth(50.0);

        btnPrecent.setMaxWidth(50.0);
        btnPrecent.setMinWidth(50.0);
        btnPrecent.setPrefWidth(50.0);

        btnCE.setMaxWidth(50.0);
        btnCE.setMinWidth(50.0);
        btnCE.setPrefWidth(50.0);

        btnSqrt.setMaxWidth(50.0);
        btnSqrt.setMinWidth(50.0);
        btnSqrt.setPrefWidth(50.0);

        btnSqur.setMaxWidth(50.0);
        btnSqur.setMinWidth(50.0);
        btnSqur.setPrefWidth(50.0);






        //adding the TextField to the mainPane
        mainPane.getChildren().add(input);

        //adding the grid to the mainPane
        mainPane.getChildren().add(grid);

        // add button  to the Grid Pane

        grid.add(btnOne, 1, 3);
        grid.add(btnTwo, 2, 3);
        grid.add(btnThree, 3, 3);
        grid.add(btnFour, 1, 4);
        grid.add(btnFive, 2, 4);
        grid.add(btnSix, 3, 4);
        grid.add(btnSeven, 1, 5);
        grid.add(btnEight, 2, 5);
        grid.add(btnNine,3, 5);
        grid.add(btnZero, 2, 6);
        grid.add(btnDecPoint, 1, 6);
        grid.add(btnEquals, 3, 6);

        grid.add(btnAdd, 4, 3);
        grid.add(btnSub, 4, 4);
        grid.add(btnMul, 4, 5);
        grid.add(btnDiv, 4, 6);

        grid.add(btnSqur,5,4);
        grid.add(btnSqrt,5,5);

        grid.add(btnCE,5,3);
        grid.add(btnPrecent,5,6);



        //using myMath class
        myMath m = new myMath();






// making the buttons clickable
        btnOne.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event1) {
                                //setting the value to the TextField vauke of the buttons
                                input.appendText(btnOne.getText());

                        }// edn event
                });// end On action

        btnTwo.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event2) {

                                input.appendText(btnTwo.getText());

                        }        // end event
                });        // end On action

        btnThree.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event3) {

                                input.appendText(btnThree.getText());

                        }                // end event
                });                // end On action

        btnFour.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event4) {

                                input.appendText(btnFour.getText());

                        }                        // end event
                });                        // end On action


        btnFive.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event5) {

                                input.appendText(btnFive.getText());

                        }                                // end event
                });

        btnSix.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event6) {

                                input.appendText(btnSix.getText());

                        }                                        // end event
                });


        btnSeven.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event7) {

                                input.appendText(btnSeven.getText());

                        }                        // end event
                });

        btnEight.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event8) {

                                input.appendText(btnEight.getText());

                        }                                // end event
                });


        btnNine.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event9) {

                                input.appendText(btnNine.getText());

                        }                                        // end event
                });


        btnZero.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event0) {

                                input.appendText(btnZero.getText());

                        }
                });

        btnDecPoint.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventD) {

                                input.appendText(btnDecPoint.getText());

                        }
                });


        btnCE.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle  (ActionEvent event0) {

                                input.clear();

                        }
                });



        /*
           Arithmetic methods
           when the buttom is clicked the value of the the TextField input is passed to the x variable of the MyMath class.
           Also the  the text of the button is massted to the operator variable in MyMath.

         */

        //Addation
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventA) {


                                m.setX(Double.parseDouble(input.getText()));
                                m.setOperator(btnAdd.getText());
                                input.clear();





                        }
                });

//Subtractions
        btnSub.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventS) {

                                m.setX(Double.parseDouble(input.getText()));
                                m.setOperator(btnSub.getText());
                                input.clear();






                        }
                });
        //multiplication
        btnMul.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventM) {

                                m.setX(Double.parseDouble(input.getText()));
                                m.setOperator(btnMul.getText());
                                input.clear();




                        }
                });

        //DivisonMulitplication
        btnDiv.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventDi) {

                                m.setX(Double.parseDouble(input.getText()));
                                m.setOperator(btnDiv.getText());
                                input.clear();




                        }
                });

        // convert a precentage  number in to decimal
        btnPrecent.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventP) {
                                double precent = Double.parseDouble(input.getText());
                                input.clear();
                                double dec= precent/100;
                                input.appendText(Double.toString(dec));


                        }
                });


        // Useres java.lang Macth class to work the squre root
        btnSqrt.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventSqrt) {
                                double x = Double.parseDouble(input.getText());
                                input.clear();
                                double sr =Math.sqrt(x);



                                input.appendText(Double.toString(sr));

                        }
                });

        // Squares the number enter into the TextField
        btnSqur.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventDi) {

                                m.setX(Double.parseDouble(input.getText()));

                                input.clear();
                                input.appendText(Double.toString(m.squr()));




                        }
                });

        /*
           method: btnEquals
           Set thge Y variable and call the arithmectic methods from the myMath class

         */

        btnEquals.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle (ActionEvent eventEq) {

                                m.setY(Double.parseDouble(input.getText()));
                                input.clear();

                                //System.out.println(m.getOperator);
                                if(m.getOperator().equals(btnAdd.getText())) {
                                        input.appendText(Double.toString(m.add()));
                                }
                                else if (m.getOperator().equals(btnSub.getText())) {
                                        input.appendText(Double.toString(m.sub()));
                                }

                                else if (m.getOperator().equals(btnMul.getText())) {
                                        input.appendText(Double.toString(m.mul()));
                                }

                                else if (m.getOperator().equals(btnDiv.getText())) {
                                        input.appendText(Double.toString(m.div()));
                                }





                        }


                });





        //setting up the primary satage
        primaryStage.setScene( new Scene ( mainPane, 300,250));
        //set so that it can not be resized
        primaryStage.setResizable(false);

        primaryStage.show();

}// end main

}// end class
