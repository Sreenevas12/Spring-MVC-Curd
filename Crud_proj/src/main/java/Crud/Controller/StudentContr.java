package Crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Crud.dao.StudentDao;
import Crud.dto.Student;

@Controller
public class StudentContr {
	@Autowired
	StudentDao dao;
	
	@GetMapping("/")
	public String home(){
		return "Home.jsp";	
	}
	
	@GetMapping("/Add-Student")	
	public String addstudent(){
		return "Add-Student.jsp";
	}
	
	@PostMapping("/Add-Stud")
	public String addStudent(@ModelAttribute Student student,ModelMap map){
		dao.save(student);
		map.put("Success","Record Added Sucessfully..!");
		return "Home.jsp";
	}
	
	@RequestMapping("/fetch-Student")
	public String fetchdata(ModelMap map){ 
		map.put("students",dao.fetchAll());
		return "fetch.jsp";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam int id, ModelMap map) {
		dao.delete(id);
		map.put("success","Data Deleted Success");
		return "fetch-Student";
	}

	@GetMapping("/edit")
	public String edit(@RequestParam int id, ModelMap map) {
		map.put("student", dao.find(id));
		return "edit.jsp";
	}
	
	@PostMapping("/update-student")
	public String updateStudent(@ModelAttribute Student student, ModelMap map) {
		dao.update(student);
		map.put("success", "Data Updated Success");
		return "fetch-Student";
	}
}
