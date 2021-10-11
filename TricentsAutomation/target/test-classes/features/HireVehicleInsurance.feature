# language: en

@hireVehicleInsurance
Feature: Hire Vehicle Insurance
  I want to hire a vehicle insurance to my car

  @fillFormToHireInsurance
  Scenario: Fill form to hire a vehicle insurance
    Given that I in home page of Tricents site
    And access Automobile Insurance
    When I fill form of Vehicle Data
    And fill form of Insurant Data
    And fill form of Product Data
    And select a Price Option
    And send a quote
    Then I validate the success message

