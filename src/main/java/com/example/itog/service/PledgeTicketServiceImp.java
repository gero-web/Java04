package com.example.itog.service;

import java.util.List;
import java.util.Objects;
q
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
        return (List<PledgeTicket>)
        reppsitory.findAll();
    }

    @Override
    public PledgeTicket updateDPledgeTicket(PledgeTicket pledgeTicket, Integer pledgeTicketId) {
        PledgeTicket depDB
        = reppsitory.findById(pledgeTicketId)
              .get();

    if (Objects.nonNull(pledgeTicket)
        && !"".equalsIgnoreCase(
            department.getDepartmentName())) {
        depDB.setDepartmentName(
            department.getDepartmentName());
    }

    if (Objects.nonNull(
            department.getDepartmentAddress())
        && !"".equalsIgnoreCase(
            department.getDepartmentAddress())) {
        depDB.setDepartmentAddress(
            department.getDepartmentAddress());
    }

    if (Objects.nonNull(department.getDepartmentCode())
        && !"".equalsIgnoreCase(
            department.getDepartmentCode())) {
        depDB.setDepartmentCode(
            department.getDepartmentCode());
    }

    return departmentRepository.save(depDB);
    }

    @Override
    public void deletePledgeTicketById(Integer pledgeTicketId) {
        // TODO Auto-generated method stub

    }

}
