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
package applyoop.oo.guitarproject.main;

import java.util.List;

import applyoop.oo.guitarproject.Guitar;
import applyoop.oo.guitarproject.GuitarSpec;
import applyoop.oo.guitarproject.Inventory;

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
        GuitarSpec guitar = getUserGuitar();
        searchGuitar(guitar);
    }

    private GuitarSpec getUserGuitar() {
        return setUpGuitarSpec("model", "backWood", "topWood", "builder");
    }

    private void searchGuitar(GuitarSpec searchGuitar) {
        List<Guitar> matchingGuitars = inventory.search(searchGuitar);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Dear User, you might like below Guitars: ");
            for (Guitar guitar : matchingGuitars) {
                System.out.println("Model: " + guitar.getGuitarSpec().getModel() + " \nBuilder: "
                        + guitar.getGuitarSpec().getBuilder() + " \nBackwood and topwood: "
                        + guitar.getGuitarSpec().getBackWood()
                        + " "
                        + guitar.getGuitarSpec().getTopWood()
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
        GuitarSpec guitarSpec = setUpGuitarSpec(model, backWood, topWood, builder);
        guitar.setGuitarSpec(guitarSpec);
        return guitar;
    }

    private GuitarSpec setUpGuitarSpec(String model, String backWood, String topWood, String builder) {
        GuitarSpec guitarSpec = new GuitarSpec();
        guitarSpec.setBuilder(builder);
        guitarSpec.setModel(model);
        guitarSpec.setBackWood(backWood);
        guitarSpec.setTopWood(topWood);
        return guitarSpec;
    }
}
