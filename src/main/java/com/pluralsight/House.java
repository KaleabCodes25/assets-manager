package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset{
    private String address;
    private int condition; //(1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    @Override
    public BigDecimal getValue(){
       return getOriginalCost();
    }

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", condition=" + condition +
                ", squareFoot=" + squareFoot +
                ", lotSize=" + lotSize +
                '}';
    }
}
