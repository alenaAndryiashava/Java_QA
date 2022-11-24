
public class Mushroom extends Ingredient implements Frieable {

    public Mushroom(int quantity) {
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
        System.out.print("Mushroom (gr): ");
        long productQuantity = getQuantity();
        productQuantity = (long) (productQuantity + productQuantity*0.8);
        return productQuantity;
    }

    @Override
    public void fry() {
        System.out.println("Fry 15 minutes.");

    }
}

