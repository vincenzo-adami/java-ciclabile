package org.lessons.java.ciclabile;

public class Main {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    // int[] array = {};

    Ciclabile arrayCiclabile = new Ciclabile(array);

    System.out.println(arrayCiclabile.hasAncoraElementi());
    System.out.println(arrayCiclabile.getElementoSuccessivo());
    System.out.println(arrayCiclabile.getElementoSuccessivo());
    System.out.println(arrayCiclabile.getElementoSuccessivo());
    System.out.println(arrayCiclabile.getElementoSuccessivo());
    System.out.println(arrayCiclabile.hasAncoraElementi());
    System.out.println(arrayCiclabile.getElementoSuccessivo());
    System.out.println(arrayCiclabile.hasAncoraElementi());

  }

}
