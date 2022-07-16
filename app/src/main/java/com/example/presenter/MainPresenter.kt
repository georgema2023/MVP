package com.example.presenter

import com.example.MainActivity
import com.example.model.MainModel
import java.util.*

class MainPresenter() {
    private lateinit var mainView: MainActivity
    private lateinit var mainModel: MainModel

    constructor(mMainModel: MainModel) : this() {
        mainModel = mMainModel
    }

    infix fun hasView(mainActivity: MainActivity) {
        mainView = mainActivity
    }

    fun findAddress(){
        var list = mainModel.findAddress()
        mainView.hideProgressBar()
        mainView.showResult(list)
    }

    infix fun doWhenItemIsClicked(item:MainModel.ResultEntity){
        mainView.goToDetailActivity(item)
    }
}