package uth.networkprogramming.group1.mailer.common.helper;

import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import uth.networkprogramming.group1.mailer.common.dto.BaseResponse;

import java.util.Collections;
import java.util.List;

@UtilityClass
public class ResponseHelper {

    public static ResponseEntity<BaseResponse> getResponse(Object obj, HttpStatus status) {
        return new ResponseEntity<>(
                BaseResponse
                        .builder()
                        .content(obj)
                        .hasError(false)
                        .errors(Collections.emptyList())
                        .timestamp(DateTimeUtil.now())
                        .status(status.value())
                        .build(),
                status
        );
    }

    public static ResponseEntity<BaseResponse> getErrorResponse(List<String> errors, HttpStatus status) {
        return new ResponseEntity<>(
                BaseResponse
                        .builder()
                        .content(null)
                        .hasError(true)
                        .errors(errors)
                        .timestamp(DateTimeUtil.now())
                        .status(status.value())
                        .build(),
                status);
    }
}
