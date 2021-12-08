package ProductoOrange;

/**
 *
 * @author Daniel Roa
 */
public class Impresora extends Producto {
    private char tipoTinta; // 'T'=toner o 'I'=inyeccion  

    public Impresora() {
    }

    public Impresora(char tipoTinta, int codigo, String marca, char estado, int precioReparacion, int precioRepuesto) {
        super(codigo, marca, estado, precioReparacion, precioRepuesto);
        this.setTipoTinta (tipoTinta);
    }

    public char getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(char tipoTinta) {
        if (tipoTinta=='T' || tipoTinta=='I' ) {           
            this.tipoTinta = tipoTinta;
        }
        else{
            System.out.println("Ingrese su tipo de tinta 'T'=toner o 'I'=inyeccion  ");
        }
            

    }

    public String mostrarDatos() {
        return super.toString() +  "Impresora{" + "tipoTinta=" + tipoTinta + '}';
        
    }
    
    

    @Override
    public int contarProducto() {
        int cant = 0;
        if (getTipoTinta() == 'T'){
            System.out.println( 1400 + getPrecioRepuesto());
        }
        return cant;
    }

    @Override
    public int calcularPrecioFinal(int precioReparacion) {
        int IVA = 0;
        int total = 0;
        IVA = (int) ((getPrecioRepuesto() + getPrecioReparacion()) * Reparable.IVA);
        total = (IVA + getPrecioReparacion() + getPrecioRepuesto() );
        return total;
    }
    
    
}
