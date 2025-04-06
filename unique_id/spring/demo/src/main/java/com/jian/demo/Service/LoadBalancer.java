

package com.jian.demo.service;
import java.util.List;

public interface LoadBalancer {
    String select(List<String> servers);
}