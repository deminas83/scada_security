package ru.demin.security.repo;

import ru.demin.security.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PeopleRepo extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);
}
