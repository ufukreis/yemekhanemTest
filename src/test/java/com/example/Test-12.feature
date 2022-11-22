Feature: Eksik veya fazla kalori seciminde tekrar sec secenegi
  Scenario: Eksik veya fazla kalori seciminde tekrar sec butonuna basar.

    Given open login page
    And click yemek menu
    And click corba1
    And click ana yemek3
    And click ana yemek4
    And click aperatif1
    And click on secimi tamamla
    Then click tekrar sec

