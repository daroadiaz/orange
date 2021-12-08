package ProductoOrange;

import java.util.ArrayList;

/**
 *
 * @author Daniel Roa
 */
public class ListaProducto {
    
    ArrayList<Producto> producto =new ArrayList<Producto>();
    
    public ListaProducto() {
        producto =new ArrayList<Producto>();
    }
    public void agregarProducto(Producto nuevoProducto) {
        if (this.verificarProducto(nuevoProducto.getCodigo()) == false) {
            producto.add(nuevoProducto);
            
        }
        else {
            System.out.println("Producto Existe");
        }
    }
    public void listar () {
        for (Producto temporalProducto : producto) {
            System.out.println(temporalProducto.toString());
        }
    }
    public boolean verificarProducto (int codigo) {
        boolean existe = false;
        for (Producto temporalProductos : producto) {
            if (temporalProductos.getCodigo () == codigo){
                existe = true;
                break;
            }
        }
        return existe;
    }
    public void eliminarProducto(String marca) {
        for (int i = 0; i< producto.size(); i++) {
            if (producto.get(i).getMarca().equals(marca)) {
                producto.remove(i);
                i = i-1;
            }
        }
    }
}

