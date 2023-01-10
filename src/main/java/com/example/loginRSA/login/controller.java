package com.example.loginRSA.login;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class controller {
    @Value("${str.common}")
    private String strCommon;
    @Value("${str.individual}")
    private String strIndivudual;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody ModelUser modelUser) {
        log.trace("$$$$$ RestController trace login start {} {}", strCommon, strIndivudual);
        log.debug("$$$$$ RestController debug login start {} {}", strCommon, strIndivudual);
        log.info("$$$$$ RestController info login start {} {}", strCommon, strIndivudual);
        log.warn("$$$$$ RestController warn login start {} {}", strCommon, strIndivudual);
        log.error("$$$$$ RestController error login start {} {}", strCommon, strIndivudual);
        if (modelUser.getId() == 18) {
            log.info("$$$$$ RestController login success");
            modelUser.setName("ImPossible");
        }
        else {
            log.warn("$$$$$ RestController login fialure");
            modelUser.setName("ImnotUser");
        }
        return ResponseEntity.status(HttpStatus.OK).body(modelUser);
    }
}
