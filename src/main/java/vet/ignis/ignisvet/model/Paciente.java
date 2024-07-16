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

    @Enumerated(EnumType.STRING)
    private Especie especie_animal;

    private String nome_animal;
    private int idade_animal;

    private String nome_dono;
    private String email_dono;
    private String telefone_dono;
    private String cpf_dono;

    public Paciente(PacienteDTO dados) {
        this.nome_animal = dados.nome_animal();
        this.idade_animal = dados.idade_animal();
        this.especie_animal = dados.especie_animal();
        this.nome_dono = dados.nome_dono();
        this.email_dono = dados.email_dono();
        this.telefone_dono = dados.telefone_dono();
        this.cpf_dono = dados.cpf_dono();
    }
}
