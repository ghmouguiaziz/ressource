package com.sofrecom.ressources.repositories;


import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.NetworkElements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NetworkElementsRepo extends JpaRepository<NetworkElements,Integer> {
    List<NetworkElements> findByAvailablityAndDatacenter_IdDataCenter(Availablity a, int id);
}
