package com.example.itog.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.itog.models.PledgeTicket;
import com.example.itog.service.PledgeTicketServiceImp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private PledgeTicketServiceImp rep;

    @PostMapping("/create")
    public PledgeTicket saveDepartment(
            @Valid @RequestBody PledgeTicket pledgeTicket) {
        return rep.savePledgeTicket(pledgeTicket);
    }

    @GetMapping("/index")
    public List<PledgeTicket> getText() {
        return rep.fetchPledgeTicketList();
    }

    @PutMapping("/updates/{id}")
    public PledgeTicket updateDepartment(@RequestBody PledgeTicket pledgeTicket,
            @PathVariable("id") Integer pledgeTicketId) {
        return rep.updateDPledgeTicket(
                pledgeTicket, pledgeTicketId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Integer id) {
        rep.deletePledgeTicketById(
                id);
        return "Deleted Successfully";
    }

}