package testrunner;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Listeners(ListenerTest.class)
@CucumberOptions(
	features = "Features",
	glue = "stepdefinitions",
	tags = "@ReportIssue or @UpdateIssue or @DeleteIssue or @FilterIssue"
//	tags = "@ReportIssue"
//	tags = "@UpdateIssue"
//	tags = "@DeleteIssue"
//	tags = "@FilterIssue"
)
public class TestRunner extends AbstractTestNGCucumberTests{}