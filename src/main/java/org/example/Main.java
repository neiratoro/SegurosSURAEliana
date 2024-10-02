package org.example;

import org.example.MODELOS.Agencia;
import org.example.MODELOS.Asegurado;
import org.example.MODELOS.Asesor;
import org.example.MODELOS.Beneficiario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("******  SISTEMA ASEGURADOR  *******");
        System.out.println("--------------------------------");

        System.out.println(" \n Bienvenido !!! ");

        Asesor = new Asesor(1, "Casa", "Calle V 13", "Sanroque",
                "USA", 150000.0, 3, 120.5, true, 1995);

        Asesor = new Asesor(2, "apto", "Calle Falsa 23", "sanJuan",
                "USA", 150000.0, 3, 120.5, true, 1995);

        Asesor = new Asesor(2, "apto", "Calle Falsa 23", "sanJuan",
                "USA", 150000.0, 3, 120.5, true, 1995);

        Scanner lea = new Scanner(System.in);
        Asesor asesor = new  Asesor();
        System.out.print("Digite el Id del apartamento: ");
        asesor.setIdAsesor(lea.nextLong());
        System.out.print("Nombre Asesor: ");
        asesor.setNombreCompleto(lea.next());
        System.out.print("Digite tu especialidad: ");
        asesor.setEspecialidad(lea.nextLine());
        System.out.println("Digite su direccion");
        asesor.setDireccion(lea.next());
        System.out.println("Digite anios de experiencia");
        asesor.setAniosExperiencia(lea.nextInt());
        System.out.println("Años de experiencia");
        asesor.setCorreoElectronico(lea.next());

        Agencia = new Agencia(1, "Juana", "Calle V 13", "Sanroque",
                "USA", 150000.0, 3, 120.5, true, 1995);

        Agencia = new Agencia(2, "Amalia", "Calle Falsa 23", "sanJuan",
                "USA", 150000.0, 3, 120.5, true, 1995);

        Agencia = new Agencia(3, "SantaFé", "Calle Falsa 23", "sanJuan",
                "USA", 150000.0, 3, 120.5, true, 1995);

        
        Scanner lea = new Scanner(System.in);
        Agencia agencia = new Agencia();
        System.out.print("Digite el Id de la agencia: ");
        agencia.setIdAgencia(lea.nextLong());
        System.out.print("Id de la agencia: ");
        agencia.getIdAgencia(lea.nextLong());
        System.out.print("Digite el nombre de la agencia: ");
        agencia.setNombreAgencia(lea.nextLine());
        System.out.println("Digite el correo electronico de la agencia");
        agencia.setCorreoElectronico(lea.next());
        System.out.println("Digite años de experiencia");
        agencia.setIngresosAnuales(lea.nextDouble());
        System.out.println("Digite el numero de empleados ");
        agencia.setNumeroEmpleados(lea.nextInt());







    }
}