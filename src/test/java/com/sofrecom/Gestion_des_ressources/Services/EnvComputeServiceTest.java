package com.sofrecom.Gestion_des_ressources.Services;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.EnvCompute;
import com.sofrecom.ressources.repositories.DataCenterRepo;
import com.sofrecom.ressources.repositories.EnvComputeRepo;
import com.sofrecom.ressources.services.EnvComputeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EnvComputeServiceTest {

    @Mock
    private EnvComputeRepo envComputeRepo;

    @Mock
    private DataCenterRepo dataCenterRepo;

    @InjectMocks
    private EnvComputeService envComputeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void addEnvCompute() {
        EnvCompute envCompute = new EnvCompute();
        envCompute.setIdCompute(1);
        DataCenter dataCenter = new DataCenter();
        when(dataCenterRepo.findById(1)).thenReturn(Optional.of(dataCenter));
        when(envComputeRepo.save(envCompute)).thenReturn(envCompute);
        assertEquals("added", envComputeService.addEnvCompute(envCompute, 1));
    }

    @Test
    void updateEnvCompute() {
        EnvCompute envCompute = new EnvCompute();
        envCompute.setIdCompute(1);
        when(envComputeRepo.findById(1)).thenReturn(Optional.of(envCompute));
        when(envComputeRepo.saveAndFlush(envCompute)).thenReturn(envCompute);
        assertEquals("updated", envComputeService.updateEnvCompute(envCompute, 1));
    }

    @Test
    void deleteEnvCompute() {
        EnvCompute envCompute = new EnvCompute();
        envCompute.setIdCompute(1);
        envComputeService.deleteEnvCompute(1);
        verify(envComputeRepo, times(1)).deleteById(1);
    }

    @Test
    void getAllEnvCompute() {
        List<EnvCompute> envComputeList = new ArrayList<>();
        when(envComputeRepo.findAll()).thenReturn(envComputeList);
        assertEquals(envComputeList, envComputeService.getAllEnvCompute());
    }

    @Test
    void getEnvComputeById() {
        EnvCompute envCompute = new EnvCompute();
        envCompute.setIdCompute(1);
        when(envComputeRepo.findById(1)).thenReturn(Optional.of(envCompute));
        assertEquals(envCompute, envComputeService.getEnvComputeById(1));
    }

    @Test
    void findByAvailablity() {
        List<EnvCompute> envComputeList = new ArrayList<>();
        when(envComputeRepo.findByAvailablityAndDatacenter_IdDataCenter(Availablity.AVAILABLE, 1)).thenReturn(envComputeList);
        assertEquals(envComputeList, envComputeService.findByAvailablity(Availablity.AVAILABLE, 1));
    }
}
