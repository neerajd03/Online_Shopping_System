import java.util.ArrayList;

public class Usercontroller {

    private static ArrayList<Usermodel> listOfProducts = new ArrayList<>();

    public boolean saveProduct(Usermodel user) {
        listOfProducts.add(user);
        return true;
    }

    public boolean setByName(String productName, String newName, long id, String category, double cost) {
        for (Usermodel product : listOfProducts) {
            if (product.getProductName().equals(productName)) {
                product.setProductName(newName);
                product.setProductId(id);
                product.setCategory(category);
                product.setCost(cost);
                return true;
            }
        }
        return false;
    }

    public void showItemsByName(String productName) {
        for (Usermodel product : listOfProducts) {
            if (product.getProductName().equals(productName)) {
                System.out.println(product);
            }
        }
    }

    public void showItems() {
        for (Usermodel product : listOfProducts) {
            System.out.println(product.getProductName());
        }
    }

    public boolean deleteItem(String productName) {
        return listOfProducts.removeIf(product -> product.getProductName().equals(productName));
    }

    public void totalCost() {
        double total = 0;
        for (Usermodel product : listOfProducts) {
            total += product.getTotalCost();
        }
        System.out.println("Total cost = " + total);
    }
}
