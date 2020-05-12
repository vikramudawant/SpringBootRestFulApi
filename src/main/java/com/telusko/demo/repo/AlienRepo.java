package com.telusko.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{

}
