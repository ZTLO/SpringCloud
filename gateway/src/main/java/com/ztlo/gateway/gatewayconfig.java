package com.ztlo.gateway;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

//@Configurable
//public class gatewayconfig {
//
//    @Bean
//    public RouteLocator userRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
//        RouteLocatorBuilder.Builder route = routeLocatorBuilder.routes();
//        route.route("path_routh_ztlo",
//                r ->r.path("/guonei")
//                        .uri("http://news.baidu.com/guonei")).build();
//        return route.build();
//    }
//
//
//    @Bean
//    public  RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
//        RouteLocatorBuilder.Builder routes =routeLocatorBuilder.routes();
//        routes.route("guoji",r ->r.path("guoji").uri("www.baidu.com")).build();
//        return  routes.build();
//    }
//}
