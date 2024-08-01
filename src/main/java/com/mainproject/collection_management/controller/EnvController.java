package com.mainproject.collection_management.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

    @Value("${MYSQLHOST}")
    private String mysqlHost;

    @Value("${MYSQLPORT}")
    private String mysqlPort;

    @Value("${MYSQLDATABASE}")
    private String mysqlDatabase;

    @Value("${MYSQLUSER}")
    private String mysqlUser;

    @Value("${MYSQLPASSWORD}")
    private String mysqlPassword;

    @GetMapping("/env")
    public String getEnv() {
        return String.format("MYSQLHOST: %s, MYSQLPORT: %s, MYSQLDATABASE: %s, MYSQLUSER: %s, MYSQLPASSWORD: %s",
                mysqlHost, mysqlPort, mysqlDatabase, mysqlUser, mysqlPassword);
    }
}
