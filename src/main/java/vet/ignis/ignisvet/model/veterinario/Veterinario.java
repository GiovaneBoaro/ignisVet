package vet.ignis.ignisvet.model.veterinario;

import vet.ignis.ignisvet.model.endereco.Endereco;
import vet.ignis.ignisvet.model.endereco.EnderecoDTO;

public class Veterinario {

    private Long id;
    private String nome;
    private Especialidade especialidade;
    private String email;
    private String celular;
    private String crmv;
    private Endereco endereco;
}
