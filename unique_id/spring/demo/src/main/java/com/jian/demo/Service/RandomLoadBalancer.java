
package com.jian.demo.service;

import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
/**
 * RandomLoadBalancer is a load balancer that selects a server randomly from the list of available servers.
 */

 @Component
public class RandomLoadBalancer implements LoadBalancer {
    @Override
    public String select(List<String> servers) {
        if (servers == null || servers.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(servers.size());
        return servers.get(index);
    }
}