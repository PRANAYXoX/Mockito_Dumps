package sample_project_2;

import java.util.Arrays;
import java.util.List;

import com.sample_project_2.TodoService;

public class TodoServiceStub implements TodoService {
	
	public List<String> retrieveTodos(String user){
		return Arrays.asList("Learn Spring MVC","Learn Dance","Learn Spring Again");
	}

}
