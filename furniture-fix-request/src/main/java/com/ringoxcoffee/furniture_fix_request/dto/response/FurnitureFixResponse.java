package com.ringoxcoffee.furniture_fix_request.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FurnitureFixResponse {
    private String status;
    private String message;
}
