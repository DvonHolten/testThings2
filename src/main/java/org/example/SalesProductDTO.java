//
//  History:
//  13-aug-23, dvh  update
//  14-nov-22, dvh  JavaDoc: comment width of field 'bemerkung'
//  17-sep-19, dvh  suppress warning for weaker access-level
//  07-sep-18, dvh  patch the EtOH-MassKonz when not provided
//  07-sep-19, dvh  annotations
//  21-may-19, dvh  support new fields for PIDX-records
//  19-aug-16, dvh  truncate the export-DtTm, drop the milliSecs
//  16-aug-16, dvh  support etoh-data in HBLIF
//  09-aug-16, dvh  support referenzNr in HBLIEF
//  29-feb-16, dvh  use specific format for date/time-fields
//  04-dec-15, dvh  new PRODUKTBESTAND for baseProduct
//  26-nov-15, dvh  new for integra-interface
//  27-nov-15, dvh  support einlagererNr
//
package org.example;

import java.io.Serial;
import java.io.Serializable;
import java.text.SimpleDateFormat;

import org.jetbrains.annotations.*;

public final class SalesProductDTO
        implements Serializable {

    @Serial
    private final static long serialVersionUID = 2023_08_13_1655L;


    static final SimpleDateFormat dtTmFmt = new SimpleDateFormat( "yyMMdd HH:mm" );

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

    int zaehlerNr = 0;
    private RecordStatus recStatus = new RecordStatus();

    public SalesProductDTO() {

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

        try {
            int i = Integer.parseInt( unStoffNr );
        } catch (NumberFormatException nfExc) {
            throw new IllegalArgumentException( "must be numeric" );
        }

        this.unStoffNr = unStoffNr;
    }

    public RecordStatus getRecStatus() {
        return recStatus;
    }

    public void setRecStatus( RecordStatus recStatus ) {
        this.recStatus = recStatus;
    }


    @Contract(pure = true)
    public int getZaehlerNr() {
        return zaehlerNr;
    }

    public void setZaehlerNr( int zaehlerNr ) {
        this.zaehlerNr = zaehlerNr;
    }

    public void setZaehlerNr( String zlrNr ){

        try {
            if ( zlrNr.isEmpty() ) {
                zlrNr = "00";
            }
            zaehlerNr = Integer.parseInt( zlrNr );
        } catch ( Exception ex ){
            System.err.println("*** error i ZlrNr: " + zlrNr );
        }
    }

    @Override
    public String toString() {
        return "SalesProductDTO{" +
                "rowId=" + rowId +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", unStoffNr='" + unStoffNr + '\'' +
                ", zaehlerNr=" + zaehlerNr +
                ", recStatus=" + recStatus +
                '}';
    }
}
