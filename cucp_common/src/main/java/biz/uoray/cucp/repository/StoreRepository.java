package biz.uoray.cucp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import biz.uoray.cucp.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

    @Query(value = "SELECT s FROM Store s WHERE s.deletedAt IS NULL")
    Page<Store> findActive(Pageable pageable);

    @Query(value = "SELECT s FROM Store s WHERE s.name LIKE %:keyword% AND s.deletedAt IS NULL")
    Page<Store> searchByName(Pageable pageable,
    		                 @Param("keyword") String keyword);
}
