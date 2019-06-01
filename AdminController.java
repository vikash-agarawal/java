package com.capgemini.bookStore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.bean.Books;
import com.capgemini.services.IAdminService;

@Controller
@RequestMapping(value = "/")
public class AdminController {
	@Autowired
	IAdminService adminService;
	
	
	@RequestMapping("/")
	public String home(ModelMap modelMap) {
		modelMap.addAttribute("map", "capstoreService.homepage()"); // need to remove quotes and content.
		return "/views/Admin/index";
	}
	
	@RequestMapping("/err")
	public String geterr() {
		return "/views/maintaince";
	}
	
	@RequestMapping("/add_NewBook")
	public String addNewBook()
	{
		return "addBookPage";
	}
	
	@RequestMapping("/save_NewBook")
	public String saveNewBook(@ModelAttribute("book") Books book)
	{
		adminService.addBook(book);
		return "addBookPage";
	}
	
	@RequestMapping("/delete_Book")
	public String deleteBook(@RequestParam("id") String bookId, ModelMap model)
	{
		adminService.deleteBookById(bookId);
		//List<Books> prod = adminService.findAllBooks();
		//model.addAttribute("abc", prod);
		return "deleteBookPage";
	}
	
	@RequestMapping("/edit_Book")
	public String editBook(@RequestParam("id") String bookId, ModelMap model)
	{
		return "editBookPage";
	}
	
	@RequestMapping("/getAllBook")
	public String getAllBook(ModelMap model)
	{
		List<Books> prod = adminService.findAllBooks();
		model.addAttribute("abc", prod);
		return "listBookPage";
	}
	
	
}
