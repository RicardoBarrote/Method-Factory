package method.factory.business.service.implementation;

import jakarta.transaction.Transactional;
import method.factory.business.factory.IUserFactory;
import method.factory.business.factory.implementation.ClienteFactoryImp;
import method.factory.business.factory.implementation.LojistaFactoryImp;
import method.factory.business.service.IUserService;
import method.factory.infrastructure.dto.UserRequestDto;
import method.factory.infrastructure.enums.UserTypeEnum;
import method.factory.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImp implements IUserService {

    private final UserRepository userRepository;
    private final Map<UserTypeEnum, IUserFactory> factoryMap;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;

        factoryMap = new HashMap<>();
        factoryMap.put(UserTypeEnum.CLIENTE, new ClienteFactoryImp());
        factoryMap.put(UserTypeEnum.LOJISTA, new LojistaFactoryImp());
    }

    @Transactional
    @Override
    public void createUser(UserRequestDto dto) {
        IUserFactory iUserFactory = factoryMap.get(dto.type());
        if (iUserFactory != null) {
            userRepository.save(iUserFactory.createUser(dto.name(), dto.cpfOrCnpj(), dto.type()));
        } else {
            throw new IllegalArgumentException("Já tomou seu café hoje ?");
        }
    }
}
