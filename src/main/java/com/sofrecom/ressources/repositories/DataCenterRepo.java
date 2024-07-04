package com.sofrecom.ressources.repositories;


import com.sofrecom.ressources.entities.DataCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataCenterRepo extends JpaRepository<DataCenter,Integer> {

}
