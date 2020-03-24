@web @hotel
Feature: Hotels.com feature

  Background:
    Given I am on hotels.com home page

  # 1
  @hotelStarRatings
  Scenario Outline: Verify user can only view the result by selected property class
    And I enter New York, New York, United States of America on hotels home page
    And I enter checkIn and checkOut dates
    And I click on search button
    When I select property class <stars> at search result page
    Then I verify system displays only <stars> hotels at search result page

    Examples:
      | stars   |
      | 5 stars |
      | 4 stars |
      | 3 stars |

  #2
  @hotelListOfHotels
  Scenario: List of all of hotel within 10 miles radius of airport or downtown
    And I enter New York, New York, United States of America on hotels home page
    And I enter checkIn and checkOut dates
    When I click on search button
    And I click on sort by distance option on search result page
    And I select John F. Kennedy International Airport (JFK) from sort by distance options
    Then I verify system displays all hotels within 10 miles radius of airport
    And I verify Hilton New York JFK Airport hotel is within 10 miles radius of airport

  #3
  @hotelDealOfTheDay
  Scenario: Verify todays deal price value
    And I enter New York, New York, United States of America on hotels home page
    And I enter checkIn and checkOut dates
    When I click on search button
    Then I verify todays deal is less than 200 at search result page

  #4
  @hotelRoomCount
  Scenario Outline: Verify room count dropdown
    When I select <select_rooms> from room dropdown
    Then I verify <number_of_room_dropdown> is displayed

    Examples:
      | select_rooms | number_of_room_dropdown |
      | 1            | 1                       |
      | 2            | 2                       |
      | 3            | 3                       |
      | 4            | 4                       |
      | 5            | 5                       |
      | 6            | 6                       |
      | 7            | 7                       |
      | 8            | 8                       |
      | 9+           | 0                       |