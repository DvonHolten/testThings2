package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class SalesProductDTOTest {


    @BeforeAll
    static void beforeAllMethod() {

    }

    @BeforeEach
    void beforeEachMethod() {

    }

    @AfterEach
    void afterEachMethod() {

    }

    @AfterAll
    static void afterAllMethod() {

    }


    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link SalesProductDTO}
     *   <li>{@link SalesProductDTO#setProductCode(String)}
     *   <li>{@link SalesProductDTO#setProductName(String)}
     *   <li>{@link SalesProductDTO#setRecStatus(RecordStatus)}
     *   <li>{@link SalesProductDTO#setRowId(int)}
     *   <li>{@link SalesProductDTO#setUnStoffNr(String)}
     *   <li>{@link SalesProductDTO#getProductCode()}
     *   <li>{@link SalesProductDTO#getProductName()}
     *   <li>{@link SalesProductDTO#getRecStatus()}
     *   <li>{@link SalesProductDTO#getRowId()}
     *   <li>{@link SalesProductDTO#getUnStoffNr()}
     * </ul>
     */
    @Test
    void testConstructor() {
        // Arrange and Act
        SalesProductDTO actualSalesProductDTO = new SalesProductDTO();
        String productCode = "Product Code";
        actualSalesProductDTO.setProductCode( productCode );
        String productName = "Product Name";
        actualSalesProductDTO.setProductName( productName );
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus
                .setLastModification( Date.from( LocalDate.of( 1970, 1, 1 ).atStartOfDay().atZone( ZoneOffset.UTC ).toInstant() ) );
        actualSalesProductDTO.setRecStatus( recStatus );
        int rowId = 1;
        actualSalesProductDTO.setRowId( rowId );
        String unStoffNr = "Un Stoff Nr";
        actualSalesProductDTO.setUnStoffNr( unStoffNr );

        // Assert
        assertEquals( "Product Code", actualSalesProductDTO.getProductCode() );
        assertEquals( "Product Name", actualSalesProductDTO.getProductName() );
        assertSame( recStatus, actualSalesProductDTO.getRecStatus() );
        assertEquals( 1, actualSalesProductDTO.getRowId() );
        assertEquals( "Un Stoff Nr", actualSalesProductDTO.getUnStoffNr() );
    }

    /**
     * Method under test: default or parameterless constructor of {@link SalesProductDTO}
     */
    @Test
    void testConstructor2() {
        // Arrange and Act
        SalesProductDTO actualSalesProductDTO = new SalesProductDTO();

        // Assert
        assertEquals( -1, actualSalesProductDTO.getRowId() );
        assertTrue( actualSalesProductDTO.getRecStatus().flagIsBlocked );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link SalesProductDTO}
     *   <li>{@link SalesProductDTO#setProductCode(String)}
     *   <li>{@link SalesProductDTO#setProductName(String)}
     *   <li>{@link SalesProductDTO#setRecStatus(RecordStatus)}
     *   <li>{@link SalesProductDTO#setRowId(int)}
     *   <li>{@link SalesProductDTO#getProductCode()}
     *   <li>{@link SalesProductDTO#getProductName()}
     *   <li>{@link SalesProductDTO#getRecStatus()}
     *   <li>{@link SalesProductDTO#getRowId()}
     *   <li>{@link SalesProductDTO#getUnStoffNr()}
     * </ul>
     */
    @Test
    void testConstructor3() {
        // Arrange and Act
        SalesProductDTO actualSalesProductDTO = new SalesProductDTO();
        String productCode = "Product Code";
        actualSalesProductDTO.setProductCode( productCode );
        String productName = "Product Name";
        actualSalesProductDTO.setProductName( productName );
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus
                .setLastModification( Date.from( LocalDate.of( 1970, 1, 1 ).atStartOfDay().atZone( ZoneOffset.UTC ).toInstant() ) );
        actualSalesProductDTO.setRecStatus( recStatus );
        int rowId = 1;
        actualSalesProductDTO.setRowId( rowId );

        // Assert
        assertEquals( "Product Code", actualSalesProductDTO.getProductCode() );
        assertEquals( "Product Name", actualSalesProductDTO.getProductName() );
        assertSame( recStatus, actualSalesProductDTO.getRecStatus() );
        assertEquals( 1, actualSalesProductDTO.getRowId() );
        assertNull( actualSalesProductDTO.getUnStoffNr() );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link SalesProductDTO}
     *   <li>{@link SalesProductDTO#setProductCode(String)}
     *   <li>{@link SalesProductDTO#setProductName(String)}
     *   <li>{@link SalesProductDTO#setRecStatus(RecordStatus)}
     *   <li>{@link SalesProductDTO#setRowId(int)}
     *   <li>{@link SalesProductDTO#setZaehlerNr(int)}
     *   <li>{@link SalesProductDTO#toString()}
     *   <li>{@link SalesProductDTO#getProductCode()}
     *   <li>{@link SalesProductDTO#getProductName()}
     *   <li>{@link SalesProductDTO#getRecStatus()}
     *   <li>{@link SalesProductDTO#getRowId()}
     *   <li>{@link SalesProductDTO#getZaehlerNr()}
     * </ul>
     */
    @Test
    void testConstructor4() {
        // Arrange and Act
        SalesProductDTO actualSalesProductDTO = new SalesProductDTO();
        String productCode = "Product Code";
        actualSalesProductDTO.setProductCode( productCode );
        String productName = "Product Name";
        actualSalesProductDTO.setProductName( productName );
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus
                .setLastModification( Date.from( LocalDate.of( 1970, 1, 1 ).atStartOfDay().atZone( ZoneOffset.UTC ).toInstant() ) );
        actualSalesProductDTO.setRecStatus( recStatus );
        int rowId = 1;
        actualSalesProductDTO.setRowId( rowId );
        int zaehlerNr = 1;
        actualSalesProductDTO.setZaehlerNr( zaehlerNr );
        actualSalesProductDTO.toString();

        // Assert that nothing has changed
        assertEquals( "Product Code", actualSalesProductDTO.getProductCode() );
        assertEquals( "Product Name", actualSalesProductDTO.getProductName() );
        assertSame( recStatus, actualSalesProductDTO.getRecStatus() );
        assertEquals( 1, actualSalesProductDTO.getRowId() );
        assertEquals( 1, actualSalesProductDTO.getZaehlerNr() );
    }

    /**
     * Method under test: default or parameterless constructor of {@link SalesProductDTO}
     */
    @Test
    void testConstructor5() {
        // Arrange and Act
        SalesProductDTO actualSalesProductDTO = new SalesProductDTO();

        // Assert
        assertEquals( 0, actualSalesProductDTO.getZaehlerNr() );
        assertEquals( -1, actualSalesProductDTO.getRowId() );
        assertTrue( actualSalesProductDTO.getRecStatus().flagIsBlocked );
    }

    /**
     * Method under test: {@link SalesProductDTO#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr() {
        // Arrange
        SalesProductDTO salesProductDTO = new SalesProductDTO();
        String unStoffNr = "Un Stoff Nr";

        // Act and Assert
        assertThrows( IllegalArgumentException.class, () -> salesProductDTO.setUnStoffNr( unStoffNr ) );
    }

    /**
     * Method under test: {@link SalesProductDTO#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr2() {
        // Arrange
        SalesProductDTO salesProductDTO = new SalesProductDTO();
        String unStoffNr = "42";

        // Act
        salesProductDTO.setUnStoffNr( unStoffNr );

        // Assert
        assertEquals( "42", salesProductDTO.getUnStoffNr() );
    }

    /**
     * Method under test: {@link SalesProductDTO#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr3() {
        // Arrange
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus.setLastModification( mock( java.sql.Date.class ) );

        SalesProductDTO salesProductDTO = new SalesProductDTO();
        salesProductDTO.setRecStatus( recStatus );
        String unStoffNr = "42";

        // Act
        salesProductDTO.setUnStoffNr( unStoffNr );

        // Assert
        assertEquals( "42", salesProductDTO.getUnStoffNr() );
    }

    /**
     * Method under test: {@link SalesProductDTO#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr4() {
        // Arrange
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus.setLastModification( mock( java.sql.Date.class ) );

        SalesProductDTO salesProductDTO = new SalesProductDTO();
        salesProductDTO.setRecStatus( recStatus );
        String unStoffNr = "42";

        // Act
        salesProductDTO.setUnStoffNr( unStoffNr );

        // Assert
        assertEquals( "42", salesProductDTO.getUnStoffNr() );
    }

    /**
     * Method under test: {@link SalesProductDTO#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr5() {
        // Arrange
        SalesProductDTO salesProductDTO = new SalesProductDTO();
        String unStoffNr = "00";

        // Act
        salesProductDTO.setUnStoffNr( unStoffNr );

        // Assert
        assertEquals( "00", salesProductDTO.getUnStoffNr() );
    }

    /**
     * Method under test: {@link SalesProductDTO#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr6() {
        // Arrange
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus.setLastModification( mock( java.sql.Date.class ) );

        SalesProductDTO salesProductDTO = new SalesProductDTO();
        salesProductDTO.setRecStatus( recStatus );
        String unStoffNr = "00";

        // Act
        salesProductDTO.setUnStoffNr( unStoffNr );

        // Assert
        assertEquals( "00", salesProductDTO.getUnStoffNr() );
    }

    /**
     * Method under test: {@link SalesProductDTO#setZaehlerNr(String)}
     */
    @Test
    void testSetZaehlerNr() {
        // Arrange
        SalesProductDTO salesProductDTO = new SalesProductDTO();
        String zlrNr = "Zlr Nr";

        // Act
        salesProductDTO.setZaehlerNr( zlrNr );

        // Assert that nothing has changed
        assertEquals( 0, salesProductDTO.getZaehlerNr() );
        assertEquals( -1, salesProductDTO.getRowId() );
        assertTrue( salesProductDTO.getRecStatus().flagIsBlocked );
    }

    /**
     * Method under test: {@link SalesProductDTO#setZaehlerNr(String)}
     */
    @Test
    void testSetZaehlerNr2() {
        // Arrange
        SalesProductDTO salesProductDTO = new SalesProductDTO();
        String zlrNr = "00";

        // Act
        salesProductDTO.setZaehlerNr( zlrNr );

        // Assert
        assertEquals( 0, salesProductDTO.getZaehlerNr() );
    }

    /**
     * Method under test: {@link SalesProductDTO#setZaehlerNr(String)}
     */
    @Test
    void testSetZaehlerNr3() {
        // Arrange
        SalesProductDTO salesProductDTO = new SalesProductDTO();
        String zlrNr = "";

        // Act
        salesProductDTO.setZaehlerNr( zlrNr );

        // Assert
        assertEquals( 0, salesProductDTO.getZaehlerNr() );
    }

    /**
     * Method under test: {@link SalesProductDTO#setZaehlerNr(String)}
     */
    @Test
    void testSetZaehlerNr4() {
        // Arrange
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus.setLastModification( mock( java.sql.Date.class ) );

        SalesProductDTO salesProductDTO = new SalesProductDTO();
        salesProductDTO.setRecStatus( recStatus );
        String zlrNr = "Zlr Nr";

        // Act
        salesProductDTO.setZaehlerNr( zlrNr );

        // Assert that nothing has changed
        assertEquals( 0, salesProductDTO.getZaehlerNr() );
        assertEquals( -1, salesProductDTO.getRowId() );
        assertTrue( salesProductDTO.getRecStatus().flagIsBlocked );
    }
}

