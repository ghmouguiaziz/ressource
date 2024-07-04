package com.sofrecom.Gestion_des_ressources.Controller;

import com.sofrecom.ressources.controller.Controller;
import com.sofrecom.ressources.entities.*;
import com.sofrecom.ressources.services.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ControllerTest {

    @Mock
    private IDataCenterService dataCenterService;

    @Mock
    private INetworkElementsService networkElementsService;

    @Mock
    private IEnvComputeService envComputeService;

    @Mock
    private IEnvStorageService envStorageService;

    @Mock
    private IEnvControlNetwork envControlNetworkService;

    @InjectMocks
    private Controller controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void addDataCenter() {
        int id = 1;
        when(dataCenterService.addDataCenter(id)).thenReturn("DataCenter added successfully");
        assertEquals("DataCenter added successfully", controller.addDataCenter(id));
    }

    @Test
    void addNetworkElements() {
        NetworkElements networkElements = new NetworkElements();
        networkElements.setName("Test");
        networkElements.setQty(10);
        networkElements.setPorts(5);
        networkElements.setUsed(3);
        networkElements.setFree(2);
        networkElements.setSpareQty(1);
        networkElements.setActDate(new Date());
        networkElements.setAvailablity(Availablity.AVAILABLE);

        int id = 1;
        when(networkElementsService.addNetworkElements(networkElements, id)).thenReturn("NetworkElements added successfully");
        assertEquals("NetworkElements added successfully", controller.addNetworkElements(networkElements, id));
    }

    @Test
    void updateNetworkElements() {
        NetworkElements networkElements = new NetworkElements();
        networkElements.setIdElements(1);
        networkElements.setName("Test");
        // Set other properties...

        int id = 1;
        when(networkElementsService.updateNetworkElements(networkElements, id)).thenReturn("NetworkElements updated successfully");
        assertEquals("NetworkElements updated successfully", controller.updateNetworkElements(networkElements, id));
    }

    @Test
    void updateDataCenterNetworkElements() {
        int networkElementsId = 1;
        int dataCenterId = 1;
        when(networkElementsService.updateDataCenterNetworkElements(networkElementsId, dataCenterId)).thenReturn("DataCenter updated with NetworkElements successfully");
        assertEquals("DataCenter updated with NetworkElements successfully", controller.updateDataCenterNetworkElements(networkElementsId, dataCenterId));
    }

    @Test
    void deleteNetworkElements() {
        int id = 1;
        when(networkElementsService.deleteNetworkElements(id)).thenReturn("NetworkElements deleted successfully");
        assertEquals("NetworkElements deleted successfully", controller.deleteNetworkElements(id));
    }

    @Test
    void getNetworkElementsById() {
        int id = 1;
        NetworkElements networkElements = new NetworkElements();
        when(networkElementsService.getNetworkElementsById(id)).thenReturn(networkElements);
        assertEquals(networkElements, controller.getNetworkElementsById(id));
    }

    @Test
    void getAllNetworkElements() {
        List<NetworkElements> networkElementsList = Collections.singletonList(new NetworkElements());
        when(networkElementsService.getAllNetworkElements()).thenReturn(networkElementsList);
        assertEquals(networkElementsList, controller.getAllNetworkElements());
    }

    @Test
    void findByAvailablityElements() {
        Availablity type = Availablity.AVAILABLE;
        int id = 1;
        List<NetworkElements> networkElementsList = Collections.singletonList(new NetworkElements());
        when(networkElementsService.findByAvailablity(type, id)).thenReturn(networkElementsList);
        assertEquals(networkElementsList, controller.findByAvailablityElements(type, id));
    }
    @Test
    void addEnvCompute() {
        EnvCompute envCompute = new EnvCompute();
        int id = 1;
        when(envComputeService.addEnvCompute(envCompute, id)).thenReturn("EnvCompute added successfully");
        assertEquals("EnvCompute added successfully", controller.addEnvCompute(envCompute, id));
    }

    @Test
    void updateEnvCompute() {
        EnvCompute envCompute = new EnvCompute();
        envCompute.setIdCompute(1);
        // Set other properties...

        int id = 1;
        when(envComputeService.updateEnvCompute(envCompute, id)).thenReturn("EnvCompute updated successfully");
        assertEquals("EnvCompute updated successfully", controller.updateEnvCompute(envCompute, id));
    }

    @Test
    void deleteEnvCompute() {
        int id = 1;
        when(envComputeService.deleteEnvCompute(id)).thenReturn("EnvCompute deleted successfully");
        assertEquals("EnvCompute deleted successfully", controller.deleteEnvCompute(id));
    }

    @Test
    void getEnvComputeById() {
        int id = 1;
        EnvCompute envCompute = new EnvCompute();
        when(envComputeService.getEnvComputeById(id)).thenReturn(envCompute);
        assertEquals(envCompute, controller.getEnvComputeById(id));
    }

    @Test
    void getAllEnvCompute() {
        List<EnvCompute> envComputeList = Collections.singletonList(new EnvCompute());
        when(envComputeService.getAllEnvCompute()).thenReturn(envComputeList);
        assertEquals(envComputeList, controller.getAllEnvCompute());
    }

    @Test
    void findByAvailablity() {
        Availablity type = Availablity.AVAILABLE;
        int id = 1;
        List<EnvCompute> envComputeList = Collections.singletonList(new EnvCompute());
        when(envComputeService.findByAvailablity(type, id)).thenReturn(envComputeList);
        assertEquals(envComputeList, controller.findByAvailablity(type, id));
    }
    @Test
    void addEnvStorage() {
        EnvStorage envStorage = new EnvStorage();
        int id = 1;
        when(envStorageService.addEnvStorage(envStorage, id)).thenReturn("EnvStorage added successfully");
        assertEquals("EnvStorage added successfully", controller.addEnvStorage(envStorage, id));
    }

    @Test
    void updateEnvStorage() {
        EnvStorage envStorage = new EnvStorage();
        envStorage.setIdStorage(1);
        // Set other properties...

        int id = 1;
        when(envStorageService.updateEnvStorage(envStorage, id)).thenReturn("EnvStorage updated successfully");
        assertEquals("EnvStorage updated successfully", controller.updateEnvStorage(envStorage, id));
    }

    @Test
    void updateDataCenterEnvStorage() {
        int envStorageId = 1;
        int dataCenterId = 1;
        when(envStorageService.updateDataCenterEnvStorage(envStorageId, dataCenterId)).thenReturn("DataCenter updated with EnvStorage successfully");
        assertEquals("DataCenter updated with EnvStorage successfully", controller.updateDataCenterEnvStorage(envStorageId, dataCenterId));
    }

    @Test
    void deleteEnvStorage() {
        int id = 1;
        when(envStorageService.deleteEnvStorage(id)).thenReturn("EnvStorage deleted successfully");
        assertEquals("EnvStorage deleted successfully", controller.deleteEnvStorage(id));
    }

    @Test
    void getEnvStorageById() {
        int id = 1;
        EnvStorage envStorage = new EnvStorage();
        when(envStorageService.getEnvStorageById(id)).thenReturn(envStorage);
        assertEquals(envStorage, controller.getEnvStorageById(id));
    }

    @Test
    void getAllEnvStorage() {
        List<EnvStorage> envStorageList = Collections.singletonList(new EnvStorage());
        when(envStorageService.getAllEnvStorage()).thenReturn(envStorageList);
        assertEquals(envStorageList, controller.getAllEnvStorage());
    }

    @Test
    void findByAvailablityStorage() {
        Availablity type = Availablity.AVAILABLE;
        int id = 1;
        List<EnvStorage> envStorageList = Collections.singletonList(new EnvStorage());
        when(envStorageService.findByAvailablityStorage(type, id)).thenReturn(envStorageList);
        assertEquals(envStorageList, controller.findByAvailablityStorage(type, id));
    }

    @Test
    void addEnvControlNetwork() {
        EnvControlNetwork envControlNetwork = new EnvControlNetwork();
        int id = 1;
        when(envControlNetworkService.addEnvControlNetwork(envControlNetwork, id)).thenReturn("EnvControlNetwork added successfully");
        assertEquals("EnvControlNetwork added successfully", controller.addEnvControlNetwork(envControlNetwork, id));
    }

    @Test
    void updateEnvControlNetwork() {
        EnvControlNetwork envControlNetwork = new EnvControlNetwork();
        envControlNetwork.setIdControlNetwork(1);
        // Set other properties...

        int id = 1;
        when(envControlNetworkService.updateEnvControlNetwork(envControlNetwork, id)).thenReturn("EnvControlNetwork updated successfully");
        assertEquals("EnvControlNetwork updated successfully", controller.updateEnvControlNetwork(envControlNetwork, id));
    }

    @Test
    void updateDataCenterEnvControlNetwork() {
        int envControlNetworkId = 1;
        int dataCenterId = 1;
        when(envControlNetworkService.updateDataCenterEnvControlNetwork(envControlNetworkId, dataCenterId)).thenReturn("DataCenter updated with EnvControlNetwork successfully");
        assertEquals("DataCenter updated with EnvControlNetwork successfully", controller.updateDataCenterEnvControlNetwork(envControlNetworkId, dataCenterId));
    }

    @Test
    void deleteEnvControlNetwork() {
        int id = 1;
        when(envControlNetworkService.deleteEnvControlNetwork(id)).thenReturn("EnvControlNetwork deleted successfully");
        assertEquals("EnvControlNetwork deleted successfully", controller.deleteEnvControlNetwork(id));
    }

    @Test
    void getEnvControlNetworkById() {
        int id = 1;
        EnvControlNetwork envControlNetwork = new EnvControlNetwork();
        when(envControlNetworkService.getEnvControlNetworkById(id)).thenReturn(envControlNetwork);
        assertEquals(envControlNetwork, controller.getEnvControlNetworkById(id));
    }

    @Test
    void getAllEnvControlNetwork() {
        List<EnvControlNetwork> envControlNetworkList = Collections.singletonList(new EnvControlNetwork());
        when(envControlNetworkService.getAllEnvControlNetwork()).thenReturn(envControlNetworkList);
        assertEquals(envControlNetworkList, controller.getAllEnvControlNetwork());
    }

    @Test
    void findByAvailablityControlNetwork() {
        Availablity type = Availablity.AVAILABLE;
        int id = 1;
        List<EnvControlNetwork> envControlNetworkList = Collections.singletonList(new EnvControlNetwork());
        when(envControlNetworkService.findByAvailablityControlNetwork(type, id)).thenReturn(envControlNetworkList);
        assertEquals(envControlNetworkList, controller.findByAvailablityControlNetwork(type, id));
    }

}
