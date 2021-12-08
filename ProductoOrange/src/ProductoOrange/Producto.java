package ProductoOrange;

/**
 *
 * @author Daniel Roa
 */
public abstract class Producto implements Reparable{
    protected int codigo; 
    protected String marca; // Computador Ó Impresora 
    protected char estado; //‘R’: reparado, ‘E’: en reparación, ‘F’: no reparado  
    protected int precioRepuesto;    
    protected int precioReparacion; 
    

    public Producto() {
    }

    public Producto(int codigo, String marca, char estado, int precioReparacion, int precioRepuesto) {
        this.codigo = codigo;
        this.marca = marca;
        this.setEstado (estado);
        this.precioRepuesto = precioRepuesto;
        this.setPrecioReparacion (precioReparacion);
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        if (estado == 'R' || estado =='E' || estado=='F') {
        this.estado = estado;
        }
        else{
            System.out.println("Elija Una de Nuestras Opciones ‘R’= reparado, ‘E’= en reparación, ‘F’= no reparado   ");
        }
    }



    public int getPrecioRepuesto() {
        return precioRepuesto;
    }

    public void setPrecioRepuesto(int precioRepuesto) {
        this.precioRepuesto = precioRepuesto;
    }
    
    
    
    public int getPrecioReparacion() {
    return precioReparacion;
    }

    public void setPrecioReparacion(int precioReparacion) {
                if(precioReparacion > 0) {
            this.precioReparacion = precioReparacion;
        }else {
            System.out.println("PRECIO DEBE SER MAYOR A CERO");
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", marca=" + marca + ", estado=" + estado + ", precioReparacion=" + precioReparacion + ", precioRepuesto=" + precioRepuesto + '}';
    }
    
    public abstract int contarProducto();
    public int calcularTotal (int precioRepuesto) {
        int total= 0;
        int IVA = 0;
            IVA = calcularPrecioFinal(precioReparacion);
            total = this.precioReparacion + precioRepuesto + IVA * precioRepuesto + IVA*this.precioReparacion;
        return total;
    }
    
    
}
