package com.project.Mondo.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.project.Mondo.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByUsername(String username);

    User findByUsername(String username);
}
