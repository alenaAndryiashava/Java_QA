
public class Pork extends Ingredient implements Stewable {

    public Pork(int quantity) {
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
        System.out.print("Pork (gr): ");
        long productQuantity = getQuantity();
        productQuantity = (long) (productQuantity + productQuantity*0.5);
        return productQuantity;
    }


    @Override
    public void stew() {
        System.out.println("Stew one hour.");

    }
}


