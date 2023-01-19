package TGDDproduct_management.backend.database;

import TGDDproduct_management.backend.model.Cart;
import TGDDproduct_management.backend.model.CartHistory;
import TGDDproduct_management.backend.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CartHistoryDB {
    public static List<Cart> carts = FileUtils.getDataCartFromFile("cart-history.json");
}
