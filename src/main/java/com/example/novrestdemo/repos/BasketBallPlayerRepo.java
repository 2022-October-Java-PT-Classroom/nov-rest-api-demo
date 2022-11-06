package com.example.novrestdemo.repos;

import com.example.novrestdemo.models.BasketballPlayer;
import org.springframework.data.repository.CrudRepository;

public interface BasketBallPlayerRepo extends CrudRepository<BasketballPlayer, Long> {
}
