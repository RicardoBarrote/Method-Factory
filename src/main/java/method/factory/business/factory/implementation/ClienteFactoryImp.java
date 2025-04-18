package method.factory.business.factory.implementation;

import method.factory.business.factory.IUserFactory;
import method.factory.infrastructure.enums.UserTypeEnum;
import method.factory.infrastructure.model.Cliente;
import method.factory.infrastructure.model.User;

public class ClienteFactoryImp implements IUserFactory {

    @Override
    public User createUser(String name, String cpfOrCnpj, UserTypeEnum type) {
        return new Cliente(name, cpfOrCnpj, type);
    }
}
