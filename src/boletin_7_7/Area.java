/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_7;
import javax.swing.JOptionPane;
public class Area {
    private double dato1;
    private double dato2;
    private final double PI=3.1416;
    
    public void areaCuadrado (){
        String respuesta = JOptionPane.showInputDialog("Introduce el lado del cuadrado");
        dato1 = Double.parseDouble(respuesta);
        JOptionPane.showMessageDialog(null, "El area del cuadrado: " + (dato1*dato1));
    } 
    public void areaTriangulo (){
        String respuesta = JOptionPane.showInputDialog("Introduce la base del triángulo");
        dato1 = Double.parseDouble(respuesta);
        respuesta = JOptionPane.showInputDialog("Introduce la altura del triángulo");
        dato2 = Double.parseDouble(respuesta);
        JOptionPane.showMessageDialog(null, "El area del triángulo: " + ((dato1*dato2))/2);
    } 
    public void areaCirculo (){
        String respuesta = JOptionPane.showInputDialog("Introduce el radio del circulo");
        dato1 = Double.parseDouble(respuesta);
        JOptionPane.showMessageDialog(null, "El area del cuadrado: " + (PI*dato1*dato1));
    } 
}
