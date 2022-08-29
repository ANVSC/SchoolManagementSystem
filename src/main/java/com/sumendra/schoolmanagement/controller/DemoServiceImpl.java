package com.sumendra.schoolmanagement.controller;

import com.sumendra.schoolmanagement.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    DemoRepo demoRepo;

    @Override
    public void saveCustomers() {
        List <Customer> customerList = new ArrayList<>();
        Customer c1 = new Customer(1,"Raju","kjsdfkjsdh");
        Customer c2 = new Customer(2,"Raju","kjsdfkjsdh");
        Customer c3 = new Customer(3,"Raju","kjsdfkjsdh");
        Customer c4 = new Customer(4,"Raju","kjsdfkjsdh");
        Customer c5 = new Customer(5,"Raju","kjsdfkjsdh");
        Customer c6 = new Customer(6,"Raju","kjsdfkjsdh");
        Customer c7 = new Customer(7,"Raju","kjsdfkjsdh");
        Customer c8 = new Customer(8,"Raju","kjsdfkjsdh");
        Customer c9 = new Customer(9,"Raju","kjsdfkjsdh");
        Customer c10 = new Customer(10,"Raju","kjsdfkjsdh");
        Customer c11 = new Customer(11,"Raju","kjsdfkjsdh");
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);
        customerList.add(c6);
        customerList.add(c7);
        customerList.add(c8);
        customerList.add(c9);
        customerList.add(c10);
        customerList.add(c11);

        List<Customer> subList = new ArrayList<>();
        int count =0;
        for(int i = 0; i<customerList.size();i++)
        {
            subList.add(customerList.get(i));
            count++;
            if(count == 3)
            {
                demoRepo.saveAll(subList);
                subList = new ArrayList<>();
                count = 0;
            }
        }
        if(subList.size()>0)
        {
            demoRepo.saveAll(subList);
        }
    }
}
