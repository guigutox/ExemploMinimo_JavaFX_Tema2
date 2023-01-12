/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package exemplominimo_javafx_tema2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 *
 * @author guilh
 */
public class FXMLDocumentController implements Initializable {
    Hamburgueria h = new Hamburgueria();
    
    @FXML
    private Label label;
    
    @FXML
    private CheckBox chk_australiano;

    @FXML
    private CheckBox chk_bovino;

    @FXML
    private CheckBox chk_cheedar;

    @FXML
    private CheckBox chk_frango;

    @FXML
    private CheckBox chk_graos;

    @FXML
    private CheckBox chk_mussarela;
    @FXML
    private Label lbl_resultado;

    
    @FXML
    private void carneBovina(ActionEvent event) {
        
        if(chk_bovino.isSelected()==true){
            chk_frango.setSelected(false);
            h.setCarne("Bovina");
        }

    }
    
    @FXML   
     private void carneFrango(ActionEvent event) {
        if(chk_frango.isSelected()==true){
            chk_bovino.setSelected(false);
            h.setCarne("Frango");
        }
     
     }
     
    @FXML
   private void paoAustraliano(ActionEvent event) {

       if(chk_australiano.isSelected()==true){
           chk_graos.setSelected(false);
           h.setPao("Australiano");
           
       }

   }

   @FXML   
    private void paoGraos(ActionEvent event) {
       if(chk_graos.isSelected()==true){
           chk_australiano.setSelected(false);
            h.setPao("7 Graos");
            
       }
    }

        @FXML
   private void QueijoMussarela(ActionEvent event) {
       
       
       if(chk_mussarela.isSelected()==true && chk_cheedar.isSelected()==true){
           h.setQueijo("Mussarela e Cheedar");
       }else if(chk_mussarela.isSelected()==true){
           h.setQueijo("Mussarela"); 
       }
       

   }

   @FXML   
    private void QueijoCheedar(ActionEvent event) {
       if(chk_mussarela.isSelected()==true && chk_cheedar.isSelected()==true){
           h.setQueijo("Mussarela e Cheedar");
       }else if(chk_cheedar.isSelected()==true){
           h.setQueijo("Cheedar"); 
       }
    }
    
    @FXML
    private void Montar(ActionEvent event) {
        lbl_resultado.setText(h.montarLanche());
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
