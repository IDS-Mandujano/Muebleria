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
        Scanner leer = new Scanner(System.in);
        super.mostrarDetalles();
        String nombres[] = {"Silla","Mesa"};
        int precios[] = {800,4000};
        
        for(int i=0;i<2;i++){
            this.nombre = nombres[i];
            this.precio = precios[i];

            System.out.println(getNombre()+" de comedor....$"+getPrecio());
        }
        System.out.println("Desea ver el combo? SI/NO");
        String opc = leer.nextLine();

        if(opc=="SI"){
            Boolean validation = true;
            setIsCombo(validation);
        }
        if (getIsCombo() == true) {
            for(int i=0;i<2;i++){
                this.nombre = nombres[i];
            }
        }
    }
}
