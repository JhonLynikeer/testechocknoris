package com.jltech.chocksnoreis.utils;

import android.content.Context
import android.content.SharedPreferences

class Preferences {

    lateinit var preferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    lateinit var context: Context
    var MODE_PRIVATE : Int = 0

    constructor(context: Context) {
        this.context = context
        preferences = context.getSharedPreferences(PREFERENCES_NAME, MODE_PRIVATE)
        editor = preferences.edit()

    }

    companion object {
        val PREFERENCES_NAME = "Preferences"
        val IS_LOGGIN = "isLoggin"
        val KEY_TOKEN = "token"
        val KEY_EMAIL = "email"
        val KEY_NAME = "name"
        val KEY_IMAGE = "image"
        val KEY_CPF = "cpf"
        val KEY_PHONE = "phone"
        val KEY_BIRTH = "birth"
        val KEY_IMAGE_URL = "image_url"
        val KEY_IMAGE_KEY = "imagem_key"
        val KEY_TYPE = "type"
    }

//    fun createSession(token: String){
//        editor.putBoolean(IS_LOGGIN, true)
//        editor.putString(KEY_TOKEN, token)
//        editor.commit()
//        editor.apply()
//    }




    fun checkLogin() : Boolean {
        return preferences.getBoolean(IS_LOGGIN, false)
    }

    fun getToken() : String {
        return preferences.getString(KEY_TOKEN, null).toString()
    }

    fun getName() : String {
        return preferences.getString(KEY_NAME, null).toString()
    }

    fun getEmail() : String {
        return preferences.getString(KEY_EMAIL, null).toString()
    }

    fun getImage() : String {
        return preferences.getString(KEY_IMAGE, null).toString()
    }

    fun getCPF() : String {
        return preferences.getString(KEY_CPF, null).toString()
    }

    fun getPhone() : String {
        return preferences.getString(KEY_PHONE, null).toString()
    }

    fun getBirth() : String {
        return preferences.getString(KEY_BIRTH, null).toString()
    }

    fun logout() {
        editor.clear()
        editor.commit()
    }
}