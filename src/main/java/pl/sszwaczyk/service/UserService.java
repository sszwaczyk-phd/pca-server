package pl.sszwaczyk.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.sszwaczyk.service.dto.UserDTO;

/**
 * Created by sszwaczyk on 10.07.17.
 */
public interface UserService {

    Page<UserDTO> findAll(Pageable pageable);
}
