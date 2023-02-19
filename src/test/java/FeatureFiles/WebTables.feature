Feature:WebTables Feature

  @SmokeTest @Regression
  Scenario Outline: Add Data Positive
    Given User add Data "<firstName>" , "<lastName>" , "<Email>" , "<Age>" , "<Salary>" , "<Department>"

    Examples:
      | firstName | lastName | Email                 | Age | Salary | Department |
      | Nıl       | Komurcu  | nilatelier8@gmail.com | 26  | 2800   | Software   |

  @SmokeTest @Regression
  Scenario Outline: Add Data Negative
    When User add same Data "<firstName>" , "<lastName>" , "<Email>" , "<Age>" , "<Salary>" , "<Department>"
    Examples:
      | firstName | lastName | Email                 | Age | Salary | Department |
      | Nıl       | Komurcu  | nilatelier8@gmail.com | 26  | 2800   | Software   |


  @SmokeTest @Regression
  Scenario Outline: Edit Data
    And User edit Data "<firstName>" and change it to "<newFirst>"

    Examples:
      | firstName  | newFirst  |
      | Nıl        | Selın     |


  @SmokeTest @Regression
  Scenario Outline: Delete Data Positive
    Given User delete Data "<newFirst>"

    Examples:
      | newFirst |
      | Selın    |


  @SmokeTest @Regression
  Scenario Outline: Delete Data Negative
    When User search deleted "<newFirst>" in search input data
    Then There is no data should displayed
    Examples:
      | newFirst    |
      | Selın       |
