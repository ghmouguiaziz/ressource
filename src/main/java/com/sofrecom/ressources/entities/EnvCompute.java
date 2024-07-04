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
public class EnvCompute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompute;
    private String classOfCompute ;
    private String name ;
    private int qty ;
    private int spareQty;
    private int vcpu;
    private int cpu;
    private int vram;
    private int bcvcpu;
    private int bcvram;
    private int bcngvcpu;
    private int bcngvram;
    private int icvcpu;
    private int icvram;
    private int invcpu;
    private int invram;
    private int sfps;
    private int sfpspare;
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
