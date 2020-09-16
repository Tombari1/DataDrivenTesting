Feature: DataDriven: BlueSky Form using Scenario Outline

  Scenario Outline: Form Fields Test
    Given I navigate to blueskycitadelform site
    When I click on Automation Testing Form
    And I enter email address "<Email>"
    And I enter Password "<Password>"
    And I click on the radio button
    Then I get the outcome "<Outcome>"


    #Ctrl + Alt + L to align to pipes |

    Examples:
      | Email                     | Password | Outcome |
      | email@test.com            | password |         |
      | email2@test.com           | password |         |
      | myemsil@bleskycitadel.com | pas@     | failed  |