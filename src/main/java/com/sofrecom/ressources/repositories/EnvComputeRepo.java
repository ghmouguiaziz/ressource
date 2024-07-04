package com.sofrecom.ressources.repositories;


import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.EnvCompute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvComputeRepo extends JpaRepository<EnvCompute,Integer> {
    List<EnvCompute> findByAvailablityAndDatacenter_IdDataCenter(Availablity a, int id);


}
