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
package reusabledesign.oo.guitarproject;

import oo.utils.StringUtils;

/**
 * @author suresh.gupta
 *
 */
public class GuitarSpec {
    private String backWood;
    private String topWood;
    private String model;
    private String builder;
    private String type;

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean matches(GuitarSpec guitarSpec) {
        return validateSearchProperties(guitarSpec.getBuilder(), this.getBuilder())
                && validateSearchProperties(guitarSpec.getModel(), this.getModel())
                && validateSearchProperties(guitarSpec.getBackWood(), this.getBackWood())
                && validateSearchProperties(guitarSpec.getTopWood(), this.getTopWood())
                && validateSearchProperties(guitarSpec.getType(), this.getType());

    }

    private boolean validateSearchProperties(String inventoryGuitarAttr, String searchGuitarAttr) {
        return (StringUtils.isBlank(inventoryGuitarAttr) && StringUtils.isBlank(searchGuitarAttr))
                || (StringUtils.isBlank(inventoryGuitarAttr) && inventoryGuitarAttr.equals(searchGuitarAttr));
    }
}
