package com.matrix.seeder;

class HelloWorld {
  public static void main(String[] args) {
    int[][] matrix = new int[9][9];

    int diagonalCounter = 0;
    int element = 1;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (j > diagonalCounter && j < matrix.length - diagonalCounter - 1) {
          matrix[j][i] = element++;
        } else {
          matrix[j][i] = 0;
        }
      }
      if (i < matrix.length / 2) {
        diagonalCounter++;
      } else {
        diagonalCounter--;
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      System.out.print("\n");
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
    }
  }
}
