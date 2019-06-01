package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bean.Category;

public interface IAdminCategoryDao extends JpaRepository<Category, String> {

}
