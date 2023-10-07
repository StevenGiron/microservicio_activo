package co.com.activo.responsable.config;

import co.com.activo.responsable.WebClientConsumerResponsable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConsumerConfig {

    @Bean
    public WebClientConsumerResponsable webClientConsumer(WebClient webClient) {
        return new WebClientConsumerResponsable(webClient);
    }

    @Bean
    public WebClient webClient(@Value("${webclient.base-url}") String url) {
        return WebClient.create(url);
    }

}
