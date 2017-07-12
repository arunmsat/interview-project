@USID-99
Feature: Message for Vechicle Details Not Found
  Message displayed to user when Registration Number entered is in valid format and the vechile details could not be found

  @MessagesForVechileDetailsNotFound
  Scenario: Verify the message when valid format of vechile registration number is entered and the vechicle details cannot be found
    Given I go to "DVLA_Vehicle_Info_URL"
    When I click on the Start_now_button
    And I enter the registration number "OE09ZZZ" of the vehicle
    And I click on the Continue_button
    Then the following message informing the next steps should be displayed to user
      """
      Vehicle details could not be found
      
      Vehicle details could not be found as it has not been possible to locate the vehicle details, your enquiry cannot proceed and has been cancelled. If you want to check the vehicle record held by DVLA...
      
      Please contact vehicle enquiries:
      
      Phone: 0300 790 6802
      Email: Send an Email
      
      An advisor will be able to assist you 8.00am - 7.00pm Monday to Friday and 8.00am - 2.00pm on Saturday.
      """
