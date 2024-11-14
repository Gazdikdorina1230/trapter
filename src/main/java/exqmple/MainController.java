/*
* File: App.java
* Author: Gazdik Dorina
* Copyright: 2024, Gazdik Dorina
* Group: Szoft II/I/N
* Date: 2024-11-14
* Github: https://github.com/Gazdikdorina1230/
* Licenc: GNU GPL
*/

package exqmple;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField areaside;

    @FXML
    private TextField aside;

    @FXML
    private TextField bside;

    @FXML
    private TextField cside;

    @FXML
    private TextField dside;

    @FXML
    void CalcButton(ActionEvent event) {
        try{
            Calculate();
        }
        catch(Exception e){
            areaside.setText("valami");
            System.out.println(e);
            System.err.println(e.getMessage());
        }
    }
    @FXML
    private void Valami(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("Adatok");
        alert.setHeaderText("Trapter nevű project");
        alert.setContentText("Készitette: Gazdik Dorina, 2024-11-14 , Szoft I/2/N");
        alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
        alert.showAndWait();
    }

    @FXML
    void ExitButton(ActionEvent event) {
        System.exit(0);
    }
    public void Calculate(){

    String asideString = aside.getText();
    String bsideString = bside.getText();
    String csideString = cside.getText();
    String dsideString = dside.getText();
    double a = Double.parseDouble(asideString); 
    double b = Double.parseDouble(bsideString);
    double c = Double.parseDouble(csideString);
    double d = Double.parseDouble(dsideString);
    double firstpart = a + c;
    double secondpart = 4 * (a-c);
    double division = firstpart/secondpart;
    double longcalc = (a+b-c+d)*(a-b-c+d)*(a+b-c-d)*(-a+b+c+d);
    double sqrtstuff = Math.sqrt(longcalc);
    Double Area = division * sqrtstuff;
    System.out.println(Area);   
    areaside.setText(String.valueOf(Area));
    }
}

