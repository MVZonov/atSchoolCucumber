Feature: Testing the Air class

Scenario: Connecting Air with Fire
Given I have an Air element
When I connect Air with Fire
Then I should get Energy

Scenario: Connecting Air with Air
Given I have an Air element
When I connect Air with Air
Then I should get Pressure

Scenario: Connecting Air with Earth
Given I have an Air element
When I connect Air with Earth
Then I should get Dust

Scenario: Connecting Air with Water
Given I have an Air element
When I connect Air with Water
Then I should get Rain


