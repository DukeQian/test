package org.duke.controller;

import org.duke.model.RiskControlRequest;
import org.duke.model.RiskControlResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("riskControl")
public class RiskControlController {

    @PostMapping("execute")
    public RiskControlResponse execute(@RequestBody RiskControlRequest request) {
        RiskControlResponse response = new RiskControlResponse();
        response.setSerialNo(request.getSerialNo());
        return response;
    }
}
