package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.CarDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDetailRepository extends JpaRepository<CarDetail, Integer> {

    @Query(value = "SELECT cd FROM CarDetail cd " +
            " INNER JOIN FETCH cd.car c " +
            " WHERE cd.deletedAt IS NULL ")
    public Page<CarDetail> findActive(Pageable pageable);

}
