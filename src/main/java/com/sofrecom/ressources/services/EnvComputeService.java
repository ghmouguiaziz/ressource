package com.sofrecom.ressources.services;


import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.EnvCompute;
import com.sofrecom.ressources.repositories.DataCenterRepo;
import com.sofrecom.ressources.repositories.EnvComputeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class EnvComputeService implements IEnvComputeService {

    private final EnvComputeRepo envcomputerepo;

    private final DataCenterRepo datacenterrepo;



    @Override
    public String addEnvCompute(EnvCompute e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        envcomputerepo.save(e);
        return "added";
    }
    @Override
    public String updateEnvCompute(EnvCompute dc ,int id) {

        EnvCompute dc1 = envcomputerepo.findById(id).get();
        dc1.setClassOfCompute(dc.getClassOfCompute());
        dc1.setName(dc.getName());
        dc1.setQty(dc.getQty());
        dc1.setSpareQty(dc.getSpareQty());
        dc1.setCpu(dc.getCpu());
        dc1.setAvailablity(dc.getAvailablity());
        dc1.setBcngvram(dc.getBcngvram());
        dc1.setBcngvcpu(dc.getBcngvcpu());
        dc1.setBcvcpu(dc.getBcvcpu());
        dc1.setBcvram(dc.getBcvram());
        dc1.setIcvcpu(dc.getIcvcpu());
        dc1.setIcvram(dc.getIcvram());
        dc1.setInvcpu(dc.getInvcpu());
        dc1.setInvram(dc.getInvram());
        dc1.setSfps(dc.getSfps());
        dc1.setVcpu(dc.getVcpu());
        dc1.setVram(dc.getVram());
        dc1.setActDate(dc.getActDate());
        dc1.setSfpspare(dc.getSfpspare());

        envcomputerepo.saveAndFlush(dc1);
        return "updated";
    }

    @Override
    public String deleteEnvCompute(int id) {

        envcomputerepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<EnvCompute> getAllEnvCompute() {

        return envcomputerepo.findAll();
    }
    @Override
    public EnvCompute getEnvComputeById(int id) {

        return envcomputerepo.findById(id).orElse(null);
    }

    public List<EnvCompute> findByAvailablity(Availablity t, int id){
        return envcomputerepo.findByAvailablityAndDatacenter_IdDataCenter(t , id);
    }


    }

