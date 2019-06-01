package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bean.Customer;

public interface IAdminCustomerDao  extends JpaRepository<Customer, String>{

}
