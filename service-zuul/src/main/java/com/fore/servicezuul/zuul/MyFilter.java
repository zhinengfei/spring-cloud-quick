package com.fore.servicezuul.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: MyFilter
 * @Description: TODO
 * @Author: xu
 * @Date: 2019/2/15 16:27
 * @Version: 1.0
 **/
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s>>>%s",request.getMethod(),request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if (accessToken ==null){
            log.warn("token is empty");
            ctx.setResponseStatusCode(401);
            ctx.setSendZuulResponse(false);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){
                return null;
            }
        }
        log.info("ok");
        return null;
    }
}
