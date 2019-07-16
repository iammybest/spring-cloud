package com.iammybest.springcloud.db.mybatis.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author 邓清海
 * @Date 2017/11/9 14:05
 * Description:
 */
//@WebFilter(urlPatterns = "/*")
public class LogFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("LogFilter start");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(servletRequest.getParameter("id"));
        if ("1".equals(servletRequest.getParameter("id"))) {
            logger.info("TEST: 不允许访问 直接返回");
            servletResponse.getWriter().print("无访问权限");
            return;
        } else {
            logger.info("TEST: 不允许登录");
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
