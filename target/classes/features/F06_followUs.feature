@regression
Feature: user can opens any follow us links
  Scenario: user opens face book link
    When user open facebook link
    Then facebook page of nopCommerce is opened in new tab
  Scenario: user opens twitter link
    When user open twitter link
    Then twitter page of nopCommerce is opened in new tab
  Scenario: user opens res  link
    When user open res link
    Then New Store News Page is opened
  Scenario: user opens YouTube link
    When user open YouTube link
    Then youtube page of nopCommerce is opened in new tab


#    When user open facebook link
#    Then "https://www.facebook.com/nopCommerce" is opened in new tab
#     Scenario: user opens twitter link
#    When user open twitter link
#    Then "https://twitter.com/nopCommerce" is opened in new tab
#      Scenario: user opens res  link
#    When user open res link
#    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab
#     Scenario: user opens YouTube link
#    When user open YouTube link
#    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab