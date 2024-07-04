package com.sofrecom.ressources.services;



import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.EnvStorage;

import java.util.List;

public interface IEnvStorageService {
    String addEnvStorage(EnvStorage af, int id);
    String updateEnvStorage(EnvStorage a, int id);
    String updateDataCenterEnvStorage(int iddc, int ida);
    String deleteEnvStorage(int id);
    List<EnvStorage> getAllEnvStorage();
    EnvStorage getEnvStorageById(int id);
    List<EnvStorage> findByAvailablityStorage(Availablity t, int id);
}
