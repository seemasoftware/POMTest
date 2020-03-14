Feature: As a user i can login successfully
  @Login
  Scenario: User should be able to login

    Given user is on home page
    When user click on popup button
    And get pagetitle
    Then user should close page successfully