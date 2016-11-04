package xyz.neutrallemonade.testng_json_reporter;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

import com.google.gson.Gson;

import xyz.neutrallemonade.testng_json_reporter.models.Report;
import xyz.neutrallemonade.testng_json_reporter.models.Test;

public class JsonReporter implements IReporter {

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		System.out.println("_____________REPORT_____________");
		ISuite suite = suites.get(0);
		System.out.println("++++" + suites.size());
		Map<String, ISuiteResult> tests = suite.getResults();

		Gson gson = new Gson();
		Report report = new Report();
		report.setSuiteName(suite.getName());

		for (String key : tests.keySet()) {

			Test test = new Test();
			test.setName(tests.get(key).getTestContext().getName());

			report.addTest(test);

			for (ITestNGMethod method : tests.get(key).getTestContext().getAllTestMethods()) {

				test.addMethod(method.getMethodName());
			}
		}

		System.out.println("_++JSON: " + (String) gson.toJson(report));

		System.out.println("_______________END______________");
	}

}
