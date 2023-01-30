package com.cxcommerce.controller;

import com.cxcommerce.models.PessoaModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping({"/pessoas"})
public class PessoaController {

    private final List<PessoaModel> pessoaModelList = new ArrayList();

    public PessoaController() {
    }

    @GetMapping({"/findAll"})
    private List<PessoaModel> getAll() {
        return this.pessoaModelList;
    }

    @GetMapping({"/findById/{id}"})
    private PessoaModel getById(@PathVariable UUID id) {
        return this.pessoaModelList.stream().filter((pessoaModel) -> id.equals(pessoaModel.getId())).findFirst().orElse(null);
    }

    @PostMapping({"/save"})
    private PessoaModel save(@RequestBody PessoaModel pessoaModel) {
        pessoaModel.setId(UUID.randomUUID());
        this.pessoaModelList.add(pessoaModel);
        return pessoaModel;
    }

    @PutMapping({"/update/{id}"})
    private PessoaModel update(@RequestBody PessoaModel pessoaModel, @PathVariable UUID id) {
        PessoaModel pessoa = this.pessoaModelList.stream().filter((pessoaModel1) -> id.equals(pessoaModel1.getId())).findFirst().orElse(null);
        this.pessoaModelList.remove(pessoa);
        pessoaModel.setId(id);
        this.pessoaModelList.add(pessoaModel);
        return pessoaModel;
    }

    @DeleteMapping({"/delete/{id}"})
    private PessoaModel delete(@PathVariable UUID id) {
        PessoaModel pessoa = this.pessoaModelList.stream().filter((pessoaModel) -> id.equals(pessoaModel.getId())).findFirst().orElse(null);
        this.pessoaModelList.remove(pessoa);
        return pessoa;
    }
}
