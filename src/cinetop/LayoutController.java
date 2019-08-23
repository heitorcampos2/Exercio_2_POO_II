/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author HeiThor
 */
public class LayoutController implements Initializable {
    
    private Label label;
    @FXML
    private CheckBox checkAcao;
    @FXML
    private CheckBox checkTerror;
    @FXML
    private CheckBox checkRomance;
    @FXML
    private CheckBox checkComedia;
    @FXML
    private RadioButton RadioJumangi;
    @FXML
    private ToggleGroup RadioButtonsVerAgora;
    @FXML
    private RadioButton RadioTitanic;
    @FXML
    private RadioButton RadioNenhum;
    @FXML
    private Label Respostas;
    @FXML
    private TextArea textArea;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PegarInformacoes(ActionEvent event) {
        String n = " ";
        String e = " ";
        if(checkAcao.isSelected()){
            //getText retorna o text do checkbox
            n += checkAcao.getText()+e;
        }
        
        if(checkTerror.isSelected()){
            n += checkTerror.getText()+e;
        }
        
        if(checkRomance.isSelected()){
            n += checkRomance.getText()+e;
        }
        
        if(checkComedia.isSelected()){
            n += checkComedia.getText()+e;
        }
        
        //=====================================================
        String m = " ";
        //para verificar se um rádio button está selecionado utili-za-se metodo isSlected
        if(RadioJumangi.isSelected()){
            //getText() tmb retorna o texto do radio
            m =RadioJumangi.getText();
        }
        
        if(RadioTitanic.isSelected()){
            //getText() tmb retorna o texto do radio
            m = RadioTitanic.getText();
        }
        
        if(RadioNenhum.isSelected()){
            //getText() tmb retorna o texto do radio
            m = RadioNenhum.getText();
        }
        //=======================================================
        String x = " ";
        //pegar o texto do text area
        x += textArea.getText();
        //==================
        Respostas.setText("O(s) genero(s) de filme(s) que você prefere são: "+n+"\nO filme que você gostaria de ver é: "+m+"\nSua opinião: "+x);
        
    }
    
}
