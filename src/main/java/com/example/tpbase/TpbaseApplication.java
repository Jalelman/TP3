package com.example.tpbase;

import com.example.tpbase.model.Employee;
import com.example.tpbase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TpbaseApplication {
    @Autowired
    EmployeeRepository employerepo;
    public static void main(String[] args) {
        SpringApplication.run(TpbaseApplication.class, args);
    }
    @GetMapping("/listemplyees")
    public List<Employee> getAllEmployee()
    {
        return (List<Employee>) employerepo.findAll();
    }
        @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee emp)
    {
        return employerepo.save(emp);
    }

}
