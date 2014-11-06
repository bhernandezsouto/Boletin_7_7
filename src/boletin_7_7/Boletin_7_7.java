/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_7;
import javax.swing.JOptionPane;
public class Boletin_7_7 {
    public static void main(String[] args) {
        Area op = new Area();
        int seleccion = JOptionPane.showOptionDialog( null, "Seleccione la figura a sacar el area: ",
                "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, new Object[]{ "Cuadrado", "Triangulo", "Circulo","Salir"}, null);
        switch (seleccion) {
            case 0: op.areaCuadrado();
                    break;
            case 1: op.areaTriangulo();
                    break;
            case 2: op.areaCirculo();
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
        }

    }
    
}
