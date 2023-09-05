package kr.hs.emirim.s2233.dialogmultichoiceitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            var animalArray = arrayOf("고양이", "여우", "담비")
            var checkArray = booleanArrayOf(false, true, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 동물은?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setMultiChoiceItems(animalArray, checkArray) {
                dialog, index, isChecked ->
                btn.text = animalArray[index]
            }
            dlg.setNegativeButton("닫기",null)
            dlg.show()
        }
    }
}