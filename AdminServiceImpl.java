package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.bean.Admin;
import com.capgemini.bean.Books;
import com.capgemini.bean.Category;
import com.capgemini.bean.Customer;
import com.capgemini.dao.IAdminBookDao;
import com.capgemini.dao.IAdminCategoryDao;
import com.capgemini.dao.IAdminCustomerDao;
import com.capgemini.dao.IAdminUserDao;

public class AdminServiceImpl implements IAdminService {

	@Autowired
	IAdminBookDao adminDao;
	
	@Autowired
	IAdminCustomerDao adminCustomerDao;
	
	@Autowired
	IAdminUserDao adminUserDao;
	
	@Autowired
	IAdminCategoryDao adminCategoryDao;
	
	@Override
	public List<Books> findAllBooks() {
		List<Books> allBooks=adminDao.findAll();
		return allBooks;
	}

	@Override
	public Books deleteBookById(String bookId) {
		Books book=AdminServiceImpl.this.getBookById(bookId);
		adminDao.deleteById(bookId);
		return book;
	}

	@Override
	public Books addBook(Books book) {
		adminDao.save(book);
		return book;
	}

	@Override
	public Books editBook(Books book) {
		adminDao.saveAndFlush(book);
		return book;
	}
	
	public Books getBookById(String bookId)
	{
		Books book=adminDao.getOne(bookId);
		return book;
	}


	@Override
	public List<Customer> findAllcustomers() {
		List<Customer> allCustomers=adminCustomerDao.findAll();
		return allCustomers;
	}

	@Override
	public Customer deleteCustomerById(String customerId) {
		Customer customer=AdminServiceImpl.this.getCustomerById(customerId);
		adminCustomerDao.deleteById(customerId);
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		adminCustomerDao.save(customer);
		return customer;
	}

	@Override
	public Customer editCustomer(Customer customer) {
		adminCustomerDao.saveAndFlush(customer);
		return customer;
	}
	
	public Customer getCustomerById(String customerId)
	{
		Customer customer=adminCustomerDao.getOne(customerId);
		return customer;
	}


	@Override
	public List<Admin> findAllUsers() {
		List<Admin> allUsers=adminUserDao.findAll();
		return allUsers;
	}

	@Override
	public Admin deleteUserById(String adminId) {
		Admin user=AdminServiceImpl.this.getUserById(adminId);
		adminUserDao.deleteById(adminId);
		return user;
	}

	@Override
	public Admin addUser(Admin user) {
		adminUserDao.save(user);
		return user;
	}

	@Override
	public Admin editUser(Admin user) {
		adminUserDao.saveAndFlush(user);
		return user;
	}
	
	public Admin getUserById(String adminId)
	{
		Admin user=adminUserDao.getOne(adminId);
		return user;
	}

	@Override
	public List<Category> findAllCategories() {
		List<Category> allCategories=adminCategoryDao.findAll();
		return allCategories;
	}

	@Override
	public Category deleteCategoryById(String categoryId) {
		Category category=AdminServiceImpl.this.getCategoryById(categoryId);
		adminCategoryDao.deleteById(categoryId);
		return category;
	}

	@Override
	public Category addCategory(Category category) {
		adminCategoryDao.save(category);
		return category;
	}

	@Override
	public Category editCategory(Category category) {
		adminCategoryDao.saveAndFlush(category);
		return category;
	}
	
	public Category getCategoryById(String categoryId)
	{
		Category category=adminCategoryDao.getOne(categoryId);
		return category;
	}
}
