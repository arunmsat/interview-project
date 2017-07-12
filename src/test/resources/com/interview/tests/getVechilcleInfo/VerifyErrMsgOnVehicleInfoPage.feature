@USID-99
Feature: Error Messages on Vehicle Info Page
  Error Message for invalid Vechile Registration Number

  @ErrMsgForVehicleRegistrationNumber
  Scenario Outline: Verify the error messages when invalid combination of registration numbers  or blank entry is entered in the vehicle Registration No. field
    Given I go to "DVLA_Vehicle_Info_URL"
    When I click on the Start_now_button
    And I enter the registration number "<Invalid_Registration_Number>" of the vehicle
    And I click on the Continue_button
    Then an error message "<Error_Message>" is displayed to user

    Examples: 
      | Invalid_Registration_Number | Error_Message                                             |
      | OE09ZFZZ                    | You must enter your registration number in a valid format |
      | OE09 ZF1                    | You must enter your registration number in a valid format |
      | BP55 !%$                    | You must enter your registration number in a valid format |
      | 1234 567                    | You must enter your registration number in a valid format |
      |                             | Please enter your registration number                     |
