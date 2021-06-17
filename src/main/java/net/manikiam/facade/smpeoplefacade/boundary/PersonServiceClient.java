package net.manikiam.facade.smpeoplefacade.boundary;

import net.manikiam.facade.smpeoplefacade.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "people", url = "${rest.person-service.url}")
public interface PersonServiceClient {

    @GetMapping("/v1/people")
    List<Object> getPeople();

    @GetMapping("/v1/people/{id}")
    Object getPerson(@PathVariable("id") Long id);

    @PostMapping
    Object newPerson(Person person);

    @PutMapping("{id}")
    Object updatePerson(@PathVariable("id") Long id, Person person);
}
