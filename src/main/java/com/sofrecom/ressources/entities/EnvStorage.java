package com.sofrecom.ressources.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class EnvStorage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStorage;
    private String classOfStorage ;
    private int rnge;
    private int qty ;
    private int spareQty;
    private int sfpspare ;
    private int sfps ;
    private int grossVolume ;
    private int netVolume ;
    private int perfGrossVolume ;
    private int capaNetVolume ;
    private int perfNetVolume ;
    private int capaGrossVolume ;
    @Temporal(TemporalType.DATE)
    private Date actDate;

    @Enumerated(EnumType.STRING)
    private Champ champ ;

    @Enumerated(EnumType.STRING)
    private Availablity availablity ;

    @JsonIgnore
    @ManyToOne
    private  DataCenter datacenter;

}
