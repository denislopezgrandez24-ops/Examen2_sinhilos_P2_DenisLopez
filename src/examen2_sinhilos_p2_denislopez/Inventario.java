/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_sinhilos_p2_denislopez;

import java.util.ArrayList;

/**
 *
 * @author denis
 */
public class Inventario {
    
    //ArrayList<Producto>productos = new ArrayList<>();
    
    public void agregarProducto(Producto p, ArrayList<Producto>listas){
        
        listas.add(p);
        
    }
    
    public String buscarProducto(String codigo, ArrayList<Producto>listas){
        
        String texto = "";
        for(int i=0; i<listas.size(); i++){
                
            if(listas.get(i).equals(codigo)){
                
                texto += listas.get(i).toString();
                
            }
                
        }
        
        return texto;
    }
    
}
