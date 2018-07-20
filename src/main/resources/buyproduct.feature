Feature: Automate test on removing product from cart
Descriptio: The purpose of this feature is to test removing product from cart.

Scenario: Customer add selected product into scenario and then remove.
     Given user is on home page
     When he search for "Die Hard"
     And choose to buy the first item
     And add item to cart
     And remove it from cart