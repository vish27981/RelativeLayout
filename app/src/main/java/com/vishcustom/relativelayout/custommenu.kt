package com.vishcustom.relativelayout

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class custommenu {
    fun customMenu(context: Context, view: View) {
        val pop = PopupMenu(context, view)
        pop.inflate(R.menu.menudemo)

        pop.setOnMenuItemClickListener {
            when (it!!.itemId) {
                R.id.edit -> {
                    Toast.makeText(context, "clicked Edited", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.del -> {
                    Toast.makeText(context, "clicked Delete", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.pro -> {
                    Toast.makeText(context, "clicked Profile", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.log -> {
                    Toast.makeText(context, "clicked Logout", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }
        try{
            val fieldMpopup = PopupMenu::class.java.getDeclaredField("mPopup")
            fieldMpopup.isAccessible = true
            val mPopup =fieldMpopup.get(pop)
            mPopup.javaClass
                .getDeclaredMethod("setFoeceShowIcon",Boolean::class.java)
                .invoke(mPopup,true)
        }
        catch(e:Exception){

        }finally {
            pop.show()

        }
    }
}