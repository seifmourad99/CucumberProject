Feature: Test the Signup functionality
  @Sanity
  Scenario: To Signup with user that not existed before
    Given user opens the website and press on signup link
    When user enters valid username  and password as  and click signup
    Then user gets signup message alert




