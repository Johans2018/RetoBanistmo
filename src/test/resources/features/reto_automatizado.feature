Feature: Reto técnico de Automatización

  Scenario: Validar el convertidor de tasa de interés
    Given Jonathan ingresa a la pagina Bancolombia en negocios
    When interactua con el convertidor
    Then se evidencia el resultado del convertidor
