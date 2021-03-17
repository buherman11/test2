package com.budiartoherman.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/")
public class CustomerController {

  @Autowired 
  private CustomerRepository customerRepository;

  @PostMapping(path="/customers")
  public @ResponseBody String createCustomer(@RequestBody Customer newCustomer) {
    customerRepository.save(newCustomer);
    return "Saved.";
  }

  @GetMapping(path="/customers")
  public @ResponseBody Iterable<Customer> readCustomers() {
    return customerRepository.findAll();
  }

  @DeleteMapping(path="/customers/{id}")
  public void deleteCustomer(
    @PathVariable Long id) {
    customerRepository.deleteById(id);
  }
}
