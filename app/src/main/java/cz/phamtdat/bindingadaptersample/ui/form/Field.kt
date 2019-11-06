package cz.phamtdat.bindingadaptersample.ui.form

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import cz.phamtdat.bindingadaptersample.R
import cz.phamtdat.bindingadaptersample.databinding.FieldBinding

class Field @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : LinearLayout(context, attrs, defStyleAttr) {

    val binding: FieldBinding = DataBindingUtil.inflate(
        LayoutInflater.from(context), R.layout.field, this, true
    )
}

// define a BindingAdapter so that you can use app:fieldData="@{ viewModel.email }" in layouts
// that include this custom layout class.
// Also, you can put this part of code in a separate file anywhere in your project,
// gradle is smart enough to attach it to a correct auto-generated databinding class
@BindingAdapter("fieldData")
fun Field.bindFieldData(data: FieldLiveDataWrapper?) {
    data?.let { this.binding.fieldData = it.email }
}