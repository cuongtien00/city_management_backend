package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.city.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private ICityService cityService;

    @GetMapping
    public ResponseEntity<List<City>> findAll(){
        List<City> cities = cityService.findAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity<City> save(@RequestBody City city){
        return new ResponseEntity<>(cityService.save(city),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<City> update(@RequestBody City city){

        return new ResponseEntity<>(cityService.save(city),HttpStatus.OK);

    }    

    @DeleteMapping("/{id}")
    public ResponseEntity<City> remove(@PathVariable Long id){
        cityService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }}
