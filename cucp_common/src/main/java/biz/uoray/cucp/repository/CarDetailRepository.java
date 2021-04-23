package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.CarDetail;
import biz.uoray.cucp.entity.Color;
import biz.uoray.cucp.entity.Grade;
import biz.uoray.cucp.entity.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

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

    @Query(value = "SELECT cd FROM CarDetail cd" +
            " INNER JOIN cd.grade g" +
            " INNER JOIN g.car c" +
            " INNER JOIN cd.store s" +
            " INNER JOIN cd.color col" +
            " WHERE cd.grade = :grade" +
            " AND cd.store = :store" +
            " AND cd.color = :color" +
            " AND cd.modelYear = :modelYear" +
            " AND cd.distance = :distance" +
            " AND cd.deletedAt IS NULL")
    List<CarDetail> findTarget(@Param("grade") Grade grade,
                               @Param("store") Store store,
                               @Param("color") Color color,
                               @Param("modelYear") Date modelYear,
                               @Param("distance") String distance);
}
