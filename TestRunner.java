package org.openIntents.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(features = "features",glue={"org.openIntents.steps"} )

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}