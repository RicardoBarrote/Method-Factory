package method.factory.infrastructure.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import method.factory.infrastructure.enums.UserTypeEnum;

import java.io.Serial;
import java.io.Serializable;

@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String CpfOrCnpj;

    @Enumerated(EnumType.STRING)
    private UserTypeEnum type;

    public User(String name, String cpfOrCnpj, UserTypeEnum type) {
        this.name = name;
        this.CpfOrCnpj = cpfOrCnpj;
        this.type = type;
    }
}
