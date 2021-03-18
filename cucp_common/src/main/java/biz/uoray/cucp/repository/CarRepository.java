package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    @Query(value = "SELECT c FROM Car c WHERE c.deletedAt IS NULL")
    Page<Car> findActive(Pageable pageable);

    @Query(value = "SELECT c FROM Car c WHERE c.code LIKE %:keyword% AND c.deletedAt IS NULL")
    Page<Car> searchByCode(Pageable pageable,
                     @Param("keyword") String keyword);

    @Query(value = "SELECT c FROM Car c WHERE c.name LIKE %:keyword% AND c.deletedAt IS NULL")
    Page<Car> searchByName(Pageable pageable,
                           @Param("keyword") String keyword);

    @Query(value = "SELECT c FROM Car c WHERE c.id = :id AND c.deletedAt IS NULL")
    Car findActiveById(@Param("id") Integer id);
}