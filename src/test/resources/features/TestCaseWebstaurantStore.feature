@wip
Feature:WebstaurantStore Product Search and Cart Operations

  Scenario:Search for 'stainless work table', add to cart, and empty cart

    Given Go to "webstaurantStoreUrl".
    Given Search for "stainless work table".
    Given Check the search result ensuring every product has the word "Table" in its title.
    Given Add the last of found items to Cart.
    Given Empty Cart.
