package lopputyo.student;


import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class StudentApplication {
	lopputyo.student.Student Student = new Student();


	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	@RestController
	@RequestMapping("app")
	
	public class testi{
		@GetMapping
		public String kylla() throws IOException{
			ClassStudFiles.muisti(Student.getFirstName(), Student.getLastName());
			//return Student.getFirstName();
			return "toimiiko";

		}
		@GetMapping("/{Name}")
		public String ei(@PathVariable String Name){
			Student.setFirstName(Name);
			return Name;
		}

		
		@GetMapping("/2/{LName}")
		public String jees(@PathVariable String LName){
			Student.setLastName(LName);
			return LName;
		}


	}

}
