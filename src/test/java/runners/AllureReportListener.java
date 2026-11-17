
package runners;

import org.testng.IExecutionListener;

import java.io.File;
import java.io.IOException;

public class AllureReportListener implements IExecutionListener {

    private final File projectDirectory =
            new File(System.getProperty("user.dir"));

    private final File resultsDirectory =
            new File(projectDirectory, "target/allure-results");

    private final File reportDirectory =
            new File(projectDirectory, "target/site/allure-maven-plugin");

    @Override
    public void onExecutionStart() {

        // Only clean results when running directly from IntelliJ
        if (!Boolean.getBoolean("allure.generate.report.from.listener")) {
            return;
        }

        deleteDirectory(resultsDirectory);
        deleteDirectory(reportDirectory);

        System.out.println("Allure: Previous results cleared.");
    }

    @Override
    public void onExecutionFinish() {

        // Maven generates the report through its verify lifecycle.
        // This listener is only for direct IntelliJ execution.
        if (!Boolean.getBoolean("allure.generate.report.from.listener")) {
            return;
        }

        System.out.println("Allure: Generating HTML report...");

        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe",
                    "/c",
                    "mvn io.qameta.allure:allure-maven:2.15.0:report"
            );

            builder.directory(projectDirectory);
            builder.inheritIO();

            Process process = builder.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Allure HTML report generated successfully.");
                System.out.println("Report: target/site/allure-maven-plugin/index.html");
            } else {
                System.err.println("Allure report generation failed. Exit code: " + exitCode);
            }

        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Could not generate Allure report: " + e.getMessage());
        }
    }

    private void deleteDirectory(File directory) {

        if (!directory.exists()) {
            return;
        }

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }

        directory.delete();
    }
}
