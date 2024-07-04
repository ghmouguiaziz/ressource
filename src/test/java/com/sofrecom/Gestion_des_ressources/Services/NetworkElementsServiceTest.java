package com.sofrecom.Gestion_des_ressources.Services;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.NetworkElements;
import com.sofrecom.ressources.repositories.DataCenterRepo;
import com.sofrecom.ressources.repositories.NetworkElementsRepo;
import com.sofrecom.ressources.services.NetworkElementsService;
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

class NetworkElementsServiceTest {

    @Mock
    private NetworkElementsRepo networkElementsRepo;

    @Mock
    private DataCenterRepo dataCenterRepo;

    @InjectMocks
    private NetworkElementsService networkElementsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void addNetworkElements() {
        NetworkElements networkElements = new NetworkElements();
        networkElements.setIdElements(1);
        when(dataCenterRepo.findById(1)).thenReturn(Optional.of(new DataCenter()));
        when(networkElementsRepo.save(networkElements)).thenReturn(networkElements);
        assertEquals("added", networkElementsService.addNetworkElements(networkElements, 1));
    }

    @Test
    void updateNetworkElements() {
        NetworkElements networkElements = new NetworkElements();
        networkElements.setIdElements(1);
        when(networkElementsRepo.findById(1)).thenReturn(Optional.of(networkElements));
        when(networkElementsRepo.saveAndFlush(networkElements)).thenReturn(networkElements);
        assertEquals("updated", networkElementsService.updateNetworkElements(networkElements, 1));
    }

    @Test
    void updateDataCenterNetworkElements() {
        NetworkElements networkElements = new NetworkElements();
        networkElements.setIdElements(1);
        DataCenter dataCenter = new DataCenter();
        dataCenter.setIdDataCenter(1);
        when(networkElementsRepo.findById(1)).thenReturn(Optional.of(networkElements));
        when(dataCenterRepo.findById(1)).thenReturn(Optional.of(dataCenter));
        when(networkElementsRepo.save(networkElements)).thenReturn(networkElements);
        assertEquals("updated", networkElementsService.updateDataCenterNetworkElements(1, 1));
    }

    @Test
    void deleteNetworkElements() {
        networkElementsService.deleteNetworkElements(1);
        verify(networkElementsRepo, times(1)).deleteById(1);
    }

    @Test
    void getAllNetworkElements() {
        NetworkElements networkElements1 = new NetworkElements();
        NetworkElements networkElements2 = new NetworkElements();
        when(networkElementsRepo.findAll()).thenReturn(Arrays.asList(networkElements1, networkElements2));
        List<NetworkElements> result = networkElementsService.getAllNetworkElements();
        assertEquals(2, result.size());
    }

    @Test
    void getNetworkElementsById() {
        NetworkElements networkElements = new NetworkElements();
        when(networkElementsRepo.findById(1)).thenReturn(Optional.of(networkElements));
        assertEquals(networkElements, networkElementsService.getNetworkElementsById(1));
    }

    @Test
    void findByAvailablity() {
        NetworkElements networkElements1 = new NetworkElements();
        NetworkElements networkElements2 = new NetworkElements();
        when(networkElementsRepo.findByAvailablityAndDatacenter_IdDataCenter(Availablity.AVAILABLE, 1))
                .thenReturn(Arrays.asList(networkElements1, networkElements2));
        List<NetworkElements> result = networkElementsService.findByAvailablity(Availablity.AVAILABLE, 1);
        assertEquals(2, result.size());
    }
}
