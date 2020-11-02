package com.example.tp.repositories;


import com.example.tp.models.P;
import com.example.tp.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Long> {

    @Query(value="SELECT * FROM sales s WHERE s.id_product = :id",nativeQuery = true)
    public ArrayList<Sale> getByProduct(@Param("id")Long id);

}
