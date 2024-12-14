package com.ringoxcoffee.database_access.service;

import com.ringoxcoffee.database_access.dto.request.InquirySampleCaseRequest;
import com.ringoxcoffee.database_access.dto.response.InquirySampleCaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InquirySampleCaseService {

    public InquirySampleCaseResponse process(InquirySampleCaseRequest inquirySampleCaseRequest, String requestId) {

        return InquirySampleCaseResponse.builder()
                .responseCode("QWER")
                .responseMessage("test messages")
                .build();
    }
}
