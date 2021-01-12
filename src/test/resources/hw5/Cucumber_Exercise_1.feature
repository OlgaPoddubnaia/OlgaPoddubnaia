Feature: Exercise 1 Homework5

  Scenario: Different elements page test
    Given I open JDI GitHub site
    Then The site has proper Url
    Then The site has proper title
    And I login on site
    Then Logged user name equals "Roman Iovlev"
    And I open Different Elements page through the header menu->Service
    Then The page has proper Url
    And I select water, wind checkboxes
    Then Wind, water checkboxes are selected
    And I select selen radio
    Then Selen radio is selected
    And Select yellow in dropdown
    Then Yellow in dropdown is selected
    Then Log rows are displayed and corresponded to checkboxes status
    Then Log row is displayed and corresponded to radio status
    Then Log row is displayed and corresponded to selected in dropdown status