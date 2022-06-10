package com.nocountry.ecommerce.ports.input.rs.mapper;

import com.nocountry.ecommerce.domain.model.Category;
import com.nocountry.ecommerce.ports.input.rs.request.CategoryRequest;
import com.nocountry.ecommerce.ports.input.rs.response.CategoryDetails;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category CategoryRequestToCategory(CategoryRequest request) {
        if ( request == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( request.getName() );

        return category;
    }

    @Override
    public CategoryDetails CategoryToCategoryDetails(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDetails categoryDetails = new CategoryDetails();

        categoryDetails.setName( category.getName() );

        return categoryDetails;
    }

    @Override
    public List<CategoryDetails> CategoryListToCategoryDetailList(List<Category> list) {
        if ( list == null ) {
            return null;
        }

        List<CategoryDetails> list1 = new ArrayList<CategoryDetails>( list.size() );
        for ( Category category : list ) {
            list1.add( CategoryToCategoryDetails( category ) );
        }

        return list1;
    }
}
