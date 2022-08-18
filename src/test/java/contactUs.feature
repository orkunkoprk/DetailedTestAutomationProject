Feature: Cucumber Test Automation contactUs
  Scenario Outline: contactUs Scenario
    Given Go to Website
    And ContactUs butonuna tiklanir
    And SubjectHeading seceneklerinden Webmaster secilir
    And "<EmailAdress>" EmailAdress girilir
    And "<OrderReferance>" Order reference girilir
    When "<Message>" Message yazilir
    Then Send butonuna tiklanir
    Examples:
    |EmailAdress|OrderReferance|Message|
    |orkun1@gmail.com|12345689|adssadaklsdlskadklşsadsaşldşlksaldsa|
    |sinem10@gmail.com|98746521|oalsdklasşdjvnxaklcasdasdadsdsads|
