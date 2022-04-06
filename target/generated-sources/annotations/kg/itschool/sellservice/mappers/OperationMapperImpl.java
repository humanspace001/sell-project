package kg.itschool.sellservice.mappers;

import javax.annotation.Generated;
import kg.itschool.sellservice.models.dtos.operation.OperationResponse;
import kg.itschool.sellservice.models.dtos.user.UserCreateDTO;
import kg.itschool.sellservice.models.entities.Operation;
import kg.itschool.sellservice.models.entities.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T19:25:34+0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class OperationMapperImpl implements OperationMapper {

    @Override
    public OperationResponse operationToOperationResponse(Operation operation) {
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

    @Override
    public Operation operationResponseToOperation(OperationResponse operationResponse) {
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

    protected UserCreateDTO userToUserCreateDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserCreateDTO userCreateDTO = new UserCreateDTO();

        userCreateDTO.setName( user.getName() );
        userCreateDTO.setLogin( user.getLogin() );

        return userCreateDTO;
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
}
