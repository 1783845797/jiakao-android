package com.hqhcn.android.tool.swagger.config;

import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ResponseMessage;

import java.util.Arrays;
import java.util.List;


public class SwaggerResponseMessage {

    public static ResponseMessage buildResponseMessage(int code, String message) {
        return new ResponseMessageBuilder()
                .code(code)
                .message(message)
                .build();
    }

    /**
     * @return A list of all Swagger Response Messages
     */
    public static List<ResponseMessage> buildResponseMessages() {
        return Arrays.asList(
                buildResponseMessage(500, "SCI internal server error"));
    }
}
