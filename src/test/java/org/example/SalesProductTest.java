package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class SalesProductTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link SalesProduct}
     *   <li>{@link SalesProduct#setProductName(String)}
     *   <li>{@link SalesProduct#setRecStatus(RecordStatus)}
     *   <li>{@link SalesProduct#setRowId(int)}
     *   <li>{@link SalesProduct#setIsBlocked(boolean)}
     *   <li>{@link SalesProduct#toString()}
     *   <li>{@link SalesProduct#getProductCode()}
     *   <li>{@link SalesProduct#getProductName()}
     *   <li>{@link SalesProduct#getRecStatus()}
     *   <li>{@link SalesProduct#getRowId()}
     *   <li>{@link SalesProduct#getUnStoffNr()}
     * </ul>
     */
    @Test
    void testConstructor() {
        // Arrange and Act
        SalesProduct actualSalesProduct = new SalesProduct();
        String productName = "Product Name";
        actualSalesProduct.setProductName( productName );
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus
                .setLastModification( Date.from( LocalDate.of( 1970, 1, 1 ).atStartOfDay().atZone( ZoneOffset.UTC ).toInstant() ) );
        actualSalesProduct.setRecStatus( recStatus );
        int rowId = 1;
        actualSalesProduct.setRowId( rowId );
        boolean flagBlock = true;
        actualSalesProduct.setIsBlocked( flagBlock );
        actualSalesProduct.toString();

        // Assert
        assertNull( actualSalesProduct.getProductCode() );
        assertEquals( "Product Name", actualSalesProduct.getProductName() );
        assertSame( recStatus, actualSalesProduct.getRecStatus() );
        assertEquals( 1, actualSalesProduct.getRowId() );
        assertNull( actualSalesProduct.getUnStoffNr() );
    }

    /**
     * Method under test: default or parameterless constructor of {@link SalesProduct}
     */
    @Test
    void testConstructor2() {
        // Arrange and Act
        SalesProduct actualSalesProduct = new SalesProduct();

        // Assert
        assertTrue( actualSalesProduct.getIsBlocked() );
        assertEquals( -1, actualSalesProduct.getRowId() );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link SalesProduct}
     *   <li>{@link SalesProduct#setProductName(String)}
     *   <li>{@link SalesProduct#setRecStatus(RecordStatus)}
     *   <li>{@link SalesProduct#setRowId(int)}
     *   <li>{@link SalesProduct#setIsBlocked(boolean)}
     *   <li>{@link SalesProduct#toString()}
     *   <li>{@link SalesProduct#getProductName()}
     *   <li>{@link SalesProduct#getRecStatus()}
     *   <li>{@link SalesProduct#getRowId()}
     * </ul>
     */
    @Test
    void testConstructor3() {
        // Arrange and Act
        SalesProduct actualSalesProduct = new SalesProduct();
        String productName = "Product Name";
        actualSalesProduct.setProductName( productName );
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( true );
        recStatus
                .setLastModification( Date.from( LocalDate.of( 1970, 1, 1 ).atStartOfDay().atZone( ZoneOffset.UTC ).toInstant() ) );
        actualSalesProduct.setRecStatus( recStatus );
        int rowId = 1;
        actualSalesProduct.setRowId( rowId );
        boolean flagBlock = true;
        actualSalesProduct.setIsBlocked( flagBlock );
        actualSalesProduct.toString();

        // Assert that nothing has changed
        assertEquals( "Product Name", actualSalesProduct.getProductName() );
        assertSame( recStatus, actualSalesProduct.getRecStatus() );
        assertEquals( 1, actualSalesProduct.getRowId() );
    }

    /**
     * Method under test: {@link SalesProduct#setProductCode(String)}
     */
    @Test
    void testSetProductCode() {
        // Arrange
        SalesProduct salesProduct = new SalesProduct();
        String prodCode = "Prod Code";

        // Act and Assert
        assertThrows( IllegalArgumentException.class, () -> salesProduct.setProductCode( prodCode ) );
    }

    /**
     * Method under test: {@link SalesProduct#setProductCode(String)}
     */
    @Test
    void testSetProductCode2() {
        // Arrange
        SalesProduct salesProduct = new SalesProduct();
        String prodCode = null;

        // Act and Assert
        assertThrows( IllegalArgumentException.class, () -> salesProduct.setProductCode( prodCode ) );
    }

    /**
     * Method under test: {@link SalesProduct#setProductCode(String)}
     */
    @Test
    void testSetProductCode3() {
        // Arrange
        SalesProduct salesProduct = new SalesProduct();
        String prodCode = "42";

        // Act and Assert
        assertThrows( IllegalArgumentException.class, () -> salesProduct.setProductCode( prodCode ) );
    }

    /**
     * Method under test: {@link SalesProduct#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr() {
        // Arrange
        SalesProduct salesProduct = new SalesProduct();
        String newUNStoffNr = "New UNStoff Nr";

        // Act and Assert
        assertThrows( IllegalArgumentException.class, () -> salesProduct.setUnStoffNr( newUNStoffNr ) );
    }

    /**
     * Method under test: {@link SalesProduct#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr2() {
        // Arrange
        SalesProduct salesProduct = new SalesProduct();
        String newUNStoffNr = null;

        // Act and Assert
        assertThrows( IllegalArgumentException.class, () -> salesProduct.setUnStoffNr( newUNStoffNr ) );
    }

    /**
     * Method under test: {@link SalesProduct#setUnStoffNr(String)}
     */
    @Test
    void testSetUnStoffNr3() {
        // Arrange
        SalesProduct salesProduct = new SalesProduct();
        String newUNStoffNr = "42";

        // Act and Assert
        assertThrows( IllegalArgumentException.class, () -> salesProduct.setUnStoffNr( newUNStoffNr ) );
    }

    /**
     * Method under test: {@link SalesProduct#getIsBlocked()}
     */
    @Test
    void testGetIsBlocked() {
        // Arrange
        SalesProduct salesProduct = new SalesProduct();

        // Act
        boolean actualIsBlocked = salesProduct.getIsBlocked();

        // Assert
        assertTrue( actualIsBlocked );
    }

    /**
     * Method under test: {@link SalesProduct#getIsBlocked()}
     */
    @Test
    void testGetIsBlocked2() {
        // Arrange
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( false );
        recStatus
                .setLastModification( Date.from( LocalDate.of( 1970, 1, 1 ).atStartOfDay().atZone( ZoneOffset.UTC ).toInstant() ) );

        SalesProduct salesProduct = new SalesProduct();
        salesProduct.setRecStatus( recStatus );

        // Act
        boolean actualIsBlocked = salesProduct.getIsBlocked();

        // Assert
        assertFalse( actualIsBlocked );
    }

    /**
     * Method under test: {@link SalesProduct#getIsBlocked()}
     */
    @Test
    void testGetIsBlocked3() {
        // Arrange
        RecordStatus recStatus = new RecordStatus();
        recStatus.setFlagIsBlocked( false );
        recStatus.setLastModification( mock( java.sql.Date.class ) );

        SalesProduct salesProduct = new SalesProduct();
        salesProduct.setRecStatus( recStatus );

        // Act
        boolean actualIsBlocked = salesProduct.getIsBlocked();

        // Assert
        assertFalse( actualIsBlocked );
    }
}

