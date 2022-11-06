package com.example.novrestdemo.repos;

import com.example.novrestdemo.models.Normie;
import com.example.novrestdemo.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface NormieRepo extends CrudRepository<Normie,Long> {
    Normie findByName(String name);
}
