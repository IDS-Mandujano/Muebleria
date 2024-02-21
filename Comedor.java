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

        
    }
}
