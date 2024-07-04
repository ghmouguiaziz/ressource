package com.sofrecom.Gestion_des_ressources.Services;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.EnvControlNetwork;
import com.sofrecom.ressources.repositories.DataCenterRepo;
import com.sofrecom.ressources.repositories.EnvControlNetworkRepo;
import com.sofrecom.ressources.services.EnvControlNetworkService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EnvControlNetworkServiceTest {

    @Mock
    private EnvControlNetworkRepo envControlNetworkRepo;

    @Mock
    private DataCenterRepo dataCenterRepo;

    @InjectMocks
    private EnvControlNetworkService envControlNetworkService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void addEnvControlNetwork() {
        EnvControlNetwork envControlNetwork = new EnvControlNetwork();
        envControlNetwork.setIdControlNetwork(1);
        when(dataCenterRepo.findById(1)).thenReturn(Optional.of(new DataCenter()));
        when(envControlNetworkRepo.save(envControlNetwork)).thenReturn(envControlNetwork);
        assertEquals("added", envControlNetworkService.addEnvControlNetwork(envControlNetwork, 1));
    }

    @Test
    void updateEnvControlNetwork() {
        EnvControlNetwork envControlNetwork = new EnvControlNetwork();
        envControlNetwork.setIdControlNetwork(1);
        when(envControlNetworkRepo.findById(1)).thenReturn(Optional.of(envControlNetwork));
        when(envControlNetworkRepo.saveAndFlush(envControlNetwork)).thenReturn(envControlNetwork);
        assertEquals("updated", envControlNetworkService.updateEnvControlNetwork(envControlNetwork, 1));
    }

    @Test
    void updateDataCenterEnvControlNetwork() {
        EnvControlNetwork envControlNetwork = new EnvControlNetwork();
        envControlNetwork.setIdControlNetwork(1);
        DataCenter dataCenter = new DataCenter();
        dataCenter.setIdDataCenter(1);
        when(envControlNetworkRepo.findById(1)).thenReturn(Optional.of(envControlNetwork));
        when(dataCenterRepo.findById(1)).thenReturn(Optional.of(dataCenter));
        when(envControlNetworkRepo.save(envControlNetwork)).thenReturn(envControlNetwork);
        assertEquals("updated", envControlNetworkService.updateDataCenterEnvControlNetwork(1, 1));
    }

    @Test
    void deleteEnvControlNetwork() {
        envControlNetworkService.deleteEnvControlNetwork(1);
        verify(envControlNetworkRepo, times(1)).deleteById(1);
    }

    @Test
    void getAllEnvControlNetwork() {
        EnvControlNetwork envControlNetwork1 = new EnvControlNetwork();
        EnvControlNetwork envControlNetwork2 = new EnvControlNetwork();
        when(envControlNetworkRepo.findAll()).thenReturn(Arrays.asList(envControlNetwork1, envControlNetwork2));
        List<EnvControlNetwork> result = envControlNetworkService.getAllEnvControlNetwork();
        assertEquals(2, result.size());
    }

    @Test
    void getEnvControlNetworkById() {
        EnvControlNetwork envControlNetwork = new EnvControlNetwork();
        when(envControlNetworkRepo.findById(1)).thenReturn(Optional.of(envControlNetwork));
        assertEquals(envControlNetwork, envControlNetworkService.getEnvControlNetworkById(1));
    }

    @Test
    void findByAvailablityControlNetwork() {
        EnvControlNetwork envControlNetwork1 = new EnvControlNetwork();
        EnvControlNetwork envControlNetwork2 = new EnvControlNetwork();
        when(envControlNetworkRepo.findByAvailablityAndDatacenter_IdDataCenter(Availablity.AVAILABLE, 1))
                .thenReturn(Arrays.asList(envControlNetwork1, envControlNetwork2));
        List<EnvControlNetwork> result = envControlNetworkService.findByAvailablityControlNetwork(Availablity.AVAILABLE, 1);
        assertEquals(2, result.size());
    }
}
