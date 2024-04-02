
package Controlador;
import Vista.Options;
import Modelo.RecurrencyRelations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlOptions implements ActionListener {
    private Options vistaOptions;
    private RecurrencyRelations objtRecurrency;

    public ControlOptions() {
        
        this.vistaOptions= new Options();
        this.vistaOptions.setVisible(true);
        this.vistaOptions.botonValoresA.addActionListener(this);
        this.vistaOptions.botonValoresB.addActionListener(this);
        this.vistaOptions.botonValoresC.addActionListener(this);
        this.vistaOptions.botonValoresD.addActionListener(this);
        this.vistaOptions.boton5ValoresA.addActionListener(this);
        this.vistaOptions.boton5ValoresB.addActionListener(this);
        this.vistaOptions.boton5ValoresC.addActionListener(this);
        this.vistaOptions.boton5ValoresD.addActionListener(this);
              
        this.objtRecurrency = new RecurrencyRelations();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vistaOptions.botonValoresA){
            
            javax.swing.JOptionPane.showMessageDialog(null, "", null, 0);
        }
        if(e.getSource() == this.vistaOptions.botonValoresB){
        
        }
        if(e.getSource() == this.vistaOptions.botonValoresC){
        
        }
        if(e.getSource() == this.vistaOptions.botonValoresD){
        
        }
        if(e.getSource() == this.vistaOptions.boton5ValoresA){
        
        }
        if(e.getSource() == this.vistaOptions.boton5ValoresB){
        
        }
        if(e.getSource() == this.vistaOptions.boton5ValoresC){
        
        }
        if(e.getSource() == this.vistaOptions.boton5ValoresD){
        
        }
    }
    
    
}
