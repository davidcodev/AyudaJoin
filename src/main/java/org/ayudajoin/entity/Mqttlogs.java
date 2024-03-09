package org.ayudajoin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "mqttlogs")
@Getter
@Setter
public class Mqttlogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String terminalDate;
    private String grupo;
    private String source;
    private String value;
    private Date serverTimestamp;
}
