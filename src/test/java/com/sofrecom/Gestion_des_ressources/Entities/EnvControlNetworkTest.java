package com.sofrecom.Gestion_des_ressources.Entities;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.Champ;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.EnvControlNetwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnvControlNetworkTest {

    private EnvControlNetwork envControlNetwork;

    @BeforeEach
    void setup() {
        envControlNetwork = new EnvControlNetwork();
    }

    @Test
    void getIdControlNetwork() {
        int id = 1;
        envControlNetwork.setIdControlNetwork(id);
        assertEquals(id, envControlNetwork.getIdControlNetwork());
    }

    @Test
    void getClassOfControlNetwork() {
        String classOfControlNetwork = "class";
        envControlNetwork.setClassOfControlNetwork(classOfControlNetwork);
        assertEquals(classOfControlNetwork, envControlNetwork.getClassOfControlNetwork());
    }

    @Test
    void getQty() {
        int qty = 3;
        envControlNetwork.setQty(qty);
        assertEquals(qty, envControlNetwork.getQty());
    }

    @Test
    void getSpareQty() {
        int spareQty = 3;
        envControlNetwork.setSpareQty(spareQty);
        assertEquals(spareQty, envControlNetwork.getSpareQty());
    }

    @Test
    void getSfpspare() {
        int sfpspare = 3;
        envControlNetwork.setSfpspare(sfpspare);
        assertEquals(sfpspare, envControlNetwork.getSfpspare());
    }

    @Test
    void getSfps() {
        int sfps = 3;
        envControlNetwork.setSfps(sfps);
        assertEquals(sfps, envControlNetwork.getSfps());
    }

    @Test
    void getActDate() {
        Date actDate = new Date();
        envControlNetwork.setActDate(actDate);
        assertEquals(actDate, envControlNetwork.getActDate());
    }

    @Test
    void getChamp() {
        Champ champ = Champ.EXTENSION;
        envControlNetwork.setChamp(champ);
        assertEquals(champ, envControlNetwork.getChamp());
    }

    @Test
    void getAvailablity() {
        Availablity availablity = Availablity.AVAILABLE;
        envControlNetwork.setAvailablity(availablity);
        assertEquals(availablity, envControlNetwork.getAvailablity());
    }

    @Test
    void getDatacenter() {
        DataCenter dataCenter = new DataCenter();
        envControlNetwork.setDatacenter(dataCenter);
        assertEquals(dataCenter, envControlNetwork.getDatacenter());
    }
}
