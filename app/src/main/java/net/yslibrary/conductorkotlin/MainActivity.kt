package net.yslibrary.conductorkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import net.yslibrary.conductorkotlin.main.MainController

class MainActivity : AppCompatActivity() {

  lateinit var router: Router

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val viewGroup = findViewById(R.id.app_container) as ViewGroup
    router = Conductor.attachRouter(this, viewGroup, savedInstanceState)
    if (!router.hasRootController()) {
      router.setRoot(MainController())
    }
  }

  override fun onBackPressed() {
    if (!router.handleBack()) {
      super.onBackPressed()
    }
  }
}
