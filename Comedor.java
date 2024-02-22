import java.util.Scanner;

public class Comedor extends Producto{
    
    private Boolean isCombo = false;

    public void setIsCombo(Boolean isCombo) {
        this.isCombo = isCombo;
    }
    public Boolean getIsCombo() {
        return isCombo;
    }
    
    public void mostrarDetalles() {
        super.mostrarDetalles();
        Scanner leer = new Scanner(System.in);
        String nombres[] = {"Silla","Mesa"};
        int precios[] = {800,4000};
        
        for(int i=0;i<2;i++){
            this.nombre = nombres[i];
            this.precio = precios[i];
            System.out.println(i+1+".-"+getNombre()+" de comedor....$"+getPrecio());
        }
    }
}
