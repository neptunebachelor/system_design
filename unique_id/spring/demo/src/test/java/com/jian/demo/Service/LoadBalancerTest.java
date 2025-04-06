// This is a test class for LoadBalancer

package com.jian.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class LoadBalancerTest {

    @Autowired
    private LoadBalancer loadBalancer;

    @Test
    void testChoose() {
        // Mock the list of service instances
        List<String> instances = new ArrayList<>();
        instances.add("service1");
        instances.add("service2");
        instances.add("service3");

        Map<String, Integer> distributionMap = new HashMap<>();
        for (String instance : instances) {
            distributionMap.put(instance, 0);
        }

        // Simulate multiple calls to the load balancer
        for (int i = 0; i < 1000; i++) {
            String selectedInstance = loadBalancer.select(instances);
            distributionMap.put(selectedInstance, distributionMap.get(selectedInstance) + 1);
        }

        // verify the distribution of selected instances
        distributionMap.forEach((instance, count) -> {
            System.out.println(instance + ": " + count);
        });
    }
}