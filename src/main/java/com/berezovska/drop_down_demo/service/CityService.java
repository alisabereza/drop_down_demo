package com.berezovska.drop_down_demo.service;

import com.berezovska.drop_down_demo.model.CityEntity;

import java.util.List;

public interface CityService {

    public List<CityEntity> findByState(int id);

}
