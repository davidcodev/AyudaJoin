package org.ayudajoin.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DatosJoin {
    private Long id;//de mqtt
    private Date serverTimestamp;// de mqtt
    private String planta;//de DicDat
    private String grupo;//de mqtt
    private String descripcionGrupo;//de DicDat
    private String source;//de mqtt
    private String descripcionTag;//de DicDat
    private String value;//de mqtt
}
