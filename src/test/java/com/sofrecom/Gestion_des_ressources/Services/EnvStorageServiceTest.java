package com.sofrecom.Gestion_des_ressources.Services;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.EnvStorage;
import com.sofrecom.ressources.repositories.DataCenterRepo;
import com.sofrecom.ressources.repositories.EnvStorageRepo;
import com.sofrecom.ressources.services.EnvStorageService;
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

class EnvStorageServiceTest {

    @Mock
    private EnvStorageRepo envStorageRepo;

    @Mock
    private DataCenterRepo dataCenterRepo;

    @InjectMocks
    private EnvStorageService envStorageService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void addEnvStorage() {
        EnvStorage envStorage = new EnvStorage();
        envStorage.setIdStorage(1);
        when(dataCenterRepo.findById(1)).thenReturn(Optional.of(new DataCenter()));
        when(envStorageRepo.save(envStorage)).thenReturn(envStorage);
        assertEquals("added", envStorageService.addEnvStorage(envStorage, 1));
    }

    @Test
    void updateEnvStorage() {
        EnvStorage envStorage = new EnvStorage();
        envStorage.setIdStorage(1);
        when(envStorageRepo.findById(1)).thenReturn(Optional.of(envStorage));
        when(envStorageRepo.saveAndFlush(envStorage)).thenReturn(envStorage);
        assertEquals("updated", envStorageService.updateEnvStorage(envStorage, 1));
    }

    @Test
    void updateDataCenterEnvStorage() {
        EnvStorage envStorage = new EnvStorage();
        envStorage.setIdStorage(1);
        DataCenter dataCenter = new DataCenter();
        dataCenter.setIdDataCenter(1);
        when(envStorageRepo.findById(1)).thenReturn(Optional.of(envStorage));
        when(dataCenterRepo.findById(1)).thenReturn(Optional.of(dataCenter));
        when(envStorageRepo.save(envStorage)).thenReturn(envStorage);
        assertEquals("updated", envStorageService.updateDataCenterEnvStorage(1, 1));
    }

    @Test
    void deleteEnvStorage() {
        envStorageService.deleteEnvStorage(1);
        verify(envStorageRepo, times(1)).deleteById(1);
    }

    @Test
    void getAllEnvStorage() {
        EnvStorage envStorage1 = new EnvStorage();
        EnvStorage envStorage2 = new EnvStorage();
        when(envStorageRepo.findAll()).thenReturn(Arrays.asList(envStorage1, envStorage2));
        List<EnvStorage> result = envStorageService.getAllEnvStorage();
        assertEquals(2, result.size());
    }

    @Test
    void getEnvStorageById() {
        EnvStorage envStorage = new EnvStorage();
        when(envStorageRepo.findById(1)).thenReturn(Optional.of(envStorage));
        assertEquals(envStorage, envStorageService.getEnvStorageById(1));
    }

    @Test
    void findByAvailablityStorage() {
        EnvStorage envStorage1 = new EnvStorage();
        EnvStorage envStorage2 = new EnvStorage();
        when(envStorageRepo.findByAvailablityAndDatacenter_IdDataCenter(Availablity.AVAILABLE, 1))
                .thenReturn(Arrays.asList(envStorage1, envStorage2));
        List<EnvStorage> result = envStorageService.findByAvailablityStorage(Availablity.AVAILABLE, 1);
        assertEquals(2, result.size());
    }
}
