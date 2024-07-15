package vet.ignis.ignisvet.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import vet.ignis.ignisvet.model.veterinario.ListagemVeterinarioDTO;
import vet.ignis.ignisvet.model.veterinario.Veterinario;
import vet.ignis.ignisvet.model.veterinario.CadastroVeterinarioDTO;
import vet.ignis.ignisvet.repository.VeterinarioRepository;

import java.util.List;


@RestController
@RequestMapping("veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroVeterinarioDTO dados) {
        repository.save(new Veterinario(dados));
    }

    @GetMapping
    public Page<ListagemVeterinarioDTO> listar(Pageable paginacao) {
        return repository.findAll(paginacao).map(ListagemVeterinarioDTO::new);
    }

}
