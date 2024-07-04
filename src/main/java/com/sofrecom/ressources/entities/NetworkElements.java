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
public class NetworkElements implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idElements;
    private String name ;
    private int qty ;
    private int ports;
    private int used;
    private int free;
    private int spareQty;
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
