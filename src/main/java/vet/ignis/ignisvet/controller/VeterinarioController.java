package vet.ignis.ignisvet.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import vet.ignis.ignisvet.model.endereco.Endereco;
import vet.ignis.ignisvet.model.veterinario.ListagemVeterinarioDTO;
import vet.ignis.ignisvet.model.veterinario.Veterinario;
import vet.ignis.ignisvet.model.veterinario.VeterinarioDTO;
import vet.ignis.ignisvet.repository.VeterinarioRepository;

import java.util.List;


@RestController
@RequestMapping("veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid VeterinarioDTO dados) {
        repository.save(new Veterinario(dados));
    }

    @GetMapping
    public List<ListagemVeterinarioDTO> listar() {
        return repository.findAll();
    }

}
