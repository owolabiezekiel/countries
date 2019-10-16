package com.example.countries.repositories;

import com.example.countries.entitles.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
