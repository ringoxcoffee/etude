package com.ringoxcoffee.database_access.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InquirySampleCaseResponse {
    private String responseCode;
    private String responseMessage;
}
