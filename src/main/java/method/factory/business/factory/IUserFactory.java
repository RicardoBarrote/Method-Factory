package method.factory.business.factory;

import method.factory.infrastructure.enums.UserTypeEnum;
import method.factory.infrastructure.model.User;

public interface IUserFactory {

    User createUser(String name, String cpfOrCnpj, UserTypeEnum type);
}
