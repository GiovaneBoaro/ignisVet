package vet.ignis.ignisvet.model;

import jakarta.persistence.*;

@Table (name = "pacientes")
@Entity (name = "Paciente")
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
