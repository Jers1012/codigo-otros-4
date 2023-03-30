package ejerciciosJava;

import java.util.Scanner;

public class Codigo4 {

	public static void main(String[] args) {

    Scanner s = new Scanner(System.in); // System.in
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
//	 jugador 2
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
// 		Se borro un Scanner
    String j2 = s.nextLine();
    
    if (j1.equals(j2)) { // equals
      System.out.println("Empate");
    } 
    else {
      int g = 2;
      switch(j1) {//se agregaron los breaks
      
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          }
          break;

        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }// cierre if
          break;
          
        case "tijeras": // tijeras
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:	g = 2; 
      }
      System.out.println("Gana el jugador " + g);
    }// cierre else
//cierre Scanner
    s.close();
}// Cierre Main
}// cierre class