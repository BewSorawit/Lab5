public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void printReceipt(InventoryCart inventoryCart) {
        System.out.println("Product = " + inventoryCart.getIndex());
        Product product[] = inventoryCart.getAllProduct();
        System.out.println("\tPumpkin Shkp (" + name + ")");

        double sum = 0;
        for (int i = 0; i < inventoryCart.getIndex(); i++) {
            if (product[i] != null) {
                System.out.println(
                        product[i].getAmount() + " x " + name + "\t(" + product[i].getCode() + ")\t"
                                + product[i].getPrice());
                sum += product[i].getPrice() * product[i].getAmount();
            }
        }
        System.out.println("\t\tTotal\t" + sum + "$");

    }
}
