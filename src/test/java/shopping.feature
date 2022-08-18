Feature: Cucumber Test Automation shopping
  Scenario: Shopping Scenario
    And Go to Website
    And Anasayfada misin
    And Ilk urunun detay sayfasina git
    And Size M yap
    And Color Mavi olsun
    And Add to Cart tikla
    And Continue shopping tikla
    And Son urunun deta sayfasina git
    And Urunun sayisini arttir
    And Add to Cart tikla
    And Proceed to checkout butonuna tikla
    And Shoppin Details sayfasinda misin
    And Pahali olan urunu bir arttir
    And Toplam urun fiyatını yazdir
    When Urunlerin ikisini de Sil
    Then Sepetin bos oldugu Mesajini Al
