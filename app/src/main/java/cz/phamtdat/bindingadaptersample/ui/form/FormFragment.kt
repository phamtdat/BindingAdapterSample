package cz.phamtdat.bindingadaptersample.ui.form

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import cz.phamtdat.bindingadaptersample.R
import cz.phamtdat.bindingadaptersample.databinding.FormFragmentBinding

class FormFragment : Fragment() {

    companion object {
        fun newInstance() = FormFragment()
    }

    private lateinit var viewModel: FormViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProviders.of(this).get(FormViewModel::class.java)
        val binding = DataBindingUtil.inflate<FormFragmentBinding>(
            inflater, R.layout.form_fragment, container, false
        )
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.startObserving(this)
        return binding.root
    }
}
