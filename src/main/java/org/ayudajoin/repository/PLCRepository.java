package org.ayudajoin.repository;

import org.ayudajoin.dto.DatosJoin;
import org.ayudajoin.entity.Mqttlogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PLCRepository extends JpaRepository<Mqttlogs, Long> {
    @Query("SELECT new org.ayudajoin.dto.DatosJoin(a.id, a.serverTimestamp, b.planta, a.grupo, b.descripcionGrupo, a.source, b.descripcionTag, a.value)" +
            "FROM Mqttlogs AS a " +
            "INNER JOIN DicDat AS b ON b.grupo = a.grupo AND b.fuente = a.source " +
            "WHERE b.planta = 'NATURAL' " +
            "AND b.descripcionGrupo = 'CALDERA'")
    List<DatosJoin> obtenerDatosJoin();
}
