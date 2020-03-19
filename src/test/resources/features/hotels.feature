@Web @Hotel
Feature: Hotels.com feature

  Background:
    Given I am on hotels homepage page

  @HotelDropDown
  Scenario: Verify user can select rooms, adult and child values
    When I select 1 in rooms
    And I select 4 in adults
    And I select 2 in children
    Then I verify that I get 2 children dropdown