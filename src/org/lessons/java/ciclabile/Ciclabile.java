package org.lessons.java.ciclabile;

import java.util.Arrays;

public class Ciclabile {

  private int[] array;
  private int indice;

  Ciclabile() {
    this.array = new int[0];
    this.indice = 0;
  }

  Ciclabile(int[] array) {
    this.array = array;
    this.indice = 0;
  }

  public boolean hasAncoraElementi() {
    if (indice < array.length) {
      return true;
    }
    return false;
  }

  public int getElementoSuccessivo() {
    if (hasAncoraElementi()) {
      indice++;
      return this.array[indice - 1];
    }
    return indice; // necessaria eccezione
  }

  public void addElemento(int a) {
    int[] arrayTemp = new int[this.array.length + 1];
    for (int i = 0; i < this.array.length; i++) {
      arrayTemp[i] = this.array[i];
    }
    arrayTemp[arrayTemp.length - 1] = a;
    this.array = new int[arrayTemp.length];
    for (int i = 0; i < arrayTemp.length; i++) {
      this.array[i] = arrayTemp[i];
    }
  }

  @Override
  public String toString() {
    return Arrays.toString(this.array);
  }

}
