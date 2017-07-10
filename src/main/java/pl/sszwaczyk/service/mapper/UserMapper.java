package pl.sszwaczyk.service.mapper;

import org.mapstruct.Mapper;
import pl.sszwaczyk.domain.User;
import pl.sszwaczyk.service.dto.UserDTO;

/**
 * Created by sszwaczyk on 10.07.17.
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userToUserDTO(User user);
}
