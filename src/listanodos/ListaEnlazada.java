/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listanodos;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada {
    
    ListaNodos cabeza;
    int tamano = 0;
    
    public ListaEnlazada(){
        this.cabeza = null;
    }
    
    public void agregarPrimero(int dato){
        
        ListaNodos nuevoNodo = new ListaNodos(dato);
        
        if(cabeza == null){
            cabeza = nuevoNodo; 
           
        }else{
            ListaNodos temporal = cabeza;
            while(temporal.getApuntador() != null){
                temporal = temporal.getApuntador();
            }
            temporal.setApuntador(nuevoNodo);
        }
        tamano++;
    }
    public int tamanoLista(){
        return tamano;
    }
    public void ImprimirLista(){
        

        ListaNodos tempo = cabeza;

        System.out.println(tempo.getDato());
        while(tempo.getApuntador() != null){


            
            tempo = tempo.getApuntador();
            System.out.println(tempo.getDato());
           
        }

    }
    public void removerDuplicados() {
        ListaNodos actual = cabeza;
        while (actual != null && actual.getApuntador()!= null) {
            if (actual.getDato() == actual.getApuntador().getDato()) {
                actual.setApuntador(actual.getApuntador().getApuntador());
            } else {
                actual = actual.getApuntador();
            }
        }
    }
    
}
        
        
    
//   
//    

