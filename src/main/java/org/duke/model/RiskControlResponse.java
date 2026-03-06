package org.duke.model;

import lombok.Data;
import java.util.List;

@Data
public class RiskControlResponse {
    private String serialNo;
    private List<String> hitRules;
    private List<String> ruleCodes;
    private String reason;
    private Boolean isEmpty;
}
