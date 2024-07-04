package com.sofrecom.Gestion_des_ressources.Entities;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.Champ;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.EnvStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnvStorageTest {

    private EnvStorage envStorage;

    @BeforeEach
    void setup() {
        envStorage = new EnvStorage();
    }

    @Test
    void getIdStorage() {
        int id = 1;
        envStorage.setIdStorage(id);
        assertEquals(id, envStorage.getIdStorage());
    }

    @Test
    void getClassOfStorage() {
        String classOfStorage = "class";
        envStorage.setClassOfStorage(classOfStorage);
        assertEquals(classOfStorage, envStorage.getClassOfStorage());
    }

    @Test
    void getRnge() {
        int rnge = 3;
        envStorage.setRnge(rnge);
        assertEquals(rnge, envStorage.getRnge());
    }

    @Test
    void getQty() {
        int qty = 3;
        envStorage.setQty(qty);
        assertEquals(qty, envStorage.getQty());
    }

    @Test
    void getSpareQty() {
        int spareQty = 3;
        envStorage.setSpareQty(spareQty);
        assertEquals(spareQty, envStorage.getSpareQty());
    }

    @Test
    void getSfpspare() {
        int sfpspare = 3;
        envStorage.setSfpspare(sfpspare);
        assertEquals(sfpspare, envStorage.getSfpspare());
    }

    @Test
    void getSfps() {
        int sfps = 3;
        envStorage.setSfps(sfps);
        assertEquals(sfps, envStorage.getSfps());
    }

    @Test
    void getGrossVolume() {
        int grossVolume = 3;
        envStorage.setGrossVolume(grossVolume);
        assertEquals(grossVolume, envStorage.getGrossVolume());
    }

    @Test
    void getNetVolume() {
        int netVolume = 3;
        envStorage.setNetVolume(netVolume);
        assertEquals(netVolume, envStorage.getNetVolume());
    }

    @Test
    void getPerfGrossVolume() {
        int perfGrossVolume = 3;
        envStorage.setPerfGrossVolume(perfGrossVolume);
        assertEquals(perfGrossVolume, envStorage.getPerfGrossVolume());
    }

    @Test
    void getCapaNetVolume() {
        int capaNetVolume = 3;
        envStorage.setCapaNetVolume(capaNetVolume);
        assertEquals(capaNetVolume, envStorage.getCapaNetVolume());
    }

    @Test
    void getPerfNetVolume() {
        int perfNetVolume = 3;
        envStorage.setPerfNetVolume(perfNetVolume);
        assertEquals(perfNetVolume, envStorage.getPerfNetVolume());
    }

    @Test
    void getCapaGrossVolume() {
        int capaGrossVolume = 3;
        envStorage.setCapaGrossVolume(capaGrossVolume);
        assertEquals(capaGrossVolume, envStorage.getCapaGrossVolume());
    }

    @Test
    void getActDate() {
        Date actDate = new Date();
        envStorage.setActDate(actDate);
        assertEquals(actDate, envStorage.getActDate());
    }

    @Test
    void getChamp() {
        Champ champ = Champ.EXTENSION;
        envStorage.setChamp(champ);
        assertEquals(champ, envStorage.getChamp());
    }

    @Test
    void getAvailablity() {
        Availablity availablity = Availablity.AVAILABLE;
        envStorage.setAvailablity(availablity);
        assertEquals(availablity, envStorage.getAvailablity());
    }

    @Test
    void getDatacenter() {
        DataCenter dataCenter = new DataCenter();
        envStorage.setDatacenter(dataCenter);
        assertEquals(dataCenter, envStorage.getDatacenter());
    }
}
