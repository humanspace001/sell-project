package kg.itschool.sellservice.mappers;

import javax.annotation.Generated;
import kg.itschool.sellservice.models.dtos.category.CategoryResponse;
import kg.itschool.sellservice.models.dtos.product.ProductCreate;
import kg.itschool.sellservice.models.dtos.product.ProductResponse;
import kg.itschool.sellservice.models.entities.Category;
import kg.itschool.sellservice.models.entities.Product;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T19:25:34+0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponse productToProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        if ( product.getId() != null ) {
            productResponse.setId( product.getId() );
        }
        productResponse.setName( product.getName() );
        productResponse.setBarcode( product.getBarcode() );
        productResponse.setCategory( categoryToCategoryResponse( product.getCategory() ) );
        productResponse.setActive( product.isActive() );

        return productResponse;
    }

    @Override
    public Product productResponseToProduct(ProductResponse productResponse) {
        if ( productResponse == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productResponse.getId() );
        product.setName( productResponse.getName() );
        product.setActive( productResponse.isActive() );
        product.setCategory( categoryResponseToCategory( productResponse.getCategory() ) );
        product.setBarcode( productResponse.getBarcode() );

        return product;
    }

    @Override
    public ProductCreate productToProductCreate(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductCreate productCreate = new ProductCreate();

        productCreate.setName( product.getName() );
        productCreate.setCategory( categoryToCategoryResponse( product.getCategory() ) );
        productCreate.setActive( product.isActive() );

        return productCreate;
    }

    @Override
    public Product productCreateToProduct(ProductCreate productCreate) {
        if ( productCreate == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( productCreate.getName() );
        product.setActive( productCreate.isActive() );
        product.setCategory( categoryResponseToCategory( productCreate.getCategory() ) );

        return product;
    }

    protected CategoryResponse categoryToCategoryResponse(Category category) {
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

    protected Category categoryResponseToCategory(CategoryResponse categoryResponse) {
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
