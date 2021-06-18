package net.manikiam.facade.smpeoplefacade.entity.dto;

import lombok.Data;
import net.manikiam.facade.smpeoplefacade.entity.Person;

@Data
public class PersonDTO {

    private Person person;
    private CountryInfo countryInfo;
}
