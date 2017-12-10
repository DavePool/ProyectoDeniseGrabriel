import java.util.*;
import javax.swing.JOptionPane;

public class main {
    
   
    public static void main(String[] args) {
        main ma = new main();
        String alumnos[] = new String[5];
        float p1[][] = new float[5][5];
        String lista = "";
        String m = "Id    nombre";      
        
        String mm[] = new String[5];
        mm[0] = "Ingles";
        mm[1] = "Calculo";
        mm[2] = "P.O.O";
        mm[3] = "algebra";
        mm[4] = "Promedio";
        
        for (int i = 0; i < alumnos.length; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre del alumno "+i+" : ");
            alumnos[i] = nombre;
            lista +=i+"    " + alumnos[i] + "  \n";
        }
        
        
      while(true){
        int op = Integer.parseInt( JOptionPane.showInputDialog(null, "                  Menú\n"
                + "1 para ingresar calificacion del primer parcial\n"
                + "2 para ingresar calificacion del segundo parcial\n"
                + "3 ingresar calificacion del tercer parcial\n"
                + "4 resultados\n"
                + "0 para salir del sistema.\n"));
      
        switch (op){
            case 1:
                String s = "";
                JOptionPane.showInputDialog(null, m+"\n"+lista);
               
                for (int i = 0; i < p1.length; i++) {
                    float sum = 0, p=0;
                    int c= 0;
                    
                    JOptionPane.showMessageDialog(null, "ingresando calificacion para "+alumnos[i]);
                    for (int j = 0; j < p1.length; j++) {
                        if(j < p1.length-1){
                            float cal = Float.parseFloat( JOptionPane.showInputDialog(null,"Calificacion para "+mm[j]));
                             p1 [i][j] = cal;
                             sum += p1[i][j];
                             c++;
                        }else{
                            p = sum /c;
                            p1[i][j] = p;
                        }    
                    }
                }
                
                for (int i = 0; i < p1.length; i++) {
                    for (int j = 0; j < p1.length; j++) {
                        s += p1[i][j]+"           ";
                    }
                    s +=i+" "+alumnos[i]+" "+"\n";
                }
                JOptionPane.showMessageDialog(null, "ID"+"  "+" Nombre" +" "+ mm[0]+"   "+mm[1]+"   "+mm[2]+"   "+mm[3]+"   "+mm[4]+"  \n"+s);
                
                break;
            case 4:
               break;
            case 0:
                System.exit(0);
                break;
        }
       }
    }
}
