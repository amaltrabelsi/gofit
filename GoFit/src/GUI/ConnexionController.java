/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import entities.Utilisateur;
import services.ServiceUtilisateur;
import entities.Utilisateur;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import services.ServiceUtilisateur;
import utils.MyDB;

/**
 * FXML Controller class
 *
 * @author TRABELSI Amaal
 */
public class ConnexionController implements Initializable {

    Connection cnx;

    @FXML
    private TextField email;
    @FXML
    private TextField role;
    @FXML
    private Button connexion;
    @FXML
    private Hyperlink mdpoublié;
    @FXML
    private Hyperlink inscription;
    @FXML
    private PasswordField mdp;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockImageView;
    @FXML
    private Label invalid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
    }

    @FXML
        
    
    
    private void connexion(ActionEvent event) {
        if (email.getText().isEmpty() == false && mdp.getText().isEmpty() == false  && role.getText().isEmpty() == false)
        {
             cnx = MyDB.getInstance().getConnection();
             String r = role.getText() ;
             System.out.println(r);
             
             
         try {
         String req = "select * from utilisateur where Email = '" + email.getText()+ "' AND  mdp ='"+ mdp.getText()+ "' and Role = '"+ role.getText()+ "'" ; 
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req); 
             if (!rs.isBeforeFirst()){
                // System.out.println("Vérifiez vous paramétres s'il vous plaît !");
                 Alert alert = new Alert (Alert.AlertType.ERROR);
                 alert.setContentText("Vérifiez vous paramétres s'il vous plaît !");
                 alert.show();
             } else { 
                 switch (r) {
                     case "admin": 
                          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/admin.fxml"));
            Parent root = loader.load();
            connexion.getScene().setRoot(root);

        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }; break;
                     case "client": 
                 try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/Welcome.fxml"));
            Parent root = loader.load();
            connexion.getScene().setRoot(root);

        } catch (IOException ex) {
            Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
        }; break;
                      case "coach": 
                 try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/coach.fxml"));
            Parent root = loader.load();
            connexion.getScene().setRoot(root);

        } catch (IOException ex) {
            Logger.getLogger(CoachController.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
                      case "vendeur": 
                 try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/vendeur.fxml"));
            Parent root = loader.load();
            connexion.getScene().setRoot(root);

        } catch (IOException ex) {
            Logger.getLogger(VendeurController.class.getName()).log(Level.SEVERE, null, ex);
        }
                         
                         
                 }
                
                
           
            }
           
             
             
         } catch (Exception e) {
             e.printStackTrace();
             e.getCause();
             
         }
   

        } else {
             Alert alert = new Alert (Alert.AlertType.ERROR);
                 alert.setContentText("Remplir vos coordonées s'il vous plaît ");
                 alert.show();
            //invalid.setText("Remplir vos coordonées s'il vous plaît ");
        }
       
    }

    @FXML
    private void mdpoublié(ActionEvent event) {
        
    }
   
    
}
