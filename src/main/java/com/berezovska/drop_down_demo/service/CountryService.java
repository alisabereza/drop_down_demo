package com.berezovska.drop_down_demo.service;

import com.berezovska.drop_down_demo.model.Country;

public interface CountryService {

    public Iterable<Country> findAll();

    public Country find(int id);

}
