package com.dbmovies.db_movies.controller;

import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbmovies.db_movies.domain.entities.Country;
import com.dbmovies.db_movies.domain.service.ICountry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;




@RestController
@RequestMapping("/api/countries")
public class CountryController {
    @Autowired
    private ICountry countryService;

    @GetMapping("/all")
    public ResponseEntity<Page<Country>> findAll(Pageable pageable) {
        Page<Country> countryPage = countryService.findAll(pageable);

        if(countryPage.hasContent()){
            return ResponseEntity.ok(countryPage);
        }

        return ResponseEntity.notFound().build();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Country> view(@PathVariable Long id) {
        Optional<Country> countryOpt = countryService.findOneById(id);
        if(countryOpt.isPresent()){
            return ResponseEntity.ok(countryOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public ResponseEntity<Country> create(@Valid  @RequestBody Country country, BindingResult result) {
        // if(result.hasFieldErrors()){
        //     return validation(result);
        // }
        return ResponseEntity.status(HttpStatus.CREATED).body(countryService.createOne(country));
    }

    private ResponseEntity<?> validation(BindingResult result){
        Map<String , String> errors = new HashMap<>();

        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(),"The field "+ err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
    
}
