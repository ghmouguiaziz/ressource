package com.sofrecom.ressources.services;



import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.NetworkElements;

import java.util.List;

public interface INetworkElementsService {
    String addNetworkElements(NetworkElements af, int id);
    String updateNetworkElements(NetworkElements a, int id);
    String updateDataCenterNetworkElements(int iddc, int ida);
    String deleteNetworkElements(int id);
    List<NetworkElements> getAllNetworkElements();
    NetworkElements getNetworkElementsById(int id);
    List<NetworkElements> findByAvailablity(Availablity t, int id);
}
