package kg.itschool.sellservice.mappers;

import javax.annotation.Generated;
import kg.itschool.sellservice.models.dtos.user.UserCreateDTO;
import kg.itschool.sellservice.models.dtos.user.UserResponseDTO;
import kg.itschool.sellservice.models.entities.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T19:25:33+0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCreateDTO userToUserCreateDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserCreateDTO userCreateDTO = new UserCreateDTO();

        userCreateDTO.setName( user.getName() );
        userCreateDTO.setLogin( user.getLogin() );

        return userCreateDTO;
    }

    @Override
    public User userCreateDTOToUser(UserCreateDTO userCreateDTO) {
        if ( userCreateDTO == null ) {
            return null;
        }

        User user = new User();

        user.setName( userCreateDTO.getName() );
        user.setLogin( userCreateDTO.getLogin() );

        return user;
    }

    @Override
    public UserResponseDTO userToUserResponse(User user) {
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

    @Override
    public User userResponseToUser(UserResponseDTO userResponseDTO) {
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
