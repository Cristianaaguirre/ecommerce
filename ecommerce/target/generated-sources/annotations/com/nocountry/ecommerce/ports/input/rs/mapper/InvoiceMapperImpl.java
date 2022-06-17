package com.nocountry.ecommerce.ports.input.rs.mapper;

import com.nocountry.ecommerce.domain.model.Invoice;
import com.nocountry.ecommerce.domain.model.Product;
import com.nocountry.ecommerce.domain.model.PurchaseSummary;
import com.nocountry.ecommerce.ports.input.rs.response.InvoiceResponse;
import com.nocountry.ecommerce.ports.input.rs.response.ProductDetails;
import com.nocountry.ecommerce.ports.input.rs.response.SummaryResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class InvoiceMapperImpl implements InvoiceMapper {

    @Override
    public SummaryResponse PurchaseSummaryToSummaryResponse(PurchaseSummary summary) {
        if ( summary == null ) {
            return null;
        }

        SummaryResponse summaryResponse = new SummaryResponse();

        summaryResponse.setAmount( summary.getAmount() );
        summaryResponse.setProduct( productToProductDetails( summary.getProduct() ) );

        return summaryResponse;
    }

    @Override
    public InvoiceResponse InvoiceToInvoiceResponse(Invoice invoice) {
        if ( invoice == null ) {
            return null;
        }

        InvoiceResponse invoiceResponse = new InvoiceResponse();

        invoiceResponse.setCreationDate( invoice.getCreationDate() );
        invoiceResponse.setTotalPrice( invoice.getTotalPrice() );
        invoiceResponse.setProductList( purchaseSummaryListToSummaryResponseList( invoice.getProductList() ) );

        return invoiceResponse;
    }

    @Override
    public List<InvoiceResponse> ListInvoiceToInvoiceResponse(List<Invoice> list) {
        if ( list == null ) {
            return null;
        }

        List<InvoiceResponse> list1 = new ArrayList<InvoiceResponse>( list.size() );
        for ( Invoice invoice : list ) {
            list1.add( InvoiceToInvoiceResponse( invoice ) );
        }

        return list1;
    }

    protected ProductDetails productToProductDetails(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDetails productDetails = new ProductDetails();

        productDetails.setName( product.getName() );
        productDetails.setPrice( product.getPrice() );
        productDetails.setStock( product.getStock() );

        return productDetails;
    }

    protected List<SummaryResponse> purchaseSummaryListToSummaryResponseList(List<PurchaseSummary> list) {
        if ( list == null ) {
            return null;
        }

        List<SummaryResponse> list1 = new ArrayList<SummaryResponse>( list.size() );
        for ( PurchaseSummary purchaseSummary : list ) {
            list1.add( PurchaseSummaryToSummaryResponse( purchaseSummary ) );
        }

        return list1;
    }
}
