package vet.ignis.ignisvet.model.veterinario;

import jakarta.persistence.*;
import vet.ignis.ignisvet.model.endereco.Endereco;
import vet.ignis.ignisvet.model.endereco.EnderecoDTO;

@Table (name = "veterinarios")
@Entity (name = "Veterinario")
public class Veterinario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String celular;
    private String crmv;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;
}
