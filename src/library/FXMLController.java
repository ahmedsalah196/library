/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Yasmin
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
   
    
    @FXML
    private void handleSearchButtonAction(ActionEvent event) {
         try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Search.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
       
    }
    @FXML
     private void handleProfileButtonAction(ActionEvent event) {
          try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("USER_FXML.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
       
    }
     @FXML
      private void handleListButtonAction(ActionEvent event) {
<<<<<<< HEAD

=======
 try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BorrowerList_FXML.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
>>>>>>> baca893d3a892663fbba3f8af9e03f2108338a62
       
    }
      @FXML
       private void handleStockButtonAction(ActionEvent event) {
         try {
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Stock.fxml"));
=======
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Stockato.fxml"));
>>>>>>> baca893d3a892663fbba3f8af9e03f2108338a62
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}


