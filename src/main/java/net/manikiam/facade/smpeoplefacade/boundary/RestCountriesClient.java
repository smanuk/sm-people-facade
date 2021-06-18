package net.manikiam.facade.smpeoplefacade.boundary;

import net.manikiam.facade.smpeoplefacade.entity.dto.CountryInfo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "countires", url = "${rest.rest-countries.url}")
public interface RestCountriesClient {

    @Cacheable("countryCode")
    @GetMapping("/v2/alpha/{code}")
    CountryInfo getCountry(@PathVariable("code") String code);
}
