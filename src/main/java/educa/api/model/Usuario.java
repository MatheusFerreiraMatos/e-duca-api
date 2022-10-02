package educa.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 3)
    private String nome;
    @Past
    private LocalDate dataNasc;
    @Column(unique = true)
    @Email
    private String email;
    @Size(min = 8)
    private String senha;
    private boolean autenticado;
}
