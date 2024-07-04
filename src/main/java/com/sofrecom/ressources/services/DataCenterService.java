package com.sofrecom.ressources.services;



import com.sofrecom.ressources.entities.DataCenter;
import com.sofrecom.ressources.repositories.DataCenterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DataCenterService implements IDataCenterService{

    private final DataCenterRepo datacenterrepo;




    @Override
    public String addDataCenter(int id) {
        DataCenter dc = new DataCenter();
        dc.setIdDataCenter(id);
        datacenterrepo.save(dc);
        return "added";
    }




}
