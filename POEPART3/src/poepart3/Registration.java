/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart3;

/**
 *
 * @author Student
 */
public class Registration { //start of class

        String userName;
    String passWord;
    String cellPhone;

    public boolean checkUserName(String username) {
        return username != null && username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        return password != null && password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[^a-zA-Z0-9].*");
    }

    public boolean checkCellPhoneNumber(String cellphone) {
        return cellphone != null && (cellphone.matches("^\\+27[0-9]{9}$")
                || cellphone.matches("^0[0-9]{9}$"));
    }

    public String registerUser(String username, String password, String cellphone) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber(cellphone)) {
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        }

        userName = username;
        passWord = password;
        cellPhone = cellphone;
        return "Registration was a success";
    }

    public boolean registerStatus(String username, String password, String cellphone) {
        return checkUserName(username) && checkPasswordComplexity(password)
                && checkCellPhoneNumber(cellphone);
    }
}