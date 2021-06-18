package net.manikiam.facade.smpeoplefacade.control;

import lombok.extern.slf4j.Slf4j;
import net.manikiam.facade.smpeoplefacade.boundary.PersonServiceClient;
import net.manikiam.facade.smpeoplefacade.boundary.RestCountriesClient;
import net.manikiam.facade.smpeoplefacade.entity.Person;
import net.manikiam.facade.smpeoplefacade.entity.dto.CountryInfo;
import net.manikiam.facade.smpeoplefacade.entity.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonService {

    @Autowired
    private PersonServiceClient personServiceClient;

    @Autowired
    private RestCountriesClient restCountriesClient;

    public PersonDTO getPerson(Long id) {
        return buildDTO(personServiceClient.getPerson(id));
    }

    private PersonDTO buildDTO(Person person) {

        CountryInfo countryInfo = restCountriesClient.getCountry(person.getCountryCode());
        return new PersonDTO(person, countryInfo);
    }
}
