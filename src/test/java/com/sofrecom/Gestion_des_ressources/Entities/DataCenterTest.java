package com.sofrecom.Gestion_des_ressources.Entities;

import com.sofrecom.ressources.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DataCenterTest {

    private DataCenter dataCenter;

    @BeforeEach
    void setUp() {
        dataCenter = new DataCenter();
    }

    @Test
    void getIdDataCenter() {
        int id = 1;
        dataCenter.setIdDataCenter(id);
        assertEquals(id, dataCenter.getIdDataCenter());
    }

    @Test
    void getEnvcomputes() {
        EnvCompute envCompute = new EnvCompute();
        List<EnvCompute> envComputeList = new ArrayList<>();
        envComputeList.add(envCompute);
        dataCenter.setEnvcomputes(envComputeList);
        assertEquals(envComputeList, dataCenter.getEnvcomputes());
    }

    @Test
    void getEnvstorages() {
        EnvStorage envStorage = new EnvStorage();
        List<EnvStorage> envStorageList = new ArrayList<>();
        envStorageList.add(envStorage);
        dataCenter.setEnvstorages(envStorageList);
        assertEquals(envStorageList, dataCenter.getEnvstorages());
    }

    @Test
    void getEnvcontrolnetworks() {
        EnvControlNetwork envControlNetwork = new EnvControlNetwork();
        List<EnvControlNetwork> envControlNetworkList = new ArrayList<>();
        envControlNetworkList.add(envControlNetwork);
        dataCenter.setEnvcontrolnetworks(envControlNetworkList);
        assertEquals(envControlNetworkList, dataCenter.getEnvcontrolnetworks());
    }

    @Test
    void getNetworkelements() {
        NetworkElements networkElements = new NetworkElements();
        List<NetworkElements> networkElementsList = new ArrayList<>();
        networkElementsList.add(networkElements);
        dataCenter.setNetworkelements(networkElementsList);
        assertEquals(networkElementsList, dataCenter.getNetworkelements());
    }
}
