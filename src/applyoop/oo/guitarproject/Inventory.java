
package applyoop.oo.guitarproject;

import java.util.ArrayList;
import java.util.List;

import oo.utils.StringUtils;

/**
 * @author suresh.gupta
 *
 */
public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public Guitar guitarBySerialNo(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialName().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {

        List<Guitar> matchingGuitars = new ArrayList<>();
        for (Guitar guitar : guitars) {
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            if (validateSearchProperties(searchGuitar.getBuilder(), guitarSpec.getBuilder())
                    && validateSearchProperties(searchGuitar.getModel(), guitarSpec.getModel())
                    && validateSearchProperties(searchGuitar.getBackWood(), guitarSpec.getBackWood())
                    && validateSearchProperties(searchGuitar.getTopWood(), guitarSpec.getTopWood())) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    private boolean validateSearchProperties(String inventoryGuitarAttr, String searchGuitarAttr) {
        return StringUtils.nonNull(inventoryGuitarAttr) && inventoryGuitarAttr.equals(searchGuitarAttr);
    }
}
