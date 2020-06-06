package com.berezovska.drop_down_demo.service;

import com.berezovska.drop_down_demo.model.StateEntity;

import java.util.List;

public interface StateService {

    public List<StateEntity> findByCountry(int id);

}