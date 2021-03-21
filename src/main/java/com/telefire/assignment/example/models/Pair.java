package com.telefire.assignment.example.models;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable=false)
    private long id;

    private long number1;
    private long number2;

    public Pair(long number1, long number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

}
