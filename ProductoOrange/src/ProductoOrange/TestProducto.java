package ProductoOrange;

/**
 *
 * @author Daniel Roa
 */
public class TestProducto {
    public static void main(String[] args) {
        ComputadorPersonal computador = new ComputadorPersonal("I5 Intel", 12 , 'S' , 1321, "Computador", 'R', 10000, 200);
        computador.mostrarDatos();
        System.out.println("Precio Final: " + computador.calcularPrecioFinal(computador.getPrecioReparacion()));
        computador.contarProducto();
        
        Impresora impresora = new Impresora('T', 1322, "Impresora", 'R', 5000, 500);
        impresora.mostrarDatos();
        System.out.println("Precio Final: " + impresora.calcularPrecioFinal(impresora.getPrecioReparacion()));
        impresora.contarProducto();
        
        System.out.println("********************");
        ListaProducto lp = new ListaProducto();
        lp.agregarProducto(computador);
        lp.agregarProducto(impresora);
        
        if (lp.verificarProducto(100) == false) {
            System.out.println("No Existe");
        }
        else {
            System.out.println("Existe");
        }
        lp.listar();
        
    }
    
    
    
}
