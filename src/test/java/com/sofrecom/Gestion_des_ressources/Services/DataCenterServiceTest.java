package com.sofrecom.Gestion_des_ressources.Services;

import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.repositories.DataCenterRepo;
import com.sofrecom.ressources.services.DataCenterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class DataCenterServiceTest {

    @Mock
    private DataCenterRepo dataCenterRepo;

    @InjectMocks
    private DataCenterService dataCenterService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void addDataCenter() {
        DataCenter dataCenter = new DataCenter();
        int id = 1;
        dataCenter.setIdDataCenter(id);
        when(dataCenterRepo.save(dataCenter)).thenReturn(dataCenter);
        assertEquals("added", dataCenterService.addDataCenter(id));
    }
}
