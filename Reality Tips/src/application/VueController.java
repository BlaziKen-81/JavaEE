package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.io.*;

public class VueController {
    
    @FXML
    private Button button;
    @FXML
    private TextField montant;
    @FXML
    private TextField pourcentage;
    @FXML
    private TextField nbPersonne;
    @FXML
    private TextField tip;
    @FXML
    private TextField total;
    @FXML
    private TextField date;
    @FXML
    private Label error;
    
    @FXML
    private void calcul(MouseEvent event) {
        try {
            double Bill = Double.parseDouble(montant.getText());
            double Tip = Double.parseDouble(pourcentage.getText());
            int NbPeople = Integer.parseInt(nbPersonne.getText());
            String Date = date.getText();
            
            if (Bill == 0 || Tip == 0 || NbPeople == 0) {
                error.setText("Saisies nulles");
            } else {
                if (isValid(Date)) {
                    double TipPS = (Bill * Tip / 100) / NbPeople;
                    double Total = (Bill / NbPeople) + TipPS;
                    
                    tip.setText(String.valueOf(TipPS));
                    total.setText(String.valueOf(Total));

                    Save(Date, Bill, Tip, NbPeople);
                    
                    System.err.println("ok");
                } else {
                    error.setText("ERREUR DATE");
                }
            }
        
        } catch (NumberFormatException e) {
            System.err.println("ERREUR" );
        }
    }
    
    private void Save(String Date, double Bill, double Tip, int NbPeople) {
        try {
            File fichier = new File("fichier.txt");
            FileOutputStream flux = new FileOutputStream(fichier);
            String data = Date + " ;" + Bill + " ;" + Tip + " ;" + NbPeople + "\n";
            flux.write(data.getBytes());
            flux.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private boolean isValid(String Date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        return Date.matches(regex);
    }
}
