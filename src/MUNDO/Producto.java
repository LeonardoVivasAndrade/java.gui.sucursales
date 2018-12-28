
package MUNDO;

import java.util.Date;

/**
 * @author Angel Leonardo Vivas Andrade - codigo 1151646 Ing. de Sistemas UFPS
 */
public class Producto {
    
    /**
     * Declaración de parámetros
     */
    public String nombre;
    public String codigo;
    public String descripcion;
    public int precio;
    public Date fecha;
    
    /**
     * Creación de Constructor vacío.
     */
    public Producto() {}
    
    /**
     * Creación de Constructor que inicializa parámetros.
     */
    public Producto(String nombre, String codigo, String descripcion, int precio, Date fecha) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
    }    
    
    /**
    * Métodos Get y Set de los Parametros de la clase Producto.
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }       
}