package net.manikiam.facade.smpeoplefacade.boundary;

import lombok.extern.slf4j.Slf4j;
import net.manikiam.facade.smpeoplefacade.control.PersonService;
import net.manikiam.facade.smpeoplefacade.entity.Person;
import net.manikiam.facade.smpeoplefacade.entity.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "v1/people")
public class PersonFacade {

    @Autowired
    PersonServiceClient personServiceClient;

    @Autowired
    PersonService personService;

    @GetMapping
    public List<PersonDTO> getPeople() {

        return personService.getPeople();
    }

    @GetMapping("{id}")
    public PersonDTO getPerson(@PathVariable("id") Long id) {

        return personService.getPerson(id);
    }

    @PostMapping
    public PersonDTO newPerson(@RequestBody @Valid Person person) {

        return personService.newPerson(person);
    }

    @PutMapping("{id}")
    public Person updatePerson(@PathVariable("id")Long id, @RequestBody Person person) {

        return personServiceClient.updatePerson(id, person);
    }
}
