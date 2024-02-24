public class Puerta extends Producto{
    private String type;

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void viewDetails() {
        super.viewDetails();
        this.name = "Puerta";
        String tipos[] = {"abedul","tambor"};
        int prices[] = {1500,1200};

        for(int i=0;i<2;i++){
            this.type = tipos[i];
            this.price = prices[i];
            System.out.println(i+1+".-"+getName()+" de "+getType()+"....$"+getPrice());
        }
    }
}
