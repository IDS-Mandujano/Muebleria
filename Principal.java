import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner leer = new Scanner(System.in);
        int opc;

        System.out.println("Bienvenido a los PINOS\nEscoja una opcion");
        do{
            System.out.println("1.- Ver puertas\n2.- Ver comedores\n3.- Realizar pago\n4.- Salir");
            opc = leer.nextInt();
            while (opc <=0 || opc>4) {
                System.out.println("Error \nSeleccione una opcion valida: ");
                opc = leer.nextInt();
            }
            validarOpcion(opc);
        }while(opc!=4);
    }

    public static void validarOpcion(int opc){
        Comedor comedor = new Comedor();
        Puerta puerta = new Puerta();
        switch (opc) {
            case 1:
                separadores();
                puerta.mostrarDetalles();
                separadores();
                break;
            case 2:
                separadores();
                comedor.mostrarDetalles();
                separadores();
                break;
            case 3:
                menuCompra();
                break;
            case 4:
                endSystem();
                break;
        }
    }

    public static void menuCompra(){
        
    }

    public static void separadores(){
        System.out.println("--------------------");
    }
    public static void endSystem(){
        System.out.println("Vuelva pronto\nSaliendo....");
    }
}