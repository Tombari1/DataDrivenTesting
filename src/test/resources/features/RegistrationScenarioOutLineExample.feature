Feature: Registration With Scenario Outline
#    2. using the scenario Outline ""
#     Ctrl + Alt + L to align to pipes |
#
  Scenario Outline: Invalid Registration
    Given I navigate to blueskycitadelform site
    And I click on Login/Register
    And I click on Register now
    When I enter the username "<USERNAME>"
    And I enter the email address "<EMAILADDRESS>"
    And I enter the password "<PASSWORD>"
    And I confirm the password "<CONFIRMPASSWORD>"
   # Then I click on the submit

    Examples:
      | USERNAME       | EMAILADDRESS   | PASSWORD         | CONFIRMPASSWORD |
      | MYUSERNAMETEST | EMAIL@TEST.COM | mysecurepassword | mysecure        |
      | MYUSERNAMETEST | EMAIL@TEST | mysecurepassword | mysecurepassword        |
      | 12345 | EMAIL@TEST.COM | mysecurepassword | mysecurepassword        |
