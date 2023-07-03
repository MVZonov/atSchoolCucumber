Feature: Testing the Water class

  Scenario: Connecting Water with Fire
    Given I have an Water element
    When I connect Water with Fire
    Then I should get Steam

  Scenario: Connecting Water with Air
    Given I have an Water element
    When I connect Water with Air
    Then I should get Rain

  Scenario: Connecting Water with Earth
    Given I have an Water element
    When I connect Water with Earth
    Then I should get Mud

  Scenario: Connecting Water with Water
    Given I have an Water element
    When I connect Water with Water
    Then I should get Sea

  Scenario: Connecting Water with Energy
    Given I have an Water element
    When I connect Water with Energy
    Then I should get Steam