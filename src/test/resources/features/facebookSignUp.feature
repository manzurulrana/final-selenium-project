@Web @Regression @Gender
Feature: Sign Up feature

  Background:
    Given I am on facebook landing page

  @GenderSelected
  Scenario: Verify your gender button is selected on sign up form
    When I enter test into firstName text field on sign up form
    And I enter test into lastName text field on sign up form
    And I enter test into password text field on sign up form
    And I enter 8883338888 into mobileNumberOrEmail text field on sign up form
    And I enter pass123 into newPassword text field on sign up form
    And I select gender Male if not already selected on sign up form
    And I click on Sign Up button on sign up form
    Then I verify that the gender Male is selected

