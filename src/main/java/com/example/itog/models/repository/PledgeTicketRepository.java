package com.example.itog.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.itog.models.PledgeTicket;

@Repository
public interface PledgeTicketRepository extends CrudRepository<PledgeTicket, Integer> {

}
