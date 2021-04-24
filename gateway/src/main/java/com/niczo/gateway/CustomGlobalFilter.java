package com.niczo.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


@Component
@Slf4j
public class CustomGlobalFilter implements GlobalFilter, Ordered {

    private static final String START_TIME = "START_TIME";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(START_TIME, System.currentTimeMillis());
        log.info("request url:{}", exchange.getRequest().getURI());
        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
            Long startTime = exchange.getAttribute(START_TIME);
            if (startTime != null) {
                log.info("request [{}] complete use {} ms", exchange.getRequest().getURI(), System.currentTimeMillis() - startTime);
            }
        }));
    }

    @Override
    public int getOrder() {
        return -10;
    }
}
