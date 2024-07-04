package com.sofrecom.ressources.services;



import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.EnvControlNetwork;

import java.util.List;

public interface IEnvControlNetwork {
    String addEnvControlNetwork(EnvControlNetwork af, int id);
    String updateEnvControlNetwork(EnvControlNetwork a, int id);
    String updateDataCenterEnvControlNetwork(int iddc, int ida);
    String deleteEnvControlNetwork(int id);
    List<EnvControlNetwork> getAllEnvControlNetwork();
    EnvControlNetwork getEnvControlNetworkById(int id);
    List<EnvControlNetwork> findByAvailablityControlNetwork(Availablity t, int id);

}
