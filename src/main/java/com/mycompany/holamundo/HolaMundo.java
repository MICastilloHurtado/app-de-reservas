
package com.mycompany.holamundo;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        
           char puestos[][]  = new char[10][10];
           int fila, silla;
           boolean centinela = false;           
           Scanner teclado = new Scanner(System.in);
           Scanner teclado1 = new Scanner(System.in);
           String bandera;
           
           
           System.out.println("----------Bienvenido al sistema de reservas----------");
           
           for(int i = 0 ; i < 10; i++){
               for(int j = 0; j < 10; j++){
                   puestos [i][j] = 'L';
               }
           }
           
           while(centinela==false){
               visualizar(puestos);
               System.out.println("Ingrese el numero de fila(entre 0 y 9):");
               fila = teclado1.nextInt();
               System.out.println("Ingrese el numero de silla(entre 0 y 9):");
               silla = teclado1.nextInt();
               if(fila > 9 || silla > 9 || puestos[fila][silla] == 'X'){
                   System.out.println("El numero de asiento no es Valido");
               }else{
                   puestos[fila][silla] = 'X';
                   System.out.println("Se ha reservado el asiento correctamente");
               }
               
               System.out.println("Desea hacer una nueva reserva? Digite: S:si, otra letra:no");
               
               bandera = teclado.nextLine();
               if(!bandera.equalsIgnoreCase("s")){
                   centinela=true;
               }
               
               
           }       
           
    }
    
    static void visualizar(char puestos[][]){
        for(int i = 0 ; i < 10; i++){
            System.out.print(i);
               for(int j = 0; j < 10; j++){
                   System.out.print("[" + puestos[i][j] + "]");
               }               
               System.out.println("");
           }
    }
}
