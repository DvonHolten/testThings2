package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.*;

class SalesProductDTOTest {


    @BeforeAll
    static void beforeAllMethod() {

    }

    @BeforeEach
    void beforeEachMethod(){

    }

    @AfterEach
    void afterEachMethod(){

    }

    @AfterAll
    static void afterAllMethod(){

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
}

