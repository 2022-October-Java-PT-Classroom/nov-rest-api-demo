package com.example.novrestdemo.repos;

import com.example.novrestdemo.models.Rockstar;
import org.springframework.data.repository.CrudRepository;

public interface RockstarRepo extends CrudRepository<Rockstar, Long> {
}
