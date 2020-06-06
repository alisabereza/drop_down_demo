package com.berezovska.drop_down_demo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.berezovska.drop_down_demo.model.Country;

@Repository("countryRepository")
public interface CountryRepository extends CrudRepository<Country, Integer> {

}