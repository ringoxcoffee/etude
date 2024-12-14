package com.ringoxcoffee.database_access.controller;

import com.ringoxcoffee.database_access.dto.request.InquirySampleCaseRequest;
import com.ringoxcoffee.database_access.dto.response.InquirySampleCaseResponse;
import com.ringoxcoffee.database_access.service.InquirySampleCaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/sample")
public class SampleController extends BaseController {

    private final InquirySampleCaseService inquirySampleCaseService;

    public SampleController(InquirySampleCaseService inquirySampleCaseService) {
        this.inquirySampleCaseService = inquirySampleCaseService;
    }

    @PostMapping("/case")
    public ResponseEntity<?> inquiryCase(@RequestHeader("request_id") String requestId,
                                         @RequestBody InquirySampleCaseRequest inquirySampleCaseRequest) {

        InquirySampleCaseResponse result = inquirySampleCaseService.process(inquirySampleCaseRequest, requestId);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
