package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.Color;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {

    @Query(value = "SELECT c FROM Color c" +
            " WHERE c.deletedAt IS NULL")
    Page<Color> getActive(Pageable pageable);

    @Query(value = "SELECT c FROM Color c" +
            " WHERE c.id = :id AND c.deletedAt IS NULL")
    Color findActiveById(@Param("id") Integer id);
}
