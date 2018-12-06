package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Arreglos {
static double array[] = null;
    static String meses[] = {"enero", "febrero", "marzo", "abril",
        "mayo", "junio", "julio", "agosto", "septiembre",
        "octubre", "noviembre", "diciembre"};
    static String dias[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo"};

    public static String[] mesesAnio() {
        return meses;
    }

    public static String[] diasSemana() {
        return dias;
    }

    public static double[] randomicos() {
        array = new double[Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de números randómicos"))];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 5;   
            System.out.println(array[i]);
        }
        
        return array;
    }

      static double suma=0;
    public static double suma() {
        for (int i = 0; i < array.length; i++) {
            suma= suma + array[i];   
        }
       return suma;
    } 
    public static double promedio() { 
       return (suma/array.length);
    }
    public static double max() {
        double max;
        max=array[0];

        for(int i = 0; i < array.length; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
        public static double min() {
        double min;
        min=array[0];

        for(int i = 0; i < array.length; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

}
