package nam.vuthanh.myapplication.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import nam.vuthanh.myapplication.R
import nam.vuthanh.myapplication.databinding.ActivityDrawerLayoutBinding

class DrawerLayoutActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var binding: ActivityDrawerLayoutBinding
    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var drawerLayout:DrawerLayout
    lateinit var navBot:BottomNavigationView
    lateinit var navView:NavigationView
    private lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawerLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initDrawerLayout()
        initAppBarConfiguration()
        initNavView()
        initNavBot()
        initNavController()
        initNavUI()
        initClick()
    }


    private fun initDrawerLayout(){
       drawerLayout  = binding.drawerLayout
    }
    private fun initAppBarConfiguration() {
        appBarConfiguration = AppBarConfiguration.Builder(R.id.drawerHome,R.id.drawerFavorite,R.id.drawerProfile,R.id.drawerSignOut)
            .setOpenableLayout(drawerLayout)
            .build()
    }
    private fun initNavView(){
        navView = binding.navView
    }

    private fun initNavBot() {
       navBot = binding.appContainMain.navBot
    }

    private fun initNavUI(){
        NavigationUI.setupWithNavController(navView,navController)
        NavigationUI.setupWithNavController(navBot,navController)
    }
    private fun initNavController(){
        navController = Navigation.findNavController(this,R.id.fmGraphHost)
    }

    override fun onSupportNavigateUp(): Boolean {
        initNavController()
        return  NavigationUI.navigateUp(navController,drawerLayout)|| NavigationUI.navigateUp(navController,appBarConfiguration)|| super.onSupportNavigateUp()
    }

    private fun initClick() {
        binding.appContainMain.imgOpenDrawer.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        var id = p0?.id
        if (id==R.id.imgOpenDrawer){
                drawerLayout.openDrawer(GravityCompat.START)

        }
    }

}