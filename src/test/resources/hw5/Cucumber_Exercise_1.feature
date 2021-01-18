Feature: Exercise 1 Homework5

  Scenario: Different elements page test
    Given I open JDI GitHub site
    Then The site has proper Url 'https://jdi-testing.github.io/jdi-light/index.html'
    Then The site has title 'Home Page'
    And I login as user "Roman Iovlev"
    Then Logged user name equals "Roman Iovlev"
    And I open Different Elements page through the header menu->Service
    Then The page has proper Url 'https://jdi-testing.github.io/jdi-light/different-elements.html'
    And I select 'Water', 'Wind' checkboxes
    Then Wind, water checkboxes are selected
    And I select selen radio
    Then Selen radio is selected
    And Select yellow in dropdown
    Then Yellow in dropdown is selected
    Then Log rows are displayed and corresponded to checkboxes status
    Then Log row is displayed and corresponded to radio status
    Then Log row is displayed and corresponded to selected in dropdown status