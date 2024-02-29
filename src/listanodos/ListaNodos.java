/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listanodos;

/**
 *
 * @author Usuario
 */
public class ListaNodos {
    public int Dato;
    ListaNodos apuntador;

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public ListaNodos getApuntador() {
        return apuntador;
    }

    public void setApuntador(ListaNodos apuntador) {
        this.apuntador = apuntador;
    }

    
    
    public ListaNodos(int valor){
        this.Dato = valor;
        this.apuntador = null;
    }

    
}
