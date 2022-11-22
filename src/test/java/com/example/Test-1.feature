Feature: corba kategorisinde en fazla 1 adet yemek seçilebilir.

  Scenario: max 1 corba

    Given open login page
    And click yemek menu
    And click corba
    Then hatali
