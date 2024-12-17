//package com.mszq.prometheus.config;
//
//import io.micrometer.core.instrument.MeterRegistry;
//import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MetricsConfig {
//
//    @Bean
//    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
//        String podName = System.getenv("POD_NAME");
//        String podIp = System.getenv("POD_IP");
//        String namespace = System.getenv("POD_NAMESPACE");
//
//        if (podName == null || podIp == null || namespace == null) {
//            System.err.println("Warning: Some environment variables are not set!");
//        }
//
//        return registry -> registry.config().commonTags(
//                "pod_name", podName != null ? podName : "unknown_pod",
//                "pod_ip", podIp != null ? podIp : "unknown_ip",
//                "namespace", namespace != null ? namespace : "unknown_namespace",
//                "deployment", "my-deployment"
//        );
//    }
//}
