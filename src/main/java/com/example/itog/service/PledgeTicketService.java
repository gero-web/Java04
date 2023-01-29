package com.example.itog.service;

import java.util.List;

import com.example.itog.models.PledgeTicket;

public interface PledgeTicketService {
    // Save operation
    PledgeTicket savePledgeTicket(PledgeTicket pledgeTicket);

    // Read operation
    List<PledgeTicket> fetchPledgeTicketList();

    // Update operation
    PledgeTicket updateDPledgeTicket(PledgeTicket pledgeTicket,
            Integer pledgeTicketId);

    // Delete operation
    void deletePledgeTicketById(Integer pledgeTicketId);
}
