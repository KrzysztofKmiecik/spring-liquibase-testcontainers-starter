package pl.kmiecik.springliquibasetestcontainersstarter;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class PersonService {
    private  PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> getPeople(){
        return personRepo.findAll();
    }
}
