package com.project.Mondo.Repository;


import org.springframework.data.repository.CrudRepository;
import com.project.Mondo.Model.Authority;

public interface AuthoritiesRepository extends CrudRepository<Authority, Long> {
}