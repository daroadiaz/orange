package ProductoOrange;

/**
 *
 * @author Daniel Roa
 */
public class ComputadorPersonal extends Producto {
    private String procesador;  
    private int memoriaRam; // entre 2 y 16 GB    
    private int discoDuro; // entre 100 GB y 1 TB    
    private char monitor; // 'S'=si o 'N'=no    

    public ComputadorPersonal() {
    }

    public ComputadorPersonal(String procesador, int memoriaRam, char monitor, int codigo, String marca, char estado, int precioReparacion, int precioRepuesto) {
        super(codigo, marca, estado, precioReparacion, precioRepuesto);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.setMonitor (monitor);
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public char getMonitor() {
        return monitor;
    }

    public void setMonitor(char monitor) {
        if (monitor == 'S' || monitor == 'N'){
            this.monitor = monitor;
        }
        else{
            System.out.println("Elija S = Si ó N =No");
        }
    }

    

    public String mostrarDatos() {
        return super.toString() +  "ComputadorPersonal{" + "procesador=" + procesador + ", memoriaRam=" + memoriaRam + ", discoDuro=" + discoDuro + ", monitor=" + monitor + '}';
    }
    
    
    

    @Override
    public int contarProducto() {
        int cant = 0;
        if (getMarca().equalsIgnoreCase("Computador")){
            System.out.println("cantidad de Equipos " + getPrecioRepuesto());
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
