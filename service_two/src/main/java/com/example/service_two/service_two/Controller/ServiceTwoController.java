package com.example.service_two.service_two.Controller;

import com.example.service_two.service_two.Service.ServiceTwoService;
import com.example.service_two.service_two.dao.ResponseDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class ServiceTwoController {
    private ServiceTwoService serviceTwoService;
    @Autowired
    public ServiceTwoController(ServiceTwoService serviceTwoService) {
        this.serviceTwoService = serviceTwoService;
    }

    @GetMapping("/last_name")
    public ResponseEntity<ResponseDao> getLastName() {
        String firstName=this.serviceTwoService.fetchFirstName().getFirstName();
        log.info("The first name is{}",firstName);
        return ResponseEntity.ok(new ResponseDao("Mohapatra"));
    }
}
