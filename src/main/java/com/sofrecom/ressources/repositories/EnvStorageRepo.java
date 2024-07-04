package com.sofrecom.ressources.repositories;


import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.EnvStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvStorageRepo extends JpaRepository<EnvStorage,Integer> {
    List<EnvStorage> findByAvailablityAndDatacenter_IdDataCenter(Availablity a, int id);
}
