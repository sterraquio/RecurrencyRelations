
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
            int numb = Integer.parseInt(this.vistaOptions.jTextFieldPuntoA.getText());
            String resultado = Integer.toString(this.objtRecurrency.firts(numb));
            javax.swing.JOptionPane.showMessageDialog(vistaOptions, "El resultado de A"+numb+": "+resultado, "Resultado", 1);
        }
        if(e.getSource() == this.vistaOptions.botonValoresB){
        
            int numb = Integer.parseInt(this.vistaOptions.jTextFieldPuntoB.getText());
            String resultado = Integer.toString(this.objtRecurrency.second(numb));
            javax.swing.JOptionPane.showMessageDialog(vistaOptions, "El resultado de B"+numb+": "+resultado, "Resultado", 1);
        }
        if(e.getSource() == this.vistaOptions.botonValoresC){
        
            int numb = Integer.parseInt(this.vistaOptions.jTextFieldPuntoC.getText());
            String resultado = Integer.toString(this.objtRecurrency.third(numb));
            javax.swing.JOptionPane.showMessageDialog(vistaOptions, "El resultado de C"+numb+": "+resultado, "Resultado", 1);
        }
        if(e.getSource() == this.vistaOptions.botonValoresD){
        
            int numb = Integer.parseInt(this.vistaOptions.jTextFieldPuntoD.getText());
            String resultado = Integer.toString(this.objtRecurrency.fourth(numb));
            javax.swing.JOptionPane.showMessageDialog(vistaOptions, "El resultado de D"+numb+": "+resultado, "Resultado", 1);
        }


        
        if(e.getSource() == this.vistaOptions.boton5ValoresA){

            String resultadoA = "";

            for (int i = 0; i < this.objtRecurrency.getNumberList().length; i++) {
                resultadoA += "El valor A"+i+ ": "+this.objtRecurrency.firts(i)+ "\n";
            }
            javax.swing.JOptionPane.showMessageDialog(vistaOptions, resultadoA, "Resultados", 1);
        }
        if(e.getSource() == this.vistaOptions.boton5ValoresB){
        
            
            String resultadoB = "";

            for (int i = 0; i < this.objtRecurrency.getSecondList().length; i++) {
                resultadoB +="El valor B"+i+ ": "+ this.objtRecurrency.second(i)+ "\n ";
            }
            javax.swing.JOptionPane.showMessageDialog(vistaOptions, resultadoB, "Resultados", 1);
        }
        if(e.getSource() == this.vistaOptions.boton5ValoresC){
            
            String resultadoC = "";

            for (int i = 0; i < this.objtRecurrency.getThirdList().length; i++) {
                resultadoC += "El valor C"+i+ ": "+this.objtRecurrency.third(i) + "\n";
            }
            javax.swing.JOptionPane.showMessageDialog(vistaOptions, resultadoC, "Resultados", 1);
        }
        if(e.getSource() == this.vistaOptions.boton5ValoresD){
            
            String resultadoD = "";

            for (int i = 0; i < this.objtRecurrency.getNumberList().length; i++) {
                resultadoD += "El valor D"+i+ ": "+this.objtRecurrency.fourth(i)+ "\n";
            }
            javax.swing.JOptionPane.showMessageDialog(vistaOptions, resultadoD, "Resultados", 1);
        }
    }
    
    
}
