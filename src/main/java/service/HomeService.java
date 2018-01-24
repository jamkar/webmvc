package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    private ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }

}
