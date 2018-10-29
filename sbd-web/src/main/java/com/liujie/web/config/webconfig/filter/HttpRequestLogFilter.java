package com.liujie.web.config.webconfig.filter;


import org.slf4j.MDC;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.UUID;

@WebFilter(urlPatterns = "/*" ,filterName = "httpRequestLogFilter")
public class HttpRequestLogFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        try{
            MDC.put("uuid",uuid);
            chain.doFilter(request,response);
        }finally {
            MDC.remove("uuid");
        }
    }

    @Override
    public void destroy() {

    }
}
