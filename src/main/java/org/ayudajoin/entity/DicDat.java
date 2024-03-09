package org.ayudajoin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "dicdat")
@Getter
@Setter
public class DicDat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String planta;
    private String grupo;
    private String descripcionGrupo;
    private String fuente;
    private String descripcionTag;
}
