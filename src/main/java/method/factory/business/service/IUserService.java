package method.factory.business.service;

import method.factory.infrastructure.dto.UserRequestDto;

public interface IUserService {

    void createUser(UserRequestDto dto) throws Exception;
}
