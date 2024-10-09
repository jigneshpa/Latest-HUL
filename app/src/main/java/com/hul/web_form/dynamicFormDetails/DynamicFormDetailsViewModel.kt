package com.hul.web_form.dynamicFormDetails

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hul.data.GetVisitDataResponseData
import com.hul.data.ProjectInfo
import com.hul.data.SchoolCode
import com.hul.user.UserInfo
import javax.inject.Inject

class DynamicFormDetailsViewModel @Inject constructor(
    private val userInfo: UserInfo,
) : ViewModel() {

    var projectInfo = MutableLiveData<ProjectInfo>()

    var visitData = MutableLiveData<GetVisitDataResponseData>(null)

    var visibiliyOfItems = MutableLiveData<Int>(View.VISIBLE)
}