import java.util.ArrayList;
import java.util.Scanner;

public class Compra {
    private ArrayList countProduct = new ArrayList<Producto>();

    public void setCountProduct(Producto producto) {
        countProduct.add(producto);
    }
    public ArrayList getCountProduct() {
        return countProduct;
    }

    public void realiceBuy(){
        Scanner leer = new Scanner(System.in);
        int opc;
        int drumDoor = 1200 , birchDoor = 1500;
        int table = 4000, chair = 800, combo = 7000;

        do {
            System.out.println("Que desea comprar?\n1.-Puertas\n2.-Comedores\n3.-Salir");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    addDoor(drumDoor,birchDoor);
                    break;
                case 2:
                    addDiningRoom(table,chair,combo);
                    break;
                case 3:
                    System.out.println("Vuelva pronto\nSaliendo...");
                    break;
            }
        }while (opc!=3);


    }
    public void calculeTotal(){

    }
    public void printTicket(){

    }

    private void addDoor(int drumDoor, int birchDoor) {
        Scanner leer = new Scanner(System.in);
        Puerta puerta = new Puerta();
        Producto producto = new Producto();
        producto.setName("Puerta");

        int opc = 0;
        int opcDesicion = 0;

        do {
            puerta.viewDetails();
            System.out.println("3.-Salir");
            opc = leer.nextInt();

            while (opc <= 0 || opc > 3) {
                System.out.println("Ingrese una opcion dentro del rango");
                opc = leer.nextInt();
            }

            if (opc == 1) {
                producto.setPrice(drumDoor);
                setCountProduct(producto);
            } else if (opc == 2) {
                producto.setPrice(birchDoor);
                setCountProduct(producto);
            }

            System.out.println("Desea agregar otro producto?\n1.-Si\n2.-No");
            opcDesicion = leer.nextInt();

            while (opcDesicion <= 0 || opcDesicion > 2) {
                System.out.println("Ingrese una opcion dentro del rango");
                opcDesicion = leer.nextInt();
            }

        } while (opc != 3 && opcDesicion != 2);
        System.out.println("Tamaño total de la lista de productos: " + countProduct.size());
    }


    private void addDiningRoom(int table, int chair, int combo){
        Scanner leer = new Scanner(System.in);
        Comedor comedor = new Comedor();
        int opc = 0;
        int opcDesicion = 0;


    }
}
