package com.berezovska.drop_down_demo.service;

import com.berezovska.drop_down_demo.model.Country;
import com.berezovska.drop_down_demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Qualifier("countryRepository")
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country find(int id) {
        return countryRepository.findById(id).get();
    }

}
