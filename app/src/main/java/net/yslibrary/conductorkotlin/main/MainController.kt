package net.yslibrary.conductorkotlin.main

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import net.yslibrary.conductorkotlin.R
import net.yslibrary.conductorkotlin.databinding.ControllerMainBinding

/**
 * Created by yshrsmz on 2016/06/01.
 */
class MainController : Controller() {

  lateinit var binding: ControllerMainBinding
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
    binding = DataBindingUtil.inflate(inflater, R.layout.controller_main, container, false)

    binding.title.text = "MainController"

    return binding.root
  }
}