package biz.uoray.cucp.repository;

import biz.uoray.cucp.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

    /**
     * storeテーブルを販売店名でselect
     *
     * @param name
     * @return
     */
    public Store findByName(String name);
}