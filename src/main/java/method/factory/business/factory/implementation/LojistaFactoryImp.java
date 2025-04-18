package method.factory.business.factory.implementation;

import method.factory.business.factory.IUserFactory;
import method.factory.infrastructure.enums.UserTypeEnum;
import method.factory.infrastructure.model.Lojista;
import method.factory.infrastructure.model.User;


public class LojistaFactoryImp implements IUserFactory {

    @Override
    public User createUser(String name, String cpfOrCnpj, UserTypeEnum type) {
        return new Lojista(name, cpfOrCnpj, type);
    }

}
