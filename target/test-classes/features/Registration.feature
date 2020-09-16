Feature: Registration
  This is the testing registration of BlueSkyCitadel.com website
  #Data driven test
  #1. WITHOUT using the parameterisation ""
  Scenario: BlueSky Citadel Registration
    Given I navigate to blueskycitadelform site
    And I click on Login/Register
    And I click on Register now
    When I enter the username
    And I enter the email address
    And I enter the password
    And I confirm the password
    Then I click on the submit



#  #1. using the parameterisation ""
  Scenario: Invalid email address
    Given I navigate to blueskycitadelform site
    And I click on Login/Register
    And I click on Register now
    When I enter the username "MYUSERNAMETEST"
    And I enter the email address "EMAIL@TEST"
    And I enter the password "MYSECURITY"
    And I confirm the password "MYSECURITY"
    Then I click on the submit
    And I confirm an error message is displayed
    And I confirm that "Please enter a valid email address." is displayed


  Scenario: Invalid username
    Given I navigate to blueskycitadelform site
    And I click on Login/Register
    And I click on Register now
    When I enter the username ""
    And I enter the email address "EMAIL@TEST"
    And I enter the password "MYSECURITY"
    And I confirm the password "MYSECURITY"
    Then I click on the submit
    And I confirm an error message is displayed

#
#  Scenario: Incorrect password
#    Given I navigate to blueskycitadelform site
#    And I click on Login/Register
#    And I click on Register now
#    When I enter the username "MYUSERNAMETEST"
#    And I enter the email address "EMAIL@TEST.com"
#    And I enter the password "MYSECURITY"
#    And I confirm the password "MYSECURITY1"
#    Then I click on the submit


  Scenario: Valid BlueSky Citadel Registration USING PARAMTER
    Given I navigate to blueskycitadelform site
    And I click on Login/Register
    And I click on Register now
    When I enter the username "MYUSERNAMETEST"
    And I enter the email address "deji@test.COM"
    And I enter the password "MYSECURITY"
    And I confirm the password "MYSECURITY"
    Then I click on the submit
