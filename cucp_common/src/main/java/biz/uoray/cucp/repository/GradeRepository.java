package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.Grade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {

    @Query(value = "SELECT g FROM Grade g" +
            " INNER JOIN g.car c" +
            " WHERE g.deletedAt IS NULL")
    Page<Grade> findActive(Pageable pageable);

    @Query(value = "SELECT g FROM Grade g " +
            " INNER JOIN g.car c" +
            " WHERE g.id = :id AND g.deletedAt IS NULL")
    Grade findActiveById(@Param("id") Integer id);

    @Query(value = "SELECT g FROM Grade g " +
            " INNER JOIN g.car c" +
            " WHERE g.grade = :grade AND g.deletedAt IS NULL" +
            " AND c.name = :name AND c.deletedAt IS NULL")
    Optional<Grade> findActiveByGradeAndCarName(@Param("grade") String grade, @Param("name") String carName);
}
