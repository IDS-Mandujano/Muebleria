import java.util.Scanner;
public class Comedor extends Producto{
    private boolean isCombo = false;

    public void setCombo(boolean combo) {
        isCombo = combo;
    }
    public boolean getIsCombo(){
        return this.isCombo;
    }

    public void viewDetails() {
        Scanner leer = new Scanner(System.in);
        super.viewDetails();
        String names[] = {"Sillas","Mesa"};
        int prices[] = {800,4000};

        for(int i=0;i<2;i++){
            this.name = names[i];
            this.price = prices[i];
            System.out.println(i+1+".-"+getName()+" de comedor...$"+getPrice());
        }

        System.out.println("Desea ver el combo?\n1.-Si\n2.-No");
        int opc = leer.nextInt();
        while (opc<=0||opc>2){
            System.out.println("Error\nIngrese una opcion dentro del rango");
            opc = leer.nextInt();

        }
        if (opc==1){
            setCombo(true);
        }
        if(getIsCombo() == true){
            System.out.println("3.-Combo de sillas y mesa....$7000");
        }
    }
}
