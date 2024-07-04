package com.sofrecom.ressources.repositories;


import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.EnvControlNetwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvControlNetworkRepo extends JpaRepository<EnvControlNetwork,Integer> {
    List<EnvControlNetwork> findByAvailablityAndDatacenter_IdDataCenter(Availablity a, int id);

}
