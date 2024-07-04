package com.sofrecom.ressources.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class DataCenter implements Serializable {
    @Id
    private  int idDataCenter;




    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<EnvCompute> envcomputes;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<EnvStorage> envstorages;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<EnvControlNetwork> envcontrolnetworks;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<NetworkElements> networkelements;



}
