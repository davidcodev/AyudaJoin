package org.ayudajoin.service.impl;

import lombok.RequiredArgsConstructor;
import org.ayudajoin.dto.DatosJoin;
import org.ayudajoin.repository.PLCRepository;
import org.ayudajoin.service.PLCService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PLCServiceImpl implements PLCService {

    private final PLCRepository plcRepository;
    @Override
    public List<DatosJoin> obtenerDatosJoin() {
        var listObject = plcRepository.obtenerDatosJoin();
//        List<DatosJoin> datosJoinList = new ArrayList<>();
//        Lo siguiente se puede mejorar con un mapper (mapstruct):
//        for (Object[] resultado : listObject) {
//            DatosJoin datosJoin = DatosJoin.builder()
//                    .id((Long) resultado[0])
//                    .serverTimestamp((Date) resultado[1])
//                    .planta((String) resultado[2])
//                    .grupo((String) resultado[3])
//                    .descripcionGrupo((String) resultado[4])
//                    .source((String) resultado[5])
//                    .descripcionTag((String) resultado[6])
//                    .value((String) resultado[7])
//                    .build();
//            datosJoinList.add(datosJoin);
//        }
        return listObject;
    }
}
