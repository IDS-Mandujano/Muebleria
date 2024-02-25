import java.util.ArrayList;
import java.util.Scanner;
public class Compra {
    private ArrayList<Producto> countProduct = new ArrayList<>();

    public void setCountProduct(Producto producto) {
        countProduct.add(producto);
    }

    public ArrayList<Producto> getCountProduct() {
        return countProduct;
    }

    public void realiceBuy() {
        Scanner leer = new Scanner(System.in);
        int opc;
        int drumDoor = 1200, birchDoor = 1500;
        int table = 4000, chair = 800, combo = 7000;

        do {
            System.out.println("Que desea comprar?\n1.-Puertas\n2.-Comedores\n3.-Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    addDoor(drumDoor, birchDoor);
                    break;
                case 2:
                    addDiningRoom(table, chair, combo);
                    break;
                case 3:
                    System.out.println("Vuelva pronto\nSaliendo...");
                    break;
            }
        } while (opc != 3);
    }

    private void addDoor(int drumDoor, int birchDoor) {
        Scanner leer = new Scanner(System.in);
        Puerta puerta = new Puerta();
        int opcDecision = 0;
    
        do {
            Producto producto = new Producto();
            producto.setName("Puerta");
    
            System.out.println("Seleccione una opción:");
            System.out.println("1. Puerta de tambor ($" + drumDoor + ")");
            System.out.println("2. Puerta de abedul ($" + birchDoor + ")");
            System.out.println("3. Salir");
            int opc = leer.nextInt();
    
            switch (opc) {
                case 1:
                    producto.setPrice(drumDoor);
                    setCountProduct(producto);
                    break;
                case 2:
                    producto.setPrice(birchDoor);
                    setCountProduct(producto);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida");
                    continue;
            }
    
            System.out.println("Desea agregar otro producto?\n1.-Si\n2.-No");
            opcDecision = leer.nextInt();
    
            while (opcDecision != 1 && opcDecision != 2) {
                System.out.println("Ingrese una opcion válida (1 o 2)");
                opcDecision = leer.nextInt();
            }
        } while (opcDecision == 1);
    
        System.out.println("Tamaño total de la lista de productos: " + getCountProduct().size());
        calculeTotal();
    }
    
    private void addDiningRoom(int table, int chair, int combo) {
        Scanner leer = new Scanner(System.in);
        Comedor comedor = new Comedor();
        int opcDecision = 0;
    
        do {
            Producto producto = new Producto();
            System.out.println(
                    "1.-Silla de comedor...$" + chair +
                            "\n2.-Mesa de comedor....$" + table +
                            "\n3.-Sillas y mesa de comedor....$" + combo +
                            "\n4.-Salir");
    
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    producto.setName("Silla de comedor");
                    producto.setPrice(chair);
                    setCountProduct(producto);
                    break;
                case 2:
                    producto.setName("Mesa de comedor");
                    producto.setPrice(table);
                    setCountProduct(producto);
                    break;
                case 3:
                    producto.setName("Sillas y mesa de comedor");
                    producto.setPrice(combo);
                    setCountProduct(producto);
                    break;
                case 4:
                    break;
                
            }
    
            System.out.println("Desea agregar otro producto?\n1.-Si\n2.-No");
            opcDecision = leer.nextInt();
    
            while (opcDecision != 1 && opcDecision != 2) {
                System.out.println("Ingrese una opcion válida (1 o 2)");
                opcDecision = leer.nextInt();
            }
        } while (opcDecision == 1);
    
        System.out.println("Tamaño total de la lista de productos: " + getCountProduct().size());
        calculeTotal();
    }
    
    private void calculeTotal() {
        Scanner leer = new Scanner(System.in);
        int total = 0;
        int pay =0;
        for (int i = 0; i < countProduct.size(); i++) {
            total += countProduct.get(i).getPrice();
        }
        while(pay != total){System.out.println("Total a pagar: $" + total);
        pay = leer.nextInt();
         }
        printTicket(pay);
        
    }

    private void printTicket(int pay) {
        System.out.println("Recibo de compra:");
        for (int i = 0; i < countProduct.size(); i++) {
            Producto producto = countProduct.get(i);
            System.out.println(producto.getName() + " - $" + producto.getPrice());
        }
        System.out.println("Usted ha pagado: " + pay);
        
    }
    
}
