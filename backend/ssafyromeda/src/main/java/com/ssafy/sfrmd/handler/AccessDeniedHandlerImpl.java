package com.ssafy.sfrmd.handler;

import com.ssafy.sfrmd.common.ApiResponse;
import com.ssafy.sfrmd.common.ApiResponseType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        ApiResponse.error(response, ApiResponseType.UNAUTHORIZED_RESPONSE, "접근 거부");
    }
}