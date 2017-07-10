package pl.sszwaczyk.service.mapper.impl;

import org.springframework.stereotype.Component;
import pl.sszwaczyk.domain.User;
import pl.sszwaczyk.service.dto.UserDTO;
import pl.sszwaczyk.service.mapper.UserMapper;

/**
 * Created by sszwaczyk on 10.07.17.
 */
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userToUserDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setEmail(user.getEmail());
        return dto;
    }

}
