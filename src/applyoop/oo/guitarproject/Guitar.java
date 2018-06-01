
package applyoop.oo.guitarproject;

/**
 * @author suresh.gupta
 *
 */
public class Guitar {
    private String serialName;
    private Double price;
    private GuitarSpec guitarSpec;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

}
