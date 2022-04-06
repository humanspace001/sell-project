package kg.itschool.sellservice.mappers;

import javax.annotation.Generated;
import kg.itschool.sellservice.models.dtos.category.CategoryResponse;
import kg.itschool.sellservice.models.dtos.discount.DiscountResponse;
import kg.itschool.sellservice.models.dtos.product.ProductResponse;
import kg.itschool.sellservice.models.entities.Category;
import kg.itschool.sellservice.models.entities.Discount;
import kg.itschool.sellservice.models.entities.Product;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T19:25:33+0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class DiscountMapperImpl implements DiscountMapper {

    @Override
    public DiscountResponse discountToDiscountResponse(Discount discount) {
        if ( discount == null ) {
            return null;
        }

        DiscountResponse discountResponse = new DiscountResponse();

        if ( discount.getId() != null ) {
            discountResponse.setId( discount.getId() );
        }
        discountResponse.setDiscount( discount.getDiscount() );
        discountResponse.setActive( discount.isActive() );
        discountResponse.setStartDate( discount.getStartDate() );
        discountResponse.setEndDate( discount.getEndDate() );
        discountResponse.setProduct( productToProductResponse( discount.getProduct() ) );

        return discountResponse;
    }

    @Override
    public Discount discountResponseToDiscount(DiscountResponse discountResponse) {
        if ( discountResponse == null ) {
            return null;
        }

        Discount discount = new Discount();

        discount.setId( discountResponse.getId() );
        discount.setDiscount( discountResponse.getDiscount() );
        discount.setActive( discountResponse.isActive() );
        discount.setStartDate( discountResponse.getStartDate() );
        discount.setEndDate( discountResponse.getEndDate() );
        discount.setProduct( productResponseToProduct( discountResponse.getProduct() ) );

        return discount;
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

    protected ProductResponse productToProductResponse(Product product) {
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

    protected Product productResponseToProduct(ProductResponse productResponse) {
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
}
