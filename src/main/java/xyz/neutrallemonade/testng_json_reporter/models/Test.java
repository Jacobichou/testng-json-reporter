package xyz.neutrallemonade.testng_json_reporter.models;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private String name;
	private List<String> methods;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMethods() {
		return methods;
	}

	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

	public void addMethod(String method) {
		if (getMethods() == null) {
			setMethods(new ArrayList<String>());
		}

		List<String> updatedMethods = getMethods();

		updatedMethods.add(method);
	}

}
