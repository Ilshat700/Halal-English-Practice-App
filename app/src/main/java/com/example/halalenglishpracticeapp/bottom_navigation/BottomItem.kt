package com.example.halalenglishpracticeapp.bottom_navigation

import com.example.halalenglishpracticeapp.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String){
    object AllUsersScreen: BottomItem("All", R.drawable.all_users_icon, "all_users_screen")
    object NewUsersScreen: BottomItem("New", R.drawable.new_users_icon, "new_users_screen")
    object ReadyUsersScreen: BottomItem("Can call", R.drawable.ready_to_call_icon, "ready_users_screen")
    object OnlineUsersScreen: BottomItem("Online", R.drawable.online_users_icon, "online_users_screen")
    object SettingsScreen: BottomItem("Settings", R.drawable.settings, "settings_screen")
}
