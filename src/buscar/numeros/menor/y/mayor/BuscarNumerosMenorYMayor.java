/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buscar.numeros.menor.y.mayor;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class BuscarNumerosMenorYMayor {

    /**
     * @param args the command line arguments
     */
    private void MenorMayor(){
        //Declaramos las variables 
        int numero,num = 0,menor,mayor,suma;
        double promedio;
        //Mostramos un mensaje y obtenemos el dato 
        num = Integer.parseInt(JOptionPane.showInputDialog("Intruduzca el número de posiciones"));
        //Declaramos un arreglo 
        int arreglo[] = new int[num];
        //introducimos los números utilizando un ciclo for
        for (int i = 0; i < arreglo.length; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Instruduzca el número " + (i + 1)));
            arreglo[i] = numero;
        }
        //buscar el menor y mayor
        menor = arreglo[0];
        mayor = arreglo[0];
        for (int j = 0; j < arreglo.length; j++) {
            //Condiciones que evalúan las variables menor, mayor y arreglo
            if (menor > arreglo[j]) {
                menor = arreglo[j];
            }
            if (mayor < arreglo[j]) {
                mayor = arreglo[j];
            }
        }
        //calcular promedio
        suma = 0;
        for (int k = 0; k < arreglo.length; k++) {
            suma = suma + arreglo[k];
        }
        promedio = suma/arreglo.length;
        //Mostramos los resultados
        String salida;
        salida = "El número menor es: " + menor + "\n" + 
                "El número mayor es: " + mayor + "\n" +
                "El promedio de los numeros es: " + promedio;
        JOptionPane.showMessageDialog(null, salida);
    }
    public static void main(String[] args) {
        //Mandamos a llamar al método MenorMayor
        BuscarNumerosMenorYMayor obj = new BuscarNumerosMenorYMayor();
        obj.MenorMayor();
    }
    
}
