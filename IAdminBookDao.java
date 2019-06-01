package com.capgemini.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.capgemini.bean.Books;

public interface IAdminBookDao extends JpaRepository<Books, String> {

}
