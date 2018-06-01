
package working.oo.guitarproject;

/**
 * @author suresh.gupta
 *
 */
public class Guitar {
    private String serialName;
    private String builder;
    private String backWood;
    private String topWood;
    private String model;
    private Double price;

    public Guitar(String serialNumber, Double price) {
        this.serialName = serialNumber;
        this.price = price;
    }

    public String getSerialName() {
        return serialName;
    }

    public void setSerialName(String serialName) {
        this.serialName = serialName;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
