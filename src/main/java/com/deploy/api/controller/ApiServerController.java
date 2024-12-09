package com.deploy.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ApiServerController {
    @GetMapping("/")
    public String apiServerDeployTest() {
        return "api-server 를 정상적으로 EC2환경에서 배포 하였습니다.";
    }

    @GetMapping("/health")
    public String apiServerHealthCheck() {
        return "Success Heatlth Check";
    }
}
