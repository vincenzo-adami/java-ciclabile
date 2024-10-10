package org.lessons.java.ciclabile;

public class Main2 {

  public static void main(String[] args) {

    Ciclabile arrayCiclabile = new Ciclabile();

    System.out.println(arrayCiclabile.hasAncoraElementi());

    arrayCiclabile.addElemento(2);
    System.out.println(arrayCiclabile.hasAncoraElementi());

    arrayCiclabile.addElemento(3);
    arrayCiclabile.addElemento(4);
    arrayCiclabile.addElemento(5);

    System.out.println(arrayCiclabile);
  }

}
