@updateprofile @smoke
Feature: Editare profil

  Background:
    # Acesta este pasul de legătură.
    # Nu repetăm pașii de "Introduce user", "Apasa buton".
    Given utilizatorul este logat în aplicație

  Scenario: Utilizatorul editeaza profilul
    When utilizatorul apasa butonul Settings
    And utilizatorul completeaza formularul cu urmatoarele date
    |firstName|lastName|email|
    |test02|automat|test.automat@qaschool.ro|
    And utilizatorul apasa butonul Update Details
    Then poate edita profilul

