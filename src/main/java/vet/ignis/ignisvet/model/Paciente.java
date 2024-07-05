package vet.ignis.ignisvet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "pacientes")
@Entity (name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAnimal;
    private int idadeAnimal;

    @Enumerated(EnumType.STRING)
    private Especie especieAnimal;

    private String nomeDono;
    private String emailDono;
    private String telefoneDono;
    private String cpfDono;
}
