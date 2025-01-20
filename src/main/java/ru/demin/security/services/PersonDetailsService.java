package ru.demin.security.services;

import ru.demin.security.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;
import ru.demin.security.repo.PeopleRepo;
import ru.demin.security.security.PersonDetails;

import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService {
    private final PeopleRepo peopleRepo;

    @Autowired
    public PersonDetailsService(PeopleRepo peopleRepo) {
        this.peopleRepo = peopleRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person =  peopleRepo.findByUsername(username);

        if (person.isEmpty())
            throw new UsernameNotFoundException("Пользователь с таким логином не найден!");

        return new PersonDetails(person.get());
    }

}