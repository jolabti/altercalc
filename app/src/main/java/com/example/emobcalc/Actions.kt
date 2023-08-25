package com.example.emobcalc

import android.content.Context
import org.mozilla.javascript.Scriptable

class Actions {
    companion object{
        fun calculate(input:String?):String{
            var resultValue = ""
            try {
                val context = org.mozilla.javascript.Context.enter()
                context.optimizationLevel = -1
                val scriptable:Scriptable= context.initStandardObjects()
                resultValue = context.evaluateString(scriptable,input,"Javascript",1 , null).toString()

            }
            catch (e:Exception){
                resultValue = "Error to Calculate"

            }

            return resultValue
        }
    }
}