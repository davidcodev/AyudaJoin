package org.ayudajoin.service.impl;

import lombok.RequiredArgsConstructor;
import org.ayudajoin.dto.DatosJoin;
import org.ayudajoin.repository.PLCRepository;
import org.ayudajoin.service.PLCService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PLCServiceImpl implements PLCService {

    private final PLCRepository plcRepository;
    @Override
    public List<DatosJoin> obtenerDatosJoin() {
        var a = plcRepository.obtenerDatosJoin();
        //a tiene la info
        return null;
    }
}
