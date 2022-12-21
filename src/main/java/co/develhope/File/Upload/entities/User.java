package co.develhope.File.Upload.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "/user", indexes = { @Index(unique = true, name = "email_inx", columnList = "email")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
   @Column(unique = true)
    private String email;
    private String profileImage;
}
