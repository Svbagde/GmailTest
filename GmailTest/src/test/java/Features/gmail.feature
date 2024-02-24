Feature: gmail compose Test
  Background:open chrome browser
    Given user open webBrowser
    And user already on login page
    When user enter all valid credentials
    And click on login button
    Then Homepage should open

  Scenario: login to gmail
    Given user click on compose button
    And enter all details
    When click on sent button


