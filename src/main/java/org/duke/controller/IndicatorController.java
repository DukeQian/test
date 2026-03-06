package org.duke.controller;

import org.duke.model.RiskControlRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("indicator")
public class IndicatorController {

    @PostMapping("getIndicatorData")
    public Map<String, String> getIndicatorData(@RequestBody RiskControlRequest request) {
        Map<String, String> result = new HashMap<>();
        if (request.getIndicators() != null) {
            for (String indicator : request.getIndicators()) {
                result.put(indicator, "");
            }
        }
        return result;
    }
}
