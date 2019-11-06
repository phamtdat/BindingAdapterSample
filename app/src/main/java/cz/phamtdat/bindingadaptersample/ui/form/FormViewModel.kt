package cz.phamtdat.bindingadaptersample.ui.form

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

data class FieldLiveDataWrapper(val email: MutableLiveData<String>)

class FormViewModel : ViewModel() {
    val fieldLiveDataWrapper = FieldLiveDataWrapper(email = MutableLiveData<String>())

    fun startObserving(lifecycleOwner: LifecycleOwner) {
        // check that your viewModel gets the updated values when you edit the email field using UI
        fieldLiveDataWrapper.email.observe(lifecycleOwner, Observer { email ->
            Log.d("EMAIL", email)
        })
    }
}
