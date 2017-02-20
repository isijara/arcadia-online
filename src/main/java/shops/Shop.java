package shops;
import items.Item;

import java.util.ArrayList;

interface Shop {
    ArrayList<String> weps = new ArrayList<String>();
    String miTienda = "tiendaza";
    double sellItem(Item i);
    void buyItem(Item i);

}
