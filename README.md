# JUnit Webform Automation Project

Welcome to the **JUnit Webform Automation Project**! This project is focused on automating the submission of a practice webform, validating the file upload functionality, and verifying successful form submission by asserting the expected confirmation message.

## Project Overview

This automation project interacts with the [Digital Unite Practice Webform](https://www.digitalunite.com/practice-webform-learners). It includes:

- Filling out all required fields.
- Uploading a file (ensuring it stays within a 2MB limit).
- Submitting the form and asserting that the expected success message is displayed.

## Features

- **JUnit Framework**: The project uses JUnit for writing and executing test cases.
- **Selenium WebDriver**: Automates web browser interactions to fill and submit the form.
- **File Upload Validation**: The test ensures that the file is uploaded correctly, with the size being within the specified limit.
- **Success Message Assertion**: Verifies that the submission is successful by checking for the expected confirmation message after submission.

## Project Structure

- **src/test/java**: Contains the JUnit test scripts for automating the webform interaction.
- **screenshots**: This folder will store screenshots that show test execution results.

## Tools & Technologies

- **JUnit**: For test case execution.
- **Gradle**: Build automation tool used for dependency management and test execution.
- **Selenium WebDriver**: Used for browser automation and web form interaction.
- **IntelliJ IDEA**: IDE for development and running the tests.

## Setup and Running Tests

### Prerequisites

- Ensure **Gradle** is installed on your system or is managed by IntelliJ IDEA.
- Install **IntelliJ IDEA** as your preferred IDE for development and test execution.

### Steps to Run


### Running Tests

1. Open IntelliJ, and navigate to the test class file.
2. Right-click on the test class or method and choose **Run** to execute the automation test.
3. The test results will be shown in the console output within IntelliJ IDEA.

## Expected Output

After executing the test:

- The file should upload successfully if it is under 2MB.
- The form should submit, and the automation should assert the appearance of the expected success message confirming successful submission.
  

## To-Do
- Add screenshots of the automated test execution (coming soon).
- Enhance test cases with additional scenarios, such as invalid file uploads (over 2MB limit), and negative test cases for form fields.


**Enjoy testing with JUnit and Gradle!**