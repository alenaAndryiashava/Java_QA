
//Создать абстрактный класс Ingredient с полем quantity, геттером, сеттром,
// абстрактным методом long calculateQuantityFor100Gramm()
// (сколько грамм сырого продукта нужно, чтобы получить 100 грамм после приготовления)
public abstract class Ingredient {
    int quantity;

    public Ingredient(int quantity) {
        this.quantity = quantity;
    }

    public abstract int getQuantity();



    public abstract void setQuantity();



    public abstract long calculateQuantityFor100Gramm();


}
