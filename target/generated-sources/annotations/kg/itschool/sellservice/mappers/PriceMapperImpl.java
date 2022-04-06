package kg.itschool.sellservice.mappers;

import javax.annotation.Generated;
import kg.itschool.sellservice.models.dtos.category.CategoryResponse;
import kg.itschool.sellservice.models.dtos.price.PriceResponse;
import kg.itschool.sellservice.models.dtos.product.ProductResponse;
import kg.itschool.sellservice.models.entities.Category;
import kg.itschool.sellservice.models.entities.Price;
import kg.itschool.sellservice.models.entities.Product;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T19:25:33+0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class PriceMapperImpl implements PriceMapper {

    @Override
    public PriceResponse priceToPriceResponse(Price price) {
        if ( price == null ) {
            return null;
        }

        PriceResponse priceResponse = new PriceResponse();

        if ( price.getId() != null ) {
            priceResponse.setId( price.getId() );
        }
        priceResponse.setPrice( price.getPrice() );
        priceResponse.setStartDate( price.getStartDate() );
        priceResponse.setEndDate( price.getEndDate() );
        priceResponse.setActive( price.isActive() );
        priceResponse.setProduct( productToProductResponse( price.getProduct() ) );

        return priceResponse;
    }

    @Override
    public Price priceResponseToPrice(PriceResponse priceResponse) {
        if ( priceResponse == null ) {
            return null;
        }

        Price price = new Price();

        price.setId( priceResponse.getId() );
        price.setPrice( priceResponse.getPrice() );
        price.setActive( priceResponse.isActive() );
        price.setStartDate( priceResponse.getStartDate() );
        price.setEndDate( priceResponse.getEndDate() );
        price.setProduct( productResponseToProduct( priceResponse.getProduct() ) );

        return price;
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
