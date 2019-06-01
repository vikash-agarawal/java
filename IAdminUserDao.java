package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bean.Admin;

public interface IAdminUserDao extends JpaRepository<Admin, String> {

}
