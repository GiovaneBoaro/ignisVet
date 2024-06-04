package vet.ignis.ignisvet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vet.ignis.ignisvet.model.endereco.Endereco;
import vet.ignis.ignisvet.model.veterinario.Veterinario;
import vet.ignis.ignisvet.model.veterinario.VeterinarioDTO;
import vet.ignis.ignisvet.repository.VeterinarioRepository;


@RestController
@RequestMapping("veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody VeterinarioDTO dados) {
        repository.save(new Veterinario(dados));
    }

}
