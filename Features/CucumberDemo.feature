Feature: To run a demo Selenium With Cucumber

  Scenario: To verify the Login Functionality
    Given I Open the website
    When I enter Valid Username and Password
    And I click on Login button
    Then I should be able to login
