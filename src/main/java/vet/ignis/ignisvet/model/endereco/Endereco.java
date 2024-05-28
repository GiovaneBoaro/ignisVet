package vet.ignis.ignisvet.model.endereco;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;

}
