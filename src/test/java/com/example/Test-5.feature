Feature: Secilenleri kaldirip basarili secim yapma
  Scenario: secilen yemekleri kaldirip basarılı secimi yaptıktan sonra ana sayfaya doner.

    Given open login page
    And click yemek menu
    And click corba1
    And click ana yemek3
    And click ana yemek4
    And click aperatif1
    And click corba1
    And click ana yemek3
    And click ana yemek4
    And click aperatif1
    Then click on secimi tamamla

