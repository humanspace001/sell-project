package kg.itschool.sellservice.mappers;

import javax.annotation.Generated;
import kg.itschool.sellservice.models.dtos.category.CategoryResponse;
import kg.itschool.sellservice.models.entities.Category;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T19:25:34+0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryResponse categoryToCategoryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse categoryResponse = new CategoryResponse();

        if ( category.getId() != null ) {
            categoryResponse.setId( category.getId() );
        }
        categoryResponse.setName( category.getName() );
        categoryResponse.setActive( category.isActive() );

        return categoryResponse;
    }

    @Override
    public Category categoryResponseToCategory(CategoryResponse categoryResponse) {
        if ( categoryResponse == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryResponse.getId() );
        category.setName( categoryResponse.getName() );
        category.setActive( categoryResponse.isActive() );

        return category;
    }
}
