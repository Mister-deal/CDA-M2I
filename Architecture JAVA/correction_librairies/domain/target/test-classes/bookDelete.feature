Feature: deletion of a book
  Scenario: successful deletion of an existing book
    Given there is a book with the ID 2
    When the user deletes the book with the ID 2
    Then the book with the ID 2 has been successfully deleted

  Scenario: Attempting to delete a book that is non-existent
    Given a book with the ID 456, which obviously doesn't exist
    When The user tries to delete the book with the 456 ID
    Then an error indicates that the book with the 456 ID doesn't exist is displayed