package config;

import model.Point;
import model.Trangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"service", "model"})
public class RootConfig {

    @Bean
    public ApplicationContextProvider provider() {
        return new ApplicationContextProvider();
    }

//    @Bean
//    public Trangle trangle() {
//        return new Trangle(pointA(), pointB(), pointC());
//    }

    @Bean
    public Point pointA() {
        return new Point(5, 6);
    }

    @Bean
    public Point pointB() {
        return new Point(7, 8);
    }

    @Bean
    public Point pointC() {
        return new Point(9, 10);
    }


}
