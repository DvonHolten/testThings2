package org.example;

import java.io.*;

public class SalesProductDTO
implements Serializable {

    @Serial
    private final static long serialVersionUID = 2023_08_13_1655L;


    private int rowId = -1;

    /**
     * Must be 3 digits
     */
    private String productCode;

    private String productName;

    /**
     * the UNStoffNr is a 4-digit code
     */
    private String unStoffNr;

    private RecordStatus recStatus = new RecordStatus();

    public SalesProductDTO(){

    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId( int rowId ) {
        this.rowId = rowId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode( String productCode ) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName( String productName ) {
        this.productName = productName;
    }

    public String getUnStoffNr() {
        return unStoffNr;
    }

    public void setUnStoffNr( String unStoffNr ) {
        this.unStoffNr = unStoffNr;
    }

    public RecordStatus getRecStatus() {
        return recStatus;
    }

    public void setRecStatus( RecordStatus recStatus ) {
        this.recStatus = recStatus;
    }
}
