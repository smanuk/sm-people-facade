package net.manikiam.facade.smpeoplefacade.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.manikiam.facade.smpeoplefacade.entity.Person;

@Data
@AllArgsConstructor
public class PersonDTO {

    private Person person;
    private CountryInfo countryInfo;
}
