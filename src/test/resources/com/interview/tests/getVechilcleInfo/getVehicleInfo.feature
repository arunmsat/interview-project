@USID-99
Feature: Get Vechile Information from DVLA
  Get Vechile Make and Colour from DVLA by entering vechile registration number
  Note:In this test Expected data is read from the feature file Examples table below and the test is validated against it

  @getVechileMakeAndColour
  Scenario Outline: Verify that user can retrieve vehicle Make and Colour from DVLA by entering vechile registration number
    Given I go to "DVLA_Vehicle_Info_URL"
    When I click on the Start_now_button
    And I enter the registration number "<Registration_Number>" of the vehicle
    And I click on the Continue_button
    Then the  vehicle information for make "<Make>" and colour "<Colour>" should be displayed along with the entered registration number "<Registration_Number>"

    Examples: 
      | Registration_Number | Make       | Colour     |
      | OE09 ZFZ            | Skoda      | Silver     |
      | SF61 EEA            | PEUGEOT    | SILVER     |
      | BP55 SNZ            | FORD       | SILVER     |
      | PK60 FXL            | VOLKSWAGEN | BLACK      |
      | DY1                 | LAND ROVER | GREY       |
      | DY11                | DOUGLAS    | NOT STATED |
