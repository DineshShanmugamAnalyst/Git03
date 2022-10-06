Feature: Verifying Adactin login details

  Scenario Outline: Verifying adactin login details with valid credentials
    Given User is on the adactin page
    When User should login "<userName>" and "<passWord>"
    Then User should verify after login success msg
    When User should search hotels "<location>","<hotels>","<roomType>","<noOfRooms>","<checkIn>","<checkOut>","<adulPerRoom>","<childPerRoom>"
    Then User should verify after search succesful msg
    When user should select hotel
    Then User should verify after select succesful msg
    When User should book a hotel "<firstName>","<laastName>","<billingAddress>","<ccNo>","<ccType>","<expMonth>","<expYear>","<cvV>"
    Then User should verify after booking succesful msg

    Examples: 
      | userName           | passWord  | location | hotels      | roomType | noOfRooms | checkIn    | checkOut   | adulPerRoom | childPerRoom | firstName       | laastName       | billingAddress | ccNo             | ccType | expMonth | expYear | cvV |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
      | DineshShanmugam123 | Dinesh123 | Sydney   | Hotel Creek | Standard | 1 - One   | 02/10/2022 | 03/10/2022 | 1 - One     | 1 - One      | DineshShanmugam | DineshShanmugam | Chennai        | 1234567812345678 | VISA   | October  |    2024 | 568 |
