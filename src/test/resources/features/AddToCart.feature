Feature: Verify AddToCart functionality

  Scenario: Add specific product in Amazon Add to cart

    Given user navigate to Amazon website
    When user search "product"
    And hit enter
    Then user able to see respective products
    When user select desired product
    And click on Add to cart
    Then product able to add in Add to cart section
