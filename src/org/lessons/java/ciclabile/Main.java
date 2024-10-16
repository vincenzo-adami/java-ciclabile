package org.lessons.java.ciclabile;

public class Main {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    // int[] array = {};

    Ciclabile arrayCiclabile = new Ciclabile(array);

    System.out.println(arrayCiclabile.hasAncoraElementi());
    try {
      System.out.println(arrayCiclabile.getElementoSuccessivo());
      System.out.println(arrayCiclabile.getElementoSuccessivo());
      System.out.println(arrayCiclabile.getElementoSuccessivo());
      System.out.println(arrayCiclabile.getElementoSuccessivo());

    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    System.out.println(arrayCiclabile.hasAncoraElementi());
    try {
      System.out.println(arrayCiclabile.getElementoSuccessivo());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    System.out.println(arrayCiclabile.hasAncoraElementi());
  }
}
