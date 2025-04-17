package method.factory.infrastructure.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.usertype.UserType;

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
    private UserType type;

}
