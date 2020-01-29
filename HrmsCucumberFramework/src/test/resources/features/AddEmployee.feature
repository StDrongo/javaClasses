#Author: syntax team (asel@syntaxtechs.com)
@sprint2 @addemployee
Feature: Add Employee

  Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page

  @smoke
  Scenario: Add new Employee
    When I add "John", "S" and "Smith"
    And I click Save
    Then I see Employee has been succesfully added

  @regression
  Scenario Outline: Add new Employee
    When I add "<FirstName>", "<MiddleName>" and "<LastName>"
    And I click Save
    Then I see Employee with "<FirstName>", "<MiddleName>" and "<LastName>" is displayed

    Examples: 
      | FirstName | MiddleName | LastName |
      | James     |            | Smith    |
      | Jane      | J          | Smith    |
      | Sasha     | J          | Smith    |
      | David     | J          | Smith    |

  Scenario: Add Employee without employee id
    When I add "John", "S" and "Smith"
    And I delete employee id
    And I click Save
    Then I see employee without employee id is being added

  Scenario: Add Employee negative scenario
    When I click Save
    Then I see required error message next to the first and last name

  Scenario Outline: AddEmployee and Login Credentials
    When I add "<FirstName>", "<MiddleName>" and "<LastName>"
    And I click on create login checkbox
    And I enter "EmployeeJame", "qQ1!wW2@" and "qQ1!wW2@"
    When I click Save
    Then I see Employee has been succesfully added

    Examples: 
      | FirstName | MiddleName | LastName |
      | James     | J          | Smith    |
