package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        //DEFINIENDO COSTOS DE LA FIESTA
        System.out.println("****GRAN FIESTA GRUPO URIBE****");
        System.out.println("*******************************");

        System.out.println("1. Digita el costo de la comida: ");
        double costoAlimentos=entradaPorTeclado.nextDouble();
        if(costoAlimentos>0){
            objetoFiesta.costosAlimentos=costoAlimentos;
        }else{
            System.out.println("Ingresa un valor valido, rata");
        }
        System.out.println("el costo de alimentos fue:"+objetoFiesta.costosAlimentos);


        System.out.println("2. Digita el costo de las bebidas: ");
        double costosBebidas=entradaPorTeclado.nextDouble();
        if(costosBebidas>0){
            objetoFiesta.costosBebidas=costosBebidas;
        }else{
            System.out.println("Ingresa un valor valido, rata");
        }
        System.out.println("el costo de alimentos fue:"+objetoFiesta.costosBebidas);


        System.out.println("3. Digita el costo del lugar: ");
        double costosLugar=entradaPorTeclado.nextDouble();
        if(costosLugar>0){
            objetoFiesta.costosLugar=costosLugar;
        }else{
            System.out.println("Ingresa un valor valido, rata");
        }
        System.out.println("el costo del lugar  fue:"+objetoFiesta.costosLugar);


        System.out.println("4. Digita el costo de los equipos: ");
        double costosEquipos=entradaPorTeclado.nextDouble();
        if(costosBebidas>0){
            objetoFiesta.costosEquipos=costosEquipos;
        }else{
            System.out.println("Ingresa un valor valido, rata");
        }
        System.out.println("el costo de los equipos fue:"+objetoFiesta.costosEquipos);
    }
}