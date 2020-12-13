package com.mustafahabib.archelon

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText


class RegisterFragment: Fragment(){




    private lateinit var user: User //intialise instance of user
    //create variables for user entry fields
    private lateinit var firstName: EditText
    private lateinit var emailAd: EditText
    private lateinit var userName : EditText
    private lateinit var password: EditText
    private lateinit var reEnterPassword: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        user = User()
    }
    //onCreateView code with assistance from learning.oreilly.com
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container,false)

        firstName = view.findViewById(R.id.user_first_name) as EditText
        emailAd = view.findViewById(R.id.user_email_ad) as EditText
        userName = view.findViewById(R.id.user_name) as EditText
        password = view.findViewById(R.id.user_password) as EditText
        reEnterPassword = view.findViewById(R.id.re_entered_password) as EditText

        return view
    }

    override fun onStart() {
        super.onStart()

        val userNameWatcher = object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                user.firstName = s.toString()

            }
        }


    }

}