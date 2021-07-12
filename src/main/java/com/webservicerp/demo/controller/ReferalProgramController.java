package com.webservicerp.demo.controller;
import com.webservicerp.demo.model.dto.bcBalanceCorrectionDTO;
import com.webservicerp.demo.repo.DataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/rp")
public class ReferalProgramController {
    @Autowired
    private DataAccess dataAccess;

    public ReferalProgramController(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    @PostMapping("/BC_BALANCE_CORRECTION")
    public ResponseEntity<?> addTerminal(@RequestBody bcBalanceCorrectionDTO bcBalanceCorrectionParameters) {
        String response = dataAccess.testMethod(bcBalanceCorrectionParameters);
        return ResponseEntity.ok("Bonuses was added successfully, BPRRN is "+ response);
    }
}
