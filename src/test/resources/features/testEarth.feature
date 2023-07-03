Feature: Testing the Earth class

  Scenario: Connecting Earth with Fire
    Given I have an Earth element
    When I connect Earth with Fire
    Then I should get Lava

  Scenario: Connecting Earth with Air
    Given I have an Earth element
    When I connect Earth with Air
    Then I should get Dust

  Scenario: Connecting Earth with Earth
    Given I have an Earth element
    When I connect Earth with Earth
    Then I should get Pressure

  Scenario: Connecting Earth with Water
    Given I have an Earth element
    When I connect Earth with Water
    Then I should get Mud