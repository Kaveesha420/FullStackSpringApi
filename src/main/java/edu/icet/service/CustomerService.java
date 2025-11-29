package edu.icet.service;

import edu.icet.model.Dto.CustomerDto;
import edu.icet.model.Entiti.Customer;
import edu.icet.repositry.CustomerRepositry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
   final CustomerRepositry customerRepositry;
    public String addCustomer(CustomerDto customerDto) {
        List<Customer> customers = customerRepositry.findAll();
        String genarateId = "C001";
        int genIntId=1;
        for (Customer customer:customers){
            if (customer.getId().equals(genarateId)){
                genIntId++;
                genarateId=String.format("C%03d",genIntId);
            }else{break;}
        }
        Customer customer =new Customer(
                genarateId,
                customerDto.getName(),
                customerDto.getAge(),
                customerDto.getAddress(),
                customerDto.getNic()
        );
        customerRepositry.save(customer);
        return "Customer added Successfully";
    }

//    public CustomerDto searchCustomer(String id) {
//        return null;
//    }
}
