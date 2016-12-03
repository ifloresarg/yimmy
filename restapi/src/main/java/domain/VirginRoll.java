package domain;

/**
 * Created by Ignacio Flores on 22/8/2016.
 */
public class VirginRoll {

    private Long virginRollId;
    private WoodType woodType;
    private Float diameter1;
    private Float diameter2;
    private Float longitude;
    private VirginRoll originalRoll;

    public VirginRoll() {
    }

    public Long getVirginRollId() {
        return virginRollId;
    }

    public void setVirginRollId(Long virginRollId) {
        this.virginRollId = virginRollId;
    }

    public WoodType getWoodType() {
        return woodType;
    }

    public void setWoodType(WoodType woodType) {
        this.woodType = woodType;
    }

    public Float getDiameter1() {
        return diameter1;
    }

    public void setDiameter1(Float diameter1) {
        this.diameter1 = diameter1;
    }

    public Float getDiameter2() {
        return diameter2;
    }

    public void setDiameter2(Float diameter2) {
        this.diameter2 = diameter2;
    }

    public VirginRoll getOriginalRoll() {
        return originalRoll;
    }

    public void setOriginalRoll(VirginRoll originalRoll) {
        this.originalRoll = originalRoll;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }
}
