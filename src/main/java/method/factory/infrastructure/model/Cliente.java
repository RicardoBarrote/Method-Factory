package method.factory.infrastructure.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import method.factory.infrastructure.enums.UserTypeEnum;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends User {

    public Cliente(String name, String cpfOrCnpj, UserTypeEnum type) {
        super(name, cpfOrCnpj, type);
    }
}
