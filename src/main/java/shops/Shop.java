package shops;
import items.Item;

import java.util.ArrayList;
import java.util.List;

interface Shop {
    List<String> weps = new ArrayList();

    double sellItem(Item i);
    void buyItem(Item i);

}
