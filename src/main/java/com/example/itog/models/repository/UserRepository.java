
package com.example.itog.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.itog.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}
