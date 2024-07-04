package com.sofrecom.Gestion_des_ressources.Entities;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.Champ;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.NetworkElements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NetworkElementsTest {

    private NetworkElements networkElements;

    @BeforeEach
    void setup() {
        networkElements = new NetworkElements();
    }

    @Test
    void getIdElements() {
        int id = 1;
        networkElements.setIdElements(id);
        assertEquals(id, networkElements.getIdElements());
    }

    @Test
    void getName() {
        String name = "name";
        networkElements.setName(name);
        assertEquals(name, networkElements.getName());
    }

    @Test
    void getQty() {
        int qty = 3;
        networkElements.setQty(qty);
        assertEquals(qty, networkElements.getQty());
    }

    @Test
    void getPorts() {
        int ports = 3;
        networkElements.setPorts(ports);
        assertEquals(ports, networkElements.getPorts());
    }

    @Test
    void getUsed() {
        int used = 3;
        networkElements.setUsed(used);
        assertEquals(used, networkElements.getUsed());
    }

    @Test
    void getFree() {
        int free = 3;
        networkElements.setFree(free);
        assertEquals(free, networkElements.getFree());
    }

    @Test
    void getSpareQty() {
        int spareQty = 3;
        networkElements.setSpareQty(spareQty);
        assertEquals(spareQty, networkElements.getSpareQty());
    }

    @Test
    void getActDate() {
        Date actDate = new Date();
        networkElements.setActDate(actDate);
        assertEquals(actDate, networkElements.getActDate());
    }

    @Test
    void getChamp() {
        Champ champ = Champ.EXTENSION;
        networkElements.setChamp(champ);
        assertEquals(champ, networkElements.getChamp());
    }

    @Test
    void getAvailablity() {
        Availablity availablity = Availablity.AVAILABLE;
        networkElements.setAvailablity(availablity);
        assertEquals(availablity, networkElements.getAvailablity());
    }

    @Test
    void getDatacenter() {
        DataCenter dataCenter = new DataCenter();
        networkElements.setDatacenter(dataCenter);
        assertEquals(dataCenter, networkElements.getDatacenter());
    }
}
