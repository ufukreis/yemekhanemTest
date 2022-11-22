Feature: Istenilen menuler kontrol

  Scenario: Secilen yemeklerin sayisi dogru mu kontrol eder.

    Given open login page
    And click rapor button
    And click menu rapor
    Then verify count

