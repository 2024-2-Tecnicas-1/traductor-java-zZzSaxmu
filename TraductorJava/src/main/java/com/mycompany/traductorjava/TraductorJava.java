package com.mycompany.traductorjava;

import java.util.HashMap;
import java.util.Scanner;

public class TraductorJava {
    // Inicialización de los HashMap como estáticos
    private static final HashMap<Integer, String> numerosESP = new HashMap<>();
    private static final HashMap<Integer, String> numerosENG = new HashMap<>();

    static {
        // Inicialización de los HashMap
        numerosESP.put(1, "uno");                 
        numerosESP.put(2, "dos");                 
        numerosESP.put(3, "tres");                 
        numerosESP.put(4, "cuatro");                 
        numerosESP.put(5, "cinco");                 
        numerosESP.put(6, "seis");                 
        numerosESP.put(7, "siete");                 
        numerosESP.put(8, "ocho");                 
        numerosESP.put(9, "nueve");                 
        numerosESP.put(10, "diez");                 
        numerosESP.put(11, "once");                 
        numerosESP.put(12, "doce");                 
        numerosESP.put(13, "trece");                 
        numerosESP.put(14, "catorce");                 
        numerosESP.put(15, "quince");                 
        numerosESP.put(16, "dieciséis");                 
        numerosESP.put(17, "diecisiete");                 
        numerosESP.put(18, "dieciocho");                 
        numerosESP.put(19, "diecinueve");                 
        numerosESP.put(20, "veinte");
        numerosESP.put(21, "veintiuno");                 
        numerosESP.put(22, "veintidós");                 
        numerosESP.put(23, "veintitrés");                 
        numerosESP.put(24, "veinticuatro");                 
        numerosESP.put(25, "veinticinco");                 
        numerosESP.put(26, "veintiséis");                 
        numerosESP.put(27, "veintisiete");                 
        numerosESP.put(28, "veintiocho");                 
        numerosESP.put(29, "veintinueve");                 
        numerosESP.put(30, "treinta");                 
        numerosESP.put(31, "treinta y uno");                 
        numerosESP.put(32, "treinta y dos");                 
        numerosESP.put(33, "treinta y tres");                 
        numerosESP.put(34, "treinta y cuatro");                 
        numerosESP.put(35, "treinta y cinco");                 
        numerosESP.put(36, "treinta y seis");                 
        numerosESP.put(37, "treinta y siete");                 
        numerosESP.put(38, "treinta y ocho");                 
        numerosESP.put(39, "treinta y nueve");                 
        numerosESP.put(40, "cuarenta");
        numerosESP.put(41, "cuarenta y uno");                 
        numerosESP.put(42, "cuarenta y dos");                 
        numerosESP.put(43, "cuarenta y tres");                 
        numerosESP.put(44, "cuarenta y cuatro");                 
        numerosESP.put(45, "cuarenta y cinco");                 
        numerosESP.put(46, "cuarenta y seis");                 
        numerosESP.put(47, "cuarenta y siete");                 
        numerosESP.put(48, "cuarenta y ocho");                 
        numerosESP.put(49, "cuarenta y nueve");                 
        numerosESP.put(50, "cincuenta");
        numerosESP.put(51, "cincuenta y uno");                 
        numerosESP.put(52, "cincuenta y dos");                 
        numerosESP.put(53, "cincuenta y tres");                 
        numerosESP.put(54, "cincuenta y cuatro");                 
        numerosESP.put(55, "cincuenta y cinco");                 
        numerosESP.put(56, "cincuenta y seis");                 
        numerosESP.put(57, "cincuenta y siete");                 
        numerosESP.put(58, "cincuenta y ocho");                 
        numerosESP.put(59, "cincuenta y nueve");                 
        numerosESP.put(60, "sesenta");
        numerosESP.put(61, "sesenta y uno");                 
        numerosESP.put(62, "sesenta y dos");                 
        numerosESP.put(63, "sesenta y tres");                 
        numerosESP.put(64, "sesenta y cuatro");                 
        numerosESP.put(65, "sesenta y cinco");                 
        numerosESP.put(66, "sesenta y seis");                 
        numerosESP.put(67, "sesenta y siete");                 
        numerosESP.put(68, "sesenta y ocho");                 
        numerosESP.put(69, "sesenta y nueve");                 
        numerosESP.put(70, "setenta");
        numerosESP.put(71, "setenta y uno");                 
        numerosESP.put(72, "setenta y dos");                 
        numerosESP.put(73, "setenta y tres");                 
        numerosESP.put(74, "setenta y cuatro");                 
        numerosESP.put(75, "setenta y cinco");                 
        numerosESP.put(76, "setenta y seis");                 
        numerosESP.put(77, "setenta y siete");                 
        numerosESP.put(78, "setenta y ocho");                 
        numerosESP.put(79, "setenta y nueve");                 
        numerosESP.put(80, "ochenta");
        numerosESP.put(81, "ochenta y uno");                 
        numerosESP.put(82, "ochenta y dos");                 
        numerosESP.put(83, "ochenta y tres");                 
        numerosESP.put(84, "ochenta y cuatro");                 
        numerosESP.put(85, "ochenta y cinco");                 
        numerosESP.put(86, "ochenta y seis");                 
        numerosESP.put(87, "ochenta y siete");                 
        numerosESP.put(88, "ochenta y ocho");                 
        numerosESP.put(89, "ochenta y nueve");                 
        numerosESP.put(90, "noventa");
        numerosESP.put(91, "noventa y uno");                 
        numerosESP.put(92, "noventa y dos");                 
        numerosESP.put(93, "noventa y tres");                 
        numerosESP.put(94, "noventa y cuatro");                 
        numerosESP.put(95, "noventa y cinco");                 
        numerosESP.put(96, "noventa y seis");                 
        numerosESP.put(97, "noventa y siete");                 
        numerosESP.put(98, "noventa y ocho");                 
        numerosESP.put(99, "noventa y nueve");                 
        numerosESP.put(100, "cien");

        numerosENG.put(1, "one");
        numerosENG.put(2, "two");
        numerosENG.put(3, "three");
        numerosENG.put(4, "four");
        numerosENG.put(5, "five");
        numerosENG.put(6, "six");
        numerosENG.put(7, "seven");
        numerosENG.put(8, "eight");
        numerosENG.put(9, "nine");
        numerosENG.put(10, "ten");
        numerosENG.put(11, "eleven");
        numerosENG.put(12, "twelve");
        numerosENG.put(13, "thirteen");
        numerosENG.put(14, "fourteen");
        numerosENG.put(15, "fifteen");
        numerosENG.put(16, "sixteen");
        numerosENG.put(17, "seventeen");
        numerosENG.put(18, "eighteen");
        numerosENG.put(19, "nineteen");
        numerosENG.put(20, "twenty");
        numerosENG.put(21, "twenty-one");
        numerosENG.put(22, "twenty-two");
        numerosENG.put(23, "twenty-three");
        numerosENG.put(24, "twenty-four");
        numerosENG.put(25, "twenty-five");
        numerosENG.put(26, "twenty-six");
        numerosENG.put(27, "twenty-seven");
        numerosENG.put(28, "twenty-eight");
        numerosENG.put(29, "twenty-nine");
        numerosENG.put(30, "thirty");
        numerosENG.put(31, "thirty-one");
        numerosENG.put(32, "thirty-two");
        numerosENG.put(33, "thirty-three");
        numerosENG.put(34, "thirty-four");
        numerosENG.put(35, "thirty-five");
        numerosENG.put(36, "thirty-six");
        numerosENG.put(37, "thirty-seven");
        numerosENG.put(38, "thirty-eight");
        numerosENG.put(39, "thirty-nine");
        numerosENG.put(40, "forty");
        numerosENG.put(41, "forty-one");
        numerosENG.put(42, "forty-two");
        numerosENG.put(43, "forty-three");
        numerosENG.put(44, "forty-four");
        numerosENG.put(45, "forty-five");
        numerosENG.put(46, "forty-six");
        numerosENG.put(47, "forty-seven");
        numerosENG.put(48, "forty-eight");
        numerosENG.put(49, "forty-nine");
        numerosENG.put(50, "fifty");
        numerosENG.put(51, "fifty-one");
        numerosENG.put(52, "fifty-two");
        numerosENG.put(53, "fifty-three");
        numerosENG.put(54, "fifty-four");
        numerosENG.put(55, "fifty-five");
        numerosENG.put(56, "fifty-six");
        numerosENG.put(57, "fifty-seven");
        numerosENG.put(58, "fifty-eight");
        numerosENG.put(59, "fifty-nine");
        numerosENG.put(60, "sixty");
        numerosENG.put(61, "sixty-one");
        numerosENG.put(62, "sixty-two");
        numerosENG.put(63, "sixty-three");
        numerosENG.put(64, "sixty-four");
        numerosENG.put(65, "sixty-five");
        numerosENG.put(66, "sixty-six");
        numerosENG.put(67, "sixty-seven");
        numerosENG.put(68, "sixty-eight");
        numerosENG.put(69, "sixty-nine");
        numerosENG.put(70, "seventy");
        numerosENG.put(71, "seventy-one");
        numerosENG.put(72, "seventy-two");
        numerosENG.put(73, "seventy-three");
        numerosENG.put(74, "seventy-four");
        numerosENG.put(75, "seventy-five");
        numerosENG.put(76, "seventy-six");
        numerosENG.put(77, "seventy-seven");
        numerosENG.put(78, "seventy-eight");
        numerosENG.put(79, "seventy-nine");
        numerosENG.put(80, "eighty");
        numerosENG.put(81, "eighty-one");
        numerosENG.put(82, "eighty-two");
        numerosENG.put(83, "eighty-three");
        numerosENG.put(84, "eighty-four");
        numerosENG.put(85, "eighty-five");
        numerosENG.put(86, "eighty-six");
        numerosENG.put(87, "eighty-seven");
        numerosENG.put(88, "eighty-eight");
        numerosENG.put(89, "eighty-nine");
        numerosENG.put(90, "ninety");
        numerosENG.put(91, "ninety-one");
        numerosENG.put(92, "ninety-two");
        numerosENG.put(93, "ninety-three");
        numerosENG.put(94, "ninety-four");
        numerosENG.put(95, "ninety-five");
        numerosENG.put(96, "ninety-six");
        numerosENG.put(97, "ninety-seven");
        numerosENG.put(98, "ninety-eight");
        numerosENG.put(99, "ninety-nine");
        numerosENG.put(100, "one hundred");
    }
    
    

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número:");
            int num1 = scanner.nextInt();

            System.out.println("Ingrese el segundo número:");
            int num2 = scanner.nextInt();
            
            int suma = num1 + num2;

            String num1ESP = numerosESP.getOrDefault(num1, "Numero no disponible");
            String num2ESP = numerosESP.getOrDefault(num2, "Numero no disponible");
            String sumaESP = numerosESP.getOrDefault(suma, "Numero no disponible");

            String num1ENG = numerosENG.getOrDefault(args, sumaESP)

            System.out.println("La suma de " + num1ESP + " más " + num2ESP + " es " + sumaESP);
        }
    }
}
