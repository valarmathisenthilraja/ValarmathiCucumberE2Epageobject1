Feature: End to End create order with multiple products
  Scenario: create on order with multiple products
    Given I navigate into url "http://twentyconsulting-001-site1.dtempurl.com/"
    When click login link on home page
    Then should see login page
    When enter email 'abc@tester.com'
    And enter password 'abc123'
    And click login button
    Then Should see home page
    When add item1 into cart
    And add item2 into cart
    And add item3 into cart
    And go to cart
    And Should appear items into cart
    And click checkout
    And select billing address
    And select shipping address
    And Select shipping method
    And select payment method
    And provide payment info
    And confirm order
    Then should see order confirm message