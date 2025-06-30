package com.example.service_two.service_two.Service;

import com.example.service_two.service_two.clients.ServiceOneClient;
import com.example.service_two.service_two.dao.ServiceOneResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTwoService {
    @Autowired
    public ServiceTwoService(ServiceOneClient serviceOneClient) {
        this.serviceOneClient = serviceOneClient;
    }

    private ServiceOneClient serviceOneClient;
    public ServiceOneResponse fetchFirstName(){
        return this.serviceOneClient.getFirstName();
    }
}
