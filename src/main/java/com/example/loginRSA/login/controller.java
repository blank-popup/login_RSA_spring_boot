package com.example.loginRSA.login;

import lombok.extern.slf4j.Slf4j;
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
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody ModelUser modelUser) {
        log.trace("$$$$$ RestController trace login start");
        log.debug("$$$$$ RestController debug login start");
        log.info("$$$$$ RestController info login start");
        log.warn("$$$$$ RestController warn login start");
        log.error("$$$$$ RestController error login start");
        if (modelUser.getId() == 18) {
            log.info("$$$$$ RestController login success");
            modelUser.setName("Impossible");
        }
        else {
            log.info("$$$$$ RestController login fialure");
            modelUser.setName("ImnotUser");
        }
        return ResponseEntity.status(HttpStatus.OK).body(modelUser);
    }
}
