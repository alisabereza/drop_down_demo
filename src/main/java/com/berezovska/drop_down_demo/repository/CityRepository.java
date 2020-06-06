package com.berezovska.drop_down_demo.repository;

import java.util.List;

import com.berezovska.drop_down_demo.model.City;
import com.berezovska.drop_down_demo.model.CityEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository("cityRepository")
public interface CityRepository extends CrudRepository<City, Integer> {

    @Query("select new com.berezovska.drop_down_demo.model.CityEntity(id, name) from City where state.id = :id")
    public List<CityEntity> findByState(@Param("id") int id);

}