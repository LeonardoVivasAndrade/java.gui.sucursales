
package MUNDO;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author Angel Leonardo Vivas Andrade - codigo 1151646 Ing. de Sistemas UFPS
 */
public class Sucursal {

    public String nombre;
    public String direccion;
    public Producto productos[];
    public int count;

    /**
     * Creación de Constructor vacío.
     */
    public Sucursal() {}
    
    /**
     * Creación de Constructor que inicializa parámetros.
     */
    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        productos = new Producto[1];        
    }
    
    /**
    * Ciclo que agrega producto en el arreglo de productos.
    * Recorre el arreglo de productos
    * Valida que el valor codigo del parametro product recibido en el metodo no se encuentre en algun objeto del arreglo productos.
    * Agrega el producto y al tiempo se crea un arreglo dinámico.
    */
    public void agregarProductos(Producto product){        
        Producto productosTmp[];
                
        if(existeProducto(product)==false){
            if(count == productos.length){
                productosTmp = new Producto[productos.length + 1];                              
                System.arraycopy(productos, 0, productosTmp, 0, productos.length);
                this.productos = productosTmp;
            }      
            productos[count++] = product;
            JOptionPane.showMessageDialog(null,"Se ha registrado "+product.getDescripcion()+" correctamente.","AVISO",JOptionPane.INFORMATION_MESSAGE);
        }                                
    }
    
    /**
    * Ciclo que elimina producto del arreglo productos.
    * Recorre el arreglo de productos y elimina cuando valide que el parametro codigo
    * sea igual al codigo del parametro product recibido en el metodo.
    * Ajusta el arreglo dinamico.    * 
    */
    public void eliminarProducto(Producto product){        
        Producto productosTmp[];
        
        for(int i=0; i<productos.length; i++){
            if(productos[i].codigo.equals(product.codigo)){
                productos[i]=null;
                productosTmp = new Producto[productos.length - 1];
                int k=0;
                for(int j=0; j<productos.length; j++){
                    if(productos[j]!=null){
                        productosTmp[k]=productos[j];
                        k++;
                    }
                }
                this.productos=productosTmp;
                count--;
                break;
            }
        }
        
        if(productos.length==0)
            productos = new Producto[1];
    }
    
    /**
    * Ciclo que recorre el arreglo de productos.
    * Busca si existe el producto.
    * Retorna falso o verdadero.
    */
    public boolean existeProducto(Producto product){
        boolean existe = false;
        for (Producto producto : productos) {
            if(producto!=null && producto.getCodigo().equals(product.getCodigo())){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
    /**
    * Ciclo que recorre el arreglo de productos.
    * Busca el que tenga la fecha mas antigua, utilizando el metodo after de la clase Date de JAVA.
    * Retorna el índice del producto encontrado.
    */
    public int indexProductoAntiguo(){
        int index=0;
        Date fechaAntigua = productos[0].getFecha();
        
        for (int i = 0; i < productos.length; i++) {
            if(productos[i]!=null && fechaAntigua.after(productos[i].getFecha())){
                index=i;
            }
        }        
        return index;
    }
    
    /**
    * Métodos Get y Set de los Parametros de la clase Sucursal.
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }   
}
