package com.sample.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sample_project_2.TodoService;

import junit.framework.Assert;
import sample_project_2.TodoServiceStub;

public class TodoBusinessImplStubTest {
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;
	@Mock
	TodoService todoService;
	
	@Test
	public void test() {
		TodoService tss=new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(tss);
		List<String> ss=todoBusinessImpl.retrieveTodosRelatedToSpring("User");
		Assert.assertEquals("Learn Spring MVC", ss.get(0));
	}

}
