//Imports
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.web.*;
import com.sun.deploy.uitoolkit.impl.fx.HostServicesFactory;
import com.sun.javafx.application.HostServicesDelegate;



public class ReadyPlayerOne extends Application {

public static void main(String[] args) {

        launch(args);
}



@Override
public void start  (Stage primaryStage)   {
        //Declaring wigets
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        Label l1 = new Label();
        Label nameLabel = new Label();
        Label pwLabel = new Label();
        TextField tf = new TextField();
        PasswordField passWord= new PasswordField();



        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

// seet test of the weigets
        nameLabel.setText("Name");
        pwLabel.setText("Password");
        btn.setText("Submit");


// Button clicked will open website if both the user name and pass wordis corrrect
        btn.setOnAction(new EventHandler<ActionEvent>() {

                        /*

                           Ready Player 1 !
                           Infromation  the eyes of the the Chief Oddoligist

                         */
                        @Override
                        public void handle  (ActionEvent event) {
                                String pw = <PASSWORD>;
                                String name=<USER NANE>;
                                System.out.println(""+btn.getText());

                                String userName =tf.getText();
                                String userPw = passWord.getText();

                                if(userPw.equals(pw) && userName.equals(name)) {

                                        l1.setText("Access gramted :"+userName);


                                        getHostServices().showDocument("http://www.jointhequest.io");







                                }

                                else{
                                        l1.setText("Access Denied!\nIOI Security has been notified!");

                                }
                        }
                });





        // add wigets to the Grid Pane
        grid.add(nameLabel, 0, 0);
        grid.add(tf, 0, 1);
        grid.add(pwLabel, 0, 2);
        grid.add(passWord, 0, 3);
        grid.add(btn, 0, 4);
        grid.add(l1, 0, 5);



        primaryStage.setScene( new Scene ( grid, 300,250));

        primaryStage.show();

}// end main

}// end class
