package method.factory.business.factory;

import method.factory.controller.UserRequestDto;
import method.factory.infrastructure.model.User;

public interface IUserFactory {

    User createUser(UserRequestDto dto);
}
