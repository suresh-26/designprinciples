/*
 * Copyright (c) Rakuten, Inc. All Rights Reserved.
 * 
 * This program is the information assets which are handled
 * as "Strictly Confidential".
 * Permission of Use is only admitted in Rakuten Inc.
 * Development Department.
 * If you don't have permission , MUST not be published,
 * broadcast, rewritten for broadcast or publication
 * or redistributed directly or indirectly in any medium.
 * 
 * $Id$
 * Created on Apr 13, 2016
 * Updated on $Date$
 */
package working.oo.guitarproject.main;

import java.util.List;

import working.oo.guitarproject.Guitar;
import working.oo.guitarproject.Inventory;
/**
 * @author suresh.gupta
 *
 */
public class FindGuitarTester {
    private Inventory inventory = null;

    public static void main(String[] args) {
        FindGuitarTester findGuitarTester = new FindGuitarTester();
        findGuitarTester.testGuitarService();
    }

    public void testGuitarService() {
        intializeInventory();
        Guitar guitar = getUserGuitar();
        searchGuitar(guitar);
    }

    private Guitar getUserGuitar() {
        return setUpGuitar(null, null, "model", "backwood", "topWood", "builder");
    }

    private void searchGuitar(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = inventory.search(searchGuitar);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Dear User, you might like below Guitars: ");
            for (Guitar guitar : matchingGuitars) {
                System.out.println("Model: " + guitar.getModel() + " \nBuilder: "
                        + guitar.getBuilder() + " \nBackwood and topwood: " + guitar.getBackWood() + " "
                        + guitar.getTopWood()
                        + ".\nYou can get this for only $: " + guitar.getPrice());
            }
        } else {
            System.out.println("Sorry we have nothing for you!");
        }
    }

    private void intializeInventory() {
        inventory = new Inventory();
        Guitar guitar = setUpGuitar("123", 1550.55, "model", "backWood", "topWood", "builder");
        inventory.addGuitar(guitar);
    }

    private Guitar setUpGuitar(String serialNumber, Double price, String model, String backWood, String topWood,
            String builder) {
        Guitar guitar = new Guitar(serialNumber, price);
        guitar.setBuilder(builder);
        guitar.setModel(model);
        guitar.setBackWood(backWood);
        guitar.setTopWood(topWood);
        return guitar;
    }
}
