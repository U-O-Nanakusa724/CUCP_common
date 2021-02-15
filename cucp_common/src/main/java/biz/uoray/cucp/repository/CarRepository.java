package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    @Query(value = "SELECT c FROM Car c WHERE c.deletedAt IS NULL")
    Page<Car> findActive(Pageable pageable);
}