package xyz.neutrallemonade.testng_json_reporter.models;

import java.util.ArrayList;
import java.util.List;

public class Report {
	private String suiteName;
	private List<Test> tests;

	public String getSuiteName() {
		return suiteName;
	}

	public void setSuiteName(String suiteName) {
		this.suiteName = suiteName;
	}

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public void addTest(Test test) {
		if (getTests() == null) {
			setTests(new ArrayList<Test>());
		}

		List<Test> updatedTests = getTests();

		updatedTests.add(test);
	}
}
