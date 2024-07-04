package com.sofrecom.ressources.controller;

import com.sofrecom.ressources.entities.Availablity;
import com.sofrecom.ressources.entities.EnvCompute;
import com.sofrecom.ressources.entities.EnvControlNetwork;
import com.sofrecom.ressources.entities.EnvStorage;
import com.sofrecom.ressources.entities.NetworkElements;
import com.sofrecom.ressources.services.IDataCenterService;
import com.sofrecom.ressources.services.IEnvComputeService;
import com.sofrecom.ressources.services.IEnvControlNetwork;
import com.sofrecom.ressources.services.IEnvStorageService;
import com.sofrecom.ressources.services.INetworkElementsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "http://localhost:4200/")
public class Controller {

    //////////////////////////////////DataCenter///////////////////////////////////////////////

    private final IDataCenterService idatacenterservice;



    @PostMapping("/addDataCenter")
    public String addDataCenter(@RequestBody int id){
        return idatacenterservice.addDataCenter(id);
    }

    //////////////////////////////////NetworkElements///////////////////////////////////////////////

    private final INetworkElementsService inetworkelementsservice;

    @PostMapping("/addNetworkElements/{id}")
    public String addNetworkElements(@RequestBody NetworkElements e, @PathVariable int id) {
        return inetworkelementsservice.addNetworkElements(e,id);
    }
    @PutMapping("/updateNetworkElements/{id}")
    public String updateNetworkElements(@RequestBody NetworkElements e,@PathVariable int id){
        return inetworkelementsservice.updateNetworkElements(e,id);
    }
    @PutMapping("/updateDataCenterNetworkElements/{ide}/{iddc}")
    public String updateDataCenterNetworkElements(@PathVariable int ide,@PathVariable int iddc){
        return inetworkelementsservice.updateDataCenterNetworkElements(ide,iddc);
    }
    @DeleteMapping("/deleteNetworkElements/{id}")
    public String deleteNetworkElements(@PathVariable int id) {

        return  inetworkelementsservice.deleteNetworkElements(id);
    }
    @GetMapping("/getNetworkElementsById/{id}")
    public NetworkElements getNetworkElementsById(@PathVariable int id){

        return inetworkelementsservice.getNetworkElementsById(id);
    }
    @GetMapping("/getAllNetworkElements")
    public List<NetworkElements> getAllNetworkElements(){

        return inetworkelementsservice.getAllNetworkElements();
    }
    @GetMapping("/findByAvailablityElements/{type}/{id}")
    public List<NetworkElements> findByAvailablityElements(@PathVariable Availablity type, @PathVariable int id){
        return inetworkelementsservice.findByAvailablity(type,id);
    }

    //////////////////////////////////EnvCompute///////////////////////////////////////////////

    private final IEnvComputeService ienvcomputeservice;

    @PostMapping("/addEnvCompute/{id}")
    public String addEnvCompute(@RequestBody EnvCompute e, @PathVariable int id){
        return ienvcomputeservice.addEnvCompute(e,id);
    }
    @PutMapping("/updateEnvCompute/{id}")
    public String updateEnvCompute(@RequestBody EnvCompute e,@PathVariable int id){
        return ienvcomputeservice.updateEnvCompute(e,id);
    }

    @DeleteMapping("/deleteEnvCompute/{id}")
    public String deleteEnvCompute(@PathVariable int id) {

        return  ienvcomputeservice.deleteEnvCompute(id);
    }
    @GetMapping("/getEnvComputeById/{id}")
    public EnvCompute getEnvComputeById(@PathVariable int id){

        return ienvcomputeservice.getEnvComputeById(id);
    }
    @GetMapping("/getAllEnvCompute")
    public List<EnvCompute> getAllEnvCompute(){

        return ienvcomputeservice.getAllEnvCompute();
    }
    @GetMapping("/findByAvailablity/{type}/{id}")
    public List<EnvCompute> findByAvailablity(@PathVariable Availablity type, @PathVariable int id){
        return ienvcomputeservice.findByAvailablity(type,id);
    }
    //////////////////////////////////EnvStorage///////////////////////////////////////////////

    private final IEnvStorageService ienvstorageservice;

    @PostMapping("/addEnvStorage/{id}")
    public String addEnvStorage(@RequestBody EnvStorage e, @PathVariable int id){
        return ienvstorageservice.addEnvStorage(e,id);
    }
    @PutMapping("/updateEnvStorage/{id}")
    public String updateEnvStorage(@RequestBody EnvStorage e,@PathVariable int id){
        return ienvstorageservice.updateEnvStorage(e,id);
    }
    @PutMapping("/updateDataCenterEnvStorage/{ide}/{iddc}")
    public String updateDataCenterEnvStorage(@PathVariable int ide,@PathVariable int iddc){
        return ienvstorageservice.updateDataCenterEnvStorage(ide,iddc);
    }
    @DeleteMapping("/deleteEnvStorage/{id}")
    public String deleteEnvStorage(@PathVariable int id) {

        return  ienvstorageservice.deleteEnvStorage(id);
    }
    @GetMapping("/getEnvStorageById/{id}")
    public EnvStorage getEnvStorageById(@PathVariable int id){

        return ienvstorageservice.getEnvStorageById(id);
    }
    @GetMapping("/getAllEnvStorage")
    public List<EnvStorage> getAllEnvStorage(){

        return ienvstorageservice.getAllEnvStorage();
    }
    @GetMapping("/findByAvailablityStorage/{type}/{id}")
    public List<EnvStorage> findByAvailablityStorage(@PathVariable Availablity type, @PathVariable int id){
        return ienvstorageservice.findByAvailablityStorage(type,id);
    }
    //////////////////////////////////EnvControlNetwork///////////////////////////////////////////////

    private final IEnvControlNetwork ienvControlnetworkservice;

    @PostMapping("/addEnvControlNetwork/{id}")
    public String addEnvControlNetwork(@RequestBody EnvControlNetwork e, @PathVariable int id){
        return ienvControlnetworkservice.addEnvControlNetwork(e,id);
    }
    @PutMapping("/updateEnvControlNetwork/{id}")
    public String updateEnvControlNetwork(@RequestBody EnvControlNetwork e,@PathVariable int id){
        return ienvControlnetworkservice.updateEnvControlNetwork(e,id);
    }
    @PutMapping("/updateDataCenterEnvControlNetwork/{ide}/{iddc}")
    public String updateDataCenterEnvControlNetwork(@PathVariable int ide,@PathVariable int iddc){
        return ienvControlnetworkservice.updateDataCenterEnvControlNetwork(ide,iddc);
    }
    @DeleteMapping("/deleteEnvControlNetwork/{id}")
    public String deleteEnvControlNetwork(@PathVariable int id) {

        return  ienvControlnetworkservice.deleteEnvControlNetwork(id);
    }
    @GetMapping("/getEnvControlNetworkById/{id}")
    public EnvControlNetwork getEnvControlNetworkById(@PathVariable int id){

        return ienvControlnetworkservice.getEnvControlNetworkById(id);
    }
    @GetMapping("/getAllEnvControlNetwork")
    public List<EnvControlNetwork> getAllEnvControlNetwork(){

        return ienvControlnetworkservice.getAllEnvControlNetwork();
    }
    @GetMapping("/findByAvailablityControlNetwork/{type}/{id}")
    public List<EnvControlNetwork> findByAvailablityControlNetwork(@PathVariable Availablity type, @PathVariable int id){
        return ienvControlnetworkservice.findByAvailablityControlNetwork(type,id);
    }

}










