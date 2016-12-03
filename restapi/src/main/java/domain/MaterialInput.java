package domain;

/**
 * Created by Ignacio Flores on 22/8/2016.
 */
public class MaterialInput {

    private Long materialInputId;
    private MaterialInputType materialInputType;
    private String name;
    private Long quantity;
    private Long idealStock;
    private Long variance;

    public MaterialInput() {
    }

    public Long getMaterialInputId() {
        return materialInputId;
    }

    public void setMaterialInputId(Long materialInputId) {
        this.materialInputId = materialInputId;
    }

    public MaterialInputType getMaterialInputType() {
        return materialInputType;
    }

    public void setMaterialInputType(MaterialInputType materialInputType) {
        this.materialInputType = materialInputType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getIdealStock() {
        return idealStock;
    }

    public void setIdealStock(Long idealStock) {
        this.idealStock = idealStock;
    }

    public Long getVariance() {
        return variance;
    }

    public void setVariance(Long variance) {
        this.variance = variance;
    }
}
