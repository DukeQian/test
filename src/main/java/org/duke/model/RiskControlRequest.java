package org.duke.model;

import lombok.Data;
import java.util.Map;

@Data
public class RiskControlRequest {
    private Long businessId;
    private String serialNo;
    private String userId;
    private String eventCode;
    private Map<String, Object> params;
}
