package uth.networkprogramming.group1.mailer.user.model;

import lombok.*;
import lombok.experimental.UtilityClass;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = User.UserEntity.TABLE_NAME)
public class User {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue
    @Column(name = UserEntity.ID)
    private UUID id;

    @Column(name = UserEntity.NAME,
            nullable = false,
            unique = true)
    private String name;

    @Column(name = UserEntity.EMAIL,
            nullable = false,
            unique = true)
    @Email
    private String email;

    @UtilityClass
    class UserEntity {
        public static final String TABLE_NAME = "E_USER";
        public static final String ID = "E_ID";
        public static final String NAME = "E_NAME";
        public static final String EMAIL = "E_EMAIL";
    }
}


