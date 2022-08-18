Feature: Cucumber Test Automation registerPage
  Scenario Outline: Register Scenario
    Given Go to Website
    And Sign in tiklanir
    And "<eMail>" adresi girilir
    And Butona tiklanir
    And Title Belirlenir
    And "<firstName>" girilir
    And "<lastName>" lastname girilir
    And "<password>" password girilir
    And Dogum Tarihi Gun Ay Yil seklinde secilip belirlenir
    And Butonlara Tiklanir
    And "<isim>" isim girilir
    And "<soyisim>" soyisim girilir
    And "<company>" company girilir
    And "<adress>" adress girilir
    And "<alternativeAdress>" alternativeAdress girilir
    And "<city>" city girilir
    And Semt secilir
    And "<postaKodu>" postaKodu girilir
    And "<telefonNo>" telefonNo girilir
    And "<evTelefonNo>" evTelefonNo girilir
    And "<mobilePhone>" mobilePhone girilir
    When acik adress once silinir daha sonra girilir
    Then Register butonuna tiklanir
    Examples:
    |eMail|firstName|lastName|password|isim|soyisim|company|adress|alternativeAdress|city|postaKodu|telefonNo|evTelefonNo|mobilePhone|
    |orkun1@gmail.com|orkun|mete|1322131|mahmut|koca|ETL|İstiklal|Mahalle|Adana|00001000|5364128985|03225684875|05552642659|
    |mustafa01@gmail.com|orkun|mete|1322131|asdasd|koca|ETL|İstiklal|Mahalle|Adana|00001000|5364128985|03225684875|05552642659|
    |sinem10@gmail.com|asdas|mete|1322131|mahmut|koca|ETL|adava|Mahalle|Adana|00001000|5364128985|03225684875|26266565|

