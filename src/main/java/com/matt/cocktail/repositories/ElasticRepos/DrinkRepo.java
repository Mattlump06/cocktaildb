package com.matt.cocktail.repositories.ElasticRepos;

import com.matt.cocktail.domain.Drink;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface DrinkRepo extends ElasticsearchRepository<Drink, Long> {



    Page<Drink> findByDrinkName(String name, Pageable pageable);


}
