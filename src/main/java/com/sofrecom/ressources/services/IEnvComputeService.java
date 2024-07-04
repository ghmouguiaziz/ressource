package com.sofrecom.ressources.services;



import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.EnvCompute;

import java.util.List;

public interface IEnvComputeService {
    String addEnvCompute(EnvCompute af, int id);
    String updateEnvCompute(EnvCompute a, int id);

    String deleteEnvCompute(int id);
    List<EnvCompute> getAllEnvCompute();
    EnvCompute getEnvComputeById(int id);
    List<EnvCompute> findByAvailablity(Availablity t, int id);


}
