/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listanodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ListaEnlazada list = new ListaEnlazada();
        int op = 0, confir = 0, dato = 0;
        System.out.println("******Bienvenido******");
        list.agregarPrimero(2);
        list.agregarPrimero(2);
        list.agregarPrimero(6);
        list.agregarPrimero(8);
        list.agregarPrimero(8);
        list.agregarPrimero(2);
        
        list.ImprimirLista();
        System.out.println("                       ");
        list.removerDuplicados();
        System.out.println("                       ");
        list.ImprimirLista();
        
//        while(confir == 0){
//        System.out.println("Elije que operacion deseas hacer: ");
//        System.out.println("1. Agregar Nodo");
//        System.out.println("2. Eliminar duplicados ");
//            System.out.println("3. Imprimir lista enlazada");
//        op = leer.nextInt();
//        switch (op) {
//            case 1:
//                System.out.println("Ingrese el valor del nodo");
//                dato = leer.nextInt();
//                list.agregarPrimero(dato);
//                
//                System.out.println(list.tamanoLista());
//                
//                break;
//            case 2:
//                list.removerDuplicados();
//                break;
//            case 3:
//                  list.ImprimirLista();
//                break;
//            default:
//                
//        }
//        }
//        
        

       
    }
    
}
