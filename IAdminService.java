package com.capgemini.services;

import java.util.List;

import com.capgemini.bean.Admin;
import com.capgemini.bean.Books;
import com.capgemini.bean.Category;
import com.capgemini.bean.Customer;

public interface IAdminService {
	public List<Books> findAllBooks();
	public Books deleteBookById(String bookId);
	public Books addBook(Books book);
	public Books editBook(Books book);
	public Books getBookById(String bookId);
	
	public List<Customer> findAllcustomers();
	public Customer deleteCustomerById(String customerId);
	public Customer addCustomer(Customer customer);
	public Customer editCustomer(Customer customer);
	public Customer getCustomerById(String customerId);
	
	public List<Admin> findAllUsers();
	public Admin deleteUserById(String adminId);
	public Admin addUser(Admin user);
	public Admin editUser(Admin user);
	public Admin getUserById(String adminId);
	
	public List<Category> findAllCategories();
	public Category deleteCategoryById(String categoryId);
	public Category addCategory(Category category);
	public Category editCategory(Category category);
	public Category getCategoryById(String categoryId);
}
