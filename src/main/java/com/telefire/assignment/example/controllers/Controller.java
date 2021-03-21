package com.telefire.assignment.example.controllers;

import java.util.List;

import com.telefire.assignment.example.models.Sum;
import com.telefire.assignment.example.models.SumMapper;

import com.telefire.assignment.example.repository.PairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.telefire.assignment.example.models.Pair;

@RestController
public class Controller {

    @Autowired
    PairRepository repository;


    @GetMapping("/add")
    public Sum register(@RequestParam(value = "number1") long number1,
                         @RequestParam(value = "number2") long number2) {
        System.out.println("checking/inserting numbers: " + number1 + "," + number2);
        return SumMapper.INSTANCE.pairToSum(findPair(number1, number2));
    }

    private Pair findPair(long number1, long number2) {
        List<Pair> pairs = repository.findAll();
        for (Pair p : pairs)
            if (number1 == p.getNumber1() && number2 == p.getNumber2())
                return p;
        return repository.save(new Pair(number1, number2));
    }
}