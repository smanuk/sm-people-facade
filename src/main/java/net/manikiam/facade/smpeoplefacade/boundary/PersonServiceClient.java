package net.manikiam.facade.smpeoplefacade.boundary;

import net.manikiam.facade.smpeoplefacade.entity.Person;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "people", url = "${rest.person-service.url}")
public interface PersonServiceClient {

    @GetMapping("/v1/people")
    List<Person> getPeople();

    @Cacheable("peopleId")
    @GetMapping("/v1/people/{id}")
    Person getPerson(@PathVariable("id") Long id);

    @PostMapping("/v1/people")
    Person newPerson(Person person);

    @PutMapping("/v1/people/{id}")
    Person updatePerson(@PathVariable("id") Long id, Person person);
}
