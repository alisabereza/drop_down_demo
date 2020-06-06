package com.berezovska.drop_down_demo.service;

import com.berezovska.drop_down_demo.model.StateEntity;
import com.berezovska.drop_down_demo.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stateService")
public class StateServiceImpl implements StateService {

    @Qualifier("stateRepository")
    @Autowired
    private StateRepository stateRepository;

    @Override
    public List<StateEntity> findByCountry(int id) {
        return stateRepository.findByCountry(id);
    }

}
