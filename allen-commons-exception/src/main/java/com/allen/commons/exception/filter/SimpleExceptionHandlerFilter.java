package com.allen.commons.exception.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleExceptionHandlerFilter implements Filter {

	private final static Logger logger = LoggerFactory.getLogger(SimpleExceptionHandlerFilter.class);
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("start execute SimpleExceptionHandlerFilter.init --------------");
		
		logger.info("end execute SimpleExceptionHandlerFilter.init -----------------");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.info("start execute SimpleExceptionHanlerFilter.doFilter  -----------");

		logger.info("end execute SimpleExceptionHanlerFilter.doFilter --------------");
	}

	@Override
	public void destroy() {
		logger.info("start execute SimpleExceptionHanlderFilter.distory -------------");
		
		logger.info("end execute SimipleExceptionHanlderFilter.distory -------------- ");
	}

}
