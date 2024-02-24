import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        viewMenu();
    }

    public  static void viewMenu(){
        int opc;

        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Bienvenido a los Pinos\nSeleccione una opcion\n1.-Ver productos\n2.-Comprar\n3.-Salir");
            opc = leer.nextInt();
            while (opc<=0 || opc > 4){
                warningMessage();
                opc = leer.nextInt();
            }
            validateOption(opc);
        }while (opc!=3);
    }

    public static void validateOption(int opc){
        Compra compra = new Compra();
        switch (opc){
            case 1:
                separator();
                viewProducts();
                separator();
                break;
            case 2:
                separator();
                compra.realiceBuy();
                separator();
                break;
            case 3:
                separator();
                endMessage();
                separator();
                break;
        }
    }

    public static void viewProducts(){
        Scanner leer = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Que productos desea ver?\n1.-Puertas\n2.-Comedor\n3.-Salir");
            opc = leer.nextInt();
            while (opc<=0||opc>3){
                warningMessage();
            }
            validateOptionProducts(opc);
        }while (opc!=3);
    }

    public static void validateOptionProducts(int opc){
        Puerta puerta = new Puerta();
        Comedor comedor = new Comedor();
        switch (opc){
            case 1:
                separator();
                puerta.viewDetails();
                separator();
                break;
            case 2:
                separator();
                comedor.viewDetails();
                separator();
                break;
            case 3:
                separator();
                endMessage();
                separator();
                break;
        }
    }

    public static void warningMessage(){ System.out.println("Seleccione dentro del rango"); }
    public static void endMessage(){ System.out.println("Vuelva pronto\nSaliendo..."); }
    public static void separator(){ System.out.println("-------------------"); }

}