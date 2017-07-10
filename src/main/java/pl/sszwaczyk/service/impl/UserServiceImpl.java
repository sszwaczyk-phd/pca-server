package pl.sszwaczyk.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sszwaczyk.domain.User;
import pl.sszwaczyk.repository.UserRepository;
import pl.sszwaczyk.service.UserService;
import pl.sszwaczyk.service.dto.UserDTO;
import pl.sszwaczyk.service.mapper.UserMapper;

/**
 * Created by sszwaczyk on 10.07.17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<UserDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Users");
        Page<User> result = userRepository.findAll(pageable);
        return result.map(user -> userMapper.userToUserDTO(user));

    }
}
