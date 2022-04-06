package kg.itschool.sellservice.mappers;

import javax.annotation.Generated;
import kg.itschool.sellservice.models.dtos.code.CodeResponse;
import kg.itschool.sellservice.models.dtos.user.UserResponseDTO;
import kg.itschool.sellservice.models.entities.Code;
import kg.itschool.sellservice.models.entities.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T19:25:33+0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class CodeMapperImpl implements CodeMapper {

    @Override
    public CodeResponse codeToCodeResponse(Code code) {
        if ( code == null ) {
            return null;
        }

        CodeResponse codeResponse = new CodeResponse();

        codeResponse.setId( code.getId() );
        codeResponse.setCode( code.getCode() );
        codeResponse.setStartDate( code.getStartDate() );
        codeResponse.setEndDate( code.getEndDate() );
        codeResponse.setCodeStatus( code.getCodeStatus() );
        codeResponse.setUser( userToUserResponseDTO( code.getUser() ) );

        return codeResponse;
    }

    @Override
    public Code codeResponseToCode(CodeResponse codeResponse) {
        if ( codeResponse == null ) {
            return null;
        }

        Code code = new Code();

        code.setId( codeResponse.getId() );
        code.setCode( codeResponse.getCode() );
        code.setCodeStatus( codeResponse.getCodeStatus() );
        code.setUser( userResponseDTOToUser( codeResponse.getUser() ) );
        code.setStartDate( codeResponse.getStartDate() );
        code.setEndDate( codeResponse.getEndDate() );

        return code;
    }

    protected UserResponseDTO userToUserResponseDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDTO userResponseDTO = new UserResponseDTO();

        if ( user.getId() != null ) {
            userResponseDTO.setId( user.getId() );
        }
        userResponseDTO.setName( user.getName() );
        userResponseDTO.setActive( user.isActive() );
        userResponseDTO.setLogin( user.getLogin() );
        userResponseDTO.setBlockDate( user.getBlockDate() );

        return userResponseDTO;
    }

    protected User userResponseDTOToUser(UserResponseDTO userResponseDTO) {
        if ( userResponseDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userResponseDTO.getId() );
        user.setName( userResponseDTO.getName() );
        user.setActive( userResponseDTO.isActive() );
        user.setLogin( userResponseDTO.getLogin() );
        user.setBlockDate( userResponseDTO.getBlockDate() );

        return user;
    }
}
