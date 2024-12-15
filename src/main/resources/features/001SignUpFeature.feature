Feature: SignUp Website
  Scenario:Test001 Signup Website (user)
    When Test001 Membuka Halaman Website
    And  Test001 Click Button SignUp
    And  Test001 Validasi SignUp
    And Test001 Input TextField <username> Yang Valid One
    And Test001 Input TextField <password> Yang Valid Two
    And Test001 Validasi Form Sign UP
    And Test001 Click Button SignUp Form
    Then Test001 Pop Out Sign Up Berhasil
#    Then Test001 Validasi website

    Examples:
      | username | password |
      | jajajakcvasdg777779 | jajak4k4 |