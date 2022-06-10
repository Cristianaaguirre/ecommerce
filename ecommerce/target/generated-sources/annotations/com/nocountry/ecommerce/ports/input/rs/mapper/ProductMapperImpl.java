package com.nocountry.ecommerce.ports.input.rs.mapper;

import com.nocountry.ecommerce.domain.model.Category;
import com.nocountry.ecommerce.domain.model.Mark;
import com.nocountry.ecommerce.domain.model.Product;
import com.nocountry.ecommerce.ports.input.rs.request.ProductCreateRequest;
import com.nocountry.ecommerce.ports.input.rs.request.ProductUpdateRequest;
import com.nocountry.ecommerce.ports.input.rs.response.ProductDetails;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product CreateProductToProduct(ProductCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setMark( productCreateRequestToMark( request ) );
        product.setCategory( productCreateRequestToCategory( request ) );
        product.setName( request.getName() );
        product.setPrice( request.getPrice() );
        product.setStock( request.getStock() );
        product.setDetail( request.getDetail() );
        product.setImage( request.getImage() );

        return product;
    }

    @Override
    public Product UpdateProductToProduct(ProductUpdateRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( request.getName() );
        product.setPrice( request.getPrice() );
        product.setDetail( request.getDetail() );
        product.setImage( request.getImage() );

        return product;
    }

    @Override
    public ProductDetails ProductToProductDetails(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDetails productDetails = new ProductDetails();

        productDetails.setName( product.getName() );
        productDetails.setPrice( product.getPrice() );

        return productDetails;
    }

    @Override
    public List<ProductDetails> ProductListToProductDetailList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductDetails> list1 = new ArrayList<ProductDetails>( list.size() );
        for ( Product product : list ) {
            list1.add( ProductToProductDetails( product ) );
        }

        return list1;
    }

    protected Mark productCreateRequestToMark(ProductCreateRequest productCreateRequest) {
        if ( productCreateRequest == null ) {
            return null;
        }

        Mark mark = new Mark();

        mark.setId( productCreateRequest.getMark() );

        return mark;
    }

    protected Category productCreateRequestToCategory(ProductCreateRequest productCreateRequest) {
        if ( productCreateRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( productCreateRequest.getCategory() );

        return category;
    }
}
