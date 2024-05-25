package vet.ignis.ignisvet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vet.ignis.ignisvet.model.veterinario.VeterinarioDTO;


@RestController
@RequestMapping("veterinarios")
public class VeterinarioController {

    @PostMapping
    public void cadastrar(@RequestBody VeterinarioDTO dados) {
        System.out.println(dados);
    }

}