package org.duke.model;

import lombok.Data;
import java.util.Map;
import java.util.Set;

@Data
public class IndicatorRequest {
    private Map<String, Object> inputParams;
    private Set<String> indicators;
    private Long businessId;
    private Long riskControlId;
}
