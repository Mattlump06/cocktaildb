package com.matt.cocktail.repositories;

import com.matt.cocktail.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface DrinkRepository extends CrudRepository<Drink, Long> {
    public Iterable<Drink> findByDrinkName(String name);
}
