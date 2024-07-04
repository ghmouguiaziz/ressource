package com.sofrecom.Gestion_des_ressources.Entities;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.Champ;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.EnvCompute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnvComputeTest {

    private EnvCompute envCompute;

    @BeforeEach
    void setup() {
        envCompute = new EnvCompute();
    }

    @Test
    void getIdCompute() {
        int id = 1;
        envCompute.setIdCompute(id);
        assertEquals(id, envCompute.getIdCompute());
    }

    @Test
    void getClassOfCompute() {
        String classOfCompute = "class";
        envCompute.setClassOfCompute(classOfCompute);
        assertEquals(classOfCompute, envCompute.getClassOfCompute());
    }

    @Test
    void getName() {
        String name = "name";
        envCompute.setName(name);
        assertEquals(name, envCompute.getName());
    }

    @Test
    void getQty() {
        int qty = 3;
        envCompute.setQty(qty);
        assertEquals(qty, envCompute.getQty());
    }

    @Test
    void getSpareQty() {
        int qty = 3;
        envCompute.setSpareQty(qty);
        assertEquals(qty, envCompute.getSpareQty());
    }

    @Test
    void getVcpu() {
        int vcpu = 3;
        envCompute.setVcpu(vcpu);
        assertEquals(vcpu, envCompute.getVcpu());
    }

    @Test
    void getCpu() {
        int cpu = 3;
        envCompute.setCpu(cpu);
        assertEquals(cpu, envCompute.getCpu());
    }

    @Test
    void getVram() {
        int vram = 3;
        envCompute.setVram(vram);
        assertEquals(vram, envCompute.getVram());
    }

    @Test
    void getBcvcpu() {
        int bcvcpu = 3;
        envCompute.setBcvcpu(bcvcpu);
        assertEquals(bcvcpu, envCompute.getBcvcpu());
    }

    @Test
    void getBcvram() {
        int bcvram = 3;
        envCompute.setBcvram(bcvram);
        assertEquals(bcvram, envCompute.getBcvram());
    }

    @Test
    void getBcngvcpu() {
        int bcngvcpu = 3;
        envCompute.setBcngvcpu(bcngvcpu);
        assertEquals(bcngvcpu, envCompute.getBcngvcpu());
    }

    @Test
    void getBcngvram() {
        int bcngvram = 3;
        envCompute.setBcngvram(bcngvram);
        assertEquals(bcngvram, envCompute.getBcngvram());
    }

    @Test
    void getIcvcpu() {
        int icvcpu = 3;
        envCompute.setIcvcpu(icvcpu);
        assertEquals(icvcpu, envCompute.getIcvcpu());
    }

    @Test
    void getIcvram() {
        int icvram = 3;
        envCompute.setIcvram(icvram);
        assertEquals(icvram, envCompute.getIcvram());
    }

    @Test
    void getInvcpu() {
        int invcpu = 3;
        envCompute.setInvcpu(invcpu);
        assertEquals(invcpu, envCompute.getInvcpu());
    }

    @Test
    void getInvram() {
        int invram = 3;
        envCompute.setInvram(invram);
        assertEquals(invram, envCompute.getInvram());
    }

    @Test
    void getSfps() {
        int sfps = 3;
        envCompute.setSfps(sfps);
        assertEquals(sfps, envCompute.getSfps());
    }

    @Test
    void getSfpspare() {
        int sfpspare = 3;
        envCompute.setSfpspare(sfpspare);
        assertEquals(sfpspare, envCompute.getSfpspare());
    }

    @Test
    void getActDate() {
        Date actDate = new Date();
        envCompute.setActDate(actDate);
        assertEquals(actDate, envCompute.getActDate());
    }

    @Test
    void getChamp() {
        Champ champ = Champ.EXTENSION;
        envCompute.setChamp(champ);
        assertEquals(champ, envCompute.getChamp());
    }

    @Test
    void getAvailablity() {
        Availablity availablity = Availablity.AVAILABLE;
        envCompute.setAvailablity(availablity);
        assertEquals(availablity, envCompute.getAvailablity());
    }

    @Test
    void getDatacenter() {
        DataCenter dataCenter = new DataCenter();
        envCompute.setDatacenter(dataCenter);
        assertEquals(dataCenter, envCompute.getDatacenter());
    }
}
