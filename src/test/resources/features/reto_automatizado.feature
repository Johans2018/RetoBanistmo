Feature: Generación de PDF de Prohibiciones de Préstamos de Auto en Banistmo

  Scenario: Validar el PDF de prohibiciones sea el correcto
    Given Jonathan ingresa al sitio web Banistmo personas
    When ingreso a prestamos de auto
    Then valido el PDF de Prohibiciones
