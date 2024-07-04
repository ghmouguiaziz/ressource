package com.sofrecom.ressources.services;


import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.entities.EnvControlNetwork;
import com.sofrecom.ressources.repositories.DataCenterRepo;
import com.sofrecom.ressources.repositories.EnvControlNetworkRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class EnvControlNetworkService implements IEnvControlNetwork{

    private final EnvControlNetworkRepo envcontrolnetworkrepo;

    private final DataCenterRepo datacenterrepo;

    @Override
    public String addEnvControlNetwork(EnvControlNetwork e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        envcontrolnetworkrepo.save(e);
        return "added";
    }
    @Override
    public String updateEnvControlNetwork(EnvControlNetwork dc ,int id) {

        EnvControlNetwork dc1 = envcontrolnetworkrepo.findById(id).get();
        dc1.setClassOfControlNetwork(dc.getClassOfControlNetwork());
        dc1.setQty(dc.getQty());
        dc1.setSpareQty(dc.getSpareQty());
        dc1.setSfps(dc.getSfps());
        dc1.setSfpspare(dc.getSfpspare());
        dc1.setAvailablity(dc.getAvailablity());
        dc1.setChamp(dc.getChamp());
        dc1.setActDate(dc.getActDate());
        envcontrolnetworkrepo.saveAndFlush(dc1);
        return "updated";
    }
    @Override
    public String updateDataCenterEnvControlNetwork(int ide ,int iddc){
        EnvControlNetwork e = envcontrolnetworkrepo.findById(ide).get();
        DataCenter dc= datacenterrepo.findById(iddc).get();
        e.setDatacenter(dc);
        envcontrolnetworkrepo.save(e);
        return "updated";
    }
    @Override
    public String deleteEnvControlNetwork(int id) {

        envcontrolnetworkrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<EnvControlNetwork> getAllEnvControlNetwork() {

        return envcontrolnetworkrepo.findAll();
    }
    @Override
    public EnvControlNetwork getEnvControlNetworkById(int id) {

        return envcontrolnetworkrepo.findById(id).orElse(null);
    }

    public List<EnvControlNetwork> findByAvailablityControlNetwork(Availablity t, int id){
        return envcontrolnetworkrepo.findByAvailablityAndDatacenter_IdDataCenter(t , id);
    }


}
