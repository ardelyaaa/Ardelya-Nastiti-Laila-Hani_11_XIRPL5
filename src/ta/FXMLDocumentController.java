/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ardelya
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label validasi;
    
    @FXML
    private Label deliaaa;
    
      @FXML
    private JFXTextField username;

    @FXML
    private JFXTextField lamakerja;

    @FXML
    private JFXTextField lembur;

    @FXML
    private JFXTextField harikerja;

    @FXML
    private Button submit;

    @FXML
    private Button hapus;

    @FXML
    private RadioButton manager;

    @FXML
    private RadioButton personalia;

    @FXML
    private RadioButton kabag;

    @FXML
    private RadioButton staff;

    @FXML
    private Button total;

    @FXML
    private JFXTextArea hayo;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

     @FXML
    void clear(ActionEvent event) {
            hayo.setText("");
            username.setText("");
            lamakerja.setText("");
            manager.setSelected(false);
            personalia.setSelected(false);
            kabag.setSelected(false);
            staff.setSelected(false);
            lembur.setText("");
            harikerja.setText("");
            validasi.setText("");
            deliaaa.setText("");
    }
    
     @FXML
    void submit(ActionEvent event) throws SQLException {
        String jabat = null;
        
        if (personalia.isSelected()){
             jabat = "3000000";
        }
        else if(kabag.isSelected()){
            jabat = "6000000";
        }else if(staff.isSelected()){
            jabat = "3000000";
        }else if(manager.isSelected()){
            jabat = "10000000";
        }
        if(username.getText().equals("")){
            validasi.setText("Masukkan Nama");
        }else 
        if(lamakerja.getText().equals("")){
            validasi.setText("Masukkan Lama Bekerja dalam Tahun");
        }else 
        if(harikerja.getText().equals("")){
            validasi.setText("Masukkan Jumlah Hari Kerja");
        }else 
        if(lembur.getText().equals("")){
            validasi.setText("Masukkan Jumlah Lembur");
        }else{
            String nama=String.valueOf(username.getText());
            String lamber=String.valueOf(lamakerja.getText());
            String jbtn=String.valueOf(jabat);
            String lmbr=String.valueOf(lembur.getText());
            String harja=String.valueOf(harikerja.getText());
        
            try{
                try(Statement statement = (Statement) koneksi.GetConnection().createStatement()){
                    statement.executeUpdate
                    ("INSERT INTO gajii values('"+nama+"','"+lamber+"','"+jbtn+"','"+lmbr+"','"+harja+"')");
                }
                deliaaa.setText("Data tersimpan");
                
            }catch (Exception ex){
                deliaaa.setText("Gagal tersimpan");
            }
    }
        
    }
    
     @FXML
    void total(ActionEvent event) {
int paket = 0;
int total = 0;

if (manager.isSelected())
    paket = 10000000;
else if (personalia.isSelected())
    paket = 3000000;
else if (kabag.isSelected())
    paket = 6000000;
else
    paket = 3000000;
    
    if(username.getText().equals("")){
            validasi.setText("Masukkan Nama");
        }else 
        if(lamakerja.getText().equals("")){
            validasi.setText("Masukkan Lama Bekerja dalam Tahun");
        }else 
        if(harikerja.getText().equals("")){
            validasi.setText("Masukkan Jumlah Hari Kerja");
        }else 
        if(lembur.getText().equals("")){
            validasi.setText("Masukkan Jumlah Lembur");
        }else{
            String name=String.valueOf(username.getText());
            String lamker=String.valueOf(lamakerja.getText());
            String lbr=String.valueOf(lembur.getText());
            String hkrj=String.valueOf(harikerja.getText());
        
            hayo.setText("Rincian Gaji"+"\n"+"Nama : "+name+
                    "\n"+"Lama Bekerja : "+lamker+"000"+"\n"+
                    "Jumlah Hari Kerja : "+hkrj+"000"+"\n"+"Jumlah Hari Lembur : "
                    +lbr+"000"+"\n"+"Untuk pengambilan gaji silahkan hubungi CEO");
            
            
    }
    
    }
      @FXML
    void logout(ActionEvent event) throws IOException {
            try{
                ((Node) (event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("masuk.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("");
              stage.show();
    }catch (IOException e){
    System.out.println("Failed to create new window" + e);
}}

    @FXML
    private void input(ActionEvent event) {
    }
    
}
