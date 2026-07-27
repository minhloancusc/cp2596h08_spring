package com.mypack.dao;

import com.mypack.entities.Region;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author minhloan
 */
public class RegionImp implements RegionDAO{
 private EntityManagerFactory emf = Persistence.createEntityManagerFactory("my_persistence_unit");
    @Override
    public List<Region> showAllRegion() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT c FROM Region c", Region.class).getResultList();

    }

}
