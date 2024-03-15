package com.arminik.nm.admin.controllers;

import com.arminik.nm.admin.models.Response;
import com.arminik.nm.admin.service.DeployService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adm/v1")
@AllArgsConstructor
public class DeployController {

    private DeployService deployService;

    @GetMapping("/deploy")
    public Response startDeploy() {
        return deployService.doDeploy();
    }
}
