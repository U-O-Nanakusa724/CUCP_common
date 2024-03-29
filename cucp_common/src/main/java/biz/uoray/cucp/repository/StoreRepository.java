package biz.uoray.cucp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import biz.uoray.cucp.entity.Store;

import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

    @Query(value = "SELECT s FROM Store s WHERE s.deletedAt IS NULL")
    Page<Store> findActive(Pageable pageable);

    @Query(value = "SELECT s FROM Store s WHERE s.name LIKE %:keyword% AND s.deletedAt IS NULL")
    Page<Store> searchByName(Pageable pageable,
    		                 @Param("keyword") String keyword);

    @Query(value = "SELECT s FROM Store s WHERE s.id = :id AND s.deletedAt IS NULL")
    Store findActiveById(@Param("id") Integer id);

    @Query(value = "SELECT s FROM Store s WHERE s.name = :name AND s.deletedAt IS NULL")
    Optional<Store> findActiveByName(@Param("name") String name);
}
