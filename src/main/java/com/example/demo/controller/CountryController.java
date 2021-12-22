package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.service.country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/countries")
@CrossOrigin("*")
public class CountryController {
    @Autowired
    private ICountryService countryService;


    @GetMapping
    public ResponseEntity<List<Country>> findAll(){
        return new ResponseEntity<>(countryService.findAll(), HttpStatus.OK);
    }
}
