package com.berezovska.drop_down_demo.service;

import com.berezovska.drop_down_demo.model.CityEntity;
import com.berezovska.drop_down_demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cityService")
public class CityServiceImpl implements CityService {

    @Qualifier("cityRepository")
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<CityEntity> findByState(int id) {
        return cityRepository.findByState(id);
    }

}
