package vet.ignis.ignisvet.model.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String bairro;
    private String uf;
    private String cep;

    public Endereco(EnderecoDTO dados) {
        this.logradouro = dados.logradouro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.bairro = dados.bairro();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }
}
