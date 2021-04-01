package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {

    @Query(value = "SELECT p FROM Price p WHERE p.id = :id AND p.deletedAt IS NULL")
    Price findActiveById(@Param("id") Integer id);
}
