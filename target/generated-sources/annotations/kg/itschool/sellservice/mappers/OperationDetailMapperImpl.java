package kg.itschool.sellservice.mappers;

import javax.annotation.Generated;
import kg.itschool.sellservice.models.dtos.category.CategoryResponse;
import kg.itschool.sellservice.models.dtos.operation.OperationDetailResponse;
import kg.itschool.sellservice.models.dtos.operation.OperationResponse;
import kg.itschool.sellservice.models.dtos.product.ProductResponse;
import kg.itschool.sellservice.models.dtos.user.UserCreateDTO;
import kg.itschool.sellservice.models.entities.Category;
import kg.itschool.sellservice.models.entities.Operation;
import kg.itschool.sellservice.models.entities.OperationDetail;
import kg.itschool.sellservice.models.entities.Product;
import kg.itschool.sellservice.models.entities.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T19:25:33+0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class OperationDetailMapperImpl implements OperationDetailMapper {

    @Override
    public OperationDetailResponse operationDetailToOperationDetailResponse(OperationDetail operationDetail) {
        if ( operationDetail == null ) {
            return null;
        }

        OperationDetailResponse operationDetailResponse = new OperationDetailResponse();

        if ( operationDetail.getId() != null ) {
            operationDetailResponse.setId( operationDetail.getId() );
        }
        operationDetailResponse.setQuantity( operationDetail.getQuantity() );
        operationDetailResponse.setAmount( operationDetail.getAmount() );
        operationDetailResponse.setOperation( operationToOperationResponse( operationDetail.getOperation() ) );
        operationDetailResponse.setProduct( productToProductResponse( operationDetail.getProduct() ) );

        return operationDetailResponse;
    }

    @Override
    public OperationDetail operationDetailToOperationDetailResponse(OperationDetailResponse operationDetailResponse) {
        if ( operationDetailResponse == null ) {
            return null;
        }

        OperationDetail operationDetail = new OperationDetail();

        operationDetail.setId( operationDetailResponse.getId() );
        operationDetail.setProduct( productResponseToProduct( operationDetailResponse.getProduct() ) );
        operationDetail.setOperation( operationResponseToOperation( operationDetailResponse.getOperation() ) );
        operationDetail.setQuantity( operationDetailResponse.getQuantity() );
        operationDetail.setAmount( operationDetailResponse.getAmount() );

        return operationDetail;
    }

    protected UserCreateDTO userToUserCreateDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserCreateDTO userCreateDTO = new UserCreateDTO();

        userCreateDTO.setName( user.getName() );
        userCreateDTO.setLogin( user.getLogin() );

        return userCreateDTO;
    }

    protected OperationResponse operationToOperationResponse(Operation operation) {
        if ( operation == null ) {
            return null;
        }

        OperationResponse operationResponse = new OperationResponse();

        operationResponse.setId( operation.getId() );
        operationResponse.setAddDate( operation.getAddDate() );
        operationResponse.setTotalPrice( operation.getTotalPrice() );
        operationResponse.setChange( operation.getChange() );
        operationResponse.setUser( userToUserCreateDTO( operation.getUser() ) );
        operationResponse.setCash( operation.getCash() );

        return operationResponse;
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

    protected User userCreateDTOToUser(UserCreateDTO userCreateDTO) {
        if ( userCreateDTO == null ) {
            return null;
        }

        User user = new User();

        user.setName( userCreateDTO.getName() );
        user.setLogin( userCreateDTO.getLogin() );

        return user;
    }

    protected Operation operationResponseToOperation(OperationResponse operationResponse) {
        if ( operationResponse == null ) {
            return null;
        }

        Operation operation = new Operation();

        operation.setId( operationResponse.getId() );
        operation.setAddDate( operationResponse.getAddDate() );
        operation.setTotalPrice( operationResponse.getTotalPrice() );
        operation.setChange( operationResponse.getChange() );
        operation.setCash( operationResponse.getCash() );
        operation.setUser( userCreateDTOToUser( operationResponse.getUser() ) );

        return operation;
    }
}
