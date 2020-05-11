Feature: latest offers search
  i as customer
  i want the ability to search for latest offers available at present
  and review the details of the offer i like

  Scenario: latest pay monthly deals search
    Given i navigate the carphonewarehouse homepage
    When i move on latestOffers link
    And i click on Pay Monthly Deals link
    And i click on right arrow link
    And i click on ViewDetails button
    Then full detail of offer is displayed
