Feature: Testing the Fire class

  Scenario: Connecting Fire with Fire
    Given I have an Fire element
    When I connect Fire with Fire
    Then I should get Fire

  Scenario: Connecting Fire with Air
    Given I have an Fire element
    When I connect Fire with Air
    Then I should get Energy

  Scenario: Connecting Fire with Earth
    Given I have an Fire element
    When I connect Fire with Earth
    Then I should get Lava

  Scenario: Connecting Fire with Water
    Given I have an Fire element
    When I connect Fire with Water
    Then I should get Steam