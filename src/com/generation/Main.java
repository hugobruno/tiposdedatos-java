package com.generation;

public class Main {

    public static void main(String[] args) {
        String nombre = "Bruno";
        byte num1 = 10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        float decimal1 = 10.25262235f;
        double decimal2 = 20.32356536d;

        char caracter = 'f';
        boolean verdadero = true;

        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;

        byte numByte1 = 120;
        byte numByte2 = 120;

        int suma = (short) (numByte1 + numByte2);
        int resta = (short) (numByte1 - numByte2);
        int multiplicacion = (short) (numByte1 * numByte2);
        float division = (float) (numByte1 / numByte2);

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
    }

}

