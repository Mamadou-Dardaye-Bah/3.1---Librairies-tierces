package org.Bah

import org.apache.commons.validator.EmailValidator
import org.apache.commons.validator.Validator

fun main(args : Array<String>) {
    for(mail : String in args) {
        if(IsValid((mail))) {
            println("Le mail $mail est valide")
        }
        else
            println("Le mail $mail est invalide")
    }
}

fun IsValid(email : String) : Boolean {
    return EmailValidator.getInstance().isValid(email)
}