import java.util.ArrayList;

public class Compra {

    private ArrayList cantidadProducto = new ArrayList<Producto>();
    private Producto producto = new Producto();

    public void setCantidadProducto(Producto producto){
        cantidadProducto.add(producto);
    }
    public ArrayList getCantidadProducto() {
        return cantidadProducto;
    }
    
    public void realizarCompra(){
        
    }

    public void calcularTotal(){

    }

    public void imprimirTicket(){

    }
}
