package com.telefire.assignment.example.models;


import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;


@Mapper
public interface SumMapper {

    SumMapper INSTANCE = Mappers.getMapper(SumMapper.class);

    @Mapping(target = "sum", ignore = true)
    @Mapping(target = "id", source = "id")
    Sum pairToSum(Pair p);

    @AfterMapping
    default void setSumValue(@MappingTarget Sum s, Pair p) {
        s.setSum(p.getNumber1() + p.getNumber2());
    }

}