package ru.demin.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demin.security.repo.PeopleRepo;

@Service
public class PeopleService {
    private final PeopleRepo peopleRepo;

    @Autowired
    public PeopleService(PeopleRepo peopleRepo) {
        this.peopleRepo = peopleRepo;
    }


}
