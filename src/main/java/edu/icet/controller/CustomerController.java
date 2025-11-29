package edu.icet.controller;

import edu.icet.model.Dto.CustomerDto;
import edu.icet.model.Entiti.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService customerService;
  //  CustomerController(CustomerService customerService){
  //      this.customerService=customerService;
  //  } // Meka wenuwata field eka final karala lombok use karala @RequiredArgsConstructor anotation eka dammama mekama karaganna puluvan

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody CustomerDto customerDto){
        return customerService.addCustomer(customerDto);
    }

    @GetMapping("/searchCustomer/{id}")
    public CustomerDto searchCustomer(@PathVariable("id")String id){
        return customerService.searchCustomer(id);
    }

    @GetMapping("/getAllCustomer")
    public List<CustomerDto> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable String id){
        customerService.deleteCustomer(id);
    }

}
