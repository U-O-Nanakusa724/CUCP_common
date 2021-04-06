package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.CarDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDetailRepository extends JpaRepository<CarDetail, Integer> {

    @Query(value = "SELECT cd FROM CarDetail cd" +
            " INNER JOIN cd.grade g" +
            " INNER JOIN g.car c" +
            " INNER JOIN cd.store s" +
            " INNER JOIN cd.color col" +
            " WHERE cd.deletedAt IS NULL AND cd.soldFlag = 0")
    Page<CarDetail> findActive(Pageable pageable);

    @Query(value = "SELECT cd FROM CarDetail cd" +
            " INNER JOIN cd.grade g" +
            " INNER JOIN g.car c" +
            " INNER JOIN cd.store s" +
            " INNER JOIN cd.color col" +
            " WHERE cd.id = :id AND s.deletedAt IS NULL")
    CarDetail findActiveById(@Param("id") Integer id);

}
