package org.example;

import org.example.Modelos.Apartamento;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***********");
        System.out.println("\n BIENVENIDO !!!");
        System.out.println("************");

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        System.out.println("Digita la ubicacion: ");
        apartamento.setUbicacion(lea.nextLine());

        System.out.println("Digita el valor del apto: ");
        apartamento.setValorApto(lea.nextInt());

        System.out.println("Digita el numero de habitaciones: ");
        apartamento.setNumeroHabitaciones(lea.nextLine());

        System.out.println("Digita los metros cuadrados del apto: ");
        apartamento.setMetrosCuadrados(lea.nextDouble());

        System.out.println("Digita si tiene balcon el apartamento: ");
        apartamento.setTieneBalcon(lea.nextBoolean());

        System.out.println("Digite el tipo de apartamento: ");
        apartamento.setTipo(lea.nextLine());

        System.out.println(apartamento);
    }
}