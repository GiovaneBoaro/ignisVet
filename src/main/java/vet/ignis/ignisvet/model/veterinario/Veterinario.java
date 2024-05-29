package vet.ignis.ignisvet.model.veterinario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import vet.ignis.ignisvet.model.endereco.Endereco;
import vet.ignis.ignisvet.model.endereco.EnderecoDTO;

@Table (name = "veterinarios")
@Entity (name = "Veterinario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
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

    public Veterinario(VeterinarioDTO dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crmv = dados.crmv();
        this.celular = dados.celular();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}
