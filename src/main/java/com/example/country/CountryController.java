package com.example.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
public class CountryController  {
    @Autowired
    private ContryRepository countryrepository ;
    @Autowired
    private CountryService countryservice ;

    @PostMapping("/addCountry")
    public String saveCountry(@RequestBody Country country)
    {
        countryrepository.save(country) ;
        return "added country with id" + country.getId();
    }
    @GetMapping("/ListAllCountry")
    public List<Country> getCountry(){

        return countryrepository.findAll();
    }
    @GetMapping("/findcountryWithId/{id}")
    public Optional<Country> getContry(@PathVariable int id){

        return countryrepository.findById(id);
    }


   @GetMapping("DeleteCountryWithid/{id}")
    public String DeleteCountry(@PathVariable int id)
    {
        countryrepository.deleteById(id);
        return " Country delete with id "+ id;
    }
    @PutMapping("/EditCountry/{id}")
    private Country EditCountry(@RequestBody Country country)
    {
        countryrepository.save(country);
        return country;
    }
    @GetMapping("/listpaginated")
    public Page<Country> ListCountryPaginated(Pageable p)
    {
        return countryrepository.findAll(p);
    }
}


