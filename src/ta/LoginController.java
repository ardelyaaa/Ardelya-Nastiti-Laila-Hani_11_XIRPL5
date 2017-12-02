/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ardelya
 */
public class LoginController implements Initializable {

    @FXML
    private JFXTextField inuser;
    @FXML
    private Button logins;
    @FXML
    private JFXPasswordField pw;
    @FXML
    private Label ardelll;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void login(ActionEvent event) throws SQLException, IOException {
        Connection connection;
        PreparedStatement ps;
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gajian?", "root", "");
            ps = connection.prepareStatement("SELECT * FROM `login` where `user` = ? AND `password` = ? ");
            ps.setString(1, inuser.getText());
            ps.setString(2, pw.getText());
            ResultSet result = ps.executeQuery();
            if(result.next()){
                try{
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("gajian.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("");
                    stage.show();
                }catch(IOException e){
                    System.out.println("Failed to create new Window." + e);
                }
            }else{
                ardelll.setText("Salah");
                pw.setText("");
                inuser.requestFocus();
            }
        }catch (SQLException ex){
                    
                    }
    }
    }
    

