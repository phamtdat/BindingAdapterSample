package cz.phamtdat.bindingadaptersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.phamtdat.bindingadaptersample.ui.form.FormFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FormFragment.newInstance())
                .commitNow()
        }
    }
}
