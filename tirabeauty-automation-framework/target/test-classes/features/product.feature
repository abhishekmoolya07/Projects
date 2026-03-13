Feature: Product purchase flow

Scenario: Search product and add to cart

Given user opens tira beauty website
When user searches for lipstick
And user selects first product
And user adds product to cart
Then product should be added successfully
