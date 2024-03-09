package org.ayudajoin.controller;

import lombok.RequiredArgsConstructor;
import org.ayudajoin.dto.DatosJoin;
import org.ayudajoin.service.PLCService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PLCController {

    private final PLCService plcService;

    @GetMapping("/datos-join")
    public List<DatosJoin> obtenerDatodJoin() {
        return plcService.obtenerDatosJoin();
    }
}
