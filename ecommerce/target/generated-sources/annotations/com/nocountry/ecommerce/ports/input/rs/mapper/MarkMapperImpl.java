package com.nocountry.ecommerce.ports.input.rs.mapper;

import com.nocountry.ecommerce.domain.model.Mark;
import com.nocountry.ecommerce.ports.input.rs.request.MarkRequest;
import com.nocountry.ecommerce.ports.input.rs.response.MarkDetails;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
@Component
public class MarkMapperImpl implements MarkMapper {

    @Override
    public Mark MarkRequestToMark(MarkRequest request) {
        if ( request == null ) {
            return null;
        }

        Mark mark = new Mark();

        mark.setName( request.getName() );

        return mark;
    }

    @Override
    public MarkDetails MarkToMarkDetails(Mark mark) {
        if ( mark == null ) {
            return null;
        }

        MarkDetails markDetails = new MarkDetails();

        markDetails.setName( mark.getName() );

        return markDetails;
    }

    @Override
    public List<MarkDetails> MarkListToMarkDetailList(List<Mark> list) {
        if ( list == null ) {
            return null;
        }

        List<MarkDetails> list1 = new ArrayList<MarkDetails>( list.size() );
        for ( Mark mark : list ) {
            list1.add( MarkToMarkDetails( mark ) );
        }

        return list1;
    }
}
