package com.example.itog.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.itog.models.PledgeTicket;
import com.example.itog.models.repository.PledgeTicketRepository;

public class PledgeTicketServiceImp implements PledgeTicketService {

    @Autowired
    private PledgeTicketRepository reppsitory;

    @Override
    public PledgeTicket savePledgeTicket(PledgeTicket pledgeTicket) {
        return reppsitory.save(pledgeTicket);
    }

    @Override
    public List<PledgeTicket> fetchPledgeTicketList() {
        return (List<PledgeTicket>) reppsitory.findAll();
    }

    @Override
    public PledgeTicket updateDPledgeTicket(PledgeTicket pledgeTicket, Integer pledgeTicketId) {
        PledgeTicket depDB = reppsitory.findById(pledgeTicketId)
                .get();

        if (Objects.nonNull(pledgeTicket.getFioBorrower())
                && !"".equalsIgnoreCase(
                        pledgeTicket.getFioBorrower())) {
            depDB.setFioBorrower(
                    pledgeTicket.getFioBorrower());
        }

        if (Objects.nonNull(
                pledgeTicket.getPledgedProperty())
                && !"".equalsIgnoreCase(
                        pledgeTicket.getPledgedProperty())) {
            depDB.setPledgedProperty(
                    pledgeTicket.getPledgedProperty());
        }

        if (Objects.nonNull(pledgeTicket.getLoanAmount())) {
            depDB.setLoanAmount(
                    pledgeTicket.getLoanAmount());
        }
        if (Objects.nonNull(pledgeTicket.getAppraisedValue())) {
            depDB.setAppraisedValue(
                    pledgeTicket.getAppraisedValue());
        }

        return reppsitory.save(depDB);
    }

    @Override
    public void deletePledgeTicketById(Integer pledgeTicketId) {
        reppsitory.deleteById(pledgeTicketId);

    }

}
