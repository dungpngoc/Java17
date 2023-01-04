package TGDDproduct_management.backend.database;

import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.List;

public class CartDB {
    public static List<Cart> carts = FileUtils.getDataCartFromFile("cart.json");
}
