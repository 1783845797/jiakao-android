package com.hqhcn.android.web;

import com.hqh.android.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    /**
     * <code>外部</code>访问的IP,不是路由的IP
     */
    public String externalIP;

    private static final long serialVersionUID = -7782390905683067564L;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public LogService logService;

    @ModelAttribute
    protected void setReqAndRes(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        this.request = request;
        this.response = response;
        this.response.setContentType("text/html;charset=UTF-8");
        this.session = session;
        externalIP = request.getHeader("x-forwarded-for");
    }

}