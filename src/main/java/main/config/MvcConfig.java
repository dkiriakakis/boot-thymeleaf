package main.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Clemens Tirsch on 13.09.2016.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter
         {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Resources controlled by Spring Security, which
        // adds "Cache-Control: must-revalidate".
        registry.addResourceHandler("/images/**")
                .addResourceLocations("classpath:/static/images/")
                .setCachePeriod(3600*24);

        registry.addResourceHandler("/bower_components/**")
                .addResourceLocations("classpath:/static/bower_components/")
                .setCachePeriod(3600*24);

        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/static/css/")
                .setCachePeriod(3600*24);

        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/static/js/")
                .setCachePeriod(3600*24);

        registry.addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:/static/fonts/")
                .setCachePeriod(3600*24);

        registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/")
                .setCachePeriod(3600*24);
    }
}
