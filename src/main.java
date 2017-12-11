import java.util.*;
import javax.swing.JOptionPane;

public class main {
    
   
    public static void main(String[] args) {
        
        String db[][] = new String[3][17];
        String lista = " ";
        
        String mm[] = new String[7];
        String mmm[] = new String[2];
        
        mm[0] = "Ingles";
        mm[1] = "Calculo";
        mm[2] = "P.O.O";
        mm[3] = "algebra";
        mm[4] = "Promedio";
        
        mmm[0] = "Id";
        mmm[1] = "Nombre";
        
        //llenando los nombres de los alumnos para las primeras dos columnas
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 1; j++) {
                 String nombre = JOptionPane.showInputDialog(null, "id No:"+i+" Ingrese Nombre del alumno "+i+" : ");
                 db[i][j] = nombre;
                 System.out.println(db[i][j]);
                 lista +=i+"    " + db[i][j];
            }
            lista +="\n";
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
                JOptionPane.showInputDialog(null,lista);
               
                //for para el primer parcial
                for (int i = 2; i < db.length; i++) {
                    float sum = 0, p=0;
                    int c= 0;
                    int index = 0;
                    for (int j  = 2 ; j < 6; j++) {
                        if(j < 5){
                            String cal = JOptionPane.showInputDialog(null,"alumno: "+db[0][index]
                                    +"\nCalificacion para "+mm[j]);
                             db [i][j] = cal;
                             sum += Float.parseFloat(db[i][j]);
                             c++;
                             index ++;
                        }else{
                            p = sum /c;
                            db[i][j] = String.valueOf(p);
                        }    
                    }
                }// fin del for externo para ingresar calificacion 
                
              /*  for (int i = 0; i < p1.length; i++) {
                    for (int j = 0; j < p1.length; j++) {
                        s +=" " + p1[i][j]+"           ";
                    }
                     s += i+" "+alumnos[i]+" "+"\n";
                }*/
                JOptionPane.showMessageDialog(null, mm[5]+"  "+mm[6] +" "+ mm[0]+"   "+mm[1]+"   "+mm[2]+"   "+mm[3]
                        +"   "+mm[4]+"\n"+s);
                
                break;
            case 4:
               break;
            case 0:
                System.exit(0);
                break;
        }//fin del switch
        
       }//fin del while
      
    }
}
