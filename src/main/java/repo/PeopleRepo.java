package repo;

import model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepo extends JpaRepository<Person, Integer> {
}
