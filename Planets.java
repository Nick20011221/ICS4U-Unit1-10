import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This program creates an array that stores the names of the planets and their
 * order from the sun.
 * 
 * @author Nick P-A
 * @since 2020/3/9
 * @version 1.0
 */
 
public class Planets {

  static int counter;
  static String porder;
  /**
  * this class prints the planets in order.
  */

  public static void main(String[] args) {

    double[][] classroom = new double[8][1];


    for (int planet = 0; planet < classroom.length; planet++) {
      System.out.print("planet" + (planet + 1) + ":");
      
      if (counter == 1) {
        porder = "venus";
      }
      if (counter == 2) {
        porder = "Earth";
      }
      if (counter == 3) {
        porder = "Mars";
      }
      if (counter == 4) {
        porder = "Jupiter";
      }
      if (counter == 5) {
        porder = "Saturn";
      }
      if (counter == 6) {
        porder = "Uranus";
      }
      if (counter == 7) {
        porder = "Neptune";
      }
      if (counter == 0) {
        porder = "Mercury";
      }
      
      for (double assignment: classroom[planet]) {
        System.out.print(" " + porder);
      }
      System.out.println();
      counter = counter + 1;
    }
  }
}