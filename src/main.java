import java.util.*;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        
        String db[][] = new String[3][17];
        String lista = " ";
        
        String mm[] = new String[7];
        String mmm[] = new String[2];
        
        mm[1] = "Ingles";
        mm[2] = "Calculo";
        mm[3] = "P.O.O";
        mm[4] = "algebra";
        mm[5] = "Promedio";
        
        mmm[0] = "Id";
        mmm[1] = "Nombre";
        
        //llenando los nombres de los alumnos para las primeras dos columnas
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 1; j++) {
                 String nombre = JOptionPane.showInputDialog(null, "id No:"+i+" Ingrese Nombre del alumno "+i+" : ");
                 db[i][j] = nombre;
                 System.out.println("i: "+i+" J: "+j);
                 lista += db[i][j];
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
                 /*********************************************PRIMER PARCIAL*********************************************************/
                 case 1:
                     String s = "";
                     JOptionPane.showInputDialog(null,lista);
                     int index = 0;
                     //for para el primer parcial
                     for (int i = 0; i < db.length; i++) {
                         float sum = 0, p=0;
                         int c= 0;

                         JOptionPane.showMessageDialog(null,"alumno: "+db[index][0]);
                         for (int j  = 1 ; j < 6; j++) {
                             System.out.println("pi-> i:"+i+" J: "+j);
                             if(j < 5){
                                 String cal = JOptionPane.showInputDialog(null,"\nCalificacion para "+mm[j]);
                                 db [i][j] = cal;
                                 sum += Float.parseFloat(db[i][j]);
                                 c++;
                             }else{
                                 p = sum /c;
                                 db[i][j] = String.valueOf(p);
                             }
                         }
                         index ++;
                     }// fin del for externo para ingresar calificacion

                     //for para imprimir calificaciones
                 for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        s +="\t"+db[i][j]+"       \t    ";
                        System.out.println("concatenando pos["+i+"] ,["+j+"]");
                    }
                     System.out.println("");
                     s += "\n";
                }
                     JOptionPane.showMessageDialog(null, mmm[1] +"   "+ mm[1]+"   "+mm[2]+"   "+mm[3]+"   "+mm[4]
                             +"   "+mm[5]+"\n"+s);
                     break;
                 /***********************************************SEGUNDO PARCIAL***********************************************************/
                 case 2:
                     if (db[0][1]==null){
                         JOptionPane.showMessageDialog(null,"Calificaciones bloqueadas, ingrese primer parcial\n");
                    }else{
                         String sp2 = "";
                         JOptionPane.showInputDialog(null,lista);
                         int indexp2 = 0;


                         //for para el segundo parcial
                         for (int i = 0; i < db.length; i++) {
                             float sum = 0, p=0;
                             int c= 0;
                             int mat = 1;

                             JOptionPane.showMessageDialog(null,"alumno: "+db[indexp2][0]);
                             for (int j  = 6 ; j < 11; j++) {
                                 System.out.println("pi-> i:"+i+" J: "+j);
                                 if(j < 10){
                                     String cal = JOptionPane.showInputDialog(null,"\nCalificacion para "+mm[mat]);
                                     System.out.println("ingresando calificacion en: ["+i+"],["+j+"]");
                                     db [i][j] = cal;
                                     sum += Float.parseFloat(db[i][j]);
                                     c++;
                                     mat++;
                                 }else{
                                     p = sum /c;
                                     db[i][j] = String.valueOf(p);
                                 }
                             }
                             indexp2 ++;
                         }// fin del for externo para ingresar calificacion

                         for (int i = 0; i < 3; i++) {
                             for (int j = 0; j < 11; j++) {
                                 if (j ==0 || j > 5) {
                                     sp2 += db[i][j] + "           ";
                                     System.out.println("concatenando pos[" + i + "] ,[" + j + "]");
                                 }
                             }
                             System.out.println("");
                             sp2 += "\n";
                         }
                         JOptionPane.showMessageDialog(null, mmm[1] +"   "+ mm[1]+"   "+mm[2]+"   "+mm[3]+"   "+mm[4]
                                 +"   "+mm[5]+"\n"+sp2);
                 }
                     break;
                 case 3:
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
