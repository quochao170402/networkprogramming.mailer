package uth.networkprogramming.group1.mailer.common.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class BaseResponse {
    private Object content;
    private boolean hasError;
    private List<String> errors;
    private String timestamp;
    private int status;
}
