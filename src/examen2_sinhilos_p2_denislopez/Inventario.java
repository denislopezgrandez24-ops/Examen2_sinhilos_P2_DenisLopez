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
    
    ArrayList<Producto>productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        
        this.productos.add(p);
        
    }
    
    public void buscarProducto(String codigo){
        
        for(int i=0; i<productos.size(); i++){
                
            if(productos.get(i).equals(codigo)){
                
            }
                
        }
        
        
    }
    
}
