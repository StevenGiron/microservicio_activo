package co.com.activo.responsable.config;

import co.com.activo.responsable.ResponsableMapper;
import co.com.activo.responsable.ResponsableMapperImpl;
import co.com.activo.responsable.WebClientConsumerResponsable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConsumerConfig {


    @Bean
    public WebClientConsumerResponsable webClientConsumer(WebClient webClient, ResponsableMapper responsableMapper) {
        return new WebClientConsumerResponsable(webClient, responsableMapper);
    }

    @Bean
    public WebClient webClient(@Value("${webclient.base-url}") String url) {
        return WebClient.create(url);
    }

    @Bean
    public ResponsableMapper responsableMapper() {
        return new ResponsableMapperImpl(); // Cambia "ResponsableMapperImpl" según el nombre generado por MapStruct
    }
}
