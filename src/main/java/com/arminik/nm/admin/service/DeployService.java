package com.arminik.nm.admin.service;

import com.arminik.nm.admin.models.Response;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class DeployService {

    @Value("${scriptPath}")
    private String scriptPath;


    @SneakyThrows
    public Response doDeploy() {
        Process process = Runtime.getRuntime().exec(scriptPath);
        process.waitFor();
        String msg = null;
        boolean error = false;
        int exitValue = process.exitValue();
        if (exitValue == 0) {
            msg = "Script executed successfully";
        } else {
            error = true;
            msg = "Script failed";
        }
        return Response.builder()
                .message(msg)
                .error(error)
                .build();
    }
}
