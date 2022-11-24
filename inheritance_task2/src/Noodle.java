
public class Noodle extends Ingredient implements Boilable {

    public Noodle(int quantity) {
        super(quantity);

    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity() {

    }

    @Override
    public long calculateQuantityFor100Gramm() {
        System.out.print("Noodle (gr): ");
        long productQuantity = getQuantity();
        productQuantity = (long) (productQuantity + productQuantity*0.1);
        return productQuantity;
    }


    @Override
    public void boil() {
        System.out.println("Boil 10 minutes");
    }
}
