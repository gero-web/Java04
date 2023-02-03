package com.example.itog.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.itog.models.Tovar;
import com.example.itog.service.TovarServiceImp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private TovarServiceImp rep;

    @PostMapping("/createTovar")
    public Tovar saveTovar(
            @Valid @RequestBody Tovar tovar) {
        return rep.saveTovar(tovar);
    }

    @GetMapping("/index")
    public List<Tovar> getAllTovar() {
        return rep.fetchTovarList();
    }

    @PutMapping("/updatesTovars/{id}")
    public Tovar updateTovar(@RequestBody Tovar tovar,
        @PathVariable("id") Integer tovarId) {
        return rep.updateTovar( tovar, tovarId);
    }

    @DeleteMapping("/deleteTovar/{id}")
    public String deleteTovarById(@PathVariable("id") Integer id) {
        rep.deleteTovar(id);
        return "Deleted Successfully";
    }

}