Feature: BlueSky Form Test
  Scenario: Menu Test
    Given I navigate to blueskycitadelform site
    And I click on the Home link
    And I click on the About link
    And I click on some menu links
    When I click on Automation Testing Form
    Then I close my window


  Scenario: Form Fields Test
    Given I navigate to blueskycitadelform site
    When I click on Automation Testing Form
    And I enter the Single Line Text
    And I enter email address
    And I enter password
    And I click on the radio button
    Then I close my window