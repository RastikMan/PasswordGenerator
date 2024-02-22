# Password Generator

## Overview

This JavaFX application generates secure, random passwords based on user-specified criteria.

## Features

* Allows users to customize password length.
* Provides options to include uppercase letters, digits, and special characters.
* Generates passwords with a high degree of randomness.
* Allows users to easily copy generated passwords to the clipboard.

## Usage

1. Enter the desired password length in the "Довжина пароля" field.
2. Select the desired character sets using the checkboxes:
    * "Включити верхній регістр": Include uppercase letters
    * "Включити цифри": Include digits
    * "Включити спеціальні символи": Include special characters
3. Click the "Згенерувати пароль" button to generate a password.
4. The generated password will be displayed in the text area.
5. Click the "Скопіювати" button to copy the password to the clipboard.

## Technical Details

* Language: Java
* Frameworks: JavaFX
* Libraries: None

## Dependencies

* Java Development Kit (JDK) version 8 or later
* JavaFX runtime

# Use Case Scenario for Password Generator v1

## Application Startup:

1. The user starts the Password Generator v1 application.

## Configuring Generation Parameters:

2. The application interface presents the following elements:
   - "Password length" field for entering the desired password length.
   - "Include upper case" checkbox to enable upper case in the password.
   - "Include digits" checkbox to include digits in the password.
   - "Include special characters" checkbox to include special characters in the password.

3. The user inputs the desired password length and selects the necessary parameters for password generation.

## Password Generation:

4. The user clicks the "Generate Password" button.
5. The application utilizes the entered parameters to generate the password.
6. The generated password is displayed in the designated text field.

## Copy Password:

7. The user observes the generated password in the text box.
8. The user clicks the "Copy" button to copy the password to the clipboard.

## Using Copied Password:

9. The user pastes the copied password into other applications or services.
10. This action is useful, for instance, during website or application registration.

## Shutdown:

11. The user concludes the interaction with the application by closing its window.
