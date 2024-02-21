public class Puerta extends Producto{
    
    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        int precios[] = {1500,1200};
        String tipos[] = {"Abedul","Tambor"};
        this.nombre = "Puerta";

        for(int i=0; i<2;i++){
            this.tipo = tipos[i];
            this.precio = precios[i];
            System.out.println(getNombre()+" de "+getTipo()+"....$"+getPrecio());
        }
    }
}
