package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.CarDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository {

    @Query(value = "SELECT g FROM Grade g" +
            " INNER JOIN g.car c" +
            " WHERE cd.deletedAt IS NULL")
    Page<CarDetail> findActive(Pageable pageable);
}
