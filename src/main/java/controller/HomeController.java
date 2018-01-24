package controller;

import config.ApplicationContextProvider;
import model.Trangle;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.HomeService;

import javax.servlet.ServletContext;

@Controller
public class HomeController implements ApplicationContextAware {

    @Autowired
    private Trangle trangle;

    @Autowired
    ApplicationContext context;

    @Autowired
    ServletContext servletContext;

    @Autowired
    HomeService homeService;

    ApplicationContext cont;


    @RequestMapping(value = "/context", method = RequestMethod.GET)
    public String printContext() {

        System.out.println("Servlet Context: " + servletContext.getInitParameter("contextClass"));

        System.out.println("Triangle: " + trangle.getPointA());

        System.out.println("Application Context from aware: " +
                cont);

        System.out.println("Application Context from provider: " +
                ApplicationContextProvider.getContext());

        System.out.println("Application Context from controller: " +
                /*ApplicationContextProvider.getContext()*/
                context);

        System.out.println("Application Context from service: " +
                homeService.getContext());

        return "/WEB-INF/index.jsp";

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.cont = applicationContext;
    }
}
