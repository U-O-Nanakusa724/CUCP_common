package biz.uoray.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDetailRepository extends JpaRepository<CarDetail, Integer> {
}