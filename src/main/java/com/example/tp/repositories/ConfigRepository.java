package com.example.tp.repositories;

import com.example.tp.models.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConfigRepository extends JpaRepository<Config,Long> {

    @Query(value="SELECT * FROM Config config ORDER BY id DESC LIMIT 1",nativeQuery = true)
    public Config findMaxById();
}
